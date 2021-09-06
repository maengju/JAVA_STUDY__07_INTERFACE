package interface_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame은 BorderLayout(동서남북)
//각방향으로 1개Component밖에 못올라감
//
class WindowTest extends Frame implements ActionListener,MouseListener{
	private Button newBtn,exitBtn;
	private TextArea area;
	
	
	public void init() {
		newBtn = new Button("new");
		exitBtn = new Button("exit");
		area = new TextArea();
		Panel  p = new Panel();//FlowLayout(순서대로 배치)
		p.add(newBtn);
		p.add(exitBtn);
		
		
		
		this.add("North",p);
		this.add("Center",area);
		
		
		
		setBounds(500,150,300,400); 
		setVisible(true);
		
		//이벤트
		this.addWindowListener(new WindowExit());
		this.addMouseListener(this);//내가 모든것을 Override를 했다. JVM이 사건에 맞게 호출해라
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
	}//init

	
	
	
	//MouseListener


	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스클릭");
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");
		
	}


	//ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newBtn) {//객체명을 확인 
			area.setText(" ");
			area.setText(""); // 초기화
		}else if(e.getActionCommand()=="exit") {//타이틀이름을 확인
			System.exit(0); //강제종료
		}
		
	}
	
	
}









//============================
public class WindowMain {

	public static void main(String[] args) {
		new WindowTest().init();

	}

}

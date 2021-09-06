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

//Frame�� BorderLayout(��������)
//���������� 1��Component�ۿ� ���ö�
//
class WindowTest extends Frame implements ActionListener,MouseListener{
	private Button newBtn,exitBtn;
	private TextArea area;
	
	
	public void init() {
		newBtn = new Button("new");
		exitBtn = new Button("exit");
		area = new TextArea();
		Panel  p = new Panel();//FlowLayout(������� ��ġ)
		p.add(newBtn);
		p.add(exitBtn);
		
		
		
		this.add("North",p);
		this.add("Center",area);
		
		
		
		setBounds(500,150,300,400); 
		setVisible(true);
		
		//�̺�Ʈ
		this.addWindowListener(new WindowExit());
		this.addMouseListener(this);//���� ������ Override�� �ߴ�. JVM�� ��ǿ� �°� ȣ���ض�
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
	}//init

	
	
	
	//MouseListener


	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺Ŭ��");
		
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
		if(e.getSource()==newBtn) {//��ü���� Ȯ�� 
			area.setText(" ");
			area.setText(""); // �ʱ�ȭ
		}else if(e.getActionCommand()=="exit") {//Ÿ��Ʋ�̸��� Ȯ��
			System.exit(0); //��������
		}
		
	}
	
	
}









//============================
public class WindowMain {

	public static void main(String[] args) {
		new WindowTest().init();

	}

}

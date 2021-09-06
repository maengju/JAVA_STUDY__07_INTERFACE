package interface_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowMain2 extends Frame implements ActionListener ,KeyListener,WindowListener{
	private Button initBtn,leftBtn,upBtn,downBtn,rightBtn;
	private int x=100,y=100;
	
	public WindowMain2() {

		initBtn = new Button("�ʱ�ȭ");
		leftBtn = new Button("��");
		upBtn = new Button("��");
		downBtn = new Button("��");
		rightBtn = new Button("��");
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,5,5,5));
		p.add(initBtn);
		p.add(leftBtn);
		p.add(upBtn);
		p.add(downBtn);
		p.add(rightBtn);
		
		this.add("North",p);
		
		
		this.setTitle("�̹���");
		this.setBounds(500,150,500,500); // â�� ��ġ�� ũ��
		this.setVisible(true); // trueâ�� ���°�  false â�� ���ִ°�
		
		
		//�̺�Ʈ
		this.addWindowListener(this);
		
		initBtn.addActionListener(this);
		leftBtn.addActionListener(this);
		upBtn.addActionListener(this);
		downBtn.addActionListener(this);
		rightBtn.addActionListener(this);
		
		initBtn.addKeyListener(this);
		leftBtn.addKeyListener(this);
		upBtn.addKeyListener(this);
		downBtn.addKeyListener(this);
		rightBtn.addKeyListener(this);
		
	}//imageMove()
	@Override
	public void paint(Graphics g) { //����Ʈ�� �ҷ����� ������ setVisible�� ȣ��ɶ� 
		
		Toolkit t = Toolkit.getDefaultToolkit();//�޼ҵ带 �̿��Ͽ� ����
		Image img = t.getImage("image/pepe.jpg");//�̹��� �ҷ����� ������/�����̸�.Ȯ���ڸ�
		g.drawImage(img, x, y, this);//�̹��� �׸���
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==initBtn) {
			x=100;
			y=100;
			
		}else if(e.getSource()==leftBtn) {
			x -= 10;
			if(x==-280) {
				x=500;	
			}
			
		}else if(e.getSource()==upBtn) {
			y -= 10;
			if(y==-280) {
				y=500;
			}
		}else if(e.getSource()==downBtn) {
			y += 10;
			if(y==500) {
				y=-280;
			}
		}else if(e.getSource()==rightBtn) {
			x += 10;
			if(x==500) {
				x=-280;
				
			}
		}
		repaint(); // JVM�� ���� paint()�� ȣ��
		
	}
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("���α׷� ����");
		System.exit(0);
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
			
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x -= 10;
			if(x==-280)x=500;	
				
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x += 10;
			if(x==500) {
				x=-280;
			}
			
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			y -= 10;
			if(y==-280) {
				y=500;
			}
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y += 10;
			if(y==500) {
				y=-280;
			}
		}
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
//===============================================================================	

	public static void main(String[] args) {
		
		new WindowMain2();
		
	}
	




	
}

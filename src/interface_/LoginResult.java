package interface_;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class LoginResult extends JFrame implements WindowListener {
   private String id,pwd;
   public LoginResult(String id, String pwd) {
	   
	  setFont(new Font("맑은고딕", Font.BOLD,20));
	  this.id=id;
	  this.pwd=pwd;
      this.setBounds(900, 120, 200, 200);
      this.setVisible(true);
      
      //이벤트
      this.addWindowListener(this);
      
   }
   
   @Override
   public void paint(Graphics g) {
	   super.paint(g);
	   if(id.equals("hong")&& pwd.equals("111")) {
		   g.setColor(Color.BLUE);
		   g.drawString("로그인성공", 35, 100);
	   }else {
		   g.setColor(Color.RED);
		   g.drawString("로그인실패", 35, 100);
	   }
	   
   }
  
   
   //WindowListener Override
   @Override
   public void windowOpened(WindowEvent e) {}

   @Override
   public void windowClosing(WindowEvent e) {
      setVisible(false);
   }

   @Override
   public void windowClosed(WindowEvent e) {}

   @Override
   public void windowIconified(WindowEvent e) {}

   @Override
   public void windowDeiconified(WindowEvent e) {}

   @Override
   public void windowActivated(WindowEvent e) {}

   @Override
   public void windowDeactivated(WindowEvent e) {}
}
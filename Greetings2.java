
import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings2() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
   
   public void paintComponent (Graphics g) {
      this.newDrawLine(g, 0, 0, 100, 100);
   }
   
   public void newDrawLine(Graphics g, int x, int y, int x1, int y1){
      g.drawLine(x,y,x1,y1);
   }
   
   // Step 25 Write newDrawRect2 here, which calls drawLine four times.
   public void newDrawRect(Graphics g, int tlx, int tly, int width, int height) {
      g.drawLine(tlx, tly, width, 0);
      g.drawLine(tlx, tly, 0, height);
      g.drawLine(tlx, tly + height, width, 0);
      g.drawLine(tlx + width, tly, 0, height);
   }
   
   // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
   //  a rectangle.  It should take drawRect.
   public void newDrawRect2(Graphics g, int tlx, int tly, int brx, int bry) {
      
   }

   
}

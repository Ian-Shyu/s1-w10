/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      //g.setColor(Color.red);
      //g.fillOval(100, 100, 50, 50);   
      
      //g.setColor(Color.blue);
      //g.fillRect(200, 200, 25, 25);

      //this.drawBullsEye(g);
      //this.olympicRings(g);
   }

   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.fillOval(100, 100, 100, 100);

      g.setColor(Color.black);
      g.fillOval(110, 110, 80, 80);

      g.setColor(Color.red);
      g.fillOval(120, 120, 60, 60);

      g.setColor(Color.black);
      g.fillOval(130, 130, 40, 40);

      g.setColor(Color.red);
      g.fillOval(140, 140, 20, 20);
   }

   public void olympicRings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(75, 75, 50, 50);

      g.setColor(Color.black);
      g.drawOval(135, 75, 50, 50);

      g.setColor(Color.red);
      g.drawOval(195, 75, 50, 50);

      g.setColor(Color.yellow);
      g.drawOval(105, 105, 50, 50);

      g.setColor(Color.green);
      g.drawOval(165, 105, 50, 50);

   }

   public void trafficLight(Graphics g){
      g.setColor(Color.blue);
   }
}

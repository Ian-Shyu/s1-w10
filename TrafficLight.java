import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements MouseListener, MouseMotionListener{
	private int xClick = -9999;
	private int yClick = -9999;
    private int clickNum;

    public TrafficLight() {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (400, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
		addMouseMotionListener(this);
    }
    
    public void paintComponent(Graphics g){
		this.getWidth();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(10.0f));
		
        
        //three cirlces
        g.setColor(Color.black);
        g.drawOval(100, 100, 200, 200);
        g.drawOval(100, 350, 200, 200);
        g.drawOval(100, 600, 200, 200);

        //color 
        // g.setColor(Color.red);
        // g.fillOval(100, 100, 200, 200);
        // g.setColor(Color.yellow);
        // g.fillOval(100, 350, 200, 200);
        // g.setColor(Color.green);
        // g.fillOval(100, 600, 200, 200);

        if (xClick != -9999 && yClick != -9999){
            clickNum ++; 
            if (clickNum == 1){
                g.setColor(Color.red);
                g.fillOval(100, 100, 200, 200);
            }

            if (clickNum == 2){
                g.setColor(Color.green);
                g.fillOval(100, 600, 200, 200);
            }
            
            if (clickNum == 3){
                g.setColor(Color.yellow);
                g.fillOval(100, 350, 200, 200);
                
                clickNum = 0;
            }

            g.setColor(Color.black);
            g.drawOval(100, 100, 200, 200);
            g.drawOval(100, 350, 200, 200);
            g.drawOval(100, 600, 200, 200);
        }


        // if (xClick != -9999 && yClick != -9999){
		// 	g.drawOval(xClick - 50, yClick - 50, 100, 100);
		// }
	}
	
	public void mouseDragged(MouseEvent event){
		//System.out.println("here");
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}

		public void mouseMoved(MouseEvent Event){

		}

	public void mouseClicked (MouseEvent event) {
		//System.out.println ("You're tickling me!");
        this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
		
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}

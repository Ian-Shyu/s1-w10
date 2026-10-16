import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
    private int xClick;
	private int yClick;

    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    
    public void paintCompoentn(Graphics g){
		this.getWidth();
		if (xClick != -9999 && yClick != -9999){
			g.drawOval(xClick - 50, yClick - 50, 100, 100);
		}
	}
	
	public void mouseClicked (MouseEvent event) {
		System.out.println ("You're tickling me!");
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

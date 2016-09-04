import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   Draws a face.
 */
public class FaceComponent extends JComponent
{
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double head = new Ellipse2D.Double(0,0, 100,100);
		g2.draw(head); //draws head
		Ellipse2D.Double eye1 = new Ellipse2D.Double(20,30, 10,10);
		g2.draw(eye1); //draws right eye
		Ellipse2D.Double eye2 = new Ellipse2D.Double(70,30, 10,10);
		g2.draw(eye2); //draws left eye
		
		g2.draw(new Line2D.Double(20,75,80,75));
	}
}
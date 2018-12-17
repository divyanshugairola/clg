import java.applet.*;
import java.awt.Graphics;

public class exp7_b extends Applet{
	public void paint(Graphics g) {
		g.drawString("Always keep Smiling", 50, 30);
		g.drawOval(60, 60, 200, 200);
		g.fillOval(90, 120, 50, 20);
		g.drawLine(165, 125, 165, 175);
		g.drawArc(110, 130, 95, 95, 0, -180);
		g.drawLine(165, 175, 150, 160);
	}


}

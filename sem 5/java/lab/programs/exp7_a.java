import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class exp7_a extends Applet{
	public void paint(Graphics g) {
		g.setFont(new Font("TimesRoman",Font.PLAIN,14));
		g.drawString("Hello applet", 40, 50);
		g.setFont(new Font("TimesRoman",Font.PLAIN,19));
		g.setColor(Color.red);
		g.drawString("Hello applet", 40, 100);
		g.setFont(new Font("TimesRoman",Font.PLAIN,20));
		g.setColor(Color.red);
		g.drawString("Hello applet", 40, 150);
		
		
	}
}

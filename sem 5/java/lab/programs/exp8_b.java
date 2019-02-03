import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class exp8_b extends Applet implements AdjustmentListener {
	Scrollbar s1, s2, s3;

	public void init() {
		s1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 255);
		s2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
		s3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		add(s1);
		add(s2);
		add(s3);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae) {
		repaint();
	}

	public void paint(Graphics g) {
		int x, y, z;
		x = s1.getValue();
		y = s2.getValue();
		z = s3.getValue();
		showStatus("RED " + x + "GREEN " + y + "BLUE" + z);
		Color c = new Color(x, y, z);
		setBackground(c);

	}
}

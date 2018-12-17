import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class exp8_a extends Applet implements MouseListener {
	int xpos;
	int ypos;

	public void init() {

		addMouseListener(this);

	}

	public void mouseClicked(MouseEvent me) {
		xpos = me.getX();
		ypos = me.getY();
		showStatus("Mouse Clicked at" + xpos + "and" + ypos);
	}

	public void mousePressed(MouseEvent me) {
		xpos = me.getX();
		ypos = me.getY();
		showStatus("Mouse pressed at" + xpos + "and" + ypos);
	}

	public void mouseReleased(MouseEvent me) {
		xpos = me.getX();
		ypos = me.getY();
		showStatus("Mouse released at" + xpos + "and" + ypos);
	}

	public void mouseEntered(MouseEvent me) {
		xpos = me.getX();
		ypos = me.getY();
		showStatus("Mouse entered at" + xpos + "and" + ypos);
	}

	public void mouseExited(MouseEvent me) {
		xpos = me.getX();
		ypos = me.getY();
		showStatus("Mouse exited at" + xpos + "and" + ypos);
	}

}

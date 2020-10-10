import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class SmallRectangle extends JPanel implements MouseMotionListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1856256381119545815L;
	
	public SmallRectangle () {
		setBackground(Frame.primaryColor);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void changeOfColor () {
		this.setBackground(new Color(RandomGenerator.randomColorNumber(), RandomGenerator.randomColorNumber(), RandomGenerator.randomColorNumber()));
	}
	
	@Override
	public void paint(Graphics g) {
	    super.paint(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("klik!");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

}

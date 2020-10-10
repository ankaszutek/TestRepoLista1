import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5151041547543472432L;
	
	Thread arrayOfThreads [] = new Thread [Main.height*Main.width];
	static SmallRectangle arrayOfRectangles [] = new SmallRectangle [Main.height*Main.width];
	
	static Color primaryColor;
	SmallRectangle newObject;
	Thread newThread;
	
	public Frame () {
		
		super ("Plansza");
		
		setPreferredSize(new Dimension(1500, 1000));
		setResizable(true);
		
		int i=0;
		while (i<Main.height*Main.width) {
			
			primaryColor = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
			
			newObject = new SmallRectangle();
			add(newObject);
			arrayOfRectangles[i]=newObject;
			
			newThread = new Thread (new Operations(i, arrayOfRectangles[i]));
			newThread.start();
			arrayOfThreads[i]=newThread;
			
			i++;
		}
		
		setLayout(new GridLayout(Main.height, Main.width, 1, 1));
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

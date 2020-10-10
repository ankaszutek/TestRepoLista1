import java.awt.EventQueue;
public class Main {
	public static int width, height, speed;
	public static double probability;
	public static void main(String[] args) {
		System.out.println("check");
		try {
			width=Integer.parseInt(args[0]);
			height=Integer.parseInt(args[1]);
			speed=Integer.parseInt(args[2]);
			probability=Double.parseDouble(args[3]);
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Frame();
				}
			});
		}
		catch (NumberFormatException ex) {
			System.out.println("Podano zle liczby");
		}
	}
}

import java.util.Random;

public class RandomGenerator {
	public static int randomColorNumber () {
		Random rand = new Random();
		return (rand.nextInt(256));
	}
	public static double randomDoubleNumber () {
		Random rand = new Random();
		return rand.nextDouble();
	}
}

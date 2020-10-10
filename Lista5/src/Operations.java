
public class Operations implements Runnable {
	
	int indeks;
	double probability;
	SmallRectangle rectangle;
	
	public Operations(int i, SmallRectangle object) {
		indeks=i;
		this.rectangle=object;
	}

	@Override
	public void run() {
		
		while (true) { // lub !Thread.currentThread().isInterrupted()
			
			this.probability=Math.random();
			
			if (this.probability<=Main.probability) {
				Frame.arrayOfRectangles[indeks].changeOfColor();
			}
			
			try {
				Thread.sleep((int)((RandomGenerator.randomDoubleNumber() + 0.5)*Main.speed));
			}
			catch (InterruptedException e) {
				
			}
		}		
	}

}

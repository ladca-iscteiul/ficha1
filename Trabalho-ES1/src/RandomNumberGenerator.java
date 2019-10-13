
public class RandomNumberGenerator {

	private int max;
	
	public RandomNumberGenerator(int max) {
		this.max = max;
	}
	
	public int generate() {
		int num = (int) Math.random()*max + 1;
		System.out.println("Number generated: " + max);
		return num;
	}
}

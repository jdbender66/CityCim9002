import java.util.Random;

public class RandomNumberGenerator {

	public int generator(int x, int y){
		Random rn = new Random(x);
		int seed = rn.nextInt(y);
		return seed;
	}
	
	public int generator(int x){
		Random rn = new Random();
		int seed = rn.nextInt(x);
		return seed;
	}
}

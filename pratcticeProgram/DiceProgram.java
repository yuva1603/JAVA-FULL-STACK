package pratcticeProgram;

import java.util.Random;

public class DiceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		
		int dice=rand.nextInt();
		System.out.println("Your Rolled :"+dice);
	}

}

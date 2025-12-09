package day11;
interface Playable{
	void play();
}
class Game{
	public static void startGame() {
		System.out.println("Lets Start a Game");
	}
}
class Cricket extends Game implements Playable{
	public void play() {
		System.out.println("Lets Play Cricket ");
	}
}
class FootBall extends Game implements Playable{
	public void play() {
		System.out.println("Lets Play FootBall");
	}
}
public class GameFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c=new Cricket();
		FootBall f=new FootBall();
		c.play();
		c.startGame();
		f.play();
		f.startGame();
	}

}

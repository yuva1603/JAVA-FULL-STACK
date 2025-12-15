package classjava2;

class Food{
	void eat(String breakfast) {
		System.out.println("Breaking the Fast "+breakfast);
	}
	
	void eat(String lunch,int time) {
		System.out.println("Lunch "+lunch+" at "+time+" PM");
	}
	
	void eat(String snacks,double quantity) {
		System.out.println("Snacks "+snacks+" ( "+quantity+" plate)");
	}
	
	void eat(String dinner,boolean isLight) {
		if(isLight) {
		System.out.println("Dinner is "+dinner+"  (Light meal)");}
		else {
		System.out.println("Dinner is "+dinner+"  (Heavy Meal)");
		}
	}
}
public class PolymorphismDay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=new Food();
		f.eat("Idly");
		f.eat("Briyani",2);
		f.eat("Tea",4);
		f.eat("Chapathi and Kuruma ",false);
		
		
	}

}

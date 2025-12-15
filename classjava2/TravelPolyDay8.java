package classjava2;

class Travel{
	void go(String place) {
		System.out.println("Going to "+place);
	}
	void go(String place,int time) {
		System.out.println("Going to "+place+" at "+time);
	}
	void go(String place,String mode) {
		System.out.println("Going to "+place+" by "+mode);
	}
	void go(String place,float distance) {
		System.out.println("Going to "+place+" ,distance : "+distance+"KM");
	}
}

public class TravelPolyDay8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel t=new Travel();
		t.go("Delhi");
		t.go("Delhi", 9);
		t.go("Delhi","Flight" );
		t.go("Delhi", 350.8f);
	}

}

package classjava5;
import java.util.StringTokenizer;

public class StringTokenizerDay23 {

	public static void main(String[] args) {
		
	// Type 1 : Default Delimiter (Space)
		
		System.out.println("Type 1 : Default Space DeLimiter");
		StringTokenizer st1=new StringTokenizer("Java Python C++");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		 
	// Type 2 Custom Delimiter
		
		System.out.println("Type 2 : Custom DeLimiter (Comma)");
		StringTokenizer st2=new StringTokenizer("A,B,C",",");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	// Type 3 : Custom Delimiter + returnDelims = true
		
		System.out.println("Type 3 : Custom Delimiter with returnDelims = true ");
		StringTokenizer st3=new StringTokenizer("A,B:C",",:",true);
		
		while(st3.hasMoreTokens()) {
				System.out.println(st3.nextToken());
			}
		
		
	}

}

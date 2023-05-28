package Java_Project;

import org.testng.annotations.Test;

public class ReverseNumber {
	@Test
	public void numberReverse() {
		int n=123456;
		int m=n;
		int temp=0;
		while(n!=0) {
			temp=temp*10+n%10;
			n=n/10;
		}
		System.out.println(m+" is reverse : "+temp);
	}
}

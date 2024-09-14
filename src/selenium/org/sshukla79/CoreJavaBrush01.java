package selenium.org.sshukla79;

import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaBrush01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr= new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
//		
//		for(int i =0 ; i<arr.length ; i++) {
//			
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			
//			}
//			else {
//				System.out.println("else" + arr[i]);
//			}
//			
//		}
//		//System.out.println(Arrays.toString(arr));
//		ArrayList<String>a = new ArrayList();
//		a.add("JAVA");
//		a.add("Testing");
//		a.add("Selenium");
//		
//	
//		System.out.println(a.get(2));
//		for(int i =0; i<a.size();i++) {
//			System.out.println(a.get(i));
//			
//		}
//		
//		String s= "hello";
//		String ss= new String("hello");
		String s =" I AM HELLO ";
		String s1 =s.trim();
		System.out.println(s1);
		
		String [] ss= s.split("AM");
		
		//System.out.println(ss[1]);
		
		for(int i = s1.length() -1 ;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
		
StringBuffer st = new StringBuffer("HELLO");
    StringBuffer rev = st.reverse();
    System.out.println(rev);
	}

}

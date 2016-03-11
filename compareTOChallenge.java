
public class compareToChallenge {
public static void main (String[] args){

	String s1 = "hello";
	String s2 = "goodbye";
	String s3 = "Happy Birthday";
	String s4 = "Congratulation";
	String s5 = "high five";
	String s6 = "no nonsence";
	String s7 = "that's alright!";
	String s8 =   "good evening";
	String s9 = "sunday";
	String s10 = "weekend";
	String s11 = "Good Friday";
	String s12 = "Christmas";

	System.out.printf("s1 = %s\ns2 = %s\ns4 = %s\ns5 = %s\ns6 = %s\ns7 = %s\ns8 = %s\ns9 = %s\ns10 = %s\ns11 = %s\ns12 = %s\n\n", s1, s2, s3, s4, s5, s6, s7, s8, s9,s10, s11, s12 );
	
	//test compareTo
	System.out.printf("\ns1.compareTo(s2) is %d", s1.compareTo(s2) );
	
	System.out.printf("\ns2.compareTo(s1) is %d", s2.compareTo(s1) );

	System.out.printf("\ns1.compareTo(s1) is %d", s1.compareTo(s1) );

	System.out.printf("\ns4.compareTo(s3) is %d", s4.compareTo(s3) );

	System.out.printf("\ns5.compareTo(s6) is %d", s5.compareTo(s6) );

	System.out.printf("\ns6.compareTo(s5) is %d", s6.compareTo(s5) );

	System.out.printf("\ns5.compareTo(s5) is %d", s5.compareTo(s5) );

	System.out.printf("\ns7.compareTo(s8) is %d", s7.compareTo(s8) );

	System.out.printf("\ns9.compareTo(s10) is %d", s9.compareTo(s10) );

	System.out.printf("\ns10.compareTo(s9) is %d", s10.compareTo(s9) );

	System.out.printf("\ns11.compareTo(s12) is %d", s11.compareTo(s12) );

	System.out.printf("\ns12.compareTo(s11) is %d", s12.compareTo(s11) );
 
}
}
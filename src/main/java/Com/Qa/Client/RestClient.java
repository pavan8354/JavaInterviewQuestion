package Com.Qa.Client;




public class RestClient {
	
	
public static void main(String[] args) {
	
	RestClient rc = new RestClient();
	rc.sum(5, 10, 30);
	rc.sum(10, 25, 55, 102.22, 987.54);
	
	
	
}
	public void sum(int a , int b , int c) {
		
		
		int d= a + b + c;
		
		System.out.println("The Obtained Sum is ----------->"+d);

	}
	
public void sum(int a , int b , int c, double d , double e) {
		
		
		double  f= a + b + c + d + e;
		
		System.out.println("The Obtained Sum is ----------->"+f);

	}
	
	

}

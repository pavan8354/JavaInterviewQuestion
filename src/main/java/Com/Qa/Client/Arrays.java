package Com.Qa.Client;




public class Arrays {
	
	
public static void main(String[] args) {
	
	
	int stude_ID[] = new int[5];
	
	stude_ID[0] = 12;
	stude_ID[1] = 13;
	stude_ID[2] = 1222;
	stude_ID[3] = 122;
	stude_ID[4] = 123455;
	
	
	int array = stude_ID.length;
	
	System.out.println("The obtained Array Length is---------->"+array);
	
	for(int i=0;i<array;i++) {
		
		System.out.println("The Obtained Student Id is-------------->"+stude_ID[i]);
	}
	
	
}
	

}

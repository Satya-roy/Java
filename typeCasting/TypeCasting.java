package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//auto type Casting(wideing) 
		byte x = 4;
		int y = x;
		
		//manual(Narrowing)
		double myDouble = 3.14;
		int myInt = (int)myDouble;
		
		System.out.println(y);
		System.out.println(myInt);
	}

}

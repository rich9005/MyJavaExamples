package hashfunct;
import java.util.*;
public class HashFunction {
	String [] theArray;
	int ArraySize;
	int itemsInArray;
	
	
	public static void main(String [] args){
		
		HashFunction newFunc = new HashFunction(30);
		String [] elelmentsToAdd = {"1", "5" ,"17" , "21", "26"};
		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
            "725", "998", "978", "988", "990", "989", "984", "320", "321",
            "400", "415", "450", "50", "660", "624" };

		//newFunc.hashfunction1(elelmentsToAdd, newFunc.theArray);
		newFunc.hashfunction2(elementsToAdd2, newFunc.theArray);
		newFunc.findKey("660");
		newFunc.displayTheStack();
	}
	
	public void hashfunction1(String [] stringsForArray ,String [] theArray ){
		
		for (int i =0  ; i <stringsForArray.length ; i++){
			String newElementval = stringsForArray[i];
			theArray[Integer.parseInt(newElementval)] = newElementval; 
		}
	}
	
	public void hashfunction2(String [] stringsForArray ,String [] theArray ){
		for (int i =0  ; i <stringsForArray.length ; i++){
			String newElementval = stringsForArray[i];
			int arrayIndex = Integer.parseInt(newElementval) % 29 ;
			System.out.println("Modulus index= " +arrayIndex+ "for value" +newElementval);
			
			while (theArray[arrayIndex] != "-1"){
				++arrayIndex;
				 System.out.println("collosion occured try===" +arrayIndex + "===Instead");
				arrayIndex %= ArraySize;
				 
			}
			theArray[arrayIndex] = newElementval;
			 
		}
	}
	
	HashFunction(int size){
		ArraySize = size;
		theArray = new String[ArraySize];
		Arrays.fill(theArray, "-1");
		  
	}
	
	public String findKey(String key){
		int arrayIndexHash = Integer.parseInt(key) % 29;
		
		while (theArray[arrayIndexHash] != "-1"){
			if (theArray[arrayIndexHash] == key){
				System.out.println("key" +key+" was found in " +arrayIndexHash);
				return theArray[arrayIndexHash];
			}
			
			++arrayIndexHash;
			arrayIndexHash %= ArraySize;
		}
		
		return null;
	}
	
	public void displayTheStack() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                System.out.format("| %3s " + " ", n);

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (theArray[n].equals("-1"))
                    System.out.print("|      ");

                else
                    System.out
                            .print(String.format("| %3s " + " ", theArray[n]));

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

        }

    }

}


	


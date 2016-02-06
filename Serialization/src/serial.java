
import java.io.*;

public class serial {

	public static void main(String [] args) throws Exception{
		
		Save obj =  new Save();
		obj.i = 7;
		
		
		File f = new File("serial.txt");
		FileOutputStream fos =  new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Object Written");
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois =  new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();
		
		System.out.println("InputStream Value: " +obj1.i);
	}	
	
}
class Save implements Serializable{
	
	int i ;
}
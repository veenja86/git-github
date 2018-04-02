package bottel;

import java.io.FileWriter;
import java.util.Properties;

public class setproperties {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		p.setProperty("Name:", "Vinja R Patel");
		p.setProperty("Email:","veenja86@gmail.com");
		
		p.store(new FileWriter("info.properties"), "Java collection properties example");
	}
}

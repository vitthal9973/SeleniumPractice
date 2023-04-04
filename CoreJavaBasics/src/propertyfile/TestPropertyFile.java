package propertyfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util. Properties;
public class TestPropertyFile {

	public static void main(String[] args) {
		String filePath1="D:\\Acceleration\\Workspace\\CoreJavaBasics\\PropertyFiles\\Appdata.properties";
		String filePath2=".\\PropertyFiles\\\\Appdata.properties";
		String filePath3=System.getProperty("user.dir")+"\\PropertyFiles\\\\Appdata.properties";
		FileInputStream fis=new FileInputStream(filePath1);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println("Application Url:"+prop.getProperty("appurl"));
		System.out.println("Application Url:"+prop.getProperty("username"));
		System.out.println("Application Url:"+prop.getProperty("password"));
		System.out.println("Application Url:"+prop.getProperty("appurl"));
	}

}

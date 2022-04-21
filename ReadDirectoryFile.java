import java.io.File;

public class ReadDirectoryFile {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\kml\\ReactProjet");
		checkDirectory(dir);
		
		
	}
	
	public static void checkDirectory(File dir){
		if (dir.isDirectory())
		{
			File[] files= dir.listFiles();
	
			for (File f: files) {
			   if(f.isDirectory()) {
				   checkDirectory(f);
			   }else {
				   if(f.getName().equals("universe.txt")) {
					   System.out.println(f.getAbsolutePath());
				   }
			   }
				
			}
	    }
	}
}

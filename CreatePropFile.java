import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Properties;
	class CreatePropFile{
	public static void main( String[] args)
	{
		Properties prop = new Properties();

		try{
			prop.setProperty("Building", " Building");
			prop.setProperty("home", "home");
			prop.setProperty("food", "food");
			prop.setProperty("photo", "photo");
			
			prop.setProperty("window", "window");
			prop.setProperty("door", "door");
			prop.setProperty("tree", "tree");
			prop.setProperty("stairs", "stairs");
			prop.setProperty("bed", "bed");
			prop.setProperty("chair", "chair");
			prop.setProperty("bucket", "bucket");
			prop.store(new FileOutputStream("randomstrings.properties"),null);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		}
	}


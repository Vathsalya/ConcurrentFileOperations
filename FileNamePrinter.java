import java.io.File;

public class FileNamePrinter implements Runnable {

	String folderName;
	
	
	
	public FileNamePrinter(String folderName){
		this.folderName = folderName;
	}
	@Override
	public void run() {
	//	System.out.println("Folder :: "+folderName);
		File[] files = new File(folderName).listFiles();

		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.println("File :: "+file.getName());
				}
			}
		}
	}

}

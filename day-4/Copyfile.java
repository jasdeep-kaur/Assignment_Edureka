/**
 * Created by jasdeepkaur on 2/20/17.
 */
import java.io.*;
import java.nio.file.Files;

/**
 * Created by jasdeep kaur on 2/20/17.
 */
class CopyingFile{

	public static void copyFileUsingJava7Files(File source, File des) throws IOException {
		Files.copy(source.toPath(), des.toPath());

	}
}
public class Copyfile{
	public static void main(String[] args) throws IOException {
		File source=new File("src/source.csv");
		File destination=new File("src/Des1.csv");
		CopyingFile.copyFileUsingJava7Files(source,destination);
	}

}

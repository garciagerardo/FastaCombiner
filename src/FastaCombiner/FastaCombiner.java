package FastaCombiner;

import java.io.*;
import java.util.Scanner;

public class FastaCombiner {
	public static void main(String args[]) throws IOException{
		File folder = new File("/Users/jerry/Documents/CS123B/Project/FastaFiles");
		File[] listOfFiles = folder.listFiles();
		String str = "";

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    		str = str + "\n" + getText(file.getPath());		        
		    }
		}
		FileOutputStream out = new FileOutputStream("/Users/jerry/Documents/CS123B/Project/CompleteSeq.fa");
		out.write(str.getBytes());
		out.close();
	}
	public static String getText(String dir)throws FileNotFoundException {
		File subFile = new File(dir);
		Scanner sc = new Scanner(subFile);
		String txt= "";
		
		while (sc.hasNextLine())
		      txt = txt + sc.nextLine();
		
		sc.close();
		
		return txt;
	}

}

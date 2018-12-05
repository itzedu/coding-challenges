package hackerrank;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DuplicateFiles {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<File> files = new ArrayList<File>();
		listf("/Users/eduardobaik/Desktop/rec/", files);
		findDuplicates(files);
      
	}

    public static void findDuplicates(List<File> files) {
    	HashMap<Long, List<File>> map = new HashMap<Long, List<File>>();
    	
    	for(File f : files) {
    		try {
				BasicFileAttributes attr = Files.readAttributes(f.toPath(), BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
				Long fileSize = attr.size();
				List<File> duplicateFiles = map.get(attr.size());
				if(duplicateFiles == null) {
					map.put(fileSize, new ArrayList<File>(Arrays.asList(f)));
				} else {
					duplicateFiles.add(f);
					map.put(fileSize, duplicateFiles);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

    	}
    }
    
    public static void checkFileContents(List<File> files) {
    	// check if the files in the array are duplicates or not
    }
    
    public static List<File> listf(String directoryName, List<File> files) {
        File directory = new File(directoryName);        

        // Get all files from a directory.
        File[] fList = directory.listFiles();
                
        if(fList != null) {
            for(File file : fList) {      
                if(file.isFile()) {
                    files.add(file);
                } else if(file.isDirectory()) {
                    listf(file.getAbsolutePath(), files);
                }
            }
        }
    
    	return files;
    }

}

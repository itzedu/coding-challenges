package hackerrank;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DuplicateFiles {	
	public static void main(String[] args) {
        List<File> files = new ArrayList<File>();
		listf("/Users/eduardobaik/Desktop/rec/", files);
		System.out.println(findDuplicates(files));
	}

    public static List<List<File>> findDuplicates(List<File> files) {
    	// For this problem, we are going to make some assumptions
    	// If the last modified timestamps of a file are the same, then they must be the same file

    	List<List<File>> duplicates = new ArrayList<List<File>>();

    	HashMap<Long, List<File>> map = new HashMap<Long, List<File>>();
    	
    	for(File f : files) {
    		Long lastMod = f.lastModified();
    		List<File> dup = map.get(lastMod);
    		
    		if(dup == null) {
    			map.put(lastMod, new ArrayList<File>(Arrays.asList(f)));
    		} else {
    			dup.add(f);
    		}
    	}
    	
    	for(List<File> dups : map.values()) {
    		if(dups.size() > 1) {
    			duplicates.add(dups);
    		}
    	}    	
    	
    	return duplicates;
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

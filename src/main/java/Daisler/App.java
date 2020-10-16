/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Daisler;

import java.nio.file.*;
import java.nio.charset.*;
import java.nio.*;
import java.nio.file.attribute.FileAttribute;
import java.net.*;
import java.util.Date;

import javax.print.attribute.standard.JobKOctetsSupported;

import java.io.*; //webistecontent
import java.time.LocalDate;//Dates
import java.lang.*;
import org.jsoup.nodes.Document;
//import java.lang.Object;
import org.jsoup.*;
 

public class App{

    public void SaveFile(URL websiteURL, String path) throws IOException{

        String websiteContent = getContent(websiteURL);
        // save content from website into Doc type
        contentIntoFile(path, websiteContent);
        //Should save the conent in the right file witg right path/directory
    }
    
    private void contentIntoFile(String pathStr, String s)throws FileNotFoundException, IOException{//Auszugebener Tect in die Datei = out

        Date d = new Date();                
        String DateString = d.toString();
        //Date (for title) will turned into String

        DateString = "/" + DateString;  
        //for the path will / added 
        
                
        System.out.println(DateString);             //for testing 2
        System.out.println(pathStr);                //3
        
        pathStr = pathStr + DateString;
        Path path = Paths.get(pathStr);
        //turned path-String into path type

        Files.write(path, s.getBytes());
        // s =content as string will be written into path
        //it is also creatin a new file if it doesnt exist
        }
}
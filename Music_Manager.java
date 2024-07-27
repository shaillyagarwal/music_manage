import java.io.File; 
import java.util.Scanner;
public class Music_Manager  
{ 
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      String directoryPath =sc.nextLine(); 
        
      File directory = new File(directoryPath); 

      File[] files = directory.listFiles(); 
    
      if (files != null) { 
        for (File file : files) { 
          System.out.println(file.getName()); 
        } 
      } 
    } 
}

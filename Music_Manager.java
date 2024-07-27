import java.io.File; 
public class Music_Manager  
{ 
    public static void main(String[] args) 
    {  
      String directoryPath = "C:/Users/HP/Desktop/surya/acharya-2024-shaillyagarwal-main/music/Music"; 
        
      File directory = new File(directoryPath); 

      File[] files = directory.listFiles(); 
    
      if (files != null) { 
        for (File file : files) { 
          System.out.println(file.getName()); 
        } 
      } 
    } 
}
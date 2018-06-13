package workshop.exercise2;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

class Sample {    
  public static void main(String[] args) {


    try {
      String searchWord = "localhost";
      long count = Files.lines(Paths.get("/etc/hosts"))
              .filter(line -> line.contains(searchWord))
              .count();

      System.out.printf("The word %s occured %d times\n", searchWord, count);
    } catch(IOException ex) {
      System.out.println(ex.getMessage());
    }
  }              
}

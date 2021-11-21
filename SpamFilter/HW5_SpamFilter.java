// Thea Cohn
// CS 141
// HW Core Topics: setting up my dev environment
//
// testing random code

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

class HW5_SpamFilter {

   public static void main(String[] args) throws FileNotFoundException {
     
     //define files
      File Emails = new File ("emails.txt");  
      File SpamWords =  new File ("SpamWords.txt"); // list provided by https://blog.hubspot.com/blog/tabid/6307/bid/30684/The-Ultimate-List-of-Email-SPAM-Trigger-Words.aspx
      File SpamCheck = new File ("SpamCheck.txt");
     
      Scanner spam = new Scanner (SpamWords);
      
      while (spam.hasNext()) {      
   }
}
      
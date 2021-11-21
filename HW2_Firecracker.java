// Thea Cohn
// CS 141
// HW Core Topics: primitive data and definite loops
//
// testing random code

class HW2_Firecracker {
 
	public static void top(String[] args) {
   
   //prints top of rocket
   
   
      
   	for(int i = 6; i >= 2; i--) {
         for(int j = 0; j < 1 * i -1; j++)
            System.out.print(" ");
         for(int j = 0; j <= 0 ; j++)
            System.out.print("//");
         for(int j = 2; j < -2 * i + 14; j++)
            System.out.print("!");
         for(int j = 0; j <= 0; j++)
            System.out.print("\\\\");
      
      System.out.println();
      }
      
      
   // splitter
      
   public static void split(String[] args) {  
    
   	for(int i = 1; i <= 1; i++) {
         for(int j = 0; j <= 0 ; j++)
            System.out.print("+");
         for(int j = 0; j <= 11 ; j++)
            System.out.print("~");
         for(int j = 0; j <= 0 ; j++)
            System.out.print("+");
      
      System.out.println();   
      }    
    } 
    
      //body type A
      
   public static void bodyA(String[] args) { 
   
      for(int k = 2; k <= 7; k++) {
         for(int j = 0; j <= 0; j++)
            System.out.print("[");
         for(int j = 1; j < 1 * k -1; j++)
            System.out.print("-");
         for(int j = 1; j < -1 * k + 9; j++)
            System.out.print("\\/");
         for(int j = 1; j < 1 * k -1; j++)
            System.out.print("-");
         for(int j = 0; j <= 0; j++)
            System.out.print("]");
            
      System.out.println();
      }
     } 
      
      //body type B
      
   public static void top(String[] args) {   
      
     for(int k = 2; k <= 5; k++) {
         for(int j = 0; j <= 0; j++)
            System.out.print("[");
         for(int j = 0; j <= -1 * k +5 ; j++)
            System.out.print("/");
         for(int j = 1; j < 1 * k +1; j++)
            System.out.print("-");
         for(int j = 1; j < 1 * k +1; j++)
            System.out.print("-");
         for(int j = 0; j <= -1 * k +5 ; j++)
            System.out.print("\\");
         for(int j = 0; j <= 0; j++)
            System.out.print("]");
            
      System.out.println();
      }
    }

  public static void top(String[] args) {

}  
}
}

/*  
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\
+~~~~~~~~~~+
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
[///----\\\]
[//------\\]
[/--------\]
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
+~~~~~~~~~~+
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\
 
 */
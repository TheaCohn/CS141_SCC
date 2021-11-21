// Thea Cohn
// CS 141
// HW Core Topics: primitive data and definite loops
//
// testing random code

import java.util.*;  //for scanner
// import java.math.RoundingMode;
// import java.text.DecimalFormat;


class HW3_Admissions {
 
	public static void main(String[] args) {
      
      
      //Intro text
      System.out.println("This program compares two applicants to\ndetermine which one seems like the stronger");
      System.out.println("applicant.  For each candidate I will need\neither SAT or ACT scores plus a weighted GPA.");
      System.out.println();
      
      //applicants
      applicant( 1 );
      applicant( 2 );

      double score1 = 0;
      double score2 = 0;
      
      //closing text
      
      scoreOverall();
   }    
    

   //Collects SAT test data and calculates overall SAT score
   public static void sat(double mathSAT, double critReading, double writing, double examScore){
   
      Scanner sc = new Scanner(System.in);
//       DecimalFormat df = new DecimalFormat("#.#");
//       df.setRoundingMode(RoundingMode.CEILING);
      
      System.out.print("SAT math?  ");
      mathSAT = sc.nextInt();
      
      System.out.print("SAT critical reading?  ");
      critReading = sc.nextInt();
      
      System.out.print("SAT writing?  ");
      writing = sc.nextInt();
      
      examScore = (2 * mathSAT + critReading + writing) / 32;
      
      System.out.print("exam score = " + examScore);       
      
  }

   //Collects ACT test data and calculates overall ACT score
   public static void act( double english, double mathACT, double reading, double science, double examScore){
   
      Scanner sc = new Scanner(System.in);
//       DecimalFormat df = new DecimalFormat("#.#");
//       df.setRoundingMode(RoundingMode.CEILING);

      System.out.print("ACT english?  ");
      english = sc.nextInt();
      
      System.out.print("ACT math?  ");
      mathACT = sc.nextInt();
      
      System.out.print("ACT reading?  ");
      reading = sc.nextInt();
      
      System.out.print("ACT science?  ");
      science = sc.nextInt();
      
      examScore = (english + 2 * mathACT + reading + science) / 1.8;
      
      System.out.print("exam score = " + examScore );
   
   }

   //Collects GPA data and calculates overall GPA score
   
   public static void gpa( double overallGPA, double maxGPA, double multiplier){
   
      Scanner sc = new Scanner(System.in);
      // DecimalFormat df = new DecimalFormat("#.#");
//       df.setRoundingMode(RoundingMode.CEILING);
     
      System.out.print("overall GPA?  ");
      overallGPA = sc.nextInt();
      
      System.out.print("max GPA?  ");
      maxGPA = sc.nextInt();
      
      System.out.print("Transcript Multiplier?  ");
      multiplier = sc.nextInt();
      
      double gpaScore = overallGPA / maxGPA * 100 * multiplier;
      
      System.out.print("GPA score = " + gpaScore);       
   
   }
   
   
   //compare final scores calculated in applicants
   public static void scoreOverall( double score1, double score2 ){
      
      
      Scanner sc = new Scanner(System.in);
     //  DecimalFormat df = new DecimalFormat("#.#");
//       df.setRoundingMode(RoundingMode.CEILING);    
//     
      System.out.println("First applicant overall score  = " + score1);
      System.out.println("Second applicant overall score = " + score2);
      
      if (score1 == score2){
        System.out.println("The two applicants seem to be equal"); 
         
      } else if (score1 > score2) {
        System.out.println("The first applicant seems to be better"); 
         
      } else if (score1 < score2){
         System.out.println("The second applicant seems to be better");
      
      }
   
   }
   
   public static void applicant(int number){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Information for applicant #" + number + ":");
      System.out.print("do you have 1) SAT scores or 2) ACT scores  ");
      int testType = sc.nextInt();
      
         if (testType == 1){
            sat( 1, 1, 1, 1);
        
         } else{ 
            act( 1, 1, 1, 1, 1);
         }
   System.out.println();
   gpa( 1, 1, 1);
   
   //define overall score
   double overallScore = 0;
   
   if (testType == 1){
      overallScore = gpa.gpaScore + sat.examScore ;
   }else if (testType == 2){
      overallScore = gpaScore.gpa + examScore.act ;
   }
   
   
   // export overall scores as different variables
   if (number == 1){
      return score1 = overallScore;
      
   }else if (number == 2){
      return score2 = overallScore;
   
   }
   }
   
   
}

/*OUTPUT
This program compares two applicants to
determine which one seems like the stronger
applicant.  For each candidate I will need
either SAT or ACT scores plus a weighted GPA.

Information for applicant #1:
    do you have 1) SAT scores or 2) ACT scores? __1__
    SAT math? __450__
    SAT critical reading? __530__
    SAT writing? __490__
    exam score = 60.0
    overall GPA? __3.4__
    max GPA? __4.0__
    Transcript Multiplier? __0.9__
    GPA score = 76.5

Information for applicant #2:
    do you have 1) SAT scores or 2) ACT scores? __2__
    ACT English? __25__
    ACT math? __20__
    ACT reading? __18__
    ACT science? __15__
    exam score = 54.4
    overall GPA? __3.3__
    max GPA? __4.0__
    Transcript Multiplier? __0.95__
    GPA score = 78.4

First applicant overall score  = 136.5
Second applicant overall score = 132.8
The first applicant seems to be better
*/
/**
 * Programmer: Juan Garcia
 * Date: August 31, 2018
 * */import java.util.*;
 import java.io.*;
 public class MySnapChat{
   /**
    * Main Method
    * @throws IOException while using files
    * @param args an array of an object String
    * */
   public static void main(String[] args)throws IOException{
     Scanner fr = new Scanner(new File("contacts.txt"));
     Contact[] cs = new Contact[Integer.parseInt(fr.nextLine())];
     for(int i = 0;i < cs.length;i++){
       cs[i] = new Contact();
       String line = fr.nextLine();
       String token[] = line.split(",");
       cs[i].setName(token[0]);
       cs[i].setSend((Integer.parseInt(token[1])));
       cs[i].setReceive(Integer.parseInt(token[2]));
     }
     writeToFile("statistic.txt",cs);
     fr.close();
   }//End of Main
   /**
    * Prints out all Contacts in .toString()
    * @param cs Array of Contacts
    * */
   public static void printContacts(Contact[] cs){
     //print out format of .toString of every contact
     for(int i = 0; i < cs.length;i++){
       System.out.println(cs[i].toString());
     }
   }//End of printContacts
   /**
    * Returns an int of the Average Send Messeges
    * @param cs Array of Contacts
    * @return int Average of Send messeges
    * */
   public static int getAverageSend(Contact[] cs){
     //adding all send and dividing by array length to get average
     int avg = 0;
     for(int i = 0; i < cs.length;i++){
       avg += cs[i].getSend();
     }
     return avg/cs.length;
   }//End of getAverageSend
   /**
    * Returns an int of the Average Received Messeges
    * @param cs Array of Contacts
    * @return double Average of Receive messeges
    * */
   public static double getAverageReceived(Contact[] cs){
     //addin all received and deviding by length of array to get avg
     int avg = 0;
     for(int i = 0; i < cs.length;i++){
       avg += cs[i].getReceive();
     }
     return avg/cs.length;
   }//End of getAverageReceived
   /**
    * Returns an String of the Name of the most sent messeges
    * @param cs Array of Contacts
    * @return String Name of max Sender
    * */
   public static String findMaxSent(Contact[] cs){
     int greatest = -999;
     String mostSent = "";
     for(int i = 0; i < cs.length;i++){
       //if statement checking if greatest less tan cs send at position i then replaces
       if(greatest < cs[i].getSend()){
         greatest = cs[i].getSend();
         mostSent = cs[i].getName();
       }
     }
     return mostSent;
   }//End of findMaxSent
   /**
    * Returns a String of Maxed Received
    * @param cs Array of Contacts
    * @return String Max Received
    * */
   public static String findMaxReceived(Contact[] cs){
     int greatest = -999;
     String mostReceived = "";
     for(int i = 0; i < cs.length;i++){
       //if statement checking if greatest less tan cs receive at position i then replaces
       if(greatest < cs[i].getReceive()){
         greatest = cs[i].getReceive();
         mostReceived = cs[i].getName();
       }
     }
     return mostReceived;
   }//End of findMaxReceived
   /**
    * Returns a String name of least number of sent messeges
    * @param cs Array of Contacts
    * @return String Name of least number of sent messages
    * */
   public static String findMinSent(Contact[] cs){
     int min = 999;
     String leastSent = "";
     for(int i = 0; i < cs.length;i++){
       //if statement checking min greater tan cs send at position i then replaces
       if(min > cs[i].getSend()){
         min = cs[i].getSend();
         leastSent = cs[i].getName();
       }
     }
     return leastSent;
   }//End of findMinSent
   /**
    * Returns a Name of the least received messeges
    * @param cs Array of Contacts
    * @return String Name of least received
    * */
   public static String findMinReceived(Contact[] cs){
     //Created a variable greater than every other number thats smaller than that
     //can be replaced everytime by another number that is smaller
     int min = 999;
     String leastReceived = "";
     for(int i = 0; i < cs.length;i++){
       //if statement checking min greater tan cs at position i then replaces
       if(min > cs[i].getReceive()){
         min = cs[i].getReceive();
         leastReceived = cs[i].getName();
       }
     }
     return leastReceived;
   }//End of findMinReceived
   /**
    * Writes to file using PrintWriter
    * @param s String name of file to be writen in
    * @param cs The array in which all methods being called will use
    * */
   public static void writeToFile(String s,Contact[] cs)throws IOException{
     File file = new File(s);
     PrintWriter pw = new PrintWriter(file);
     pw.print("Contacts: ");
     for(int i = 0; i < cs.length;i++){
       pw.print(cs[i].getName() + " , ");}
     pw.println();
     pw.println("Average number of sent messages is: " + getAverageSend(cs));
     pw.println("Average number of received messeges is: " + getAverageReceived(cs));
     pw.println("Individual with the most message sent is: " + findMaxSent(cs));
     pw.println("Individual with the most message received is: "+ findMaxReceived(cs));
     pw.println("Individual with the least message sent was: " + findMinSent(cs));
     pw.println("Individual with the least message received was: " + findMinReceived(cs));
     pw.close();
   }//end of writeToFile
 }//end of class
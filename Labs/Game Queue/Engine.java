//Doesnt work go to simulate.java

import java.util.*;
import java.io.*;
public class Engine{
  public static MyQueue playRoom = new MyQueue();
  public static MyQueue waitingQ = new MyQueue();
  public static boolean proccessed = false;
  public static int TIME = 0;
  public static int TOTAL_TIME = 0;
  public static int TOTAL_CAPACITY = 0;
  public static int PROCESSING = 0;
  public static int P = 0;
  public static int PLAYED = 0;
  public static int STAY = 0;
  public static int AWAITING = 0;
  public static int WAITING = 0;
  public static int DEQUEDW = 0;
  public static void main(String [] args) throws Exception,IOException{
    Scanner uI = new Scanner(System.in);
    // ask the user for how total time for the simulation to run
    System.out.println("Please enter total time for simulation");
    TOTAL_TIME = uI.nextInt();
    // ask capacity of the waiting queue
    System.out.println("Please enter total capacity for waiting queque.");
    TOTAL_CAPACITY = uI.nextInt();
    // ask capacity of the processing queue queue (linked list)
    System.out.println("Please enter the  capacity processing list");
    PROCESSING = uI.nextInt();
    MyLinkedList proccessing = new MyLinkedList();
    int TIME = 0; // variable that keeps track of every minute
    
    /************** Simulate the Player Object **************/
    String   usrName   = "cscs";
    int   arrivalTime  = 10;
    int    waitingTime = 5;
    boolean  processed = false;
    /********************************************************/
    // read the file
    Scanner nFile = new Scanner(new File("names.txt"));
    
    // sort Players based on arrival time
    Scanner nFile2 = new Scanner(new File("names.txt"));
    int[] temp = new int[18];
    while(nFile2.hasNextLine()){
      for(int i = 0;i < temp.length;i++){
        Player p = new Player(nFile2.nextLine());
        temp[i] = p.getArrivalTime();
      }
    }
//    QuickSort ob = new QuickSort();
//    ob.sort(temp,0,temp.length-1);
    nFile.close();
    nFile = null;
    nFile = new Scanner(new File("names.txt"));
    Scanner f = new Scanner(new File("names.txt"));
    // define the queue based on capacity
    MyQueue players = new MyQueue();
    // store Players based on arrival time
    for(int i = 0; i < temp.length;i++){
      Player p = new Player(nFile.nextLine());
      while(p.getArrivalTime() != temp[i]){
        p = new Player(f.nextLine());
      }
      System.out.println(p);
      players.enqueue(p);
      waitingQ.enqueue(p);
      playRoom.enqueue(p);
      f.close();
      f = null;
      f = new Scanner(new File("names.txt"));
    }
    nFile.close();
    while(TIME <= TOTAL_TIME){
      // process each player.
      // E.g.,
      
      if(TOTAL_CAPACITY >= 0){
        if(players.peek().getArrivalTime() == TIME){
          System.out.println(players.dequeue().getUsrName() + "has join the session");
        }
        TOTAL_CAPACITY--;
      }
      updateWaitingQueue(waitingQ);
       if(P != 0){
         updatePlayingTime(playRoom);
         P--;
       }
      TIME++;
      Thread.sleep(500);     // used to appreciate simulation :-)
      System.out.println("Minute:\t"+TIME);
      
    }
    STAY = PLAYED - players.size();
    uI.close();
    System.out.println("Thank you for playing...");
    writeStatic("statistics.txt");
    
  }
  public static void updateWaitingQueue(MyQueue w)throws EmptyQueueException{
      if((w.peek().getArrivalTime() + w.peek().getWaitingTime()) == TIME){
        proccessed = true;
        P++;
        System.out.println(w.peek() + " has entered the lobby");
        playRoom.enqueue(w.peek());
        w.dequeue();
        PLAYED++;
        DEQUEDW++;
      } 
  }
  public static void updatePlayingTime(MyQueue p)throws EmptyQueueException{
    proccessed = p.peek().getProcessed();    
      if(p.peek().getGameTime() == TIME){
        System.out.println(p.dequeue() + "has left game");
      }
  }
  public static void writeStatic(String f) throws IOException{
    File file = new File(f);
    PrintWriter pr = new PrintWriter(file);
    pr.println("Total time: " + TOTAL_TIME);
    pr.println("Capacity of Waiting Queue: "+TOTAL_CAPACITY);
    pr.println("Proccesed: "+P);
    pr.println("Players played"+PLAYED);
    pr.println("Players that stayed; "+STAY);
    pr.println("Average play time: "+AWAITING);
    pr.println("Number of players enqueued: "+WAITING);
    pr.println("Number of players deqeueud: "+DEQUEDW);
    pr.close();
  }
}
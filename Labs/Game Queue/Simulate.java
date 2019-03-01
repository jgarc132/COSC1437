import java.util.Scanner;
import java.io.*;
public class Simulate{
  public static int playersInGame = 0;
  public static void main(String [] args) throws Exception,IOException{
    Scanner uI = new Scanner(System.in);
    System.out.println("Please enter total time for simulation");
    int TIME_ALLOWED = uI.nextInt();
    uI.close();
    int TIME = 0;
    Scanner nFile = new Scanner(new File("names.txt"));
    Player[] temp = new Player[18];
    int count = 0;
    while(nFile.hasNextLine()){      
      Player p = new Player(nFile.nextLine());
      temp[count] = p;
      count++;
      //temp.enqueue(p);
    }
    sort(temp);
    MyQueue players = new MyQueue();
    for(int i = 0; i < temp.length;i++){
      players.enqueue(temp[i]);
      //System.out.println(temp[i]);
    }
    MyQueue waitingRoom = new MyQueue();
    MyLinkedList gameRoom = new MyLinkedList();
      while(TIME <= TIME_ALLOWED){
        if(!players.isEmpty()){
          if(players.peek().getArrivalTime() == TIME){
            players.peek().setProcessed(true);
            System.out.println(players.peek().getUsrName() + " \t has joined the Waiting Room");
            waitingRoom.enqueue(players.dequeue());
          }
        }
        if(!players.isEmpty()){
          if(players.peek().getArrivalTime() == TIME){
            players.peek().setProcessed(true);
            System.out.println(players.peek().getUsrName() + " \t has joined the Waiting Room");
            waitingRoom.enqueue(players.dequeue());
          }
        }
      updateWaitingTime(waitingRoom,gameRoom);
      //updatePlayingTime(gameRoom);
      TIME++;
      Thread.sleep(500);     // used to appreciate simulation :-)
      System.out.println("Minute:\t"+TIME);
      
    }
    System.out.println("Thank you for playing...");
  }
  public static void updateWaitingTime(MyQueue x, MyLinkedList gRoom) throws EmptyQueueException{
    if(x.isEmpty())
      return;
    else{
      if(x.peek().getWaitingTime() > 0)
        x.peek().updateWaiting();
      else{
        gRoom.add(x.peek());
        gRoom.printNext(); 
        System.out.print(" \t has joined Game Room \n");
        x.dequeue();
      }
    }
  }
  //Update playing time the playersInGame replaces each player so never lets them leave
//  public static void updatePlayingTime(MyLinkedList gRoom){
//    if(gRoom.getNext() == null)
//      return ;
//    else{
//      if(gRoom.getNext().getGameTime() > 0)
//        gRoom.getNext().updateGameT();
//      else if(gRoom.getNext().getGameTime() == 0){
//        gRoom.printNext();
//        System.out.println(" has left the Game Room");
//      }
//    }
//  }
  public static void sort(Player a[]){
    for(int i = 0; i < a.length-1;i++){
      for(int j = 0; j < a.length-i-1;j++){
        if(a[j].compareTo(a[j+1]) > 0){
          Player tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }
}
public class Player{
  private String usrName;
  private int arrivalTime;
  private int waitingTime;
  private int gameTime;
  private boolean processed;
  
  public Player(String line){
    String newLine = line.replace("\t", "");
    for(int i = 0;i <= 3;i++){
      String token[] = newLine.split(",");
      this.usrName = token[0];
      this.arrivalTime = Integer.parseInt(token[1]);
      this.waitingTime = Integer.parseInt(token[2]);
      this.gameTime = Integer.parseInt(token[3]);
    }
  }
  public Player(String usrName, int arrivalTime, int waitingTime, int gameTime, boolean processed){
    this.usrName = usrName;
    this.arrivalTime = arrivalTime;
    this.waitingTime = waitingTime;
    this.gameTime = gameTime;
    this.processed = processed;
  }
  public String getUsrName(){
    return this.usrName;
  }
  public int getArrivalTime(){
    return this.arrivalTime;
  }
  public int getWaitingTime(){
    return this.waitingTime;
  }
  public int getGameTime(){
    return this.gameTime;
  }
  public boolean getProcessed(){
    return this.processed;
  }
  public void setProcessed(boolean processed){
    this.processed = processed;
  }
  public int compareTo(Object o){
    Player tmp = (Player) o;
    if(this.arrivalTime == tmp.arrivalTime){
      if(this.waitingTime == tmp.waitingTime){
        return this.waitingTime - tmp.waitingTime;
      }
    }
    return this.arrivalTime - tmp.arrivalTime;
  }
  public void updateWaiting(){
    if(processed == true)
      waitingTime--;
  }
  public void updateGameT(){
    if(gameTime > 0)
      gameTime--;
  }
  public String toString(){
    return  "Username: " + usrName +"\t Arrival: " + arrivalTime +"\t Waiting: " + waitingTime + "\t Game Time: " + gameTime + "\t Processed: "+ processed;
  }
}
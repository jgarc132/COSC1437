public class Contact{
  private String name;
  private int send;
  private int receive;
  public Contact(){
    this.name = null;
    this.send = 0;
    this.receive = 0;
  }
  public Contact(String name,int send,int receive){
    this.name = name;
    this.send = send;
    this.receive = receive;
  }
  public String getName(){
    return this.name;
  }
  public int getSend(){
    return this.send;
  }
  public int getReceive(){
    return this.receive;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setSend(int send){
    this.send = send;
  }
  public void setReceive(int receive){
    this.receive = receive;
  }
  public String toString(){
    return getName() + " | " + (getSend() + getReceive());
  }
}
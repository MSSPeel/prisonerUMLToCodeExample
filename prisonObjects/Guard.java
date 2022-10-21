package prisonObjects;

public class Guard{
  
  private String name;
  private final int ID;
  private static int guardCounter = 0;
  public Guard(String name){
    ID = guardCounter++;
    this.name = name;
  }
  public String getName() {
  	return name;
  }
  public void setName(String name) {
  	this.name = name;
  }
  public int getID() {
  	return ID;
  }
  public static int getGuardCounter() {
  	return guardCounter;
  }

  @Override
  public String toString(){
    String info = "Guard name: " + name;
    info += "\nGuard ID " + ID;

    return info;
  }
}
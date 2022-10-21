package prisonObjects;
/** 
 * The Cell class 
* <p> This class is the blue print for Cell objects</p>
* @author Murzaku George
* @version 1.0
* @since 2022-11-19
*/
public class Cell{
  //Fields
  /**
  * Name is a String that holds the name of the Cell
  */
  private String name;
  /**
  * <p> open is a boolean field </p>
  * <p> Determines the status of the door.</p>
  * <p> It is true for open and false for closed.</p>
  */
  private boolean open;
  /**
  * <p> code is the secret digit to be used for opening the door </p>
  * <p> It can be set and seen only by a Guard type </p>
  */
  private int code;

  //Constructors
  /**
  * <p>This constructor will generate an instance of a Cell</P>
  * <p>with name and status of the door already initialized</p>
  * @param name The name of a cell
  * @param open The status of the door 
  */
  public Cell (String name, boolean open){
    this.name = name;
    this.open = open;
  }
 
  /**
  * <p>This constructor will generate an instance of a Cell</P>
  * <p>with name and status of the door already initialized</p>
  * <p>and the entry code preset</p>
  * @param name The name of a cell
  * @param open The status of the door 
  * @param code The preset code to be used to open/close the door
  */
  public Cell (String name, boolean open, int code){
    this(name, open); //Use the simpler constructor
    this.code = code;
  }

  //getters and setters
  /**
  *
  */
  public String getName(){
    return name; 
  }
  
  /**
  *
  */
  public void setName(String name){
    this.name = name;
  }

  /**
  *
  */
  public boolean getOpen(){
    return open;
  }

  /**
  *
  */
  public int getCode(Guard guard){
    return (guard != null && guard instanceof Guard)? code: 0;
  }

  /**
  *
  */
  public boolean setCode(Guard guard, int code){
    if (guard != null && guard instanceof Guard){
      this.code = code;
      return true;
    }
    return false;
  }

  // special method

  /**
  *
  */
  public void changeDoorStatus(int code){
    if (this.code == code){
      if (open){
        open = false;
      }else{
        open = true;
      }
    }
  }

  // overwritten method
  /**
  *
  */
  public String toString(){
    String cell = "Cell name: " + name;
    cell += "\nDoor status: " + ((open)?"Open":"Close");
    cell += "\nCode: " + "You wish!";
    return cell;
  }
}
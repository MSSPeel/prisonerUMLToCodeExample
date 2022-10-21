package prisonObjects;
public class Prisoner{
  
  //Fields
  private String name;
  private final int BOOKING_NUMBER;
  private float height;
  private int sentence;
  private Cell cell;
  private static int prisonerCount = 0;

  //Cosntructors
  public Prisoner (String name, float height){
    BOOKING_NUMBER = prisonerCount++;
    this.name = name;
    this.height = height;
  }

  public Prisoner (String name, float height, int sentence){
    this(name, height);
    this.sentence = sentence;
  }

  public Prisoner (String name, float height, int sentence, Cell cell){
    this(name,height,sentence);
    this.cell = cell;
  }

  //Getters and setters
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBOOKING_NUMBER() {
		return BOOKING_NUMBER;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getSentence() {
		return sentence;
	}

	public void setSentence(int sentence, Guard guard) {
    if (guard != null && guard instanceof Guard){
      this.sentence = sentence;
    }
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell, Guard guard) {
    if (guard != null && guard instanceof Guard){
		  this.cell = cell;
    }
	}

	public static int getPrisonerCount() {
		return prisonerCount;
	}

  @Override
  public String toString(){
    
    String info = "Name " + name;
    info += "\nBooking number " + BOOKING_NUMBER;
    info += "\nHeight " + height;
    info += "\nSentence " + sentence;
    info += "\nCell " + cell.toString();

    return info;
  }

}
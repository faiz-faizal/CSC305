
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Student
{
    // instance variables - replace the example below with your own
    protected String id;
    protected String name;
    protected String program;
    protected String gender;
    protected boolean college; 
    
    public Student(){}
    //constructor
    public Student(String id, String name, String program, String gender, boolean college)
    {
        this.id = id;
        this.name = name;
        this.program = program;
        this.gender = gender;
        this.college = college;
    }
    //setter method
    public void setId(String id){ this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setProgram(String program){ this.program = program;}
    public void setGender(String gender){ this.gender = gender;}
    public void setCollege(boolean college){ this.college = college;}
    
    //getter method
    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getProgram(){ return program;}
    public String getGender(){ return gender;}
    public boolean getCollege(){ return college;}
    
    //processor
    public abstract double calculateFees();
    
    //printer method
    public abstract String toPrint();
   
    
}

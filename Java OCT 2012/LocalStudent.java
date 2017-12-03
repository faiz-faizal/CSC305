
/**
 * Write a description of class LocalStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LocalStudent extends Student
{
    // instance variables - replace the example below with your own
    private String state;
    private double parentIncome;
    
     public LocalStudent(){
        super();
    }
    
    //normal constructor for LocalStudent 
    public LocalStudent(String id, String name, String program, String gender, boolean college, String state, double parentIncome)
    {
        super(id,name, program, gender, college);
        this.state = state;
        this.parentIncome = parentIncome;
    }
    //setter method
    public void setState( String state){ this.state = state;}
    public void setParentIncome( double parentIncome){this.parentIncome = parentIncome;}
    //getter method
    public String getState(){ return state; }
    public double getParentIncome(){ return parentIncome; }
    //processor method for LocalStudent
    public double calculateFees()
    {
       double fees = 1000;
       if(college)
           fees += 300;      
       if( parentIncome < 2500)
            fees = 0;
        
       return fees;
    }
    //printer method
    public String toPrint(){
        
        String print ="Student Details \nID:" + id +
           "\nNAME: " + name + "\nPROGRAM " + program + "\nGENDER: " + gender + "\nCOLLEGE: " + college +
           "\nSTATE: " + state + "\nPARENT INCOME: " + parentIncome + "\nTOTAL FEE: "  + calculateFees() + "\n";
           
           return print;
    }
}

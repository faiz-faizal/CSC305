
public class DailyRental extends Movies
{
    private int days;
    
    public DailyRental( int custId, String name, String movieCode,int days)
    {
        super(custId, name, movieCode);
        this.days = days;
    }
    
    //setter method
    public void setCustId( int custId){this.custId = custId;}
    public void setName( String name){this.name = name;}
    public void setMovieCode( String movieCode){this.movieCode = movieCode;}
    public void setDays( int days){this.days=days;}
    
    //getter method
    public int getCustId(){return custId;}
    public String getName(){return name;}
    public String getMovieCode(){return movieCode;}
    public int getDays(){return days;}
    
    public double calCharges()
    {
       double charges = 0;
       if( movieCode.equalsIgnoreCase("SciFi")){charges = 10.00 * days;}
       else if ( movieCode.equalsIgnoreCase("Comic")){charges = 8.00 * days;}
       else if ( movieCode.equalsIgnoreCase("Act")){charges = 5.00 * days;}

       return charges;
    }
    
    public String toPrint(){
        
           String print ="Daily Rental Details \n Customer ID:" + custId +
           "\nNAME: " + name + "\nMOVIE CODE " + movieCode + "\nTOTOAL DAYS: " + days + "\nCHARGES: " + calCharges() +"\n";
           
        return print;
    }
}

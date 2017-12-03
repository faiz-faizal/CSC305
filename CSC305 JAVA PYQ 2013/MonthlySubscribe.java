
/**
 * Write a description of class MonthlySubscribe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MonthlySubscribe extends Movies
{
    private String subCode;
    private String addMovies;
    
    public MonthlySubscribe( int custId, String name, String movieCode, String subCode, String addMovies)
    {
        super(custId, name, movieCode);
        this.subCode = subCode;
        this.addMovies = addMovies;
    }
    
    //setter method
    public void setCustId( int custId){this.custId = custId;}
    public void setName( String name){this.name = name;}
    public void setMovieCode( String movieCode){this.movieCode = movieCode;}
    public void setAddMovies( String addMovies){this.addMovies = addMovies;}
    public void setSubCode(String subCode){this.subCode = subCode;}
    
    //getter method
    public int getCustId(){return custId;}
    public String getName(){return name;}
    public String getMovieCode(){return movieCode;}
    public String getAddMovies(){return addMovies;}
    public String getSubCode(){return subCode;}
    
    public double calCharges()
    {
       double charges = 0;
       if( movieCode.equalsIgnoreCase("SciFi")){charges = 150;}
       else if ( movieCode.equalsIgnoreCase("Comic")){charges = 100;}
       else if ( movieCode.equalsIgnoreCase("Act")){charges = 80;}
   
       if( addMovies.equalsIgnoreCase("Animation")){charges = charges + 50;}
       else if(addMovies.equalsIgnoreCase("Learning")){charges = charges + 30;}
      
       return charges;
    }
    
    
}


/**
 * Write a description of class Movies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Movies
{
    protected int custId;
    protected String name;
    protected String movieCode;
    
    //normal constructor
    public Movies(int custId, String name, String movieCode)
    {
        this.custId = custId;
        this.name = name;
        this.movieCode = movieCode;
    }
    
    //setter method
    public void setCustId( int custId){this.custId = custId;}
    public void setName( String name){this.name = name;}
    public void setMovieCode( String movieCode){this.movieCode = movieCode;}
    
    //getter method
    public int getCustId(){return custId;}
    public String getName(){return name;}
    public String getMovieCode(){return movieCode;}
    
    public abstract double calCharges();
        
}

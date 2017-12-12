
import java.io.*  ;
import java.util.* ;
import java.text.* ;
import java.lang.* ;
import javax.swing.* ;

public class Main
{
    public static void main(String[]args) throws FileNotFoundException , ParseException , NullPointerException
    {
        //declaration input file
        File txt = new File("movies.txt") ;
       
        Scanner sc = new Scanner(txt) ;
       
        Movies arrayMov[] = new Movies[100];
        
        int i = 0 ;
        while(sc.hasNextLine())
        {
            //reading one line in student.txt
            String line = sc.nextLine() ;
            
            //tokenize using (;) delimeter
            StringTokenizer st = new StringTokenizer(line ,";") ;
            
            //tokenize input from user.txt
            //delimeter is ';'
            int custId = Integer.parseInt(st.nextToken());
            String name= st.nextToken() ;
            String movCod = st.nextToken() ;
            String custType = st.nextToken() ;
            int days = Integer.parseInt(st.nextToken()) ;
            String subsCod = st.nextToken();
            String addMov = st.nextToken();
            
            //Object DailyRental
            if(custType.equalsIgnoreCase("DailyRental"))
            {
                DailyRental dRent = new DailyRental(custId, name, movCod, days);
                arrayMov[i] = dRent;
            }
            //Object MonthlySubscribe
            else 
            {
                MonthlySubscribe mSubs = new MonthlySubscribe(custId, name, movCod,subsCod, addMov);
                arrayMov[i] = mSubs;
            }
            
    
            i++ ;
        }
        
        
        double totalCharge = 0;
        int numOfCust_AddAnim = 0;
        
        for(i=0; i<arrayMov.length; i++)
        {
            if(arrayMov[i] instanceof MonthlySubscribe)
            {
                String temp = arrayMov[i].getAddMovies().equalsIgnoreCase("Animation");
                numOfCust_AddAnim++;
            }
        }
        
        for(i=0; i<arrayMov.length; i++)
        {
            if(arrayMov[i] instanceof DailyRental)
            {
                totalCharge = totalCharge + arrayMov[i].calCharges();
                System.out.println(arrayMov[i].toPrint());
            }
        }
        
        for(i=0; i<arrayMov.length; i++)
        {
            if(arrayMov[i] instanceof MonthlySubscribe)
            {
                totalCharge = totalCharge + arrayMov[i].calCharges(); 
                System.out.println(arrayMov[i].toPrint());
            }
        }
        
        
        System.out.println("\n\nTOTAL CHARGES: " + totalCharge + "\nNUMBER OF CUSTOMER ADD ANIMATION: "+ numOfCust_AddAnim);
        

    }
    
}

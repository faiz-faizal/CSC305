
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
       File txt = new File("student.txt") ;
       
       Scanner sc = new Scanner(txt) ;
       
       Student arrayS[] = new Student[100]; 
       
       int i = 0 ;
        while(sc.hasNextLine())
        {
            //reading one line in student.txt
            String line = sc.nextLine() ;
            
            //tokenize using (;) delimeter
            StringTokenizer st = new StringTokenizer(line ,";") ;
            
            //tokenize input from user.txt
            //delimeter is ';'
            String id = st.nextToken() ;
            String name = st.nextToken() ;
            String program = st.nextToken() ;
            String gender = st.nextToken() ;
            boolean college = Boolean.parseBoolean(st.nextToken()) ;
            String state = st.nextToken();
            double parentIncome=Double.parseDouble(st.nextToken());
            String countryFrom = st.nextToken();
            
            //Object local student
            if(countryFrom.equalsIgnoreCase("malaysia"))
            {
                LocalStudent local = new LocalStudent(id, name, program, gender, college, state, parentIncome);
                arrayS[i] = local;
            }
            //Object international student
            else 
            {
                InternationalStudent inter = new InternationalStudent(id, name, program, gender, college, countryFrom);
                arrayS[i] = inter;
            }
            
    
            i++ ;
        }
       
         
       
       double totalfeesLocal = 0;
       for( i = 0; i < arrayS.length ; i++){           
            if( arrayS[i] instanceof LocalStudent){
                totalfeesLocal += arrayS[i].calculateFees();   
            }
        }
        
       
       for( i = 0; i < arrayS.length ; i++){
           if( arrayS[i] instanceof InternationalStudent){
              if( arrayS[i].getCountryFrom().equalsIgnoreCase("Yemen"))
                System.out.println(arrayS[i].toPrint());          
            }
       }
     
      
    }
}
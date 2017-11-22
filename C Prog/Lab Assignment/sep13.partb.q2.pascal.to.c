#include <stdio.h>

struct employeeRecord 
{
    char name[50];
    float monthly_salary, sales, bonus; //%f
    
};

void discount( struct employeeRecord employee[], int i);
float indx, bonus_BO_sales;

//-------------------question 2 (a)------------------
int main()
{
	int i , temp = 0; //declare dahulu kalau nak buat for loop
	printf("Enter numbers of employee to input: ");
	scanf("%d", &temp);
	struct employeeRecord employee[temp];
	
	for( i = 0; i < temp; i++)
	{
		
	    printf("\nEnter employee's name: ");
	    scanf("%s", &employee[i].name); //%s untuk char
	    printf("\nEnter employee's monthly salary: ");
	    scanf("%f", &employee[i].monthly_salary);
	    printf("\nEnter employee's sales: ");
	    scanf("%f", &employee[i].sales);
		
		discount(employee, i); //---------------question 2 (c)-------------
		
		bonus_BO_sales = employee[i].sales * employee[i].bonus;
		employee[i].bonus = (employee[i].monthly_salary*indx) + bonus_BO_sales;

	}
	
	//-------------------question 2 (d)----------------------
	int f = 0;
	for( f = 0; f < temp; f++)
	{
		printf("\n***** KLM Payment Slip *****");
		printf("\nName of the Employee            : RM %s", employee[f].name);
		printf("\nMonthly Salary of the Employee  : RM %3.2f",employee[f].monthly_salary);
		printf("\nSales of the Employee           : RM %3.2f", employee[f].sales);
		printf("\nCalculated Bonus of the Employee: RM %3.2f", employee[f].bonus);
		
	}
	
	
	
	return 0;
    

}

//-----------------------question 2 (b)--------------------------
void discount( struct employeeRecord employee[], int i)
{
	
   		if( employee[i].sales > 200000)
	   	{
	   		indx = 2;
	   		employee[i].bonus = 3.5;
		}
		
		else if ((employee[i].sales <= 200000) && (employee[i].sales >=100001) )
	    {
	   		indx = 1.5;
	   		employee[i].bonus = 2.5;	
		}
		else if ((employee[i].sales >= 100000  ) && (employee[i].sales > 50001))
		{
			indx = 1;
			employee[i].bonus = 1.5;
		}
		else if((employee[i].sales >=50000)&&(employee[i].sales >=20001))
		{
			indx = 1;
			employee[i].bonus = 1.0;
		}
		else
		{
			indx = 0.5;
			employee[i].bonus = 0.5;
		}
}



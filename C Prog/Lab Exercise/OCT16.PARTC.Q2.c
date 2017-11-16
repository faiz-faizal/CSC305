#include<stdio.h>
#include<stdlib.h>

int main() {
   
   float bmi, weight, height;
   int bmi_category;
   
   printf("Enter your weight in kilograms: ");
   scanf("%f", &weight);
   
   printf("Enter your height in meters: ");
   scanf("%f", &height);
   
   bmi = weight/(height*height);
   printf("Your bmi is: %f", bmi);
  
   if( bmi < 18.5)
   {    bmi_category = 1;}
   else if( (bmi >= 18.5) && (bmi <= 24.9))
   {     bmi_category = 2;}
   else if( (bmi >= 25) && (bmi <= 29.9))
   {     bmi_category = 3;}
   else
   {     bmi_category = 4;}
        
   switch(bmi_category)
   {
      case 1:
      printf("BMI Category: Underweight");
      break;
      
      case 2:
      printf("BMI Category: Normalweight");
      break;
      
      case 3:
      printf("BMI Category: Overweight");
      break;
      
      case 4:
      printf("BMI Category: Obese");
      break;
   }
          
  printf("Your bmi category is: %i",bmi_category);         
                       
  system("PAUSE");
}
  

/*
#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма, която изисква от потребителя да въведе число x, където x e интервала (0;1). 
Да се намери сумата от сбора на реципрочните стойности за всеки две twin primes. Развитието да продължи докато отношението не стане по-малко то x.
*/
#include <stdio.h>
int main()
{
int i;
float x;
double sum = 0,z;
do
{
	printf("Enter number(0<x<1):");
	scanf("%f" , &x);
} while ( x < 0 || x >= 1 );


	for( i = 3; x >= sum; i+=2 )
	{
		if( Prime(i) && Prime(i+2) )
			{
			z=i;
			sum =sum + 1/z + 1/(z+2);
			i=i+2;
			}
	}
printf("sum=%f\n", sum);
return 0;
}

int Prime(unsigned int number) 	
{
	unsigned int i;
    if (number <= 1)
	{
		 return 0;
	}
    for (i=2; i*i <= number; i++)
	 {
        if (number % i == 0)
		{
			return 0;
		}
    	 }
    return 1;
}
		

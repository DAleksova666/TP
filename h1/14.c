/*
#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма,която изисква от потребителя да въведе целочислено число x, където 0<x<10. Да се инициализира масив от 10 елемента. Да се намери първото просто число в интервала [0; +∞) завършващо на x и да се запише като първи елемент в масива. Да се намери второто просто число в интервала [0;  +∞) завършващо на x и да се запише като втори елемент в масива. Аналогично да се намерят първите N прости числа в интервала [0;  +∞) и да се запишат като елемент N в масива. Масивът да се изведе на стандартния изход.
*/

#include <stdio.h>
int main()
{
int x,n,y,i=0;
int arr[10];
int max=100000;
do
{
	printf("Enter number(0<x<10):");
	scanf("%d" , &x);
} while ( x < 0 || x >= 10 );

switch (x) 
{
case 2:
  printf("Prosto chislo:%d\n", x);
  break;
case 4:
  printf("Nqma takiva prosti chisla\n");
  break;
case 5:
  printf("Prosto chislo:%d\n", x);
  break;
case 6:
  printf("Nqma takiva prosti chisla\n");
  break;
case 8:
  printf("Nqma takiva prosti chisla\n");
  break;
default:
for (n=0;n<max;n++)
{
for ( y = 2 ; y <= n - 1 ; y++ )
   		{
      		if ( n%y == 0 )
      		break;
   		}
	if ( y == n )
     		{
		if ( n%10 == x)
		{
		arr[i]=n;
		i++;
		}
		}
	}
printf("Prostite chisla sa:\n");
for ( i=0; i<=9 ;i++)
	{
	printf("%d\n", arr[i]);
	}
    break;
}


return 0;
}	

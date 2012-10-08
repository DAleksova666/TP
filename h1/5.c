/*
#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма, която изисква от потребителя да въведе целочислено число, x, където 0 < x < 10. Да се инициализират масива от 10 елемента. Стойностите на елементите на масива да са равни на косинус от индекса на елемента. Да се изведе масивът, след което да се сортира в низходящ ред и отново да се изведе.
*/

#include <stdio.h>
#include <math.h>

enum bool{FALSE, TRUE};

void bubbleSort(double arr[], int(*order)(double, double), int max);

void swap( double *a, double *b );

int desc( double a, double b);

int main()
{
int x,i;
double arr[10];
double index = 0.00f,n;
	
do
{
	printf("Enter number(0<x<10):");
	scanf("%d" , &x);
} while ( x < 0 || x >= 10 );

for(i = 0; i < 10; i++)
{
	arr[i] = cos(index);
	index++;
}

printf("Before\n");
for( i = 0; i < x; i++ )
{
	printf("Array[%d] = %f\n", i, arr[i]);
}
bubbleSort( arr, desc, x );

printf("After \n");
for( i = 0; i < x; i++ )
{
	printf("Array[%d] = %f\n", i, arr[i]);
}

return 0;

}

void swap(  double *a, double *b )
{
	double temp;

	temp = *a;
	*a = *b;
	*b = temp;
}
int desc( double a, double b)
{
	if(a > b)
	{
		return 0;
	}
	return 1;
}

void bubbleSort(double arr[], int(*order)(double, double), int max)
{
	int swaped = FALSE, i, j;

	while(!swaped)
	{
		swaped = TRUE;
		for(i = 0; i < max; i++)
		{
			if( order(arr[i], arr[i+1]) )
			{
				swap(&arr[i], &arr[i+1]);
				swaped = FALSE;
			}
		}
		max -= 1;
	}	
}



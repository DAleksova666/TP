/*
#Училище - Технологично училище „Електронни системи” към Технически университет – София
#Клас - 11Б
#Номер - 12
#Име - Даниела Алексова
#Задача - Програма, която изисква от потребителя да въведе целочислено
число x, където 0<x<10. Да се инициализира масив от 100 целочислени елемента.
Стойностите на елементите да са случайни числа в интервала [0, 100).
Елементите на масива да се подредят така, че числата завършващи на x да са в началото.
*/

#include <stdio.h>

enum bool{FALSE, TRUE};
const MIN_RAND = 0;
const MAX_RAND = 100;

void bubbleSort(int arr[], int(*order)(int, int), int max, int x);

void swap( int *a, int *b );

int endsWith(int, int);

int main()
{
int x,i;
int arr[100];
	
do
{
	printf("Enter number(0<x<10):");
	scanf("%d" , &x);
} while ( x < 0 || x >= 10 );

for(i = 0; i < 100; i++)
	{
	arr[i] = MIN_RAND + rand() % (MIN_RAND - MAX_RAND);
	}

bubbleSort(arr, endsWith, 100, x);

for( i = 0; i < 100; i++ )
	{
	printf("Arr[%d] = %d\n", i, arr[i]);	
	}
}

void swap( int *a, int *b )
{
	int temp;

	temp = *a;
	*a = *b;
	*b = temp;
}
int endsWith(int i, int x)
{
	if( i % 10 == x )
	{
		return 1;
	}
	return 0;
}
void bubbleSort(int arr[], int(*order)(int, int), int max, int x)
{
	int i, j, swaped;

	for( i = 0; i <= max; i++ )
	{
		swaped = FALSE; j = 0;
		if(order(arr[i], x))
		{
			while(!swaped)
			{
				if( !order(arr[j], x) )
				{
					swap(&arr[j], &arr[i]);	
					swaped = TRUE;	
				}
				j++;
			}
		}
	}	
}

#include <stdio.h>
int n;

void printReverse(int a[],int n1)
{
   if(n1<0)
    return;
   printf("%d\n",a[n1]);
   printReverse(a,n1-1);	
}

int main()
{
	int n=5;
	int a[5]={1,2,3,4,5};
	printReverse(a,n);
}

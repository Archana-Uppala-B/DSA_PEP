#include <stdio.h>

int main()
{
	int a[5]={1,2,3,4,5};
	print(a,4);
}
 void print(int a[],int ind)
 {
 	if(ind<0)
 	{
 		return;
	 }
	print(a,ind-1);
	printf("%d\n",a[ind]);
 }

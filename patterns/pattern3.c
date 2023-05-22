#include <stdio.h>

int main()
{
	int i,j,n;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			printf("\t");
		}
		for(j=0;j<i;j++)
		{
			printf("*\t");
		}
		printf("\n");
	}
}

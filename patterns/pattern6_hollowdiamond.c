#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n;
	scanf("%d",&n);
	int st=(n/2)+1;
	int sp=1;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=st;j++)
		{
			printf("*\t");
		}
		for(j=1;j<=sp;j++)
		{
			printf("\t");
		}
		for(j=1;j<=st;j++)
		{
			printf("*\t");
		}
		if(i<=n/2)
		{
			st-=1;
			sp+=2;
		}
		else
		{
			st+=1;
			sp-=2;
		}
		printf("\n\n");
	}
}

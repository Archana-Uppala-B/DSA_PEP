#include <stdio.h>
int main()
{
	int n;
	int i,j;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i+j==n+1)
			{
				printf("*\t");
			}
			else
			{
				printf("\t");
			}
		}
		printf("\n\n");
	}
	
}

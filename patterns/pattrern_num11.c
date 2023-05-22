#include <stdio.h>

int main()
{
	int n,i,j,val=1;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d\t",val++);
		}
		printf("\n");
	}
}

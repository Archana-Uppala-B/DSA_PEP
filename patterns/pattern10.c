#include <stdio.h>

int main()
{
	int n,i,j;
	scanf("%d",&n);
	int os=n/2;
	int is=-1;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=os;j++)
		{
			printf("\t");
		}
		printf("*\t");
		
		for(j=1;j<=is;j++)
		{
			printf("\t");
		}
		if(i>1 && i<n)
		{
			printf("*\t");
		}
		if(i<=n/2)
		{
			os--;
			is+=2;
		}
		else
		{
			os++;
			is-=2;
		}
		printf("\n");
	}
}

#include <stdio.h>

int main()
{
	int n,i,j,a=0,b=1,c;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d\t",a);
			c=a+b;
			a=b;
			b=c;
		}
		printf("\n");
	}
}

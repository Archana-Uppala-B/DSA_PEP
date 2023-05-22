#include <stdio.h>

int main()
{
	int n;
	scanf("%d",&n);
	pzz(n);
}

void pzz(int n)
{
	if(n==0)
	{
		return;
	}
	printf("pre %d\n",n);
	pzz(n-1);
	printf("In %d\n",n);
	pzz(n-1);
	printf("post %d\n",n);
}

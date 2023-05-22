#include <stdio.h>

int main()
{
	int n;
	scanf("%d",&n);
	char a='A',b='B',c='C';
	toi(n,a,b,c);
}

void toi(int n,char A,char B,char C)
{
	if(n==0)
	 return;
	toi(n-1,A,C,B);
	printf("%d %c - %c\n",n,A,B);
	toi(n-1,C,B,A);
}

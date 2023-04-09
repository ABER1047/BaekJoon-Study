#include<stdio.h>

int main(){
	int a,b,cnt=0,i=1;
	int arr[1000];
	printf("%d %d %d\n",cnt,a,b);
	while(cnt<1000){
		for (int j=0;j<i;j++){
			arr[cnt]=i;
			cnt++;
		}
		i++;
		printf("%d %d %d\n",cnt,a,b);
	}
	scanf("%d %d",&a,&b);
	cnt=0;
	for(int j=a;j<=b;j++){
		cnt+=arr[j-1];
	}
	printf("%d",cnt);
}


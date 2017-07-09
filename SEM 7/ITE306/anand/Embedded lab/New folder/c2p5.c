#include<regx51.h>
#include "wait.c"
int main(){
	int x=0x00;
	while(1){
		P1=x;
		wait(10000);
		x=x+1;
		if(x==10){
			break;
		}
	}
}
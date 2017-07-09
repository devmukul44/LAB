#include<regx51.h>
#include "wait.c"
int main(){
	P1=0x01;
	while(1){
		wait(10000);
		P1=P1<<1;
		if(P1==0x80){
			wait(10000);
			P1=0x00;
			break;
		}
	}
}
		
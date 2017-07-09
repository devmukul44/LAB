#include<regx51.h>
int main(){
	while(1){
		if(P1 %2==0){
			P2=0x10;
			P3=0xFF;
		}
		else{
			P3=0x08;
			P2=0xFF;
		}
	}
	return 0;
}
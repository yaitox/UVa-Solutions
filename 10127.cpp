#include <bits/stdc++.h>


using namespace std;

int main(){

int n;
while(cin>>n){
 int i;
 
int p=1;
 
 for(i=1;;i++){
 
 
  
  if(p%n==0){cout<<i<<'\n';break;} 
  p=p*10+1; 
  p%=n;

 }

 
 
}



return 0;
}

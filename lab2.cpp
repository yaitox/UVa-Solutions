#include <bits/stdc++.h>
using namespace std;
#define forn(i,n) for(int i=0;i<(int)n;i++)
int main(){


int n;
cin>>n; 

string s;
while(n--){
map<char,int>mp;
    
    cin>>s;

    forn(i,s.length()){
    
int j=i+2;
mp[s[i]];
if(j>=s.length()){
 break;
}



while(s[j]!=';'){
 if(j>=s.length()){
  break;
 }
 mp[s[i]]++;
 mp[s[j]]++;
 j++;
 
}
i=j;
    }
    for(auto elem:mp){
    
        cout<<elem.first<<"="<<elem.second<<' ';
    }
    cout<<'\n';

}

    return 0;
}


#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    char arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    bool visited[n];
    for(int i=0;i<n;i++){
        visited[i]=false;
    }
    for(int i=0;i<n;i++){
        if(visited[i]){
            continue;
        }
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
            count++;
            visited[j]=true;
            }
        }
        if(count%2!=0){
            cout<<arr[i];
            return 0;
        }
    }
    cout<<"All are even";
}
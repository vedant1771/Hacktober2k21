#include <iostream>
using namespace std;

int printTour(int gas[],int cost[], int n)
{
 int start = 0;
    int end =  1;
  
    int curr_petrol = gas[start] - cost[start];
  
   
    while (end != start || curr_petrol < 0)
    {
        
        while (curr_petrol < 0 && start != end)
        {
           
            curr_petrol -=  gas[start] - cost[start];
            start = (start + 1)%n;
  
            
            if (start == 0)
               return -1;
        }
  
       
        curr_petrol += gas[start] - cost[start];
  
        end = (end + 1)%n;
    }
  
   
    return start;
}



int main(){
  int n;
  cin>>n;
  int gas[n];
    int cost[n];
    for(int i=0;i<n;i++){
      cin>>gas[i];
    }
    for(int i=0;i<n;i++){
      cin>>cost[i];
    }
   int start= printTour(gas,cost,n);
   cout<<start;



  return 0;
}
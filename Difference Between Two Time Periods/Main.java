#include<iostream>
using namespace std;
struct time
{
  int hr,min,sec;
}t1,t2;
int main()
{
  cin>>t1.hr>>t1.min>>t1.sec;
  cin>>t2.hr>>t2.min>>t2.sec;
  if(t2.sec>t1.sec)
  {
    --t1.min;
    t1.sec+=60;
  }
  if(t2.min>t1.min)
  {
    --t1.hr;
    t1.min+=60;
  }
  cout<<t1.hr-t2.hr<<":"<<t1.min-t2.min<<":"<<t1.sec-t2.sec;
}
#include<iostream>
using namespace std; 
int countDigit(int n) 
{ 
	int count = 0; 
	while (n != 0) { 
		n = n / 10; 
		++count; 
	} 
	return count; 
}  
int main(void) 
{ 
	int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;;;
	cout <<"The number of digits in "<<n<<" is "<<countDigit(n); 
	return 0; 
} 
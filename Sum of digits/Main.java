#include<iostream> 
#include<bits/stdc++.h> 
using namespace std; 
int sum_of_digit(int n) 
{ 
	if (n == 0) 
	return 0; 
  	else
	return (n % 10 + sum_of_digit(n / 10)); 
} 
int main() 
{ 
	int n;
    cout<<"Enter the value of n"<<endl;
    cin>>n;
	int result = sum_of_digit(n); 
	cout<< "The sum of digits in "<<n<<" is "<<result<<endl; 
	return 0; 
} 
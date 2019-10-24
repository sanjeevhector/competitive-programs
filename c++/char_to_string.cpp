// Demonstrates conversion 
// from character array to string 
  
#include <bits/stdc++.h> 
using namespace std; 
  
// uses the constructor in string class 
// to convert character array to string 
string convertToString(char* a, int size) 
{ 
    string s(a); 
  
    // we cannot use this technique again 
    // to store something in s 
    // because we use constructors 
    // which are only called 
    // when the string is declared. 
  
    // Remove commented portion 
    // to see for yourself 
  
    /* 
    char demo[] = "gfg"; 
    s(demo); // compilation error  
    */
  
    return s; 
} 
  
// Driver code 
int main() 
{ 
    char a[] = { 'C', 'O', 'D', 'E' }; 
    char b[] = "geeksforgeeks"; 
  
    int a_size = sizeof(a) / sizeof(char); 
    int b_size = sizeof(b) / sizeof(char); 
  
    string s_a = convertToString(a, a_size); 
    string s_b = convertToString(b, b_size); 
  
    cout << s_a << endl; 
    cout << s_b << endl; 
  
    return 0; 
} 
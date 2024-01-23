#include <iostream>
using namespace std;

int main()
{
    // int a =3;
    // cout << !a<< endl;

    // for (int i = 0; i ; i++)
    // {
    //     cout << i << endl;
    // }

    // string a;
    // if(cin>>a){ // It works
    //     cout << "khus";
    // }

    // if(cout << "hi"){
    //     cout << "Khushhal";
    // }

    // int a = 2;
    // int b = a+1;
    // if((a=3)==b){  // This assign value to a
    //     cout << a;
    // }

    char a;
    cout << "Enter the character:- ";
    cin >> a;

    int b = a;
    // cout << b;
    if (b < 58 && b > 47)
    {
        cout << "This is number";
    }
    else if (b > 64 && b < 91)
    {
        cout << "This is upper case";
    }
    else if (b > 96 and b < 123)
    {
        cout << "This is lower case";
    }
}
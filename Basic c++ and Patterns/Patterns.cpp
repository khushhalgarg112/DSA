#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the number of Rows:- ";
    cin >> n;

    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << i << " ";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5*/

    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << j << " ";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*  1 2 3
        4 5 6
        7 8 9  */

    // int i = 1;
    // int x = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << x << " ";
    //         x++;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << "*"
    //              << " ";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*
    1
    2 3
    3 4 5
    4 5 6 7
    5 6 7 8 9
    */

    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     int value = i;
    //     while (j <= i)
    //     {
    //         cout << value << " ";
    //         value++;
    //         j++;
    //     }

    //     cout << endl;
    //     i++;
    // }

    /*
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
    */

    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << i - j + 1 << " ";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*
    A A A A
    B B B B
    C C C C
    D D D D
    */
    // int i = 1;
    // int num = 65;
    // while (i <= n)
    // {
    //     int j = 1;
    //     char ch = num;
    //     while (j <= n)
    //     {
    //         cout << ch << " ";
    //         j++;
    //     }
    //     num++;
    //     cout << endl;
    //     i++;
    // }

    /*
    A B C D
    A B C D
    A B C D
    A B C D
    */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     char ch = 'A';
    //     while (j <= n)
    //     {
    //         cout << ch << " ";
    //         ch = ch + 1;
    //         j++;
    //     }

    //     cout << endl;
    //     i++;
    // }

    /*
    A B C D E
    F G H I J
    K L M N O
    P Q R S T
    U V W X Y
    */
    // int i = 1;
    // char ch = 'A';
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << ch << " ";
    //         ch = ch + 1;
    //         j++;
    //     }

    //     cout << endl;
    //     i++;
    // }

    /*
    A B C D
    B C D E
    C D E F
    D E F G
    */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     char ch = 'A' + i - 1;
    //     while (j <= n)
    //     {
    //         cout << ch << " ";
    //         ch++;
    //         j++;
    //     }

    //     cout << endl;
    //     i++;
    // }

    /*
    A
    B B
    C C C
    D D D D
    E E E E E
    */
    // int i = 1;
    // char ch = 'A';
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << ch << " ";

    //         j++;
    //     }
    //     ch++;
    //     cout << endl;
    //     i++;
    // }

    /*
    A
    B B
    C C C
    D D D D
    E E E E E
    */
    // int i = 1;
    // char ch = 'A';
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << ch << " ";

    //         j++;
    //     }
    //     ch++;
    //     cout << endl;
    //     i++;
    // }

    /*
    A
    B C
    C D E
    D E F G
    E F G H I
    */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     char ch = 'A' + i - 1;
    //     while (j <= i)
    //     {
    //         cout << ch << " ";
    //         ch++;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*
     A
     B C
     C D E
     D E F G
     E F G H I
     */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     char ch = 'A' + n -i;
    //     while (j <= i)
    //     {
    //         cout << ch << " ";
    //         ch++;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    /*
    *
   **
  ***
 ****
*****
     */
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n - i)
    //     {
    //         cout << " ";
    //         j++;
    //     }   

    //     while (j <= n)
    //     {
    //         cout << "*";
    //         j++;
    //     }

    //     cout << endl;
    //     i++;
    // }


    /*
    * * * * 
    * * *
    * *
    *
    */
//    int i =1;
//    while (i<=n)
//    {
//     int j=1;
//     while (j<=n-i+1)
//     {
//         cout << "*" << " ";
//         j++;
//     }
//     cout << endl;
//     i++;
//    }

/*
* * * * 
* * *
* *
*
*/
    // int i =1;
    // while (i<=n)
    // {
    //     int j=1;
    //     while (j<=n-i+1)
    //     {
    //         cout << "*" << " ";
    //         j++;
    //     }
    //     cout << endl;
    //     i++; 
    // }
   

/*
12345
 2345
  345
   45
    5
*/
    // int i =1;
    // while (i<=n)
    // {
    //     int j=1;
    //     int num = 1;
    //     while (j < i)
    //     {
    //        cout << " ";
    //        num++;
    //        j++;
    //     }
    //     while (j >= i && j <= n)
    //     {
    //         cout << num;
    //         num++;
    //         j++;
    //     }
    //     cout << endl;
    //     i++; 
    // }


/*
    1
   121
  12321
 1234321
123454321
*/
    int i =1;
    while (i<=n)
    {
        int j=1;
        int num = 1;
        while (j < n-i+1)
        {
           cout << " ";
           j++;
        }
        while (j<=n)
        {
            cout << num;
            num++;
            j++;
        }
        num=num-2;
        j = 1;
        while (j<i)
        {
            cout << num;
            num= num-1;
            j++;
        }
        
        cout << endl;
        i++; 
    }
}
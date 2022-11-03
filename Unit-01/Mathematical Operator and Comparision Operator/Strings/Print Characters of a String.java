/*
Description

You are given a string, whose size is stored in a variable with the nameN

The string itself is stored in a variable with the name,str

Print all the characters, stored instr, on a new line

For example, if the value stored inN = 6, and the string isstr = "nrupul", then the required output will be

n
r
u
p
u
l


Input
The first line of the input contains the value stored inN

The next line contains the string stored instr


Output
Print all characters of the string stored instr, on a new line, as shown in the problem statement

Sample Input 1 

6
ankush
Sample Output 1

a
n
k
u
s
h
Hint

In the sample test case, the value stored inN = 6, and the value stored instr = "ankush"

Therefore, the required output will be

a
n
k
u
s
h*/
public static void printChar(int n, String str){
    //write your code here
    for(int i=0; i<=n-1; i++){
       System.out.println(str.charAt(i));
    }
  }

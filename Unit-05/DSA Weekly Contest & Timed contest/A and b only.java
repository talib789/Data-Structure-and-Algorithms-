/*Description

You are given a string S that contains 3 characters: 'a', 'b', and '?'. Your task is to convert it to a string which contains only 2 characters: 'a', 'b'. The converted string must follow following conditions:

1. It should not contains two letters 'a' in a row.

2. if there are many strings possible, the answer should be one which is the first in alphabetical order

(Read sample test case for better understanding)


Input
Input Format

The first line contains non-empty string s consisting of 'a', 'b' and '?' characters.

Constraints

Length of s is at most 50.


Output
Output Format

Output the first in alphabetical order word


Sample Input 1 

?ba??b
Sample Output 1

ababab
Hint

Sample 1 Explanation

ababab, ababbb, bbabab and bbabbb are possible. The first in alphabetical order is ababab.*/

import java.io.*; 
import java.util.*; 
public class Main { 
    public static String solve(String a){
        StringBuffer ans = new StringBuffer(); 
        for (int i=0;i<a.length();i++){ 
        if (a.charAt(i)=='?'){ 
        if (i == 0){ 
        if (a.charAt(i+1)=='a') ans.append('b'); 
        else{ans.append('a');};
        }else if (i==a.length()-1){ 
            if (a.charAt(i-1)=='a')ans.append('b'); 
        else{ans.append('a');}; 
        }else{ 
    if (a.charAt(i-1)=='a' || a.charAt(i+1)=='a') ans.append('b'); 
    else{ans.append('a');}; }
    }else{ 
    ans.append(a.charAt(i));
           }
        }
    if (ans.length()==1) return ans.toString(); 
    for (int i=0;i<ans.length();i++){ 
        if (i==0){ 
            if (ans.charAt(i)=='a' && ans.charAt(i+1)=='a')ans.setCharAt(i+1, 'b'); 
        }
     else if (i==a.length()-1){
  if (ans.charAt(i)=='a' && ans.charAt (i-1)=='a'){ 
      ans.setCharAt(i,'b');
        }
     }
     else{ 
    if (ans.charAt(i)=='a' && ans.charAt (i-1)=='a') ans.setCharAt(i, 'b'); 
    else if (ans.charAt(i)=='a' && ans.charAt(i+1)=='a')ans.setCharAt(i+1, 'b'); 
       }
    }
    return ans.toString();
  }
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 
        String a = s.next(); 
        System.out.println(solve(a));
       }
    }

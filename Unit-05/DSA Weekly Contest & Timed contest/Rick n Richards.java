/*Description

There is a contest of Competitive eating. Rick and Richard were participating in the game.

N bananas are placed in a line. Rick starts to eat from left to right, and Richard from right to left. For each banana, its length is known.

Rick eats with speed twice that of Richard. If a player starts to eat the banana, other player can't touch it. If both players reach the same banana simultaneously, Rick gets to eat that banana as he snatches it away from Richard.

How many bananas each of the players will eat?


Input
Input Format :

The first line contains one integer T, the number of test cases.

The first line of each test case contains one integer N,the number of bananas.

The second line contains a sequence , A1, A2, A3 . . . An where Ai denotes length of ith bananas.



Constraints :

1 ≤ T ≤ 100

1 ≤ N ≤ 100000

1 ≤ Ai ≤ 10000000


Output
Print two numbers X and Y separated by space, where X is the number of bananas eaten by Rick, and Y is the number of bananas eaten by Richard.


Sample Input 1 

1
5
2 9 8 2 7
Sample Output 1

3 2
Hint

Rick will start eating 1st banana of length 2. Richard will start with 5th banana of length 7.

As Rick's speed is twice Richard's, He will start with second banana. Richard still would be eating the first. Rick will start with his third banana and when Richard will finish his, he'l start with his second banana ( index 4).*/
import java.util.Scanner;
 class Main {
     public static void main ( String [] args){
         Scanner scn = new Scanner (System.in);
         int t = scn.nextInt();
         while(t--!=0){
             int n = scn.nextInt();
             int [] arr = new int [n];
             for (int i=0; i<n; i++) arr[i] = scn.nextInt();
             int left = 0, right = n-1;
             int leftCount = 0, rightCount = 0;
             int leftSum = 0,  rightSum = 0;
             while (left <= right){
                 if(leftSum <= rightSum*2){
                     leftCount++;
                     leftSum+= arr[left++];
                 }else{
                     rightCount++;
                     rightSum+=arr[right--];
                 }
             }
             System.out.println(leftCount + " " + rightCount);
             }
         }
     }

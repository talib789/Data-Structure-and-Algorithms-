/*Description

The University of Transylvania is conducting the coding fest for the Computer Programmers of the state. Again, because of his extraordinary managerial skills, Dracula is given the task to make arrangements for the competition.

Dracula came to know that N people, are going to participate in the fest, and so he has the job of arranging them on N places for the fest. He gave an ID from 1 to N to each participant, and formulated a strategy to prevent plagiarism.

He decided that all such permutations, in which the sum of IDs of participants, between two specific positions, L and R(L and R inclusive), are odd, need to be rejected. Find the total number of permutations, that will have to be rejected, according to Dracula’s strategy.


Input
The first line of input contains N, the number of people participating in the fest. All the people participating in the fest have ID’s from 1 to N.

The next line contains, the value of L and R, as described in the question.

Constraints
1 <= N <= 10

0 <= L, R <= N-1


Output
Print the number of permutations of N people, that will have to be rejected, according to Dracula’s strategy.


Sample Input 1 

3
0 1
Sample Output 1

4
Hint

The value of N is 3, so IDs of people participating in the fest is {1,2,3}.

All permutations of {1,2,3} where the sum of values between L = 0 and R = 1 are odd, are

{1,2,3}, {2,1,3}, {3,2,1}, {2,3,1},

In each permutation, the sum of all elements lying between index L and R (including L and R), are odd.

therefore the number of permutations that need to be rejected is 4.*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    static List< List<Integer>> ans = new ArrayList<>();
    public static void swap ( int[] a, int i , int j){
        int temp = a [i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int permute( int[] a, int l, int h, int sum, int l1, int r1){
            if (l>h){
            if (sum %2 == 1){
                return 1;
            }
            return 0;
        }
        int ans = 0;
        for ( int i = l; i<=h; i++){
            swap(a,i,l);
            if (l>= l1 && l<=r1){
                ans += permute(a, l+1, h , sum + a[l],l1,r1);
            }else{
                ans+= permute(a,l+1, h, sum,l1,r1);
            }
            swap(a,i,l);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i<n ; i++) a[i] = i+1;
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(permute(a,0,n-1,0,l,r));
    }
}

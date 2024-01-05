import java.util.*;
class Solution{
	public static int min(int res, int a){
		return res > a ? a : res;
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{80, 20, 30, 40, 510};
		int res = Integer.MAX_VALUE;
		Solution sl = new Solution();
		for(int a : arr){
			res = sl.min(res, a);
		}
		System.out.println(res);
	}
}
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				arr[i][j] = mat;
			}
		}
		// for(int[] row : arr){
		// 	int max = Integer.MIN_VALUE;
		// 	for(int value : row){
		// 		max = Math.max(max, value);
		// 	}
		// 	System.out.println(max);
		// }

		// for(int i = 0; i < arr.length; i++){
		// 	int ans = Integer.MIN_VALUE;
		// 	for(int j = 0; j < arr[0].length; j++){
		// 		ans = Math.max(ans, arr[i][j]);
		// 	}
		// 	System.out.println(ans);;
		// }

		// int ans = Integer.MIN_VALUE;
		// for(int i = 0; i < arr.length; i++){
		// 	ans = Integer.MIN_VALUE;
		// 	for(int j = 0; j < arr[0].length; j++){
		// 		ans = Math.max(ans, arr[i][j]);
		// 	}
		// 	System.out.println(ans);;
		// }


		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			ans = Integer.MIN_VALUE;
			for(int j = 0; j < arr[0].length; j++){
				if(ans < arr[i][j])ans = arr[i][j];
			}
			System.out.println(ans);;
		}

		for(int i = 0; i < arr.length; i++){
			int ans = Integer.MIN_VALUE;
			for(int j = 0; j < arr[0].length; j++){
				if(ans < arr[i][j])ans = arr[i][j];
			}
			System.out.println(ans);;
		}
	}
}
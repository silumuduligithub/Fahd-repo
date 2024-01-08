import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 5; i++){
			al.add(sc.nextInt());
		}

		Collections.sort(al);
		for(int i = 0; i < al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}


// note : 
// 		difference between array and arraylist:
// 				array is static in nature but arraylist is dynamic in nature
// 		you can declare a list in two different ways
// 				1: List<DataType> list_name = new ArrayList<>();
// 				2.ArrayList<DataType> listName = new ArrayList<>();

// 		method to add a element inside arraylist :
// 				using .add() method we can add value inside ArrayList
// 		method to get the value from ArrayList
// 				using .get(index) method we can get the value form arraylist
// 		how to get the size of arraylist
// 				using .size() method we can get the size of an ArrayList
// 		method to sort a arraylist 
// 				Collections.sort(arrayListName);
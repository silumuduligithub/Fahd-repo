import java.util.Scanner;
import java.util.ArrayList;
// import java.util.List;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 5; i++){
			al.add(sc.nextInt());
		}

		for(int i = 0; i < al.size(); i++){
			System.out.print(al.get(i) + " ");
		}

		for(int i = 0; i < 5; i++){
			al.add(sc.nextInt());
		}
		
		for(int i = 0; i < al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}
import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(i*j*2);
		}
		sc.close();
	}
}
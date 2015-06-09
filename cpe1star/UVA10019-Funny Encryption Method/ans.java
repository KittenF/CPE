import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i = 0; i < line; i++) {
			String proline = Integer.toString(sc.nextInt());
			int x1 = Integer.parseInt(proline);
			String x1b = Integer.toBinaryString(x1);
			System.out.print(x1b.replace("0","").length()+" ");
			int x2 = Integer.parseInt(proline,16);
			String x2b = Integer.toBinaryString(x2);
			System.out.println(x2b.replace("0","").length());
		}
		sc.close();
	}
}
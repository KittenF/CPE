// key word : sigma 
import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int linenum = sc.nextInt();
		for(int i = 0; i < linenum; i++){
			int people = Integer.parseInt(sc.next());
			Double chance = Double.parseDouble(sc.next());
			int num = Integer.parseInt(sc.next());
			double sigma = 0;
			if(Math.abs(chance)>0&&Math.abs(chance)<1){
				sigma = 1/(1-Math.pow(1-chance,people));
			}
			double ans = Math.pow(1-chance,num-1)*chance*sigma;
			System.out.printf("%.4f%n",ans);
		}
		sc.close();
	}
}
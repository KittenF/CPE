import java.util.Scanner;
import java.util.Arrays;
class main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int linea = sc.nextInt();
		for(int i = 0; i < linea;i++){
			int lineb = sc.nextInt();
			int pmain[] = new int[lineb];
			for(int j = 0; j < lineb; j++){
				pmain[j] = sc.nextInt();
			}
			Arrays.sort(pmain);
			int mid = (int)Math.floor(pmain.length/2);
			int mid1 = pmain[mid];
			int mid2 = pmain[mid - 1];
			int msum1 = 0;
			int msum2 = 0;
			for(int j = 0; j < lineb; j++){
				msum1 += Math.abs(mid1 - pmain[j]);
				msum2 += Math.abs(mid2 - pmain[j]); 
			}
			int sum[] = new int[]{msum1,msum2};
			Arrays.sort(sum);
			System.out.println(sum[0]);
		}
		sc.close();
	}
}
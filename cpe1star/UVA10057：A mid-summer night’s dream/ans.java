import java.util.Scanner;
import java.util.Arrays;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int len = sc.nextInt();
			int set[] = new int[len]; // inputs
			for(int i = 0; i < len;i++){
				set[i]= sc.nextInt();
			}
			Arrays.sort(set);
			int ans[] = new int[set[set.length-1]+1];
			for(int i = 0; i <= set[set.length-1];i++){
				int tag = 0;
				for(int j = 0; j < len; j++) {
					tag += Math.abs(set[j]-i);
				}
				ans[i] = tag;
			}
			Arrays.sort(ans);
			
			for(int i :set){ //find input that input's ans == ans[0]
				int tag = 0;
				for(int j = 0; j < len; j++) {
					tag += Math.abs(set[j]-i);
				}
				if(tag == ans[0]){
					System.out.print(i);
					break;
				}
			}
			int ans2 = 0;
			for(int i :set){
				int tag = 0;
				for(int j = 0; j < len; j++) {
					tag += Math.abs(set[j]-i);
				}
				if(tag == ans[0]) { // if ans == every input
					ans2++;
				}
			}
			System.out.print(" "+ans2);
			int ans3 = 1;
			for(int i = 1; i < ans.length; i++){ // same ans
				if(ans[0]==ans[i]){
					ans3++;
				}
			}
			System.out.println(" "+ans3);
		}
		sc.close();
	}
}
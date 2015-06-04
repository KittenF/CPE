import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt(); // 結束值
			int b = sc.nextInt(); // 起始值
			System.out.print(a+" "+b+" ");
			int best = 0; // 最大值
			if(a < 0 || a > 1000000) {
				break;
			}
			if(b < 0 || b > 1000000) {
				break;
			}
			if(a > b){
				best = a;
				a = b;
				b = best;
				best = 0;
			}
			for(int i = a; i <= b; i++){
				int mathtag = i;
				int tag = 1;
				while(mathtag!=1){
					tag++;
					if(mathtag%2==0){
						mathtag /= 2;
					} else {
						mathtag = mathtag * 3 + 1;
					}
				}
				if(best < tag){
					best = tag;
				}
			}
			System.out.println(best);
		}
	   
	}
}
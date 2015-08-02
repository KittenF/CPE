import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String tag = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		while(sc.hasNext()){
			String input = sc.next();
			for(int i = 2;i<=63;i++){
				if(i == 63){
					System.out.println("such number is impossible!");
					break;
				}
				int sum[] = new int[input.length()];
				boolean fail = false;
				for(int j = 0; j < input.length(); j++){
					sum[j] = tag.indexOf(input.charAt(j));
					if(sum[j] == -1){
						sum[j] = 0;
					}
					if(sum[j] >= i){ // if base 2 , set are 0 and 1; base 3, set are 0,1,2 ; And so on;
						fail = true;
						break;
					}
				}
				if(fail){
					continue;
				}
				for(int j = 0; j < input.length()-1; j++){ // if base 4, input = 322 , 3*4+2 = 14
					sum[j+1] = sum[j]%(i-1)*i + sum[j+1];  // 14 * 4 + 2 = 58 , 58 % 3 = 1 
				}										   // 14 % 3 = 2 , 2*4+2= 10 , 10%3=1
				if(sum[input.length()-1] % (i-1) == 0) { // find ans and check ans % n-1 == 0
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}
}
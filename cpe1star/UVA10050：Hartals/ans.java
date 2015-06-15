import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i = 0; i < testcase;i++){
			int days = sc.nextInt();
			int partynum = sc.nextInt();
			int parties[] = new int[partynum];
			int nowork  = 0;
			for(int j = 0; j < partynum; j++){
				parties[j] = sc.nextInt();
			}
			for(int j = 1; j <= days; j++) {
				for(int k : parties){
					if(j%k==0&&j%7!=0&&j%7!=6){
						nowork++;
						break;
					}
				}
			}
			System.out.println(nowork);
		}
		sc.close();
	}
}
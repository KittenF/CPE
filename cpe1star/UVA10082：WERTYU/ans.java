import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(sc.hasNextLine()){
			String input = sc.nextLine();
			for(int i = 0; i < input.length(); i++){
				try{
					int flag = a.indexOf(input.charAt(i));
					System.out.print(a.charAt(flag-1));
				} catch(Exception e){
					System.out.print(input.charAt(i));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
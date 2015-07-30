import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean printend = false;
		while(sc.hasNextLine()){ //input && detail
			if(printend){
				System.out.println();
			}
			LinkedList<int[]> ans = new LinkedList<int[]>();
			String input = sc.nextLine();
			for(int i = 0; i < input.length();i++){
				int out = input.charAt(i);
				boolean flag = false;
				for(int[] j : ans){
					if(j[0] == out){
						j[1]++;
						flag = true;
						break;
					}
				}
				if(flag == false){
					ans.add(new int[]{out,1});
				}
			}
			Collections.sort(ans,new anssort());
			for(int[] j : ans){
				System.out.println(j[0]+" "+j[1]);
			}
			printend = true;
		}
		sc.close();
	}
}
class anssort implements Comparator<int[]>{
	public int compare(int[] e1,int[] e2){
		if(e1[1] < e2[1]) {
			return -1;
		} 
		if(e1[1] > e2[1]) {
			return 1;
		}	
		if(e1[0] < e2[0]) {
			return 1;
		}
		return -1;
	}
}
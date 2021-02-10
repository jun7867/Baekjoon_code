package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1233_남준영 {
	static int N;
	static String[] node;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=10;
		StringTokenizer st = null;
		for(int tc=1;tc<=10;tc++) {
			boolean isValid=true;
			N=Integer.parseInt(br.readLine());
			node=new String[N+1];
			for(int i=1;i<=N;i++) {
				st=new StringTokenizer(br.readLine()," ");
				int parent=Integer.parseInt(st.nextToken());
				char ch=st.nextToken().charAt(0);
				if(ch-'0' >=0 && ch-'0' <=9){
					if(st.hasMoreTokens()) {
						isValid=false;
					}
				}else {
					if(!st.hasMoreTokens()) {
						isValid=false;
					}
				}
			}
			if(isValid)
				System.out.printf("#%d %d\n",tc,1);
			else {
				System.out.printf("#%d %d\n",tc,0);
			}
		}
	}
}


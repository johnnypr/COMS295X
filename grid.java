import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	static char[][] board = new char[52][52];
	static char i,j,words;
	static char[] word = new char[250];
	static int len, cases, m,n;
	static boolean found;
	static String[] aux;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		cases = Integer.parseInt(bf.readLine());
		bf.readLine();
		while((cases--) > 0){
			
			aux = bf.readLine().split(" ");
			m = Integer.parseInt(aux[0]);
			n = Integer.parseInt(aux[1]);
			
			for(i = 0; i < m+2; i++) board[i][0] = '-';
			for(j = 0; j < n+2; j++) board[0][j] = board[m+1][j] = '-';
			for(i = 1; i <= m; i++) board[i] = bf.readLine().toCharArray();
			for(i = 0; i < m+2; i++) board[i][n+1] = '-';
			for(i = 1; i <= m; i++)
				for(j = 1; j <= n; j++)
					if(board[i][j] > 64 && board[i][j] < 91) board[i][j] +=32;
			
			while((words--) > 0){
				word = bf.readLine().toCharArray();
				found = false;
				len = word.length;
				for(j = 0; word[j] != '\0'; j++) if(word[j] > 64 && word[j] < 91) word[j] +=32;
				search();
			}
			if(cases > 0) System.out.print('\n');
		}


	}

	static void recSearch(int xo,int yo, int px, int py, int ax,int ay, int k){
		if(k == len) {
			System.out.printf("%d %d\n",xo,yo,word);
			found = true;
			return;
		}
		if(board[xo+ax][yo+ay] != word[k]) return;
		
		recSearch(xo,yo,px,py,ax+px,ay+py,k+1);
	}

	static void search(){
		char x,y;
		for(x = 1; x <= m; x++)
			for(y = 1; y <= n; y++)
				if(board[x][y] == word[0]){
					recSearch(x,y,0,1,0,1,1); 
					if(!found) recSearch(x,y,1,0,1,0,1); 
					if(!found) recSearch(x,y,0,-1,0,-1,1);
					if(!found) recSearch(x,y,-1,0,-1,0,1);
					if(!found) recSearch(x,y,1,1,1,1,1); 
					if(!found) recSearch(x,y,-1,1,-1,1,1); 
					if(!found) recSearch(x,y,1,-1,1,-1,1);
					if(!found) recSearch(x,y,-1,-1,-1,-1,1); 
					if(found) return;
				}
	}

	

}
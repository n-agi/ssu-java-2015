import java.util.*;
class Knight{
	private int map[][];
	private int size;
	private boolean move_available = true;
	private final static int[][] moves = {{1,-2},{2,-1},{2,1},{1,2},{-1,2},
        {-2,1},{-2,-1},{-1,-2}};
	public Knight(int v){
		this.map = new int[v][v];
		this.size = v;
		for(int i = 0 ; i < v ; i++){
			for(int j = 0 ; j < v ; j++){
				this.map[i][j] = -1;
			}
		}
	}
	public void manualSolve(){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int P[] = new int[2];
		P[0] = r.nextInt(this.size);
		P[1] = r.nextInt(this.size);
		int current_move = 1;
		this.map[P[0]][P[1]] = 1;

		System.out.println(this.toString());
		while(move_available){
			int input = 0;
			List<int[]> S = new ArrayList<int[]>();
			S = get_Available(current_move);
			if(S.size() == 0) {
				System.out.println("You cannot move further."); 
				move_available=false;
				return;
			}
			int idx = 1;
			for(int[] av : S){
				System.out.println(idx + ". " + av[0] + ", " + av[1]);
				idx++;
			}
			System.out.print("Select your move : ");
			input = s.nextInt();
			if(input > idx || input <= -1){
				System.out.println("Not available move.");
				return;
			}
			int[] selected = (int[])S.get(input-1);
			map[selected[0]][selected[1]] = ++current_move;

			System.out.println(this.toString());
		}
	}
	public boolean isSolved(){
		for(int i = 0 ; i < this.size ; i++){
			for(int j = 0 ; j < this.size; j++){
				if(map[i][j] == -1) return false;
			}
		}
		return true;
	}
	public void solve(){
		Random r = new Random();
		int P[] = new int[2];
		int current_move = 1;
		P[0] = r.nextInt(this.size);
		P[1] = r.nextInt(this.size);
		//1.	Set P to be a random initial position on the board
		//2.	Mark the board at P with the move number "1"
		this.map[P[0]][P[1]] = 1;
		while(move_available){
			//3.	For each move number from 2 to the number of squares on the board,
			//a.	let S be the set of positions accessible from the input position
			//b.	set P to be the position in S with minimum accessibility
			//c.	mark the board at P with the current move number

			List<int[]> S= new ArrayList<int[]>();
			S = get_Available(current_move);
			if(S.size() == 0) {move_available = false; return;}

			List<int[]> tmp = new ArrayList<int[]>();
			int []lowest_coor = new int[2];
			int lowest_value = 0x7FFFFFFF;
			for(int [] s : S){
				tmp.add(new int[]{s[0],s[1], get_accessibility(new int[]{s[0],s[1]}) } );
			}

			for(int [] t : tmp){
				if(t[2] < lowest_value){
					lowest_value = t[2];
					lowest_coor[0] = t[0];
					lowest_coor[1] = t[1];
				}
			}
			map[lowest_coor[0]][lowest_coor[1]] = ++current_move;
			//4.	Return the marked board -- each square will be marked with the move number on which it is visited.
		}
		
	}
	public int get_accessibility(int [] coordinates){
		int ret =0;
		for(int i = 0 ; i < this.size; i++){
			for(int j = 0 ; j < this.size ; j++){
				int[] current = new int[]{i,j};
				if(map[i][j] != -1) continue;
				for(int[] move: moves){
					if(current[0] + move[0] == coordinates[0] && current[1] + move[1] == coordinates[1]){
						ret++;
					}
				}
			}
		}
		return ret;
	}
	public List<int[]> get_Available(int current_idx){
		List<int[]> S = new ArrayList<int[]>();
		int[] current = get_Current(current_idx);
		for(int[] move : moves){
			if(current[0] + move[0] >= 0 && current[1] + move[1] >= 0 && current[0] + move[0] < this.size && current[1] + move[1] < this.size){
				if(map[current[0]+move[0]][current[1]+move[1]] == -1)
					S.add(new int[]{current[0] + move[0], current[1] + move[1]});
			}
		}
		return S;
	}
	public int[] get_Current(int cur){
		int[] tmp = new int[2];
		for(int i = 0 ; i < this.size ; i++){
			for(int j = 0 ; j < this.size ; j++){
				if(map[i][j] == cur){
					tmp[0] = i;
					tmp[1] = j;
					return tmp;
				}
			}
		}
		return new int[]{0,0};
	}
	public String toString(){
		String res = "";
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
				res += String.format("%2d", this.map[i][j]) + " ";
			}
			res += "\n";
		}
		return res;
	}
}
public class KnightSolver {
	public static void main(String []args){
		Knight k = null;
		int input;
		Scanner s = new Scanner(System.in);
		System.out.println("Knight's Tour solver");
		System.out.println("1. 3x3");
		System.out.println("2. 5x5");
		System.out.println("3. 8x8");
		input = s.nextInt();
		if(input == 1){
			k = new Knight(3);
		}
		else if(input == 2){
			k = new Knight(5);
		}
		else if(input == 3){
			k = new Knight(8);
		}
		else{
			System.out.println("Unknown Init value");
		}
		System.out.println("1. Computer");
		System.out.println("2. User");
		input = s.nextInt();
		if(input == 1){
			k.solve();
		}
		else if(input == 2){
			k.manualSolve();
		}
		if(k.isSolved())
		System.out.println(k.toString());
		else{
			System.out.println("This map is not solved.");
			System.out.println(k.toString());
		}
		
	}
}
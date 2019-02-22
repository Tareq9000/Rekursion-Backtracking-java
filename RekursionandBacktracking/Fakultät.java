package RekursionandBacktracking;

public class Fakultät {

	public static void main(String[] args) {

		Fakultät fak = new Fakultät();
		
		System.out.println(fak.fakultät(4));
	}
	
	public int fakultät(int zahl) {
		
		if(zahl > 1) {
			return zahl * fakultät(zahl - 1);
		}
		else {
			return 1;
		}
	}
}

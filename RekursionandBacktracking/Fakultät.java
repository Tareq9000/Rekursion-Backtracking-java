package RekursionandBacktracking;

public class Fakult�t {

	public static void main(String[] args) {

		Fakult�t fak = new Fakult�t();
		
		System.out.println(fak.fakult�t(4));
	}
	
	public int fakult�t(int zahl) {
		
		if(zahl > 1) {
			return zahl * fakult�t(zahl - 1);
		}
		else {
			return 1;
		}
	}
}

package leetcode_array101_card_tutorial;

public class CustomArrayDVD {
	public static void main(String[] args) {

		DVD[] arrDVD = new DVD[5];
		arrDVD[0] = new DVD("Headlights", 1997, "Alan Walker");
		arrDVD[1] = new DVD("Castle", 2016, "Halsey");
		arrDVD[4] = new DVD("The Avengers", 2012, "Joss Whedon");
		System.out.println(arrDVD[0] + "\n" + arrDVD[1] + "\n" + arrDVD[4]);
	}
}

class DVD {
	private String name;
	private int releaseYear;
	private String director;

	public DVD(String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.releaseYear + ", " + this.director;
	}
}
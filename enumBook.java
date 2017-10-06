public enum Book{
	
	JHTP("JAVA HOW TO PROGRAM", "2015"),
	CHTP("C HOW TO PROGRAM", "2013"),
	IW3HTP("INTERNET AND THE WORLD WIDE WEB HOW TO PROGRAM", "2012"),
	CPPHTP("C++ HOW TO PROGRAM", "2014"),
	VBHTP("VISUAL BASIC HOW TO PROGRAM","2014"),
	CSHARPHTP("C# HOW TO PROGRAM", "2014");


	private final String title;
	private final String year;

	Book(String title, String year){
		this.title = title;
		this.year = year;

	}

	public String getTitle(){
		return title;
	}
	public String getYear(){
		return year;
	}
}
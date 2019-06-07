package netflix;

public class Netflix {
	public static void main(String[] args) {
		Movie Endgames = new Movie("Endgames",4);
		Movie Infinity_War = new Movie("Infinity War",5);
		Movie LeMovie1 = new Movie("Le Movie #1",1);
		Movie LeMovie2 = new Movie("Le Movie #2",0);
		Movie LeMovie3 = new Movie("Le Movie #3",-1);
		
		System.out.println("Price for \"Avengers:End Games\": "+Endgames.getTicketPrice());
		
		NetflixQueue Q = new NetflixQueue();
		
		Q.addMovie(Endgames);Q.addMovie(Infinity_War);Q.addMovie(LeMovie1);Q.addMovie(LeMovie2);Q.addMovie(LeMovie3);
		Q.printMovies();
		Q.sortMoviesByRating();
		System.out.println("The best movie is " + Q.getMovie(0));
		System.out.println("The second best movie is " + Q.getMovie(1));
	}
}

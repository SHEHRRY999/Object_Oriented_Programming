class Movie {
    private String mpaaRating;
    private int idNumber;
    private String movieTitle;

    public Movie(String mpaaRating, int idNumber, String movieTitle) {
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
        this.movieTitle = movieTitle;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            return idNumber == movie.idNumber;
        }
        return false;
    }

    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}

class Action extends Movie {
    public Action(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 3.0;
    }
}

class Comedy extends Movie {
    public Comedy(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5;
    }
}

class Drama extends Movie {
    public Drama(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}

public class task1 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("PG-13", 101, "Inception");
        Action actionMovie = new Action("R", 102, "Mad Max: Fury Road");
        Comedy comedyMovie = new Comedy("PG", 103, "The Hangover");
        Drama dramaMovie = new Drama("PG-13", 104, "The Shawshank Redemption");

        System.out.println(movie1.getMovieTitle() + " late fee for 3 days: $" + movie1.calcLateFees(3));
        System.out.println(actionMovie.getMovieTitle() + " late fee for 3 days: $" + actionMovie.calcLateFees(3));
        System.out.println(comedyMovie.getMovieTitle() + " late fee for 3 days: $" + comedyMovie.calcLateFees(3));
        System.out.println(dramaMovie.getMovieTitle() + " late fee for 3 days: $" + dramaMovie.calcLateFees(3));

        Movie movie2 = new Movie("PG-13", 101, "Inception");
        System.out.println("movie1 equals movie2: " + movie1.equals(movie2));
    }
}
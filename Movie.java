package MTBS;

import java.util.List;
import java.util.Map;

public class Movie {
    private String title;
    private String genre;
    private double rating;
    private int duration;
    private String synopsis;

    private DatabaseOperation db = new DatabaseOperation();
    public Movie(){
        
    }
    public Movie(String title,String genre, double rating,int duration,String synopsis){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.synopsis = synopsis;
    }

    public void insertMovie(String title,String genre, double rating,int duration,String synopsis){
        String sql = "INSERT INTO movies (title,genre,rating,duration,synopsis) values (?,?,?,?,?)";
        Object [] values = {title,genre,rating,duration,synopsis};
        int rowsAffected = db.executeUpdate(sql, values);
        if(rowsAffected>0){
            System.out.println("Movie inserted successfully");
        }else{
            System.out.println("Something went wrong Movie not inserted");
        }
    }
    public void showMovies() {
        String sql = "SELECT * FROM Movies";
        List<Map<String, Object>> movies = db.getRecords(sql);
        for (Map<String, Object> movie : movies) {
            System.out.println("Movie ID: " + movie.get("MovieID"));
            System.out.println("Title: " + movie.get("Title"));
            System.out.println("Genre: " + movie.get("Genre"));
            System.out.println("Rating: " + movie.get("Rating"));
            System.out.println("Duration(mins): " + movie.get("Duration"));
            System.out.println("Synopsis: " + movie.get("Synopsis"));
            System.out.println("-----------------------------");
        }
    }


}

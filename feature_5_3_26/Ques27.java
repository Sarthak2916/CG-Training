package CG_Engineers.DSA;

import java.util.ArrayList;
import java.util.List;

public class Ques27 {

    public static void main(String[] args) {

        Movie myMovies= new MovieManager();

        myMovies.add("Inception,2010,Nolan");
        myMovies.add("RRR,2022,Rajamauli");
        myMovies.remove("RRR");
        myMovies.search("RRR");
    }
}

interface Movie{
    void add(String movie);
    void remove(String movie);
    void search(String movie);
}

class MovieManager implements Movie{

    List<String[]> movies;
    MovieManager(){
        movies= new ArrayList<>();
    }
    @Override
    public void add(String movie){
        String[] sArr= movie.split(",");
        movies.add(sArr);
    }

    @Override
    public void remove(String movie) {
        for(int i=0;i<movies.size();i++){
            if(movies.get(i)[0].equals(movie)){
                movies.remove(i);
            }
        }
    }
    @Override
    public void search(String movie){
        for(int i=0;i<movies.size();i++){
            if(movies.get(i)[0].equals(movie)){
                System.out.println("Movie Details: \n"+movies.get(i)[0]+" "+movies.get(i)[1]+" "+movies.get(i)[2]);
                return;
            }
        }
        System.out.println("Movie not found");
    }
}

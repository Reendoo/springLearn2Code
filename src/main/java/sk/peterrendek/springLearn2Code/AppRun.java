package sk.peterrendek.springLearn2Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.peterrendek.springLearn2Code.services.MovieService;

@Component
public class AppRun {
    @Autowired
    MovieService movieService;
    public void run(){
    movieService.createAddAddMovie();
    }
}

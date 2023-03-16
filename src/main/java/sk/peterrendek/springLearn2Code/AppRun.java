package sk.peterrendek.springLearn2Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;
import sk.peterrendek.springLearn2Code.services.MovieService;

@Component
public class AppRun {

    // injektovanie pomocou triedy
    @Autowired
    MovieService movieService;



    //injektovanie pomocou konstruktora
//    @Autowired
//    MovieService movieService;
//    public AppRun(MovieService movieService) {
//        this.movieService = movieService;
//    }
    //injekcia cez setter


//    MovieService movieService;
    @Autowired
//    @Qualifier("englishHelloWordImpl")
    HelloWorldService helloWorldService;
//    @Autowired
//    public void setMovieService(MovieService movieService) {
//        System.out.println("Injektujem cez setter");
//        this.movieService = movieService;
//    }

    public void run(){
    movieService.createAndAddMovie();
    helloWorldService.sayHallo();

    }
}

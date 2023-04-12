package sk.peterrendek.springLearn2Code.myrestfullapi.init;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.peterrendek.springLearn2Code.myrestfullapi.services.MovieService;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {
    private final MovieService movieService;

    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(@NotNull ContextRefreshedEvent event) {
        movieService.createAndAddMovies();
    }
}

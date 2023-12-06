package app.config;

import app.library_environment.main_essence.Library;
import app.library_environment.separate_entities.Book;
import app.library_environment.separate_entities.Reader;
import app.library_environment.staff.administration.Director;
import app.library_environment.staff.employees.Librarian;
import app.library_environment.staff.employees.SecurityGuard;
import app.library_environment.staff.employees.ServiceManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Library library() {
        return new Library();
    }

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public Reader reader() {
        return new Reader();
    }

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    public Librarian librarian() {
        return new Librarian();
    }

    @Bean
    public SecurityGuard securityGuard() {
        return new SecurityGuard();
    }

    @Bean
    public ServiceManager serviceManager() {
        return new ServiceManager();
    }
}
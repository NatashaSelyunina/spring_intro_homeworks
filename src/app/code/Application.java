package app.code;

import app.library_environment.main_essence.Library;
import app.library_environment.separate_entities.Book;
import app.library_environment.separate_entities.Reader;
import app.library_environment.staff.administration.Director;
import app.library_environment.staff.employees.Librarian;
import app.library_environment.staff.employees.SecurityGuard;
import app.library_environment.staff.employees.ServiceManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Код приложения без спринга.
//        Book book = new Book();
//
//        Reader reader = new Reader();
//        reader.setBook(book);
//
//        Librarian librarian = new Librarian();
//        SecurityGuard securityGuard = new SecurityGuard();
//        ServiceManager serviceManager = new ServiceManager();
//
//        Director director = new Director();
//        director.setLibrarian(librarian);
//        director.setSecurityGuard(securityGuard);
//        director.setServiceManager(serviceManager);
//
//        Library library = new Library();
//        library.setReader(reader);
//        library.setDirector(director);
//
//        library.manageLibrary();


        // Код приложения на спринге, используя xml-конфигурацию
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Library library = context.getBean(Library.class);
//        library.manageLibrary();


        // Код приложения на спринге, используя конфигурацию на аннотациях
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Library library = context.getBean(Library.class);
        library.manageLibrary();
    }
}
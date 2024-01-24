package mirza.SpringFramework.spring6webapp.bootstrap;

import mirza.SpringFramework.spring6webapp.Domain.Author;
import mirza.SpringFramework.spring6webapp.Domain.Book;
import mirza.SpringFramework.spring6webapp.Domain.Publisher;
import mirza.SpringFramework.spring6webapp.Repositories.AuthorRepository;
import mirza.SpringFramework.spring6webapp.Repositories.BookRepository;
import mirza.SpringFramework.spring6webapp.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author mohammad = new Author();
        mohammad.setFirstName("mohammadreza");
        mohammad.setLastName("mirzaei");

        Book books = new Book();
        books.setTitle("Domain Driven Design");
        books.setISBN("123456789");

        Author msaved = authorRepository.save(mohammad);
        Book book = bookRepository.save(books);

        Author mehdi = new Author();
        mehdi.setFirstName("mahdi");
        mehdi.setLastName("sadeghi");

        Book noEJB = new Book();
        noEJB.setTitle("JAVAEE without EJB");
        noEJB.setISBN("987654321");


        Author mehdis = authorRepository.save(mehdi);
        Book EJb = bookRepository.save(noEJB);

        mohammad.getBooks().add(book);
        mehdi.getBooks().add(EJb);
        book.getAuthors().add(mohammad);
        EJb.getAuthors().add(mehdis);

      Book b1=new Book();
      b1.setTitle("Java EE");
      b1.setISBN("987654321");
      b1.getAuthors().add(mehdi);

      Publisher pub=new Publisher();
      pub.setPublisherName("sadra");
      Publisher savedpub=publisherRepository.save(pub);






        authorRepository.save(mohammad);
        authorRepository.save(mehdi);

              System.out.println("in Bootstrap");
        System.out.println("Author count is : "+ authorRepository.count());
        System.out.println("Book count is : "+ bookRepository.count());



    }
}

package mirza.SpringFramework.spring6webapp.Domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id")
    private Long id;

    @Column(name = "publisherName")
    private String publisherName;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books ;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getPublisher_id() {
        return id;
    }

    public void setPublisher_id(Long publisher_id) {
        this.id = publisher_id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return getPublisher_id() != null ? getPublisher_id().equals(publisher.getPublisher_id()) : publisher.getPublisher_id() == null;
    }

    @Override
    public int hashCode() {
        return getPublisher_id() != null ? getPublisher_id().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisher_id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}


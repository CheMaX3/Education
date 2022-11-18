package BookBase;

public class Book {
    private String author;
    private String name;
    private Integer publicationDate;

    public Book (String author, String name, Integer publicationDate) {
        this.author = author;
        this.name = name;
        this.publicationDate = publicationDate;
    }

    public String getAuthor () {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }


}

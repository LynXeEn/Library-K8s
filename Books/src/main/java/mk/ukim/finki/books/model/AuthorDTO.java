package mk.ukim.finki.books.model;

import lombok.Data;

@Data
public class AuthorDTO {

    private String id;
    private String name;
    private String biography;
    private String email;

    public AuthorDTO() {
    }

    public AuthorDTO(String id, String name, String biography, String email) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.email = email;
    }

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.biography = author.getBiography();
        this.email = author.getEmail();
    }
}

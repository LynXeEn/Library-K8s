package mk.ukim.finki.books.model;

import lombok.Data;

@Data
public class AuthorDTO {

    private String id;
    private String name;
    private String biography;

    public AuthorDTO() {
    }

    public AuthorDTO(String id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }
}
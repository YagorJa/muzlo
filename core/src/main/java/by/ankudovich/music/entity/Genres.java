package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "genres")
public class Genres {
    @Id
    @GeneratedValue
    private Long genre_id;
    private String genre_name;
    private String genre_description;
}

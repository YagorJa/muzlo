package by.ankudovich.music.entity;



import by.ankudovich.music.enums.SubscribeType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "users")
public class   User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String surname;
//    private SubscribeType type;



}
package by.ankudovich.music.entity;


import by.ankudovich.music.apis.role.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String username;
    private String password;
    private String email;
    private String surname;
    @OneToOne(cascade = CascadeType.ALL)
    private Subscriptions subscription;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "favorite_song", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "track_id"))
    private Collection<Track> favoriteSongs;
    @Enumerated(EnumType.STRING)
    private UserRole role;


}
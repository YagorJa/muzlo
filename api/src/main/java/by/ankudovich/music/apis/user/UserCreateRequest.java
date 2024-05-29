package by.ankudovich.music.apis.user;

import by.ankudovich.music.apis.role.UserRole;
import lombok.Data;

@Data
public class UserCreateRequest {
    private String name;
    private String username;
    private String password;
    private String email;
    private String surname;
    private UserRole role;
}

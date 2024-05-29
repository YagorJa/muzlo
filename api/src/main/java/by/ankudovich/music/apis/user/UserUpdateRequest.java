package by.ankudovich.music.apis.user;

import lombok.Data;

@Data
public class UserUpdateRequest extends UserCreateRequest {
    private Long id;
}

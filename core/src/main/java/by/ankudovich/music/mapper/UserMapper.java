package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.apis.user.UserCreateRequest;
import by.ankudovich.music.apis.user.UserResponse;
import by.ankudovich.music.apis.user.UserUpdateRequest;
import by.ankudovich.music.entity.Track;
import by.ankudovich.music.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "subscription.user",ignore = true)
    UserResponse toResponse(User user);
    User toEntity(UserCreateRequest createRequest);


    @Mapping(target = "subscriptions", ignore = true)
    SubscriptionTypeResponse toSubscriptionTypeResponseResponse(SubscriptionTypeResponse typeResponse);

    @Mapping(target = "artist", ignore = true)
    @Mapping(target = "album", ignore = true)
    @Mapping(target = "genre", ignore = true)
    TrackResponse toTrackResponse(Track song);

    User toEntity(UserUpdateRequest updateRequest);

    @Mapping(target = "userId", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest updateRequest);
}
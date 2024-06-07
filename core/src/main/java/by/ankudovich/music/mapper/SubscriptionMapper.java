package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.apis.subscriptions.SubscriptionCreateRequest;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import by.ankudovich.music.apis.user.UserResponse;
import by.ankudovich.music.entity.SubscriptionTypes;
import by.ankudovich.music.entity.Subscriptions;
import by.ankudovich.music.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {
    SubscriptionResponse toResponse(Subscriptions subscription);

    @Mapping(target = "subscriptions", ignore = true)
    SubscriptionTypeResponse toTypeResponse(SubscriptionTypes types);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "favoriteSongs", ignore = true)
    @Mapping(target = "subscription", ignore = true)
    UserResponse toUserResponse(User user);

    Subscriptions toEntity(SubscriptionCreateRequest subscriptionCreateRequest);
}

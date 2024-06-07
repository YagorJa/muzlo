package by.ankudovich.music.service.type;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeCreateRequest;
import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.repository.SubscriptionTypeRepository;

public interface TypeService {
    SubscriptionTypeResponse addType(SubscriptionTypeCreateRequest request);
    SubscriptionTypeResponse getType(Long id);
}

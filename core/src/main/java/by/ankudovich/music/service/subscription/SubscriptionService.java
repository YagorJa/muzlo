package by.ankudovich.music.service.subscription;

import by.ankudovich.music.apis.subscriptions.SubscriptionCreateRequest;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse add(SubscriptionCreateRequest subscriptionCreateRequest);
    SubscriptionResponse getSub(Long id);
}

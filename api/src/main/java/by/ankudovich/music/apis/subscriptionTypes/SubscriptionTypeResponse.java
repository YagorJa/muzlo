package by.ankudovich.music.apis.subscriptionTypes;

import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import lombok.Data;

import java.util.Collection;
@Data
public class SubscriptionTypeResponse {
    private Long id;
    private String description;
    private Double price;
    private String typeName;
    private Collection<SubscriptionResponse> subscriptions;
}

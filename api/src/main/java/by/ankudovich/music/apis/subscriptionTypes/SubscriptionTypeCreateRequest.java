package by.ankudovich.music.apis.subscriptionTypes;

import lombok.Data;

import java.util.Collection;

@Data
public class SubscriptionTypeCreateRequest {
    private String description;
    private Double price;
    private String typeName;
    private Collection<Long> subscriptionsId;
}

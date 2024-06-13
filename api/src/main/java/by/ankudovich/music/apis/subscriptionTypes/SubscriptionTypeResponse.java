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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Collection<SubscriptionResponse> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Collection<SubscriptionResponse> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

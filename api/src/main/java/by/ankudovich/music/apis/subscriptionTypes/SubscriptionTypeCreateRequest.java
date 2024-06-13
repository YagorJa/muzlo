package by.ankudovich.music.apis.subscriptionTypes;

import lombok.Data;

import java.util.Collection;

@Data
public class SubscriptionTypeCreateRequest {
    private String description;
    private Double price;
    private String typeName;
    private Collection<Long> subscriptionsId;

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

    public Collection<Long> getSubscriptionsId() {
        return subscriptionsId;
    }

    public void setSubscriptionsId(Collection<Long> subscriptionsId) {
        this.subscriptionsId = subscriptionsId;
    }
}

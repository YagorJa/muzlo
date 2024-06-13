package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "subcsriptionTypes")
public class SubscriptionTypes {
    @Id
    @GeneratedValue
    private Long subscrTypeId;
    private String description;
    private Double price;
    private String typeName;
    @OneToMany(mappedBy = "subscriptionType")
    private Collection<Subscriptions> subscriptions;

    public Long getSubscrTypeId() {
        return subscrTypeId;
    }

    public void setSubscrTypeId(Long subscrTypeId) {
        this.subscrTypeId = subscrTypeId;
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

    public Collection<Subscriptions> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Collection<Subscriptions> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

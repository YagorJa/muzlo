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

}

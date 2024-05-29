package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "subscriptions")
public class Subscriptions {
    @Id
    @GeneratedValue
    private Long subscrId;
    @OneToOne
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private SubscriptionTypes subscriptionType;

}

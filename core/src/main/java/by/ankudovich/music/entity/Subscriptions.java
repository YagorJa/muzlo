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
    private Long subscr_id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="subscription_type_id", nullable=false)
    private SubscriptionTypes subscriptionType;
    private LocalDate start_date;
    private LocalDate end_date;

}

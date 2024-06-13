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

    public Long getSubscrId() {
        return subscrId;
    }

    public void setSubscrId(Long subscrId) {
        this.subscrId = subscrId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SubscriptionTypes getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionTypes subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}

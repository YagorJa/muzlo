package by.ankudovich.music.apis.subscriptions;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.apis.user.UserResponse;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SubscriptionResponse {
    private Long subscrId;
    private UserResponse user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private SubscriptionTypeResponse type;

    public Long getSubscrId() {
        return subscrId;
    }

    public void setSubscrId(Long subscrId) {
        this.subscrId = subscrId;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
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

    public SubscriptionTypeResponse getType() {
        return type;
    }

    public void setType(SubscriptionTypeResponse type) {
        this.type = type;
    }
}

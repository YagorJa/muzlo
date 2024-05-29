package by.ankudovich.music.apis.subscriptions;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.apis.user.UserResponse;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;

@Data
public class SubscriptionResponse {
    private Long subscrId;
    private UserResponse user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private SubscriptionTypeResponse subscrTypeId;
}

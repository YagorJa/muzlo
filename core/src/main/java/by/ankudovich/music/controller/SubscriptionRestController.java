package by.ankudovich.music.controller;

import by.ankudovich.music.apis.subscriptions.SubscriptionCreateRequest;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.subscription.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("subscription")
public class SubscriptionRestController {
    private final SubscriptionService subscriptionService;

    @Transactional
    @PostMapping("/add")
    public SubscriptionResponse addSubscription(@RequestBody SubscriptionCreateRequest request) {
        return subscriptionService.add(request);
    }

    @GetMapping("/subscription/{id}")
    public SubscriptionResponse getSubscriptionById(@PathVariable Long id) {
        SubscriptionResponse response = subscriptionService.getSub(id);
        if (response == null) {
            throw new UniversalException("нет данного жанра");
        }
        return response;
    }
}


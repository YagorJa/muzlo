package by.ankudovich.music.service.subscription;

import by.ankudovich.music.apis.subscriptions.SubscriptionCreateRequest;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import by.ankudovich.music.mapper.SubscriptionMapper;
import by.ankudovich.music.mapper.UserMapper;
import by.ankudovich.music.repository.SubscriptionRepository;
import by.ankudovich.music.repository.SubscriptionTypeRepository;
import by.ankudovich.music.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class SubscriptionServiceImpl implements SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;
    private final UserRepository userRepository;
    private final SubscriptionMapper subscriptionMapper;
    private final SubscriptionTypeRepository typeRepository;
    private final UserMapper userMapper;
    @Override
    public SubscriptionResponse add(SubscriptionCreateRequest subscriptionCreateRequest) {
       var subscription = subscriptionMapper.toEntity(subscriptionCreateRequest);
       subscription.setUser(userRepository.findById(subscriptionCreateRequest.getUserId()).orElse(null));
       subscription.setSubscriptionType(typeRepository.findById(subscriptionCreateRequest.getUserId()).orElse(null));
        return subscriptionMapper.toResponse(subscriptionRepository.save(subscription));
    }

    @Override
    public SubscriptionResponse getSub(Long id) {
        return subscriptionMapper.toResponse(subscriptionRepository.findById(id).orElse(null));
    }
}

package by.ankudovich.music.service.type;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeCreateRequest;
import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.mapper.SubscriptionTypeMapper;
import by.ankudovich.music.repository.SubscriptionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService{
    private SubscriptionTypeMapper mapper;
    private SubscriptionTypeRepository repository;
    @Override
    public SubscriptionTypeResponse addType(SubscriptionTypeCreateRequest request) {
        var type = mapper.toEntity(request);
        return mapper.toResponse(repository.save(type));
    }

    @Override
    public SubscriptionTypeResponse getType(Long id) {
        return mapper.toResponse(repository.findById(id).orElse(null));
    }
}

package by.ankudovich.music.controller;

import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeCreateRequest;
import by.ankudovich.music.apis.subscriptionTypes.SubscriptionTypeResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.type.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/type")
public class TypeRestController {
    private final TypeService typeService;
    @Transactional
    @PostMapping("/add")
    public SubscriptionTypeResponse add(@RequestBody SubscriptionTypeCreateRequest request) {
        return typeService.addType(request);
    }
@GetMapping("/get/{id}")
  public  SubscriptionTypeResponse get(@PathVariable Long id){
        var type = typeService.getType(id);
        if (type == null){
            throw new UniversalException("Нет типа");
        }
        return type;
  };
}

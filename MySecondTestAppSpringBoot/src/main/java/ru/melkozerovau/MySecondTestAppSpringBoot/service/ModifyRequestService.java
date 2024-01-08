package ru.melkozerovau.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.melkozerovau.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}

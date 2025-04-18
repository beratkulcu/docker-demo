package com.docker.test;

import com.docker.entity.StateEntity;
import com.docker.entity.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final StateRepository stateRepository;

    @Cacheable(value = "states")
    public List<StateEntity> getAllStates() {
        return stateRepository.findAll();
    }
}

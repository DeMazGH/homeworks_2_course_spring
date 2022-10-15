package pro.sky.homeworks.homeworks2coursespring.service;

import org.springframework.stereotype.Service;

@Service
public interface BasketService {

    void add(int itemId);

    void add(int firstItemId, int secondItemId);

    Object get();
}

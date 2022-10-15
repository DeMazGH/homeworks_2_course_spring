package pro.sky.homeworks.homeworks2coursespring.service;

public interface BasketService {

    void add(Integer itemId);

    void add(Integer firstItemId, Integer secondItemId);

    Object get();
}

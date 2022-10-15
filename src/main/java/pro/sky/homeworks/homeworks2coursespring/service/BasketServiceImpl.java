package pro.sky.homeworks.homeworks2coursespring.service;

import pro.sky.homeworks.homeworks2coursespring.model.Basket;

import java.util.Collections;

public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(int itemId) {
        basket.getItemList().add(itemId);
    }

    @Override
    public void add(int firstItemId, int secondItemId) {
        basket.getItemList().add(firstItemId);
        basket.getItemList().add(secondItemId);
    }

    @Override
    public Object get() {
        return Collections.unmodifiableList(basket.getItemList());
    }
}

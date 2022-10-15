package pro.sky.homeworks.homeworks2coursespring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.homeworks.homeworks2coursespring.model.Basket;

import java.util.Collections;

@Service
@Scope("session")
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(Integer itemId) {
        basket.getItemList().add(itemId);
    }

    @Override
    public void add(Integer firstItemId, Integer secondItemId) {
        basket.getItemList().add(firstItemId);
        basket.getItemList().add(secondItemId);
    }

    @Override
    public Object get() {
        return Collections.unmodifiableList(basket.getItemList());
    }
}

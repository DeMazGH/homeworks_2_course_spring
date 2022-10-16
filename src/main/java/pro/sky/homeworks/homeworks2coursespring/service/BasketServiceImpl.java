package pro.sky.homeworks.homeworks2coursespring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homeworks.homeworks2coursespring.model.Basket;

import java.util.ArrayList;
import java.util.Collections;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl() {
        this.basket = new Basket();
    }

    @Override
    public void add(ArrayList<Integer> itemId) {
        basket.getItemList().addAll(itemId);
    }

    @Override
    public Object get() {
        return Collections.unmodifiableList(basket.getItemList());
    }
}

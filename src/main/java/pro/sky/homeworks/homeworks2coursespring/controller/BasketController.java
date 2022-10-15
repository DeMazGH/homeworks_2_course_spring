package pro.sky.homeworks.homeworks2coursespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @GetMapping("/store/order/add")
    public void add(int itemId) {

    }

    @GetMapping("/store/order/get")
    public Object get() {
        return null;
    }
}

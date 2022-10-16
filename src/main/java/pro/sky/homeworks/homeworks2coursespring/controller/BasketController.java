package pro.sky.homeworks.homeworks2coursespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeworks.homeworks2coursespring.service.BasketService;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(value = "/add")
    public void add(@RequestParam("itemId") ArrayList<Integer> itemId) {
        basketService.add(itemId);
    }

    @GetMapping(value = "/get")
    public Object get() {
        return basketService.get();
    }
}

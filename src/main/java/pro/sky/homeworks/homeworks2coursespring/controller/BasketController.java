package pro.sky.homeworks.homeworks2coursespring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeworks.homeworks2coursespring.service.BasketService;

@RestController
@RequestMapping("/store/order")
@Scope("session")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(value = "/add")
    public void add(@RequestParam("itemId") Integer itemId) {
        basketService.add(itemId);
    }

    @GetMapping(value = "/add", params = {"firstItemId", "secondItemId"})
    public void add(@RequestParam("firstItemId")Integer firstItemId, @RequestParam("secondItemId")Integer secondItemId) {
        basketService.add(firstItemId, secondItemId);
    }

    @GetMapping(value = "/get")
    public Object get() {
        return basketService.get();
    }
}

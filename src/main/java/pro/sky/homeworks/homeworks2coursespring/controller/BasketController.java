package pro.sky.homeworks.homeworks2coursespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @GetMapping("/store/order/add")
    public void add(@RequestParam("itemId") int itemId) {

    }

    @GetMapping(value = "/store/order/add", params = {"firstItemId", "secondItemId"})
    public void add(@RequestParam("firstItemId")int firstItemId, @RequestParam("secondItemId")int secondItemId) {

    }

    @GetMapping("/store/order/get")
    public Object get() {
        return null;
    }
}

package pro.sky.homeworks.homeworks2coursespring.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Basket {

    private final List<Integer> itemList;

    public Basket() {
        this.itemList = new ArrayList<>();
    }

    public List<Integer> getItemList() {
        return itemList;
    }


}

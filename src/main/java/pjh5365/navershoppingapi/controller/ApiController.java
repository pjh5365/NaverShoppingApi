package pjh5365.navershoppingapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjh5365.navershoppingapi.dto.ShoppingResponse;
import pjh5365.navershoppingapi.service.ShoppingService;

@RestController
@RequestMapping("/api/shopping")
@RequiredArgsConstructor    //final 필드 자동주입
public class ApiController {

    private final ShoppingService shoppingService;

    @GetMapping("/search/{query}")
    public ShoppingResponse search(@PathVariable String query) {
        return shoppingService.search(query);
    }
}

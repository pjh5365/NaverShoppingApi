package pjh5365.navershoppingapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjh5365.navershoppingapi.dto.ShoppingRequest;
import pjh5365.navershoppingapi.dto.ShoppingResponse;
import pjh5365.navershoppingapi.shopping.NaverClient;

@Service
@RequiredArgsConstructor
public class ShoppingService {
    private final NaverClient naverClient;

    public ShoppingResponse search(String query) {
        ShoppingRequest shoppingRequest = new ShoppingRequest();
        shoppingRequest.setQuery(query);

        return naverClient.search(shoppingRequest);
    }
}

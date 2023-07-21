package pjh5365.navershoppingapi.shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pjh5365.navershoppingapi.dto.ShoppingRequest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchTest() {
        var search = new ShoppingRequest();
        search.setQuery("슬리퍼");

        var result = naverClient.search(search);
        System.out.println(result);
    }
}

package pjh5365.navershoppingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data   //getter, setter 생성
@AllArgsConstructor //모든 필드가 들어간 생성자 만들기
@NoArgsConstructor  //기본 생성자 만들기
public class ShoppingRequest {
    private String query = "";   //검색어
    private Integer display = 1;    //검색결과 갯수는 1개만

    public MultiValueMap map() {    //파라미터를 넘기기 위한 맵
        LinkedMultiValueMap<String, String > map = new LinkedMultiValueMap();
        map.add("query", query);
        map.add("display", String.valueOf(display));

        return map;
    }

}

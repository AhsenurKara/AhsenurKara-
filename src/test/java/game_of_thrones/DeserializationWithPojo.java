package game_of_thrones;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.junit.Test;
import pojo.game_of_thrones.*;



import java.io.IOException;

public class DeserializationWithPojo {


    @Test
    public void getCharacter() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        CharacterPojo character = objectMapper.readValue(response.getEntity().getContent(), CharacterPojo.class);

        System.out.println(character.getData());
    }

    @Test
    public void getHouses() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/houses");

        ObjectMapper objectMapper = new ObjectMapper();
        HousesPojo[] houses = objectMapper.readValue(response.getEntity().getContent(), HousesPojo[].class);

        for (HousesPojo house : houses) {
            System.out.println(house.getName());
        }
    }

    @Test
    public void getBookCharacters() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters/");

        ObjectMapper objectMapper = new ObjectMapper();
        CharFullPojo[] books = objectMapper.readValue(response.getEntity().getContent(), CharFullPojo[].class);

        for (CharFullPojo book : books) {
            System.out.println(book.getName());
        }
    }

    @Test
    public void getLocations() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        LocationPojo location = objectMapper.readValue(response.getEntity().getContent(), LocationPojo.class);

        System.out.println(location.getData());

    }
}
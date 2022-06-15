package star_wars.star_wars;

import com.fasterxml.jackson.databind.ObjectMapper;
import game_of_thrones.HttpClientUtils;
import org.apache.http.HttpResponse;
import org.junit.Test;
import pojo.game_of_thrones.CharFullPojo;
import star_wars.PeoplePojo;
import star_wars.PlanetsPojo;
import star_wars.StarshipPojo;

import java.io.IOException;

public class DeserializationWithPojo {


    @Test
    public void getPlanets() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/planets?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PlanetsPojo[] star = objectMapper.readValue(response.getEntity().getContent(), PlanetsPojo[].class);

        for (PlanetsPojo planet : star){
            System.out.println(planet.getName());
        }
        }


    @Test
    public void getStarships() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/starships/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        StarshipPojo starship = objectMapper.readValue(response.getEntity().getContent(), StarshipPojo.class);

        System.out.println(starship.getResults());
    }

    @Test
    public void getPeople() throws IOException {

        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/people/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PeoplePojo people = objectMapper.readValue(response.getEntity().getContent(), PeoplePojo.class);

        System.out.println(people.getResults());
    }
}


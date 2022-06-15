package star_wars;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StarshipPojo {
    private int count;
    private String next;
    private int previous;
    private List<Object> results;
    private String name;
    private String model;
    private String manufacturer;
    private int cost_in_credits;
    private int length;
    private int max_atmosphering_speed;
    private int crew;
    private int passengers;
    private int cargo_capacity;
    private int consumables;
    private int hyperdrive_rating;
    private int MGLT;
    private String starship_class;
    private List<String> pilots;
    private List<String> films;
    private List<String> created;
    private List<String> edited;
    private String url;
}
/*



    "count": 36,
    "next": "https://swapi.dev/api/starships/?page=2",
    "previous": null,
    "results": [
        {
            "name": "CR90 corvette",
            "model": "CR90 corvette",
            "manufacturer": "Corellian Engineering Corporation",
            "cost_in_credits": "3500000",
            "length": "150",
            "max_atmosphering_speed": "950",
            "crew": "30-165",
            "passengers": "600",
            "cargo_capacity": "3000000",
            "consumables": "1 year",
            "hyperdrive_rating": "2.0",
            "MGLT": "60",
            "starship_class": "corvette",
            "pilots": [],
            "films": [
                "https://swapi.dev/api/films/1/",
                "https://swapi.dev/api/films/3/",
                "https://swapi.dev/api/films/6/"
            ],
            "created": "2014-12-10T14:20:33.369000Z",
            "edited": "2014-12-20T21:23:49.867000Z",
            "url": "https://swapi.dev/api/starships/2/"
        },
 */
package pojo.game_of_thrones;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CharacterPojo {



    /*

    Create Pojo files for:
	GOT:
		https://api.got.show/api/map/characters
		https://api.got.show/api/book/houses
		https://api.got.show/api/book/characters !!!
		https://api.got.show/api/book/characters/{name}
		https://api.got.show/api/book/characterlocations
		https://api.got.show/api/book/characterlocations/{name}

     */

/*

{
    "message": "Success",
    "data": [
        {
             "titles": [],
            "books": [
                "The Sworn Sword",
                "The Mystery Knight",
                "A Storm of Swords"
            ],
            "_id": "5cc0743504e71a0010b84f43",
            "dateOfDeath": 196,
            "dateOfBirth": 184,
            "imageLink": "/misc/images/characters/Aegon_Blackfyre.jpeg",
            "male": true,
            "culture": "Valyrian",
            "house": "House Blackfyre",
            "slug": "Aegon_Blackfyre",
            "name": "Aegon Blackfyre",
            "createdAt": "2019-04-24T14:35:33.774Z",
            "updatedAt": "2019-04-24T14:35:33.774Z",
            "__v": 0
        },
        {
 */



    private List<Object> data;
    private  List<String> titles;
    private  List<String> books;
    private String message;
    private int _id;
    private String male;
    private String house;
    private String slug;
    private String name;
    private String createdAt;
    private String updatedAt;
    private int __v;
    private String imageLink;
    private String culture;




    /*



     */

}

package pojo.game_of_thrones;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagPojo {

    private int id;
    private String name;


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

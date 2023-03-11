import java.util.*;

public class Room {
    private int bedType;
    List<Person> persons = new ArrayList<>(bedType);;

    public Room() {

    }

    public Room(int bedType) {
        this.bedType = bedType;
        this.persons = new ArrayList<>(bedType);
        for (int i = 0; i < bedType; i++) {
            persons.add(new Person());
        }
    }

    public void addRoomType(int bedType) {
        this.bedType = bedType;
    }

}

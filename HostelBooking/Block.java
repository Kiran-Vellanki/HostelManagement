import java.util.*;

public class Block {
    private int floors;
    private List<Room> list;

    public Block(int floors) {
        this.floors = floors;
        list = new ArrayList<>(floors);
        for (int i = 0; i < floors; i++) {
            list.add(new Room());
        }
    }

    public void addBedType(int roomNo, int bedType) {
        list.get(roomNo).addRoomType(bedType);
    }

    public void addPerson(int roomNo, String name, int age, String email, String regNo) {
        list.get(roomNo).persons.add(new Person(name, age, email, regNo));
    }

    public void getDetails(int roomNo) {
        for (Person person : list.get(roomNo).persons) {
            System.out.println(person.name + " " + person.age + " " + person.email + " " + person.regNo);
        }
    }

    public void getDetailsFloorWise(int floor) {
        for (Room room : list) {
            for (Person person : room.persons) {
                System.out.print(person.name + " " + person.age + " " + person.email + " " + person.regNo);
            }
            System.out.println();
        }
    }

    public void getDetails(int floor, int roomNo) {

    }
}

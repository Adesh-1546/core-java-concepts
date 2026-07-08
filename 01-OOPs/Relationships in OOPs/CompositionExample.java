package OOPS;

// Room class (dependent)
class Room {
    void showRoom() {
        System.out.println("Room is created");
    }
}

// House class (owner)
class House {

    private Room room; // Composition

    House() {
        room = new Room(); // Room created inside House
    }

    void showHouse() {
        System.out.println("House is created");
        room.showRoom();
    }
}

public class CompositionExample {
    public static void main(String[] args) {

        House house = new House();
        house.showHouse();

        // Room cannot exist independently here
    }
}

package AutowiredDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Freshman {
    private String name;

    @Autowired
    private DormRoom room;

    public Freshman(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public DormRoom getRoom() { return room; }
}

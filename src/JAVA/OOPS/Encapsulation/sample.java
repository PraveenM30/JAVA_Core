package JAVA.OOPS.Encapsulation;

public class sample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    sample(String name1) {
        this.name = name1;
    }
}

class runner1 {
    public static void main(String[] args) {
        sample s = new sample("praveen");
        System.out.println(s.getName());
        s.setName("manoj");
        System.out.println(s.getName());
    }
}

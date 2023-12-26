public class Wheel {
    private String color;
    private int inch;
    private String name;

    public Wheel(String color, int inch, String name) {
        this.color = color;
        this.inch = inch;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package exercise;

// BEGIN
class Flat implements Home {
    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }

        return this.getArea() > another.getArea() ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Квартира площадью " +
                this.getArea() +
                " метров на " + floor + " этаже";
    }
}
// END

public class Vector {
    double x1, y1, x2, y2;

    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Vector(double x2, double y2) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Vector sum(Vector vector){
        double x1_n = this.x1 + vector.x1;
        double y1_n = this.y1 + vector.y1;
        double x2_n = this.x2 + vector.x2;
        double y2_n = this.y2 + vector.y2;
        return new Vector(x1_n, y1_n, x2_n, y2_n);
    }

    @Override
    public String toString() {
        return "Vector: \n" +
                "x1 - " + x1 + " y1 - " + y1 +
                "\nx2 - " + x2 + " y2 - " + y2;
    }
}

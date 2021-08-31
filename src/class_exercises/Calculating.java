package class_exercises;

public class Calculating {
    int res;

    public Calculating() {

    }

    public void add(int x, int y) {
        res = x + y;

    }

    public int getAdd() {
        System.out.println(res);
        return res;
    }

    public int mult(int x, int y) {
        int result = x * y;
        return result;
    }
}

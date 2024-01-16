package lesson_28_reflection_anotation.task_2_prototype.color;

public class Color implements Cloneable{
    private int red;
    private int blue;
    private int green;
    private int alpha;

    public Color(int red,int green, int blue, int alpha) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setAlpha(alpha);
    }

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", blue=" + blue +
                ", green=" + green +
                ", alpha=" + alpha +
                '}';
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red < 0 || red > 255) throw new IllegalArgumentException("number must be between 0 .. 255");

        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (blue < 0 || blue > 255) throw new IllegalArgumentException("number must be between 0 .. 255");
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (green < 0 || green > 255) throw new IllegalArgumentException("number must be between 0 .. 255");
        this.green = green;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        if (alpha < 0 || alpha > 255) throw new IllegalArgumentException("number must be between 0 .. 255");
        this.alpha = alpha;
    }

    @Override
    public Color clone() {
        try {
            Color clone = (Color) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
import java.util.List;

public class Badge {

    private String text;
    private List color;
    private String size;


    public Badge() {
    }

    public Badge(String text, List color, String size) {
        this.text = text;
        this.color = color;
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List getColor() {
        return color;
    }

    public void setColor(List color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "text='" + text + '\'' +
                ", color=" + color +
                ", size='" + size + '\'' +
                '}';
    }
}

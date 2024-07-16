import javax.persistence.*;

@Entity
@DiscriminatorValue("Pizza")
public class Pizza extends Dish {
    private double size;
    private boolean spicy;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

}

import java.util.Objects;

public abstract class Fruit implements Comparable {
    private int acidity;

    public Fruit (int acidity) {
        this.acidity=acidity;
    }

    public int getAcidity() {
        return acidity;
    }

    public void setAcidity(int acidity) {
        this.acidity = acidity;
    }

    @Override
    public int compareTo(Object fruit) {
        if(this.acidity ==  ((Fruit) fruit).acidity) {
            return 0;
        }
        return this.acidity > ((Fruit) fruit).acidity ? 1 : -1;
    }

    @Override
    public boolean equals(Object newFruit) {
        if (this == newFruit) {
            return true;
        }
        if (newFruit == null || getClass() != newFruit.getClass()){
            return false;
        }
        Fruit fruit = (Fruit) newFruit;
        return this.acidity == ((Fruit) newFruit).acidity;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(acidity);
    }

    @Override
    public String toString() {
        return "Acidity --> " + getAcidity();
    }
}

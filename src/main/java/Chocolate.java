import java.util.Comparator;

public class Chocolate
{
    double price ;
    double weight;
    public void setWeight(double weight) {
        this.weight=weight;

    }

    public void setPrice(double price) {
        this.price=price;

    }
    public double getPrice() {
        return price;
    }



    public double getWeight() {
        return weight;
    }
}
class Toblerone extends Chocolate
{
    public Toblerone()
    {
        super.setWeight(120);
        super.setPrice(650);
    }
}
class Cadbury extends Chocolate
{
    public Cadbury()
    {
        super.setWeight(180);
        super.setPrice(250);
    }
}
class Snickers extends Chocolate
{
    public Snickers()
    {
        super.setWeight(70);
        super.setPrice(300);
    }

}
class Sortbyprice implements Comparator<Chocolate>
{
    public int compare(Chocolate chocolate1, Chocolate chocolate2)
    {
        return (int) (chocolate1.getPrice()-chocolate2.getPrice());
    }

}



public class Shop extends Place{
    String description;
    String  priceCategory;

    public Shop(String name , String description , String priceCategory){
        this.name=name;
        this.description=description;
        this.priceCategory=priceCategory;
        this.stars=0;
    }

    @Override
    public String toString(){
        return " Shop { "+ name + " , " + "Stars = "+ stars+ " , "+ "Price Category "+ priceCategory + " , " + "Description "+ description+ " } ";

    }


}
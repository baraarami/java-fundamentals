

import java.util.ArrayList;

public class Main {
    public boolean mainMethode(){
        return true;
    }

    public static void main(String[] args) {
        Restaurant restaurant1= new Restaurant("Classy" , "$$");
        Review review = new Review("not bad" , "Baraa" , 8);

        System.out.println(restaurant1.toString());
        System.out.println(review.toString());
        restaurant1.addReview(review);
        System.out.println(restaurant1.reviews);
        System.out.println(restaurant1.toString());



        Shop shop = new Shop("pretty" , "Flower Shop" , "$$$");
        System.out.println(shop.toString());

        ArrayList<String> movies = new ArrayList<String>();
        movies.add("wonder women ");
        movies.add("Me before you ");
        movies.add("Twilight");


        Theater theater= new Theater("Tablet" , movies);
        Review review1= new Review("awesome" , "sereen" , 8 , theater , "Twilight");
        System.out.println(review1.toString());
    }
}

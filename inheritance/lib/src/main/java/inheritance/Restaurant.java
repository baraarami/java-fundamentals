/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends ReviewInterface {
    private  String name;
    private int stars;
    private String price;
    List<Review> reviews = new ArrayList<>();

    public Restaurant(String name , int stars , String price){
        super();
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // public int getStars(){
    //     return stars;
    // }

    public String getPrice(){
        return price;
    }


    public void setName(String name){
        this.name = name ;
    }

    public void setStars(int stars){
        this.stars = stars ;
    }

    public void setPrice(String price){
        this.price = price ;
    }


@Override
    public String toString() {
        return "Restaurant name: " + getName() + " with Stars" + getStars() + " and the price is : " + getPrice() ;
    }



 @Override
 public void addReview(String body , String auther , int stars ){
     addReview (body , auther , stars);
 }

 public void addReview(Review review){
     if(! this.reviews.contains(review)){
         this.setStars(review.getStars());
         this.reviews.add(review);
     }
 }

    public int getStars() {
     return stars; 
    }

}
    

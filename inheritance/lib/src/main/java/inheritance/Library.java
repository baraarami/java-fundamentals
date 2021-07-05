package inheritance;

public class Library {

    public boolean myLibrary (){
        return true;
    }



    public static void main(String[] args) {
        Restaurant mb = new Restaurant("hotdog", 5 , "from 15$ to 52$");
        System.out.println(mb);


        Review review1 = new Review("first review", "baraa", 5);
        System.out.println(review1);

        Review review2 = new Review("secound","sara", 3);
        System.out.println(review2);
        // restrornt1.addReview(review2);
        
        Review review3 = new Review("thired", "neveen", 1);
        System.out.println(review3);
        // restrornt1.addReview(review3);
        // System.out.println(restrornt1);


        // System.out.println("Restorant :" + mb.getName()+ "," + "Rate :" + mb.getStars() + "," + "price is :" + mb.getPrice());
        // System.out.println("Review for the resturant : " + "Auther is :" + mb.getAuther() + ","+ "comment: " + mb.getBody() + "," + "Rate given " + mb.getStars());


    }
   
}

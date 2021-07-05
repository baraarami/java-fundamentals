package inheritance;

public class Library {
    public static void main(String[] args) {
        Restaurant mb = new Restaurant("hotdog", 5 , "from 15$ to 52$");
        mb.addReview("sweet", "baraa" , 5);

        System.out.println("Restorant :" + mb.getName()+ "," + "Rate :" + mb.getStars() + "," + "price is :" + mb.getPrice());
        System.out.println("Review for the resturant : " + "Auther is :" + mb.getAuther() + ","+ "comment: " + mb.getBody() + "," + "Rate given " + mb.getStars());


    }
    public boolean Library(){
        return true;
    }
}

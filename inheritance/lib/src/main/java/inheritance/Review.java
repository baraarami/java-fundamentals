package inheritance;
//import review.types.LinkedList;



public class Review {
 
    static String body;
    static String auther;
    static int stars;


    public Review(String body , String auther , int stars){
        Review.body=body;
        Review.auther=auther;
        Review.stars=stars;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        Review.body=body;

    }

    public String getAuther(){
        return auther;
    }


    public void setAuther(String auther){
        Review.auther= auther;
    }

    public int getStars(){
        return stars;
    }

    public void setStars(int stars){
        Review.stars=stars;
    }

    @Override
    public String toString() {
        return "Review : " + " body :"+ body + " with Stars" + stars + " and the auther is : " + auther ;
    }

}



package inheritance;

public class ReviewInterface implements Review{

    protected static String body;
    protected static int stars;
    public static String auther;


    public ReviewInterface(String body , String auther , int stars){
        ReviewInterface.body = body;
        ReviewInterface.auther = auther;
        ReviewInterface.stars = stars;
    }

    public String getBody(){
        return body;
    }

    public String getAuther(){
        return auther;
    }

    public int getStars(){
        return ReviewInterface.stars;
    }

    @Override
    public String toString() {
       return " ReviewInterface { "+ "body" + body + " ," +"auther :" + auther + "," + "stars" + stars + " }";
    }

}

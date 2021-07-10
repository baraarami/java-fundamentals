public class Review {

    public String author ;
    public int stars;
    public String body;
    public Place place;
    public String movie;


    public Review(){

    }

    public Review (String body , String author , int stars){

        this.author=author;
        this.stars=stars;
        this.body=body;
    }


    public Review (String body , String author , int stars , NewReview place){
        this.author=author;
        this.stars=stars;
        this.body=body;
        place.addReview(this);
    }

    public Review (String body , String author , int stars , Theater place ,String movie){
        this.author=author;
        this.stars=stars;
        this.body=body;
        this.movie=movie;
        place.addReview(this);
    }

    public String toString(){
        if (place != null){
            if (movie != null){
                return "Author :" + author + "\n Movie :"+movie +"\n Theater"+ place.name + "\n Stars"+ stars + "\n Review "+ body;
            }else {

                return "Author :" + author + "\n Theater"+ place.name + "\n Stars"+ stars + "\n Review "+ body;
            }
        }else {
            return "Author :" + author + "\n Stars"+ stars + "\n Review "+ body;
        }
    }

}
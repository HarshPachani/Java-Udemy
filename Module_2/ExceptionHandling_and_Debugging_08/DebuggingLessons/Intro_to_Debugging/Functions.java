public class Functions {
    //Description:
    /*"If gryffindor beats Ravenclaw by a nargin of three hundred points,
    they win the championship.
    If they win by any number of points, they would come second.
    If they lose by less than a hundred points, they came third behind Hufflepuff.
    If they loss by more than a hundred points, they would be in fourth place" */
    public static void main(String[] args) {

        int gryffindor = 500;    
        int ravenclaw = 100;
        int pointsMargin = gryffindor - ravenclaw ;
        int ranking = ranking(pointsMargin);
        System.out.println(ranking);

    }

    public static int ranking(int pointsMargin) {
        if (pointsMargin > 300) {
            return 1;
        } else if (pointsMargin > 0) {
            return 2;
        } else if (pointsMargin > -100) {
            return 1;
        } else {
            return 4;
        } 
    }


}

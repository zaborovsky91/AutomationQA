public class StudentClassC {
    private int score = 0;

    public int getScore () {
        return score;
    }

    public void setScore(int score) {
        if ( score < 0 ||  score > 5) {
            System.out.println("Не верная оценка");
        } else {
            this.score = score;
        }
    }

    public static void main(String args[]){
        StudentClassC newScore  = new StudentClassC();
        newScore.setScore(5);
        System.out.println(newScore.getScore());

    }
}

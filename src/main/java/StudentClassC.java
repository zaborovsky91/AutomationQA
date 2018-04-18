public class StudentClassC {
    private int averageScore = 0;

    public int getScore () {
        return averageScore;
    }

    public void setScore(int score) {
        if ( score < 0 ||  score > 5) {
            System.out.println("Не верная оценка");
        } else {
            this.averageScore = score;
        }
    }

    public static void main(String args[]){
        StudentClassC newScore  = new StudentClassC();
        newScore.setScore(5);
        System.out.println(newScore.getScore());

    }
}

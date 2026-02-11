package karakterBeregner;

public class Main {
    void main(){

        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();



    }

    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void addAssignmentPoints(int points){
        assignmentPoints += points;

    }

    void addExamPoints(int points){
        examPoints += points;

    }

    void addProjectPoints(int points){
        projectPoints += points;

    }

    void printTotal(){
        int totalPoints = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total score: " + totalPoints);
    }

}






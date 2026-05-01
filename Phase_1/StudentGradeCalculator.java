import java.util.Scanner;
public class StudentGradeCalculator {
    
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Can you give me 5 student names with their scores (o-100)");

        String [] names=new String[5];
        double [] scores=new double[5];
        String [] grades=new String[5];

        double total=0;
        double average=0;
        String highestGradeName="";
        String lowestGradeName="";
        double highestGrade=0;
        double lowestGrade=100;



        for (int i=0; i<5; i++){
            names[i]=scanner.next();
            scores[i]=scanner.nextDouble();
            total+=scores[i];
            if (scores[i]>highestGrade){
                highestGrade=scores[i]; 
                highestGradeName=names[i];
            }
            if(scores[i]<=lowestGrade){
                lowestGrade=scores[i];
                lowestGradeName=names[i];

            }
            if (scores[i]>=90){
                grades[i]="A";
            }
            else if (scores[i]>=80){
                grades[i]="B";
            }
            else if (scores[i]>=70){
                grades[i]="C";
            }
            else if (scores[i]>=60){
                grades[i]="D";
            }
            else{
                grades[i]="F";
            }
        }
        for (int i=0; i<5; i++){
            System.out.println("Student: "+ names[i]+" | " + "Score: " + scores[i] + " | " + "Grade: " + grades[i]);
        }
        System.out.println();

        average=total/5;
        System.out.println("Class Average: " + average);
        System.out.println("Highest: " + highestGradeName + " with " + highestGrade);
        System.out.println("Lowest: "+lowestGradeName + " with " + lowestGrade);
         
        scanner.close();

    }
    
}

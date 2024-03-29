import java.util.Scanner;
public class grade {
	@SuppressWarnings("resource")
    public static void main(String[] args){
		System.out.print("Welcome to GradeCalculator!\n\n"); 
        Scanner s = new Scanner(System.in);
		int students = 0;
		int exams = 0;
		double classav = 0;
		int count = 0;
		double lowest = 0;
		double highest = 0;
		
		String name;
		System.out.print("Please enter the number of students: ");
		students = s.nextInt();
		System.out.print("Please enter the number of exams   : ");
		exams = s.nextInt();
		System.out.println("\n\n----------------------------------------");
		
		String[] examScores = new String [exams];
		
		while(count < students) {
			int totalExam=0;
			int starnum=0;
			char letter='a';
			String stars= "";
		
		
			
		System.out.print("Enter student " + (count+1) +"'s name\t: ");
		name = s.nextLine();
		s.nextLine(); 
		System.out.print("Enter exam scores\t: ");
		examScores = s.nextLine().split(" ");
		
		for(int i = 0; i < exams; i++){
			totalExam += Integer.parseInt(examScores[i]);
		}
		int studentavg = totalExam / exams;
		System.out.println(" Average: " + studentavg);
		
		if(studentavg>=90){
			letter = 'A';
			stars = "****";
			starnum = 4;
		}
		else if(studentavg<90 && studentavg>=80){
			letter = 'B';
			stars = "***";
			starnum = 3;
		}
		else if(studentavg<80 && studentavg>=70){
			letter = 'C';
			stars = "**";
			starnum = 2;
		}
		else if(studentavg<70 && studentavg>=60){
			letter = 'D';
			stars = "*";
			starnum = 1;
		}
		else if(studentavg<60){
			letter = 'F';
			stars = "";
			starnum = 0;
		}
		
		System.out.println("Grade statistics for " + name);// Matt for some reason unseen to me at 12:08 it wont pull name from top.
		System.out.println(" Letter Grade: " + letter);
		System.out.println(name + " gets " + starnum + " stars! "+ stars);
			
			
		System.out.println("\n----------------------------------------");
		classav += studentavg;
		count++;
		}
		
		
		
		
		System.out.println("Class statistics: ");
		System.out.println(" Average: "+ (classav / exams));
		System.out.println(" Lowest : " + lowest);
		System.out.println(" Highest: " + highest);
		System.out.println("Done. Good bye!");
		
		}
}
import java.util.Scanner;
public class Stroki {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("����� ������ ������: ");
		String s1 = scan.nextLine();
		 System.out.print("����� ������ ������: ");
		String s2 = scan.nextLine();
		 System.out.print("����� ������ ������: ");
		String s3 = scan.nextLine();
		System.out.println("���������� � ������� �1: "+(s1+s3));
		System.out.println("���������� � ������� �2: "+(s3+s2+s1));
		System.out.println("���������� � ������� �3: "+(s1+s2+s3));		
	}
}

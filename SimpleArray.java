package dataStructure;

public class SimpleArray {

	public static void main(String[] args) {

		// ONe Dim Array
		int[] number = new int[5];
		number[0] = 14;
		number[1] = 1;
		number[2] = 6;
		number[3] = 22;
		number[4] = 10;

		System.out.println("Simple Array");

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");

		}
		System.out.println("\n----------------------------");

		// Array of objects
		System.out.println("Object Array");
		Student[] stu = new Student[3];
		stu[0] = new Student("Alaa", 1);
		stu[1] = new Student("Bedn", 2);
		stu[2] = new Student("Temimy", 3);

		for (Student student : stu) {
			System.out.println("Name :" + student.name + " , id: " + student.id);

		}

		// Two Dimension
		int[][] data = new int[3][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[i][j] + "\t");

			}
			System.out.println("\n");

		}

	}

}

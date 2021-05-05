
public class Main {

	public static void main(String[] args) {
	Course course1 = new Course (1,"Yazýlým Geliþtirici Yetiþtirme Kampý(Csharp + Angular)","engin demirog", 100);
		
		
		
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)","engin demirog",27);
	
		
		
		Course course3 = new Course(3,"Programlamaya giriþ için Temel Kurs","engin demirog",100);
		
		Course [] courses = {course1,course2,course3};
		
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		
		Course[] course = {course1,course2,course3};
		
		System.out.println(course.length);

	}

	}



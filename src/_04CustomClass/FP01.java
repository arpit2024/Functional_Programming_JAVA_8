package _04CustomClass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FP01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courses=List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)
		);
		// allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95Predicate
				= course -> course.getReviewScore() > 95;

		Predicate<Course> reviewScoreGreaterThan90Predicate
				= course -> course.getReviewScore() > 90;

		Predicate<Course> reviewScoreLessThan90Predicate
				= course -> course.getReviewScore() < 90;

		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		// allMatch checks if all the elements in the stream match the given predicate or not & returns false if any of the elements does not match the predicate.
		//returns false since not all the values are greater than 95
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		// noneMatch checks if none of the elements in the stream match the given predicate or not & returns false if any of the elements match the predicate.
		//returns true since none of the values are less than 90
		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		//returns false since all the values are greater than 90
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));
		//returns true since all the values are greater than 95

		//Sorting the courses based on the number of students
		Comparator<Course> comparingByNoOfStudents=Comparator.comparing(Course::getNoOfStudents);
		System.out.println(courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList()));;
	//OP- [FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92,
	// Azure:21000:99, API:22000:97, Microservices:25000:96]

		//Sorting in reverse order based on the number of students- (here comparingInt for primitive int type
		Comparator<Course> comparingByNoOfStudentsDesc=Comparator.comparingInt(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDesc).collect(Collectors.toList()));;
	//OP- [Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92,
	// Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		//suppose we want to sort the courses based on the number of students and if the number of students
		// is the same in multiple then sort based on the review score
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews=
				Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore).reversed();
		System.out.println(
				courses
						.stream()
						.sorted(comparingByNoOfStudentsAndNoOfReviews)
						.collect(Collectors.toList())
		);
	//O/p- [Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92,
	// Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		//to pick top 5 courses- not all
		System.out.println(
				courses
						.stream()
						.sorted(comparingByNoOfStudentsAndNoOfReviews)
						.limit(5)
						.collect(Collectors.toList())
		);
	//[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98]

		//skip top 3 results
		System.out.println(
				courses
						.stream()
						.sorted(comparingByNoOfStudentsAndNoOfReviews)
						.skip(3)
						.collect(Collectors.toList())
		);
	//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		//skip top 3 results and then first 5
		System.out.println(
				courses
					.stream()
					.sorted(comparingByNoOfStudentsAndNoOfReviews)
					.skip(3)
					.limit(5)
					.collect(Collectors.toList())
		);
		//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95]

	//we will print out the list of original courses so that I can have that as a way of comparing
		System.out.println("original List");
		System.out.println(courses);
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91,
		// AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]


	//I would want to keep checking the list until I find a course with review score less than 95
	// and as soon as I find it, I'd want to return this stuff which I found earlier.
		System.out.println(
				courses
					.stream()
					.takeWhile(x-> x.getReviewScore()>=95)
		//while these condition is met, we would want to take the elements from the stream. After that we would want to
		//take none of the elements. So, even if one element breaks the criteria, we'll skip all the elements after that and that's what takeWhile does.
					.collect(Collectors.toList())
		);
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96]


		//As long as this condition is true, it will skip the elements.
		System.out.println(
				courses
						.stream()
						.dropWhile(x-> x.getReviewScore()>=95)
						//while these condition is met, we would want to skip these the elements from the stream.
						.collect(Collectors.toList())
		);
		//O/p- [FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]

		//here coomparingByNoOfStudentsAndNoOfReviews is a comparator-courses based on the number of students and if the number of students
		//is the same in multiple then sort based on the review scor
		System.out.println(
				courses
						.stream()
						.max(comparingByNoOfStudentsAndNoOfReviews)
		);
		//Optional[FullStack:14000:91]//here this is the last element in the comparingByNoOfStudentsAndNoOfReviews list got in above example

		System.out.println(
				courses
						.stream()
						.min(comparingByNoOfStudentsAndNoOfReviews)
		);
		//Optional[Microservices:25000:96]


		//use a filter or a predicate which gives me no results, So none of the courses have a review score less than 90.
		System.out.println(
				courses
						.stream()
						.filter(reviewScoreLessThan90Predicate)
						.min(comparingByNoOfStudentsAndNoOfReviews)//get the first one
				//since op is nul in last line we can use .orElse(new Course("Kubernetes", "Cloud", 91, 20000) to get the default value
		);
		//O/p- Optional.empty -> as none of the courses have a review score less than 90.
		//here instead of returning null, it returns Optional.empty

		//we have done a filter using a specific predicate, you would want to find the first element which meets that specific criteria.
		System.out.println(
				courses
						.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						.findFirst()
				);
		//Optional[Spring:20000:98]//here this is the first element in the reviewScoreGreaterThan95Predicate list got in above example

		System.out.println(
				courses
						.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						.findFirst()//return any /one of the value-cant guess
		);
		//Optional[Spring:20000:98]
		
		//to find the sum
		System.out.println(
				courses
						.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						//.map(x->x.getNoOfStudents())
						.mapToInt(Course::getNoOfStudents)
						.sum()
		);
		//88000

		//to find the average
		System.out.println(
				courses
						.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						//.map(x->x.getNoOfStudents())
						.mapToInt(Course::getNoOfStudents)
						.average()
		);
		//OptionalDouble[22000.0]

		//to find the count
		System.out.println(
				courses
						.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						//.map(x->x.getNoOfStudents())
						.mapToInt(Course::getNoOfStudents)
						.count()
		);//o/p- 4

		System.out.println(
				courses.stream()
						.filter(reviewScoreGreaterThan95Predicate)
						.mapToInt(Course::getNoOfStudents)
						.max());
		//OptionalInt[25000]
	}
}

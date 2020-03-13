import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsPeriodDurationExample {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println("Present time : " + now);

		// ChronoUnit examples

		LocalDate plus10days = now.plus(10, ChronoUnit.DAYS);
		System.out.println("adding 10 days : " + plus10days);

		LocalDate plus10months = now.plus(10, ChronoUnit.MONTHS);
		System.out.println("adding 10 months : " + plus10months);

		// Period example
		LocalDate octDate = LocalDate.of(2019, 12, 1);
		System.out.println("Oct date : " + octDate);

		int months = Period.between(octDate, now).getMonths();
		System.out.println("Months difference : " + months);

		int days = Period.between(octDate, now).getDays();
		System.out.println("days difference : " + days);

		// Duration example

		LocalTime timenow = LocalTime.of(10, 10, 0);
		LocalTime yesterdayTime = LocalTime.of(10, 10, 10);

		long seconds = Duration.between(timenow, yesterdayTime).getSeconds();
		System.out.println("seconds : " + seconds);
	}

}

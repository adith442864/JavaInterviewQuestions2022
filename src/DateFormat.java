import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d.toString());
		
		String date_Selected = "12-04-2022";
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		Date dateToBeSelected = sd.parse(date_Selected);
		System.out.println(dateToBeSelected.toString());
		
		//compare
		System.out.println(d.compareTo(dateToBeSelected));
		
		String day = new SimpleDateFormat("dd").format(dateToBeSelected);
		System.out.println(day);
		

		String month = new SimpleDateFormat("MMMM").format(dateToBeSelected);
		System.out.println(month);
		

		String year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
		System.out.println(year);
		
		
		
	}

}

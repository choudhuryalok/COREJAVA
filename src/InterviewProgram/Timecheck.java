package InterviewProgram;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;





public class Timecheck {

	public static void main(String[] args) {
		//DateTime dt = new DateTime(819676800000L);//1995-12-23
		//DateTime dt = new DateTime(567216000000L);// 1987-12-23

		Timecheck timecheck = new Timecheck();
		
		String fmdob= timecheck.getFormattedDob("1987-12-23");
		String ageinYr= timecheck.getAgeInYears("1987-12-23");
		System.out.println("fmdob"+fmdob);
		System.out.println("ageinYr"+ageinYr);
	}

	
	 private String getFormattedDob(String dob) {
	        String formattedDob = null;
	        try {
	            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            Date parsedDob = simpleDateFormat.parse(dob);
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            formattedDob = formatter.format(parsedDob);
	        } catch (Exception exception) {
	           // LOGGER.info("Exception in getFormattedDob() method :", exception);
	        }
	        return formattedDob;
	    }
	
	 private String getAgeInYears(String dob) {
	        String ageInYears = null;
	        try {
	            Calendar dateNow = Calendar.getInstance();
	            Calendar dateOfBirth = Calendar.getInstance();
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            dateOfBirth.setTime(sdf.parse(dob));
	            if (dateOfBirth.after(dateNow)) {
	            	System.out.println("Birth date can't be future date !!");
	                return ageInYears;
	            }
	            ageInYears = getAgeInYears(dateNow, dateOfBirth);
	        } catch (ParseException | IllegalArgumentException exception) {
	            //LOGGER.info("Exception in getAgeInYears() method :", exception);
	            return ageInYears;
	        }
	        return ageInYears;
	    }
	 
	 private String getAgeInYears(Calendar dateNow, Calendar dateOfBirth) {
	        String ageInYears;
	        int yearNow = dateNow.get(Calendar.YEAR);
	        int yearDob = dateOfBirth.get(Calendar.YEAR);
	        int age = yearNow - yearDob;
	        int monthNow = dateNow.get(Calendar.MONTH);
	        int monthDob = dateOfBirth.get(Calendar.MONTH);
	        int monthDiff = monthNow - monthDob;
	        int dateDiff = dateNow.get(Calendar.DATE) - dateOfBirth.get(Calendar.DATE);
	        age = getFinalAge(age, monthDiff, dateDiff);
	        ageInYears = Integer.toString(age);
	        return ageInYears;
	    }
	 
	 private int getFinalAge(int age, int monthDiff, int dateDiff) {
	        int localAge = age;
	        int age13 = 13;
	        int age18 = 18;
	        int dateOrMonthDiff = 0;
	        if (localAge == age13 && monthDiff == 0 && dateDiff == 0) {
	            localAge++;
	        } else if (localAge == age18 && monthDiff == dateOrMonthDiff && dateDiff == dateOrMonthDiff) {
	            localAge++;
	        } else if (monthDiff == dateOrMonthDiff && dateDiff > dateOrMonthDiff) {
	            localAge++;
	        } else if (monthDiff > dateOrMonthDiff && dateDiff > dateOrMonthDiff) {
	            localAge++;
	        } else if (monthDiff > dateOrMonthDiff && dateDiff <= dateOrMonthDiff) {
	            localAge++;
	        }
	        return localAge;
	    }
}

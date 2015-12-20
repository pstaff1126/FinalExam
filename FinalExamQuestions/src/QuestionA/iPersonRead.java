package QuestionA;

import java.util.Date;

public interface iPersonRead   {

	public default String getFirstName() {
		return this.getFirstName();
	}
	

	public static String getMiddleName() {
		return getMiddleName();
	}

	

	public static String getLastName() {
		return getLastName();
	}

	

	public static Date getDOB() {
		return getDOB();
	}


	public static String getAddress() {
		return getAddress();
	}

	

	public static String getPhone() {
		return getPhone();
	}

	

	public static String getEmail() {
		return getEmail();
	}
}

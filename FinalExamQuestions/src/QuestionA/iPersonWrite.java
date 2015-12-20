package QuestionA;

import java.util.Date;

public interface iPersonWrite {
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}

	

	public void setMiddleName(String MiddleName) {
		this.MiddleName=MiddleName;
	}

	

	public void setLastName(String LastName) {
		this.LastName=LastName;
	}



	public  void setDOB(Date DOB) {
		this.DOB=DOB;
	}

	public  void setAddress(String newAddress) {
		this.Address=newAddress;
	}

	

	public  void setPhone(String newPhone_number);

	

	public  void setEmail(String newEmail) {
		this.Email=newEmail;
	}

	
}

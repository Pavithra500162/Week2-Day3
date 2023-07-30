package week2.day3;

public class Students {

	public void getStudentInfo(int sId)
	{
		System.out.println("Student id: "+sId);
	}
	public void getStudentInfo(int sId,String Sname)
	{
		System.out.println("Student id: "+sId+"\n"+"Student Name: "+Sname);
	}
	public void getStudentInfo(long Phno,String email)
	{
		System.out.println("Student phone number: "+Phno+"\n"+"Student Email id: "+email);
	}
	public static void main(String[] args) {
		Students pavi=new Students();
		pavi.getStudentInfo(35);
		pavi.getStudentInfo(35, "Pavithra Shanmugam");
		pavi.getStudentInfo(9578623645l, "pavithra@gmail.com");

	}

}


public class Gym {
	private String pass;
	private String Name;
	private String Phone;
	private String DOB;
	private String Height;
	private String Trainer;
	private String Gym;
	
	
	
	

	public Gym(String phone, String name, String Phone,String DOB,String Height,String Gym,String Trainer) {
		this.Phone=Phone;
		this.Name=Name;
		this.pass=pass;
		this.DOB=DOB;
		this.Height=Height;
		this.Gym=Gym;
		this.Trainer=Trainer;
	}

	public String getPhone() {
		return Phone ;
		}
	public String getGym() {
		return Gym ;
		}
	public String getTrainer() {
		return Trainer;
		}
	public String getPass() {
		return pass;
	}
	public String getDOB() {
		return DOB;
	}
	public String getName() {
		return Name;
	}
	public String getHeight() {
		return Height;
	}
	
	public void setPhone(String Phone) {
		this.Phone=Phone;
	}
	public void setGym(String Gym) {
		this.Gym=Gym;
	}
	public void setTrainer(String Trainer) {
		this.Trainer=Trainer;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setDOB(String DOB) {
		this.DOB=DOB;
	}
	public void setHeight(String Height) {
		this.Height=Height;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
	}
	
	


}

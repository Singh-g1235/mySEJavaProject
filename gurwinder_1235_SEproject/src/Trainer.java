
public class Trainer {
	private String Trainer;
	private String Gym;
	
	public Trainer(String Gym,String Trainer) {
	
		this.Gym=Gym;
		this.Trainer=Trainer;
	}
		
		public String getGym() {
			return Gym ;
			}
		public String getTrainer() {
			return Trainer;
			}
		
		public void setGym(String Gym) {
			this.Gym=Gym;
		}
		public void setTrainer(String Trainer) {
			this.Trainer=Trainer;
		}

}

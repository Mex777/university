public class university {
		private String name;
		private	String country;
		private	String city;
		private	String price;
		private	String degree;
		private	String duration;
		private	String english;
		private	String keyInfo;
		private	String total;

		public void setKeyInfo(String sKI) {
			keyInfo=sKI;
		}
		public void setName(String sN) {
			name=sN;
		}
		public void setCountry(String sC) {
			country=sC;
		}
		public void setCity(String sCity){
			city=sCity;
		}
		public void setPrice(String sPrice) {
			if (sPrice=="0") {
				price="Free";
			} else {
				price = sPrice + " euro";
			}
		}
		public void setDuration(String time, String puncte) {
			duration=time + " years " + puncte + " ECTS";
		}
		public void setDegree(String sD){
			degree = sD;
		}
		public void setEnglish(String sE){
			if (sE=="true") {
				english = "Needs profiecency test";
			}
			else {
				english= "Doesn't need profiecency test";
			}
		}
		public void setTotal(university a) {
			total=a.getName() + "\n" + a.getCountry() + ", " + a.getCity() + "\n" + a.getDegree() + "\n" + a.getDuration();
			total += "\n" + a.getPrice() + "\n" + a.getEnglish() + "\n" + a.getKeyInfo();
		}

		public String getKeyInfo() {
			return keyInfo;
		}

		public String getName(){
			return name;
		}
		public String getCity(){
			return city;
		}
		public String getPrice(){
			return price;
		}
		public String getDuration(){
			return duration;
		}
		public String getDegree(){
			return degree;
		}
		public String getCountry(){
			return country;
		}
		public String getEnglish(){
			return english;
		}
		public String getTotal(){
			return total;
		}


}

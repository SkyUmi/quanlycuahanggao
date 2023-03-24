package Servlet;

public class UserAccount {
	 public static final String GENDER_MALE ="M";
	 public static final String GENDER_FEMALE="F";
	 
         
	 private String userName;
         private String user;
         private String sdt;
         private String email;
         private String gender;
         private String address;
	 private String password;
	 
	 public UserAccount(){
	 
	 }
	 public UserAccount(String username,String user,String sdt,String email,String gender, String address, String password){
	 
         this.userName=username;
         this.user=user;
         this.sdt=sdt;
         this.email=email;
	 this.gender=gender;
         this.address=address;
	 this.password=password;
	 }
	 public UserAccount(String username, String password){
	 this.userName=username; 
	 this.password=password;
	 }
	 public UserAccount(UserAccount us){
         
	 this.userName=us.userName;
         this.user=us.user;
         this.sdt=us.sdt;
         this.email=us.email;
         this.gender=us.gender;
	 this.address=us.address;
	 this.password=us.password;
	 }
         
         public String getUser() {
	 return user;
	 }
         public void setUser(String user) {
	 this.user = user;
	 }
	 public String getUserName() {
	 return userName;
	 }
         public String getSdt() {
	 return sdt;
	 }
         public String getEmail() {
	 return email;
	 }
         public String getGender() {
	 return gender;
	 }
	 public String getAddress() {
	 return address;
	 }
	 public String getPassword() {
	 return password;
	 }
	 public void setUserName(String userName) {
	 this.userName = userName;
	 }
	 public void setSdt(String sdt) {
	 this.sdt = sdt;
	 }
         public void setEmail(String email) {
	 this.email = email;
	 }
         public void setGender(String gender) {
	 this.gender = gender;
	 }
         public void setAddress(String address) {
	 this.address = address;
	 }
	 public void setPassword(String password) {
	 this.password = password;
	 }
	 
}
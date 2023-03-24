/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/**
 *
 * @author THANH HAI
 */
public class NCC {
    //public static final String GENDER_MALE ="M";public static final String GENDER_FEMALE="F";
	 
         
	 private String ID;
	 private String nameNCC;
	 private String type;
         private String address;
         private String email;
         private String sdt;
	 
	 public NCC(){
             super();
	 }
	 public NCC( String ID, String nameNCC, String type, String address,String email, String sdt){
             
            this.ID=ID;
            this.nameNCC=nameNCC;
            this.type=type;
            this.address=address;
            this.email=email;
            this.sdt=sdt;
	 }
	 //public Product(String ID, String name){
	 //this.ID=ID; 
	 //this.name=name;
	 //}
	 public NCC(NCC n){
            
            this.ID=n.ID;
            this.nameNCC=n.nameNCC;
            this.type=n.type;
            this.address=n.address;
            this.email=n.email;
            this.sdt=n.sdt;
	 }
         
         
         
	 public String getID() {
	 return ID;
	 }
	 public String getNameNCC() {
	 return nameNCC;
	 }
	 public String getType() {
	 return type;
	 }
         public String getAddress() {
	 return address;
	 }
         public String getEmail() {
	 return email;
	 }
         public String getSdt() {
	 return sdt;
	 }
         
	 public void setID(String ID) {
	 this.ID = ID;
	 }
	 public void setNameNCC(String nameNCC) {
	 this.nameNCC = nameNCC;
	 }
	 public void setType(String type) {
	 this.type = type;
	 }
         public void setAddress(String address) {
	 this.address = address;
	 }
         public void setEmail(String email) {
	 this.email = email;
	 }
         public void setSdt(String sdt) {
	 this.sdt = sdt;
	 }
}


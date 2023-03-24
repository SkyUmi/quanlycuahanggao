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
public class KH {
    //public static final String GENDER_MALE ="M";public static final String GENDER_FEMALE="F";
	 
         
	 private String ID;
	 private String nameKH;
         private String typebus;
	 private String buypro;
         private String address;
         private String email;
         private String sdt;

	 
	 public KH(){
             super();
	 }
	 public KH( String ID,String nameKH,  String typebus, String buypro, String address, String email, String sdt){
             
            this.ID=ID;
            
            this.nameKH=nameKH;
            this.typebus=typebus;
            this.buypro=buypro;
            this.address=address;
            this.email=email;
            this.sdt=sdt;

            
	 }
	 //public Product(String ID, String name){
	 //this.ID=ID; 
	 //this.name=name;
	 //}
	 public KH(KH k){
            
            this.ID=k.ID;
            this.nameKH=k.nameKH;
            this.typebus=k.typebus;
            this.buypro=k.buypro;
            this.address=k.address;
            this.email=k.email;
            this.sdt=k.email;
	 }

    KH(String ID, String nameKH, String typebus, String address, String email, String sdt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
         
	 public String getID() {
	 return ID;
	 }
	 public String getNameKH() {
	 return nameKH;
	 }
	 public String getTypebus() {
	 return typebus;
	 }
         public String getBuypro() {
	 return buypro;
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
	 public void setNameKH(String nameKH) {
	 this.nameKH = nameKH;
	 }
	 public void setTypebus(String typebus) {
	 this.typebus = typebus;
	 }
         public void setBuypro(String buypro) {
	 this.buypro = buypro;
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

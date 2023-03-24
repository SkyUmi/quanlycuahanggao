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
public class Product {
    //public static final String GENDER_MALE ="M";public static final String GENDER_FEMALE="F";
	 
         
	 private String ID;
         private String user;
	 private String name;
         private String loaisp;
	 private String type;
         private String price;
         private String description;
         private String image;
	 
	 public Product(){
             super();
	 }
	 public Product( String ID,String user, String name,String loaisp, String type, String price,String description, String image){
             
            this.ID=ID;
            this.user=user;
            this.name=name;
            this.loaisp=loaisp;
            this.type=type;
            this.price=price;
            this.description=description;
            this.image=image;
	 }
	 //public Product(String ID, String name){
	 //this.ID=ID; 
	 //this.name=name;
	 //}
	 public Product(Product p){
            
            this.ID=p.ID;
            this.user=p.user;
            this.name=p.name;
            this.loaisp=p.loaisp;
            this.type=p.type;
            this.price=p.price;
            this.description=p.description;
            this.image=p.image;
	 }
         
         public String getLoaisp() {
	 return loaisp;
	 }
         public void setLoaisp(String loaisp) {
	 this.loaisp = loaisp;
	 }
         public String getDescription() {
	 return description;
	 }
         public void setDescription(String description) {
	 this.description = description;
	 }
         public String getUser() {
	 return user;
	 }
         public void setUser(String user) {
	 this.user = user;
	 }
	 public String getID() {
	 return ID;
	 }
	 public String getName() {
	 return name;
	 }
	 public String getType() {
	 return type;
	 }
         public String getPrice() {
	 return price;
	 }
         public String getImage() {
             return image;
         }
	 public void setID(String ID) {
	 this.ID = ID;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public void setType(String type) {
	 this.type = type;
	 }
         public void setPrice(String price) {
	 this.price = price;
	 }
         public void setImage(String image) {
	 this.image = image;
	 }
}

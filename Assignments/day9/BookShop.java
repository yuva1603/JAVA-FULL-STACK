package day9;

import java.util.Scanner;

class Book{
	private String title;
	private String author;
	private int price;
	public String getTitle() {
		return title;	}
	public String getAuthor() {
		return author;	}
	public int getPrice() {
		return price;	}
	public void setTitle(String newTitle) {
		this.title=newTitle;	}
	public void setAuthor(String newAuthor) {
		this.author=newAuthor;}
	public void setPrice(int newPrice) {
		this.price=newPrice;}}
public class BookShop {
	public static int discount( int n,int price) {
		int res=price-(price/n);
		return res;		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title of books : ");
		String title=sc.next();
		System.out.println("Enter the Author Name : ");
		String author = sc.next();
		int price = 10000;
		System.out.println("The price of "+title+" written by "+ price +"Rs");
		Book obj=new Book();
		obj.setTitle(title);
		obj.setAuthor(author);
		obj.setPrice(price);
		System.out.println("The Title You Entered is "+obj.getTitle());
		System.out.println("The Author of "+obj.getTitle()+" is "+obj.getAuthor());
		System.out.println("The price of "+obj.getTitle()+" is "+obj.getPrice());
		BookShop d=new BookShop();
		System.out.println("Enter the Discount : ");
		int discount=sc.nextInt();
		int res=d.discount(discount, price);
		System.out.println("The Discounted price is "+res);
		
	}

}

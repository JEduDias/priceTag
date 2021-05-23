package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			System.out.println("Product #"+ (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (status == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product used = new UsedProduct(name, price, manufactureDate);
				list.add(used);
			} else if (status == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				ImportedProduct imported = new ImportedProduct(name, price, customsFee);
				list.add(imported);
			} else {
				Product product = new Product(name, price);
				list.add(product);
			}
			
			
			
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}

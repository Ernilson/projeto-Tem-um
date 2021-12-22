package br.com.teste.Applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.teste.model.Clientes;
import br.com.teste.model.OrdemItem;
import br.com.teste.model.Order;
import br.com.teste.model.ProdutosModel;
import br.com.teste.model.enums.OrderStatus;

public class Program {
	
	public static void main(String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Clientes cli = new Clientes(name, email, birthDate);
		
		System.out.println("Enter order data:");
		
		System.out.println("Status: ");
		
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
Order order = new Order(new Date(), status, cli);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			ProdutosModel product = new ProdutosModel(productName, productPrice);
			

			OrdemItem orderItem = new OrdemItem(quantity, productPrice, product); 

			order.addItem(orderItem);		
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}

package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Order;
import entities.OrderItens;
import entities.OrderUsers;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		List <OrderItens> list = new ArrayList<>();
		 Date dataHora = new Date();
	     SimpleDateFormat formatoUtil = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	     String moment = formatoUtil.format(dataHora);
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Email:");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY");
		String birthday = sc.next();
		OrderUsers user = new OrderUsers(name,email,birthday);
		
		System.out.println("STATUS:" + OrderStatus.PROCESSING);
		System.out.print("How many itens in this order?");
		Order order = new Order(moment,OrderStatus.DELIVERED);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data:",i + 1);
			System.out.println();
			System.out.print("Enter product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Enter price product:");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			OrderItens ordItens = new OrderItens(productName, priceProduct, quantity);
			ordItens.calculateSubTotal(); // Adicione esta linha para calcular o subtotal
			list.add(ordItens);

			
		}
		System.out.println("Order moment:" + moment);
		System.out.println("Order status:" + OrderStatus.PROCESSING);
		System.out.println(user);
		System.out.println("ORDER ITENS:");
		
		for(OrderItens e : list) {
		System.out.println(e);
			
		}

		
		double total = 0.0;
		for (OrderItens item : list) {
		    total += item.getSubTotal();
		}

		System.out.println("Total: " + String.format("%.2f", total));
	}

}

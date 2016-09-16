package payment.view;

import java.util.ArrayList;
import java.util.Scanner;

import main.controller.MainController;
import order.domain.Order;
import product.domain.Product;

public class PaymentView {

	// variable
	private Scanner keyboard;
	
	// constructor
	public PaymentView() {
		
		this.keyboard = new Scanner(System.in);
		
	}
	
	public void paymentView(int sumPrice, ArrayList<Order> orders, ArrayList<Product> products) {
		
		System.out.println("결제 총액은 다음과 같습니다");
		System.out.println(sumPrice + "원");
		
		System.out.println("결제 방식을 선택해 주십시오");
		System.out.println("1. 카드결제 || 2. 현금결제 || 3. 결제취소하기");
		int selectedMethodNumber = keyboard.nextInt();
		
		if(selectedMethodNumber == 1){
			
			System.out.println("카드결제를 선택하셨습니다");
			MainController.getPaymentController().requestPayment(selectedMethodNumber, orders, products);
			
		} else if(selectedMethodNumber == 2){
			
			System.out.println("현금결제를 선택하셨습니다");
			MainController.getPaymentController().requestPayment(selectedMethodNumber, orders, products);
			
		} else if(selectedMethodNumber == 3){
			
			System.out.println("결제를 취소합니다");
			MainController.getUserController().requestUserMainMenu();
			
		} else {
			
			System.out.println("결제 방식을 선택해 주십시오");
			
		}
		
	}

}

package main;


import java.util.Scanner;

import kong.unirest.*;

public class Main {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Get tickets? (Y/N) : ");
		if (input.next() == "Y") {*/
			HttpResponse<JsonNode> response = Unirest.get("https://goclockwise.happyfox.com/api/1.1/json/tickets")
				      .header("accept", "application/json")
				      .basicAuth("85e2bbc3ff084ca4ba32760bb279e6a7", "3ceba8af9b3649f48964f61fa96e5061")
				      //.queryString("85e2bbc3ff084ca4ba32760bb279e6a7", "3ceba8af9b3649f48964f61fa96e5061")
				      .queryString("status", "_all")
				      .asJson();
			System.out.println(response);
			System.out.println("test");
		/*}
		input.close();*/
	}
	
	

}

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class collectionsLab {

	private static Scanner scnr;
	private static Map<String, Double> items = new TreeMap<>();
	static String[] itemsArray = { "apple", "banana", "cauliflower", "dragonfruit", "Elderberry", "figs", "grapefruit",
			"honeydew" };
	static Double[] pricesArray = { 0.99, 0.59, 1.59, 2.19, 1.79, 2.09, 1.99, 3.49 };

	public static void main(String[] args) {
		boolean cont = true;
		boolean cont2 = true;
		DecimalFormat df = new DecimalFormat("0.00");
		int apple = 0;
		int banana = 0;
		int cauliflower = 0;
		int dragonfruit = 0;
		int elderberry = 0;
		int figs = 0;
		int grapefruit = 0;
		int honeydew = 0;
		double totalCount = 0;
		double priceCount = 0;
		double applePrice = 0;
		double bananaPrice = 0;
		double cauliflowerPrice = 0;
		double dragonfruitPrice = 0;
		double elderberryPrice = 0;
		double figsPrice = 0;
		double grapefruitPrice = 0;
		double honeydewPrice = 0;
		scnr = new Scanner(System.in);
		fillItemsMap();
		System.out.println("Welcome to Guenther's Market!");
		System.out.println("Item\t\tPrice");
		System.out.println("===========================");
		for (int i = 0; i < itemsArray.length - 6; i++) {
			System.out.println(itemsArray[i] + "\t\t" + pricesArray[i]);
		}
		for (int i = 2; i < itemsArray.length - 4; i++) {
			System.out.println(itemsArray[i] + "\t" + pricesArray[i]);
		}
		for (int i = 4; i < itemsArray.length - 3; i++) {
			System.out.println(itemsArray[i] + "\t" + pricesArray[i]);
		}
		for (int i = 5; i < itemsArray.length - 2; i++) {
			System.out.println(itemsArray[i] + "\t\t" + pricesArray[i]);
		}
		for (int i = 6; i < itemsArray.length; i++) {
			System.out.println(itemsArray[i] + "\t" + pricesArray[i]);
		}
		do {
			System.out.println("What item would you like to order?");
			String userOrder = scnr.nextLine();
			if (userOrder.charAt(0) == 'a' || userOrder.charAt(0) == 'A') {
				System.out.println("Adding " + itemsArray[0] + " to cart at $" + pricesArray[0]);
				apple++;
				totalCount++;
				priceCount = priceCount + pricesArray[0];
				applePrice = apple * pricesArray[0];
			} else if (userOrder.charAt(0) == 'b' || userOrder.charAt(0) == 'B') {
				System.out.println("Adding " + itemsArray[1] + " to cart at $" + pricesArray[1]);
				banana++;
				totalCount++;
				priceCount = priceCount + pricesArray[1];
				bananaPrice = banana * pricesArray[1];
			} else if (userOrder.charAt(0) == 'c' || userOrder.charAt(0) == 'C') {
				System.out.println("Adding " + itemsArray[2] + " to cart at $" + pricesArray[2]);
				cauliflower++;
				totalCount++;
				priceCount = priceCount + pricesArray[2];
				cauliflowerPrice = cauliflower * pricesArray[2];
			} else if (userOrder.charAt(0) == 'd' || userOrder.charAt(0) == 'D') {
				System.out.println("Adding " + itemsArray[3] + " to cart at $" + pricesArray[3]);
				dragonfruit++;
				totalCount++;
				priceCount = priceCount + pricesArray[3];
				dragonfruitPrice = dragonfruit * pricesArray[3];
			} else if (userOrder.charAt(0) == 'e' || userOrder.charAt(0) == 'E') {
				System.out.println("Adding " + itemsArray[4] + " to cart at $" + pricesArray[4]);
				elderberry++;
				totalCount++;
				priceCount = priceCount + pricesArray[4];
				elderberryPrice = elderberry * pricesArray[4];
			} else if (userOrder.charAt(0) == 'f' || userOrder.charAt(0) == 'F') {
				System.out.println("Adding " + itemsArray[5] + " to cart at $" + pricesArray[5]);
				figs++;
				totalCount++;
				priceCount = priceCount + pricesArray[5];
				figsPrice = figs * pricesArray[5];
			} else if (userOrder.charAt(0) == 'g' || userOrder.charAt(0) == 'G') {
				System.out.println("Adding " + itemsArray[6] + " to cart at $" + pricesArray[6]);
				grapefruit++;
				totalCount++;
				priceCount = priceCount + pricesArray[6];
				grapefruitPrice = grapefruit * pricesArray[6];
			} else if (userOrder.charAt(0) == 'h' || userOrder.charAt(0) == 'H') {
				System.out.println("Adding " + itemsArray[7] + " to cart at $" + pricesArray[7]);
				honeydew++;
				totalCount++;
				priceCount = priceCount + pricesArray[7];
				honeydewPrice = honeydew * pricesArray[7];
			} else {
				System.out.println("Sorry, we don't have those.");
			}
			System.out.println("Would you like to order anything else? y/n");

			String userCont = scnr.nextLine();
			if (userCont.charAt(0) == 'y' || userCont.charAt(0) == 'Y') {
				cont = true;
			} else if (userCont.charAt(0) == 'n' || userCont.charAt(0) == 'N') {
				cont = false;
				break;
			} else {
				System.out.println("Sorry, I didn't get that.");
				cont = true;

			}

		} while (cont == true);
		System.out.println("Thanks for your order! \nHere's what you got:");
		if (apple > 0) {
			System.out.println(itemsArray[0] + "\t\t $" + pricesArray[0] * apple);
		}
		if (banana > 0) {
			System.out.println(itemsArray[1] + "\t\t $" + pricesArray[1] * banana);
		}
		if (cauliflower > 0) {
			System.out.println(itemsArray[2] + "\t $" + pricesArray[2] * cauliflower);
		}
		if (dragonfruit > 0) {
			System.out.println(itemsArray[3] + "\t $" + pricesArray[3] * dragonfruit);
		}
		if (elderberry > 0) {
			System.out.println(itemsArray[4] + "\t $" + pricesArray[4] * elderberry);
		}
		if (figs > 0) {
			System.out.println(itemsArray[5] + "\t\t $" + pricesArray[5] * figs);
		}
		if (grapefruit > 0) {
			System.out.println(itemsArray[6] + "\t $" + pricesArray[6] * grapefruit);
		}
		if (honeydew > 0) {
			System.out.println(itemsArray[7] + "\t $" + pricesArray[7] * honeydew);
		}
		System.out
				.println("The average cost of items ordered is $" + df.format(findAverageCost(totalCount, priceCount)));
		System.out.println(df.format(findHighestIndex(applePrice, bananaPrice, cauliflowerPrice, dragonfruitPrice,
				elderberryPrice, figsPrice, grapefruitPrice, honeydewPrice)));
		System.out.println(df.format(findLowestIndex(applePrice, bananaPrice, cauliflowerPrice, dragonfruitPrice, elderberryPrice, figsPrice, grapefruitPrice, honeydewPrice)));
	}

	private static void fillItemsMap() {
		items.put("apple", 0.99);
		items.put("banana", 0.59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("figs", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);
	}

	public static double findAverageCost(double price, double quantity) {
		price = (quantity / price);
		return price;
	}

	public static double findHighestIndex(double a, double b, double c, double d, double e, double f, double g,
			double h) {
		if (a > b && a > c && a > d && a > e && a > f && a > g && a > h) {
			System.out.print("The most expensive items were apples at index 0 and cost you: $");
			return a;
		} else if (b > a && b > c && b > d && b > e && b > f && b > g && b > h) {
			System.out.print("The most expensive items were bananas at index 1 and cost you: $");
			return b;
		} else if (c > a && c > b && c > d && c > e && c > f && c > g && c > h) {
			System.out.print("The most expensive items were cauliflower at index 2 and cost you: $");
			return c;
		} else if (d > a && d > b && d > c && d > e && d > f && d > g && d > h) {
			System.out.print("The most expensive items were dragonfruit at index 3 and cost you: $");
			return d;
		} else if (e > a && e > b && e > c && e > d && e > f && e > g && e > h) {
			System.out.print("The most expensive items were Elderberries at index 4 and cost you: $");
			return e;
		} else if (f > a && f > b && f > c && f > d && f > e && f > g && f > h) {
			System.out.print("The most expensive items were figs at index 5 and cost you: $");
			return f;
		} else if (g > a && g > b && g > c && g > d && g > e && g > f && g > h) {
			System.out.print("The most expensive items were grapefruits at index 6 and cost you: $");
			return g;
		} else {
			System.out.print("The most expensive items were honeydew at index 7 and cost you: $");
			return h;
		}
	}

	

}

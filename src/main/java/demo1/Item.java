package demo1;

public class Item {
	String name;//名称
	int price;//价格

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Item bolldBottle = new Item("血瓶", 50);
		Item shoes = new Item("草鞋", 300);
		Item sword = new Item("长剑", 350);
		System.out.println(bolldBottle.name + ":" + bolldBottle.price);
		System.out.println(shoes.name + ":" + shoes.price);
		System.out.println(sword.name + ":" + sword.price);
	}
}

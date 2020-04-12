class Item {
	int id;
	String name;
	double price;
	//TODO add variable.
	char a="18";

	//TODO constructor
	Public Item (int id, String name, double price, char a="18%") {
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getA() {
		return a;
	}

	public void setA(char a) {
		this.a = a;
	}
	

	double taxReturn () {
		//TODO
		int ddv=0;
		ddv = a * price / 100;
		return ddv * 15 / 100;
		
	}

}
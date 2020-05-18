package burger;

	public class Hamburger extends MenuItem {
	    private String meat;
	    private String breadRoll;

	    public Hamburger(int id, String name, double price, String meat, String breadRoll) {
	        super(id, name, price);
	        this.meat = meat;
	        this.breadRoll = breadRoll;
	    }

	    public String getMeat() {
	        return meat;
	    }

	    public String getBun() {
	        return breadRoll;
	    }
	}


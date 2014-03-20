import java.util.Date;


public class Transaction 
{
	private int id;
	private String description;
	private Date date;
	private int amount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	public Transaction(int id, String description, Date date, float amount2) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
		this.amount = (int) amount2;
	}
}
	
	
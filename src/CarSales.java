import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CarSales {
	
	private Integer sales;
	private YearMonth date;
	
	public CarSales(String date, String sales) {
		this.date = YearMonth.parse(date, DateTimeFormatter.ofPattern("MMM-yy", Locale.US));
		this.sales = Integer.parseInt(sales);
		}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CarSales [date=" + date + ", sales=" + sales + "]";
	}
	
	

}

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GenerateCarSalesReport {
	
	public GenerateCarSalesReport(List<CarSales> carSalesList,String modelType) {
		
		System.out.println(modelType + " Yearly Sales Report");
		System.out.println("-------------------");
		
		Map<Integer, List<CarSales>> salesGroupedByYear = carSalesList.stream()
																	 .collect(Collectors.groupingBy(d -> d.getDate().getYear()));
		
		String yearlySales = salesGroupedByYear.entrySet().stream()
												.map(x -> x.getKey() + " -> " + x.getValue().stream()
												.collect(Collectors.summingInt(CarSales::getSales)))
												.collect(Collectors.joining("\n"));
		
		System.out.println(yearlySales + "\n"); 
		
		Optional<CarSales> minCarSales = carSalesList.stream()
								       .min((CarSales o1, CarSales o2) -> o1.getSales().compareTo(o2.getSales()));
		
		Optional<CarSales> maxCarSales = carSalesList.stream()
									   .max((CarSales o1, CarSales o2) -> o1.getSales().compareTo(o2.getSales()));
														
		
		System.out.println("The best month for " + modelType + " was: " + maxCarSales.orElse(new CarSales("Jan-00", "00")).getDate());
		
		System.out.println("The lowest month for " + modelType + " was: " + minCarSales.orElse(new CarSales("Jan-00", "00")).getDate());
		
													
	}

}

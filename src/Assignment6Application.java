import java.io.IOException;
import java.util.List;

public class Assignment6Application {
	
	public static final String model3 = "model3.csv";
	public static final String modelS = "modelS.csv";
	public static final String modelX = "modelX.csv";

	public static void main(String[] args) throws IOException {
		
		FileService fileService = new FileService();
		List<CarSales> model3CarSales = fileService.importCarSales(model3);
		List<CarSales> modelXCarSales = fileService.importCarSales(modelX);
		List<CarSales> modelSCarSales = fileService.importCarSales(modelS);
		
		GenerateCarSalesReport model3Report = new GenerateCarSalesReport(model3CarSales, "Model 3");
		GenerateCarSalesReport modelSReport = new GenerateCarSalesReport(modelSCarSales, "Model S");
		GenerateCarSalesReport modelXReport = new GenerateCarSalesReport(modelXCarSales, "Model X");
		

	}

}

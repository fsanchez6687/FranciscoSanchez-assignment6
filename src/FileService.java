import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	
	public List<CarSales> importCarSales(String fileName) throws IOException {
		
		List<CarSales> carSalesList = new ArrayList<>();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		
		String line = bufferedReader.readLine();
		
		try {
				while ((line = bufferedReader.readLine()) != null) {
					String [] data = line.split(",");
					carSalesList.add(new CarSales(data[0], data[1]));
				}
		} finally { 
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		return carSalesList;
		
	}

}

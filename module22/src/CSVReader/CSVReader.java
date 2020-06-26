package CSVReader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        String csvFile = "D:\\Module2\\module22\\src\\CSVReader\\country.txt";
        BufferedReader br = null;
        String line = " ";
        String csvSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code=" + country[4] + ", name=" + country[5] + "]");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IIOException e){
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IIOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

package application;

import Controler.InstrumentControler;
import entities.Instrument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import viewer.MainFrame;

/**
 *
 * @author jasom
 */
public class Program {

    public static void main(String[] args) {
     
    List <Instrument> instruments = new ArrayList<>();
    InstrumentControler ic = new InstrumentControler(instruments);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
 
        String path = "c:instrumentos.csv";
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String maker = fields[1];
                String model = fields[2];
                String dateLast = fields[3];
                LocalDate lastCalibatrion = LocalDate.parse(dateLast, fmt);
                String dateNext = fields[4];
                LocalDate nextCalibatrion = LocalDate.parse(dateNext, fmt);
                String description = fields[5];
                
                Instrument instrument = new Instrument(name, maker, model, lastCalibatrion, nextCalibatrion, description);
                ic.save(instrument);
                
                line = br.readLine();
            }

        } 
        catch(IOException e){
            e.printStackTrace();
        }
        
     
     
     
     MainFrame mainFrame = new MainFrame(ic);
     mainFrame.setVisible(true);
     mainFrame.setLocationRelativeTo(null);
       
    } 
}

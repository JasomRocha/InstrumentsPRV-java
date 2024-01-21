package application;

import Controler.InstrumentControler;
import entities.Instrument;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import viewer.MainFrame;

/**
 *
 * @author jasom
 */
public class Program {

    public static void main(String[] args) {
     
    List <Instrument> instruments = new ArrayList<>();
    
    
     Scanner sc = new Scanner(System.in);
     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
     LocalDate d04 = LocalDate.parse("21/07/2024", fmt);
     LocalDate d05 = LocalDate.parse("20/07/2024", fmt);
     LocalDate d06 = LocalDate.parse("12/08/2024", fmt);
     LocalDate d07 = LocalDate.parse("14/07/2024", fmt);
    
     
     Instrument inst1 = new Instrument("Medidor de Espessura", "Cobal", "E330", d04, d05, "Very nice calibrator");
     Instrument inst2 = new Instrument("Dosimetro", "Interinstrument", "D220", d04, d05, "Dosimenter of DDS gold");
     Instrument inst3 = new Instrument("Termometer", "Integral term", "TNT110", d06, d07, "Very nice Termometer");
     Instrument inst4 = new Instrument("Extinguesher PQS", "Invert", "PQS1", d06, d07, "To make sure");
     Instrument inst5 = new Instrument("Extiguisher Water", "Invert", "water1", d04, d05, "To recharge");
     
     instruments.add(inst1);
     instruments.add(inst2);
     instruments.add(inst3);
     instruments.add(inst4);
     instruments.add(inst5);
     
     InstrumentControler ic = new InstrumentControler(instruments);
     
     MainFrame mainFrame = new MainFrame(ic);
     mainFrame.setVisible(true);
     mainFrame.setLocationRelativeTo(null);
       
    } 
}

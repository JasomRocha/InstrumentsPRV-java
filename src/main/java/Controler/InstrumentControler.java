package Controler;

import entities.Instrument;
import exceptions.InputExceptions;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class InstrumentControler {
   
    List <Instrument> instruments = new ArrayList<>();
    List <Instrument> toCalibrateInstruments = new ArrayList<>();
    String path = "c:instrumentos.csv";
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }
    
    public InstrumentControler() {
    }
    
    public InstrumentControler(List<Instrument> instruments) {
        this.instruments = instruments;
    }
    
    public boolean hasCalibrationNeeds(){
        for(Instrument inst:instruments){
            if(inst.getNextCalibration().isBefore(LocalDate.now())){
                toCalibrateInstruments.add(inst);  
            }   
        }  
        return !toCalibrateInstruments.isEmpty();
    }
    
    public List <Instrument> toCalibrate(){
        return toCalibrateInstruments; 
    }
    
    public boolean save(Instrument instrument){
        if(instrument != null){
            instruments.add(instrument);
            return true;
        }
        else{
            throw new InputExceptions("Input error Exception: the filds cannot be blank");
        }
    }
    
    public boolean salvarEmArquivo(String pathC) {
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
        for (Instrument inst : instruments) {
            bw.write(inst.getName() + "," + inst.getMaker() + "," +
                     inst.getModel() + "," + inst.getLastCalibration().format(fmt)+ "," +
                     inst.getNextCalibration().format(fmt) + "," + inst.getDescription());
            bw.newLine();
        }
        return true;
    } 
    
    catch (IOException e) {
        e.printStackTrace();
        return false;
        }
    }
    
    public boolean delete(Instrument instrument){
         for(Instrument inst:instruments){
             boolean test = inst.equals(instrument);
             if(test){
                 instruments.remove(inst);
                  return true;
             }
         }             
       return false;
    }   
    
    public List <Instrument> returnAll(){
        return instruments;
    }
    
    public boolean editInstrument(Instrument editedInstrument){
          for(Instrument inst:instruments){
             boolean test = inst.equals(editedInstrument);
             if(test){
               int index = instruments.indexOf(editedInstrument); //Encontro o index da minha ocorrencia
               instruments.remove(index); //removo o instrumento atual
               instruments.add(index, editedInstrument); //insiro na mesma posicao o novo instrumento
                  return true;
             }
         }             
       return false;
    }
    
    
     public List <Instrument> findInstrument(String instrument){
            Stream <Instrument> str1 = instruments.stream(); //Converto o list para stream, devido a velocidade e complexidade o1
            Boolean result = str1.anyMatch(x -> x.getName().toUpperCase().equals(instrument.toUpperCase())); //testo se existe o nome na minha stream 
            
            if(result){
                List <Instrument> Matchs = instruments.stream().filter(x -> x.getName().toUpperCase().equals(instrument.toUpperCase())).toList(); //crio uma lista de ocorrencias e retorno como list
                return Matchs; //retorna a lista de ocorrencias do objeto
            }
             else{
                    return null;
        }
        
    }
     
     public Instrument findInstrumentFirstOcurrency(String instrument){
            Stream <Instrument> str1 = instruments.stream(); //Converto o list para stream, devido a velocidade e complexidade o1
           
            Boolean result = str1.anyMatch(x -> x.getName().toUpperCase().equals(instrument.toUpperCase())); //testo se existe o nome na minha stream 
            
            if(result){
                List <Instrument> Matchs = instruments.stream().filter(x -> x.getName().toUpperCase().equals(instrument.toUpperCase())).toList(); //crio uma lista de ocorrencias e retorno como list
                return Matchs.get(0); //retorna a primeira ocorrencia do objeto
            }
             else{
                    return null;
        }   
    }
      
     public List<Instrument> Ordenate(List <Instrument> toOrdenate){
         Collections.sort(toOrdenate);
         return toOrdenate;
     } 
     
      public boolean hasAlreadySavedInstrument(Instrument instrument){
         for(Instrument inst:instruments){
             boolean test = inst.equals(instrument);
             if(test){
                  return true;
             }
         }             
       return false;
    } 
    
      public boolean hasAlreadySavedInstrumentName(Instrument instrument){
         for(Instrument inst:instruments){
             int test = inst.getName().compareTo(instrument.getName());
             if(test == 0){
                  return true;
             }
         }             
       return false;
    }   
}

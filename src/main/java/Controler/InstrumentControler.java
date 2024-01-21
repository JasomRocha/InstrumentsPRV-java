package Controler;

import entities.Instrument;
import exceptions.InputExceptions;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class InstrumentControler {
   
    List <Instrument> instruments = new ArrayList<>();
    List <Instrument> toCalibrateInstruments = new ArrayList<>();

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
    
    public List <Instrument> returnAll(){
        return instruments;
    }
    
    public void editInstrument(Instrument instrument, Instrument editedInstrument){
        int index = instruments.indexOf(instrument); //Encontro o index da minha ocorrencia
         instruments.remove(index); //removo o instrumento atual
         instruments.add(index, editedInstrument); //insiro na mesma posicao o novo instrumento
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
     
     public List<Instrument> Ordenate(List <Instrument> toOrdenate){
         Collections.sort(toOrdenate);
         return toOrdenate;
     } 
}

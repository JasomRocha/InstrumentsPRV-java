/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewer;

import Controler.InstrumentControler;
import entities.Instrument;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/**
 *
 * @author jasom
 */
public class ChangesFrame extends javax.swing.JFrame {
    
    private InstrumentControler ic;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   
    public ChangesFrame() {
        initComponents();
    }

    public ChangesFrame(InstrumentControler ic) {
        initComponents();
        this.ic = ic;
    }

  
    public void showResults(Instrument result){ 
          tdfName.setText(result.getName());
          tdfMaker.setText(result.getMaker());
          tdfModel.setText(result.getModel());
          tdfLastCal.setText( result.getLastCalibration().format(fmt));
          tdfNextCal.setText(result.getNextCalibration().format(fmt));
          tdaDesc.setText(result.getDescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tdfSearch = new javax.swing.JTextField();
        btnLocalizarInstrumento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tdfModel = new javax.swing.JTextField();
        tdfLastCal = new javax.swing.JTextField();
        tdfNextCal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tdfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdaDesc = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tdfMaker = new javax.swing.JTextField();
        tdfBuscaNaLista = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        btnLocalizarInstrumento.setText("Buscar");
        btnLocalizarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarInstrumentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Localizar Intrumento: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar equipamento");

        tdfModel.setEditable(false);

        tdfLastCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfLastCalActionPerformed(evt);
            }
        });

        tdfNextCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfNextCalActionPerformed(evt);
            }
        });

        jLabel2.setText("Equipamento:");

        jLabel4.setText("Fabricante:");

        jLabel5.setText("Modelo:");

        jLabel6.setText("Última Calibração:");

        tdfName.setEditable(false);
        tdfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Próxima Calibração:");

        tdaDesc.setColumns(20);
        tdaDesc.setRows(5);
        jScrollPane1.setViewportView(tdaDesc);

        jLabel7.setText("Descrição:");

        tdfMaker.setEditable(false);

        tdfBuscaNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfBuscaNaListaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Localizar Intrumento: ");

        btnRemover.setText("Remover Instrumento");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnSalvar.setText("Editar Instrumeto");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Alteração não definitiva");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Alteração não definitiva");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel11.setText("Edite ou Remova instrumentos ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(tdfNextCal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tdfLastCal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tdfModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tdfMaker, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tdfName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSalvar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addComponent(btnRemover)))
                            .addComponent(btnVoltar)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tdfBuscaNaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfBuscaNaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfMaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfLastCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfNextCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfNameActionPerformed

    private void btnLocalizarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarInstrumentoActionPerformed
    }//GEN-LAST:event_btnLocalizarInstrumentoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        if(tdfBuscaNaLista.getText().isEmpty() || tdfBuscaNaLista.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite o instrumento a ser pesquisado!");
        }   else if(ic.findInstrumentFirstOcurrency(tdfBuscaNaLista.getText()) == null){
            JOptionPane.showMessageDialog(null, "Instrumento não cadastrado!");
        }
        else{
            String name = tdfBuscaNaLista.getText();
            showResults(ic.findInstrumentFirstOcurrency(name));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
       int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse equipamento?", "Atenção! voce está realizando alterações no programa", JOptionPane.YES_NO_OPTION);
      Instrument instrument = new Instrument(); //instaciamos o obej veiculo para populalo com as informacoes dos campos de texto
     
      
     if(opcao == JOptionPane.YES_OPTION){
      
      instrument.setName(tdfName.getText());
      instrument.setMaker(tdfMaker.getText());
      instrument.setModel(tdfModel.getText());
      String last = tdfLastCal.getText();
      LocalDate latCal = LocalDate.parse(last, fmt);
      String next = tdfNextCal.getText();
      LocalDate nextCal = LocalDate.parse(next, fmt);
      instrument.setNextCalibration(nextCal);
      instrument.setLastCalibration(latCal);
      instrument.setDescription(tdaDesc.getText());
      
      if(ic.delete(instrument)){
          JOptionPane.showMessageDialog(null, "Instrumento removido com sucesso!\nclique em 'Salvar todas alterações' para tornar as alterações permanentes");
          tdfName.setText("");
          tdfMaker.setText("");
          tdfModel.setText("");
          tdfLastCal.setText("");
          tdfNextCal.setText("");
          tdaDesc.setText("");
          tdfName.requestFocus();
        }
      else{
         JOptionPane.showMessageDialog(null, "Erro ao remover Instrumento!"); 
        }
     }else if(opcao == JOptionPane.NO_OPTION){
         
     } else if(opcao == JOptionPane.CANCEL_OPTION){
                        
     } else if(opcao == JOptionPane.CLOSED_OPTION){
                         
     }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Instrument instrument = new Instrument(); //instaciamos o obej veiculo para populalo com as informacoes dos campos de texto
      
      instrument.setName(tdfName.getText());
      instrument.setMaker(tdfMaker.getText());
      instrument.setModel(tdfModel.getText());
      String last = tdfLastCal.getText();
      LocalDate latCal = LocalDate.parse(last, fmt);
      String next = tdfNextCal.getText();
      LocalDate nextCal = LocalDate.parse(next, fmt);
      instrument.setNextCalibration(nextCal);
      instrument.setLastCalibration(latCal);
      instrument.setDescription(tdaDesc.getText());
      
      if(ic.editInstrument(instrument)){
          JOptionPane.showMessageDialog(null, "Instrumento editado com sucesso!");
          tdfName.setText("");
          tdfMaker.setText("");
          tdfModel.setText("");
          tdfLastCal.setText("");
          tdfNextCal.setText("");
          tdaDesc.setText("");
          tdfName.requestFocus();
        }
      else{
         JOptionPane.showMessageDialog(null, "Erro ao editar Instrumento!"); 
      }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tdfBuscaNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfBuscaNaListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfBuscaNaListaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tdfLastCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfLastCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfLastCalActionPerformed

    private void tdfNextCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfNextCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfNextCalActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangesFrame().setVisible(true);
            }
            public void windowClosing(java.awt.event.WindowEvent e) {
                        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLocalizarInstrumento;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tdaDesc;
    private javax.swing.JTextField tdfBuscaNaLista;
    private javax.swing.JTextField tdfLastCal;
    private javax.swing.JTextField tdfMaker;
    private javax.swing.JTextField tdfModel;
    private javax.swing.JTextField tdfName;
    private javax.swing.JTextField tdfNextCal;
    private javax.swing.JTextField tdfSearch;
    // End of variables declaration//GEN-END:variables
}

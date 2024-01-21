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
public class MainFrame extends javax.swing.JFrame {
    
   InstrumentControler ic = new InstrumentControler();

    public MainFrame() {
    }
    
    
    public MainFrame(InstrumentControler ic) { 
        initComponents();
        this.ic = ic;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tdfName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdaDesc = new javax.swing.JTextArea();
        tdfMaker = new javax.swing.JTextField();
        tdfModel = new javax.swing.JTextField();
        tdfLastCal = new javax.swing.JTextField();
        tdfNextCal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalvarAlt = new javax.swing.JButton();
        btnAterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Instrumentos - PRV");
        setBackground(new java.awt.Color(51, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        tdfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfNameActionPerformed(evt);
            }
        });

        tdaDesc.setColumns(20);
        tdaDesc.setRows(5);
        jScrollPane1.setViewportView(tdaDesc);

        tdfLastCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdfLastCalActionPerformed(evt);
            }
        });

        jLabel2.setText("Equipamento:");

        jLabel4.setText("Fabricante:");

        jLabel5.setText("Modelo:");

        jLabel6.setText("Última Calibração:");

        jLabel3.setText("Próxima Calibração:");

        jLabel7.setText("Descrição ou informação adicional:");

        btnSalvar.setText("Inserir");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnVerTodos.setText("Ver todos");
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Created By JRSolutions®");

        jLabel9.setBackground(new java.awt.Color(51, 255, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\jasom\\OneDrive\\Documentos\\NetBeansProjects\\CadastroDeInstrumentosPRV\\img\\Logo-prv.png")); // NOI18N
        jLabel9.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setText("Bem vindo, cadastre um novo equipamento");

        btnSalvarAlt.setText("Salvar todas alterações");
        btnSalvarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAltActionPerformed(evt);
            }
        });

        btnAterar.setText("Editar Instrumento");
        btnAterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAterarActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("(Alterações Permanentes)");

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Formato: \"dd/MM/yyyy\"");

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Formato: \"dd/MM/yyyy\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(15, 15, 15))
                                    .addComponent(btnSalvarAlt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAterar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(253, 253, 253)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tdfMaker, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addComponent(tdfName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(230, 230, 230)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(tdfNextCal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tdfLastCal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(tdfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tdfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdfMaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tdfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdfLastCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdfNextCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVerTodos)
                    .addComponent(btnSalvarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAterar)
                .addGap(1, 1, 1)
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfNameActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      
      Instrument instrument = new Instrument(); //instaciamos o obej instrument para populalo com as informacoes dos campos de texto
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
      
      if(tdfName.getText().isEmpty() || tdfMaker.getText().isEmpty() || tdfModel.getText().isEmpty() || tdfLastCal.getText().isEmpty() || tdfNextCal.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos"); 
      }
      else if(tdfName.getText().isBlank() || tdfMaker.getText().isBlank() || tdfModel.getText().isBlank() || tdfLastCal.getText().isBlank() || tdfNextCal.getText().isBlank()){
          JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos"); 
      }
      else{
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
            
            if(ic.hasAlreadySavedInstrumentName(instrument)){
                JOptionPane.showMessageDialog(null, "Já existe um instrumento com esse nome. Mude o nome do Instrumento para salvar.\n(Sugetão: SeuEquipamento02)");
            }
            
            else if(ic.hasAlreadySavedInstrument(instrument)){
                 int opcao = JOptionPane.showConfirmDialog(null, "Já existe um Instrumento cadastrado com essas informações.\nDeseja realmente salvar este arquivo?", "Atenção! risco de instrumentos duplicados", JOptionPane.YES_NO_OPTION);
                 if(opcao == JOptionPane.YES_OPTION){
                        //tentar salvar
                        if(ic.save(instrument)){
                            JOptionPane.showMessageDialog(null, "Instrumento cadastrado com sucesso!");
                            tdfName.setText("");
                            tdfMaker.setText("");
                            tdfModel.setText("");
                            tdfLastCal.setText("");
                            tdfNextCal.setText("");
                            tdaDesc.setText("");
                            tdfName.requestFocus();
                          }
                        else{
                           JOptionPane.showMessageDialog(null, "Erro ao cadastrar Instrumento!"); 
                        }
                    } else if(opcao == JOptionPane.NO_OPTION){
                         JOptionPane.showMessageDialog(null, "Instrumento não cadastrado!");
                    } else if(opcao == JOptionPane.CANCEL_OPTION){
                           
                    } else if(opcao == JOptionPane.CLOSED_OPTION){
                         
                    }
                }   
                    else{
                      if(ic.save(instrument)){
                            JOptionPane.showMessageDialog(null, "Instrumento cadastrado com sucesso!");
                            tdfName.setText("");
                            tdfMaker.setText("");
                            tdfModel.setText("");
                            tdfLastCal.setText("");
                            tdfNextCal.setText("");
                            tdaDesc.setText("");
                            tdfName.requestFocus();
                          }
                        else{
                           JOptionPane.showMessageDialog(null, "Erro ao cadastrar Instrumento!"); 
                        }
                    }  
            
      }
            
      
     
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        ic.toCalibrate().clear();  
        
        if(ic.hasCalibrationNeeds()){
                int opcao = JOptionPane.showConfirmDialog(null, "Existe um ou mais instrumentos com a calibração atrasada.\nDeseja ver a lista de equipamentos para calibrar?", "Atenção! Instrumentos com calibração atrasada", JOptionPane.YES_NO_OPTION);
                
                if(opcao == JOptionPane.YES_OPTION){
                    InstrumentControler ictemp = new InstrumentControler();
                    ictemp.setInstruments(ic.toCalibrate());
                    DlgInstruments dlg = new DlgInstruments(null,true , ictemp);
                    dlg.showResults(ic.toCalibrate());
                    dlg.setVisible(true);
                    dlg.setLocationRelativeTo(null);    
                    } else if(opcao == JOptionPane.NO_OPTION){
                        DlgInstruments dlg = new DlgInstruments(null,true , ic);
                        dlg.showInformations();
                        dlg.setVisible(true);
                        dlg.setLocationRelativeTo(null);
                    } else if(opcao == JOptionPane.CANCEL_OPTION){
                        this.dispose();   
                    } else if(opcao == JOptionPane.CLOSED_OPTION){
                        this.dispose(); 
                    }
                }   
                    else{
                       DlgInstruments dlg = new DlgInstruments(null,true , ic);
                       dlg.showInformations();
                       dlg.setVisible(true);
                       dlg.setLocationRelativeTo(null);
                    }    
    }//GEN-LAST:event_btnVerTodosActionPerformed

    private void btnSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAltActionPerformed
        String path = "c:instrumentos.csv";
        
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja salvar todas as alterações no arquivo?", "Confirme para Salvar", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.YES_OPTION){
           if(ic.salvarEmArquivo(path)){
               JOptionPane.showMessageDialog(null, "Alterações salvas!");
           } else{
               JOptionPane.showMessageDialog(null, "Alterações não salvas! Problema com Arquivo.");
           }
           
        } else if(opcao == JOptionPane.NO_OPTION){
           
        } else if(opcao == JOptionPane.CANCEL_OPTION){
             
        } else if(opcao == JOptionPane.CLOSED_OPTION){
           
        }
        else{
            
        }          
    }//GEN-LAST:event_btnSalvarAltActionPerformed

    private void btnAterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAterarActionPerformed
        ChangesFrame cf = new ChangesFrame(ic);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAterarActionPerformed

    private void tdfLastCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdfLastCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdfLastCalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAterar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlt;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea tdaDesc;
    private javax.swing.JTextField tdfLastCal;
    private javax.swing.JTextField tdfMaker;
    private javax.swing.JTextField tdfModel;
    private javax.swing.JTextField tdfName;
    private javax.swing.JTextField tdfNextCal;
    // End of variables declaration//GEN-END:variables
}

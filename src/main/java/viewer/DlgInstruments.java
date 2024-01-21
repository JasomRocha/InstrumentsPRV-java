
package viewer;

import Controler.InstrumentControler;
import entities.Instrument;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;


public class DlgInstruments extends javax.swing.JDialog {
    
    private InstrumentControler ic;
    
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    
    public DlgInstruments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
    }

     public DlgInstruments(java.awt.Frame parent, boolean modal, InstrumentControler ic) {
        super(parent, modal);
            initComponents();
            this.ic = ic;
           
    }
      
     
     public void showInformations(){
         List <Instrument> instruments = ic.returnAll();
         
         //limpar JTable
         for(int i=0; i < instruments.size(); i++){
             tblInstruments.setValueAt(null, i, 0);
             tblInstruments.setValueAt(null, i, 1);
             tblInstruments.setValueAt(null, i, 2);
             tblInstruments.setValueAt(null, i, 3);
             tblInstruments.setValueAt(null, i, 4);
             tblInstruments.setValueAt(null, i, 5);
         }
         
         for(int i = 0; i<instruments.size() && instruments.get(i) != null; i++){
             tblInstruments.setValueAt(instruments.get(i).getName(), i, 0);
             tblInstruments.setValueAt(instruments.get(i).getMaker(), i, 1);
             tblInstruments.setValueAt(instruments.get(i).getModel(), i, 2);
             tblInstruments.setValueAt(instruments.get(i).getLastCalibration().format(fmt), i, 3);
             tblInstruments.setValueAt(instruments.get(i).getNextCalibration().format(fmt), i, 4);
             tblInstruments.setValueAt(instruments.get(i).getDescription(), i, 5);
         }
         
     }
        
     
     public void showResults(List <Instrument> results){
        List <Instrument> instruments = ic.returnAll();
         
         //limpar JTable
         for(int i=0; i < instruments.size(); i++){
             tblInstruments.setValueAt(null, i, 0);
             tblInstruments.setValueAt(null, i, 1);
             tblInstruments.setValueAt(null, i, 2);
             tblInstruments.setValueAt(null, i, 3);
             tblInstruments.setValueAt(null, i, 4);
             tblInstruments.setValueAt(null, i, 5);
         }
         int columnIndex = 4;
         for(int i = 0; i < results.size() && results.get(i) != null; i++){
             tblInstruments.setValueAt(results.get(i).getName(), i, 0);
             tblInstruments.setValueAt(results.get(i).getMaker(), i, 1);
             tblInstruments.setValueAt(results.get(i).getModel(), i, 2);
             tblInstruments.setValueAt(results.get(i).getLastCalibration().format(fmt), i, 3);
             tblInstruments.setValueAt(results.get(i).getNextCalibration().format(fmt), i, 4);
             
             LocalDate currentDate = LocalDate.now();
             LocalDate cellDate = results.get(i).getNextCalibration();
             
             Color foregroundColor = (currentDate.isAfter(cellDate)) ? Color.RED : tblInstruments.getForeground();
             DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
             renderer.setForeground(Color.RED);
            tblInstruments.getColumnModel().getColumn(columnIndex).setCellRenderer(renderer);

            tblInstruments.setValueAt(results.get(i).getDescription(), i, 5);
         }
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstruments = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        tdfSearch = new javax.swing.JTextField();
        btnLocalizarInstrumento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Instrumentos Cadastrados");

        tblInstruments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Instrumento", "Fabricante", "Modelo", "Ultima Calibração", "Próxima Calibração", "Informações adicionais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInstruments);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar ");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnLocalizarInstrumento.setText("Buscar");
        btnLocalizarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarInstrumentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Localizar Intrumento: ");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Created By JRSolutions®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tdfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLocalizarInstrumento)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar)
                    .addComponent(tdfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarInstrumento)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnEditar)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLocalizarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarInstrumentoActionPerformed
        if(tdfSearch.getText().isEmpty() || tdfSearch.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite o instrumento a ser pesquisado!");
        }   else if(ic.findInstrument(tdfSearch.getText()) == null){
            JOptionPane.showMessageDialog(null, "Instrumento não cadastrado!");
        }
        else{
        List <Instrument> results = new ArrayList<>();
        String name = tdfSearch.getText();
        showResults(ic.findInstrument(name));
       }
    }//GEN-LAST:event_btnLocalizarInstrumentoActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
       showResults(ic.Ordenate(ic.returnAll())); 
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
      
    }//GEN-LAST:event_btnEditarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgInstruments dialog = new DlgInstruments(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLocalizarInstrumento;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInstruments;
    private javax.swing.JTextField tdfSearch;
    // End of variables declaration//GEN-END:variables
}

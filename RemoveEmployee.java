/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dj_sp
 */
public class RemoveEmployee extends javax.swing.JFrame {
File sallaried=new File("Salaried Employee Registration.txt");  
File hourly=new File("Hourly Employee Registration.txt");
File commission=new File("Commission Employee Registration.txt");
//creating  a text files

    /**
     * Creates new form RemoveEmployee
     */
    public RemoveEmployee() {
        initComponents();
        removeSalEmp();                             
        removeHourlyEmp();
        removeCommissionEmp();
        //calling methods
       }
    
    public void removeSemp(){
           
       }
       public void removeSalEmp(){
        DefaultTableModel model=(DefaultTableModel)tblSalaried.getModel();
       
        FileReader fr;
        try {
            fr = new FileReader(sallaried);
            BufferedReader br=new BufferedReader(fr);                               
                 //reading from text file
             String line;
             int column;
             int row=0;

        while(( line=br.readLine())!=null){
   tblSalaried.setValueAt(line,row,0);
   tblSalaried.setValueAt(br.readLine(),row,1);
   tblSalaried.setValueAt(br.readLine(),row,2);
   tblSalaried.setValueAt(br.readLine(),row,3);
   tblSalaried.setValueAt(br.readLine(),row,4);
   tblSalaried.setValueAt(br.readLine(),row,5);
   tblSalaried.setValueAt(br.readLine(),row,6);                                     
   tblSalaried.setValueAt(br.readLine(),row,7);
   tblSalaried.setValueAt(br.readLine(),row,8);
   tblSalaried.setValueAt(br.readLine(),row,9);
   
            row++;
             //sets to a jtable
}
    
    
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
       public void removeHourlyEmp(){
           DefaultTableModel model=(DefaultTableModel)tblSalaried.getModel();
       
        FileReader fr;
        try {
            fr = new FileReader(hourly);
            BufferedReader br=new BufferedReader(fr);

             String line;
             int column;
             int row=0;

        while(( line=br.readLine())!=null){
   tblHourly.setValueAt(line,row,0);
   tblHourly.setValueAt(br.readLine(),row,1);
   tblHourly.setValueAt(br.readLine(),row,2);
   tblHourly.setValueAt(br.readLine(),row,3);
   tblHourly.setValueAt(br.readLine(),row,4);
   tblHourly.setValueAt(br.readLine(),row,5);
   tblHourly.setValueAt(br.readLine(),row,6);
   tblHourly.setValueAt(br.readLine(),row,7);
   tblHourly.setValueAt(br.readLine(),row,8);
   
   
   
            row++;
    
}
    
    
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
       
    public void removeCommissionEmp(){
           DefaultTableModel model=(DefaultTableModel)tblCommission.getModel();
       
        FileReader fr;
        try {
            fr = new FileReader(commission);
            BufferedReader br=new BufferedReader(fr);

             String line;
             int column;
             int row=0;

        while(( line=br.readLine())!=null){
   tblCommission.setValueAt(line,row,0);
   tblCommission.setValueAt(br.readLine(),row,1);
   tblCommission.setValueAt(br.readLine(),row,2);
   tblCommission.setValueAt(br.readLine(),row,3);
   tblCommission.setValueAt(br.readLine(),row,4);
   tblCommission.setValueAt(br.readLine(),row,5);
   tblCommission.setValueAt(br.readLine(),row,6);
   tblCommission.setValueAt(br.readLine(),row,7);
   tblCommission.setValueAt(br.readLine(),row,8);
   tblCommission.setValueAt(br.readLine(),row,9);
   
   
            row++;
    
}
    
    
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
    
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalaried = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHourly = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommission = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salaried Employee");

        tblSalaried.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title ", "First Name", "Last Name", "DOB", "NiN", "Job Title", "Job Department", "Type of Employment", "Anual Gross Sallary"
            }
        ));
        jScrollPane1.setViewportView(tblSalaried);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Employee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hourly Employee");

        tblHourly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "First Name", "Last Name", "DOB", "NiN", "Job Title", "Job Department", "Pay Rate"
            }
        ));
        jScrollPane2.setViewportView(tblHourly);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Commission Employee");

        tblCommission.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "First Name", "Last Name", "DOB", "NiN", "Job Title", "Job Department", "Annual Gross Sallary", "Commission Rate"
            }
        ));
        jScrollPane3.setViewportView(tblCommission);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Delete selected Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dj_sp\\Desktop\\previous (1).png")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Delete Selected Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Delete Selected Employee");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        DefaultTableModel model=(DefaultTableModel)tblSalaried.getModel();
        int selectedRow=tblSalaried.getSelectedRow();
     
        int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to remove selected employee");
        //displays confirmation dialog to user
    if(dialogResult == JOptionPane.YES_OPTION){
         model.removeRow(selectedRow);
        //gets the user answer and if true removes employee from table
        
        
         String newwFile = "Salaried Employee Registration2.txt";
         //creating new text file
        File newFile = new File(newwFile);
        try {
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            int rowCount=tblSalaried.getRowCount();
            for(int i = 0; i < tblSalaried.getRowCount(); i++){//rows
                for(int j = 0; j < tblSalaried.getColumnCount(); j++){//columns
                  //
                   
                   if(tblSalaried.getValueAt(i,j)!=null){
                    bw.write((String) tblSalaried.getValueAt(i,j));
                    bw.newLine();
                   }
                    //writing to a file while jtable is nt equal to nothing
                }
               
                
            }
            JOptionPane.showMessageDialog(null, "Employee has been removed from the system");
            //display a message to user 
            bw.close();
            fw.close();
            
            sallaried.delete();
            newFile.renameTo(sallaried);
            //deletes old file,
            // renames new file to the old file
           
           
            
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }else{
        
    }
       
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FirstMenu FirstMenu=new FirstMenu();
        FirstMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         DefaultTableModel model=(DefaultTableModel)tblHourly.getModel();
        int selectedRow=tblHourly.getSelectedRow();
        
          int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to remove selected employee");
          if(dialogResult == JOptionPane.YES_OPTION){
               model.removeRow(selectedRow);
        
        
         String newwFile = "Hourly Employee Registration2.txt";
        File newFile = new File(newwFile);
        try {
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            int rowCount=tblHourly.getRowCount();
            for(int i = 0; i < tblHourly.getRowCount(); i++){//rows
                for(int j = 0; j < tblHourly.getColumnCount(); j++){//columns

                   
                   if(tblHourly.getValueAt(i,j)!=null){
                    bw.write((String) tblHourly.getValueAt(i,j));
                    bw.newLine();
                   }

                }
               
                
            }
              JOptionPane.showMessageDialog(null, "Employee has been removed from the system");
            
            bw.close();
            fw.close();
            
            hourly.delete();
            newFile.renameTo(hourly);
           
           
            
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model=(DefaultTableModel)tblCommission.getModel();
        int selectedRow=tblCommission.getSelectedRow();
        
        int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to remove selected employee");
          if(dialogResult == JOptionPane.YES_OPTION){
                model.removeRow(selectedRow);
        
        
         String newwFile = "Commission Employee Registration2.txt";
        File newFile = new File(newwFile);
        try {
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            int rowCount=tblCommission.getRowCount();
            for(int i = 0; i < tblCommission.getRowCount(); i++){//rows
                for(int j = 0; j < tblCommission.getColumnCount(); j++){//columns

                   
                   if(tblCommission.getValueAt(i,j)!=null){
                    bw.write((String) tblCommission.getValueAt(i,j));
                    bw.newLine();
                   }

                }
               
                
            }
            JOptionPane.showMessageDialog(null, "Employee has been removed from the system");
            
            bw.close();
            fw.close();
            
            commission.delete();
            newFile.renameTo(commission);
            
           
           
            
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
      
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblCommission;
    private javax.swing.JTable tblHourly;
    private javax.swing.JTable tblSalaried;
    // End of variables declaration//GEN-END:variables
}

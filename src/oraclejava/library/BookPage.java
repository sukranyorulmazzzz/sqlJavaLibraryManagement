/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejava.library;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sukra
 */
public class BookPage extends javax.swing.JFrame {
 DefaultTableModel model;
    Connection con=null;
    Statement statement=null;
    ResultSet rs=null;
    BookPage bp;
    StudentPage sp;
    LibrarianPage lp;
    PreparedStatement pst=null;
    /**
     * Creates new form BookPage
     */
    public BookPage() {
        initComponents();
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelkitap = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        text1 = new java.awt.TextField();
        text2 = new java.awt.TextField();
        text3 = new java.awt.TextField();
        text4 = new java.awt.TextField();
        text5 = new java.awt.TextField();
        text7 = new java.awt.TextField();
        text8 = new java.awt.TextField();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panelkitapLayout = new javax.swing.GroupLayout(panelkitap);
        panelkitap.setLayout(panelkitapLayout);
        panelkitapLayout.setHorizontalGroup(
            panelkitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelkitapLayout.setVerticalGroup(
            panelkitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button1.setLabel("Geri");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label1.setText("ID:");

        label2.setText("Kitap Adı:");

        label3.setText("Yazar:");

        label4.setText("İçerik:");

        label5.setText("Basım Yılı:");

        label8.setText("Yayınevi:");

        label9.setText("Tür:");

        button2.setLabel("Kaydet");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("Kitapları Göster");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kitap Adı", "Yazar", "İçerik", "Basım Yılı", "Yayınevi", "Tür"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(255, 255, 255)
                                        .addComponent(panelkitap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))
                                .addGap(1090, 1090, 1090))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30))
                                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)))
                                        .addGap(30, 30, 30))
                                    .addComponent(text5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelkitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1){

            try{
                String sql = "DELETE FROM BOOKS";
                String url="jdbc:oracle:thin:@localhost:1521:XE";
                con=DriverManager.getConnection(url,"sukran","sukran");
                pst=con.prepareStatement(sql);
                tblModel.removeRow(jTable1.getSelectedRow());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Başarıyla Güncellendi!");

                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text7.setText("");
                text8.setText("");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Tablo Boş...");

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Seçmediniz...");

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1){
            String id=text1.getText();
            String isim=text2.getText();
            String yazar=text3.getText();
            String icerik=text4.getText();
            String yil=text5.getText();
            String yayinevi=text7.getText();
            String tur=text8.getText();

            tblModel.setValueAt(id, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(isim, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(yazar, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(icerik, jTable1.getSelectedRow(), 3);
            tblModel.setValueAt(yil, jTable1.getSelectedRow(), 4);
            tblModel.setValueAt(yayinevi, jTable1.getSelectedRow(), 5);
            tblModel.setValueAt(tur, jTable1.getSelectedRow(), 6);

            try{
                String sql = "UPDATE BOOKS SET BOOKID=?, BOOKNAME=?, BOOKAUTHOR=? ,DESCRIPTION=?,YEAROFPUB=?,PUBLISHER=?,BOOKTYPE=?";
                String url="jdbc:oracle:thin:@localhost:1521:XE";
                con=DriverManager.getConnection(url,"sukran","sukran");
                pst=con.prepareStatement(sql);

                pst.setString(1, id);
                pst.setString(2, isim);
                pst.setString(3, yazar);
                pst.setString(4, icerik);
                pst.setString(5, yil);
                pst.setString(6, yayinevi);
                pst.setString(7, tur);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Başarıyla Güncellendi!");

                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text7.setText("");
                text8.setText("");

                kitaplariGoruntule();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Tablo Boş...");

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Seçmediniz...");

            }
        }
        // TODO
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        String tblid=tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String ad=tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String yazar=tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String icerik=tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String basimyili=tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String yayinevi=tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();

        String tur=tblModel.getValueAt(jTable1.getSelectedRow(),6).toString();

        text1.setText(tblid);
        text2.setText(ad);
        text3.setText(yazar);
        text4.setText(icerik);
        text5.setText(basimyili);
        text7.setText(yayinevi);
        text8.setText(tur);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        kitaplariGoruntule();

        // TODO add your handling code here
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        try{
            String sql="insert into BOOKS (BOOKID,BOOKNAME,BOOKAUTHOR,DESCRIPTION,YEAROFPUB,PUBLISHER,BOOKTYPE) VALUES(?,?,?,?,?,?,?)";

            String url="jdbc:oracle:thin:@localhost:1521:XE";
            con=DriverManager.getConnection(url,"sukran","sukran");
            pst=con.prepareStatement(sql);
            pst.setString(1,text1.getText());
            pst.setString(2,text2.getText());
            pst.setString(3,text3.getText());
            pst.setString(4,text4.getText());
            pst.setString(5,text5.getText());
            pst.setString(6,text7.getText());
            pst.setString(7,text8.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Başarıyla kaydedildi.");
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text7.setText("");
            text8.setText("");
            kitaplariGoruntule();
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        mainformlibrarian mf=new mainformlibrarian();
        setVisible(false);
        mf.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    public void kitaplariGoruntule(){
         DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
               
        tblModel.setRowCount(0);
        try{
          String sql="select* from BOOKS";
          String url="jdbc:oracle:thin:@localhost:1521:XE";
            con=DriverManager.getConnection(url,"sukran","sukran");
            statement=con.createStatement();
            rs=statement.executeQuery(sql);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("BOOKID"));
                String name=rs.getString("BOOKNAME");
                String author=rs.getString("BOOKAUTHOR");
                String description=rs.getString("DESCRIPTION");
                String yearofpub=rs.getString("YEAROFPUB");
                String publisher=rs.getString("PUBLISHER");
                String booktype=rs.getString("BOOKTYPE");
                
                String tbData[]={id,name,author,description,yearofpub,publisher,booktype};
                 tblModel.addRow(tbData);
            }
            con.close();
        }
        catch(Exception ex){
            System.out.println("hata");
        }
      
    }
       
 
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
            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel panelkitap;
    private java.awt.TextField text1;
    private java.awt.TextField text2;
    private java.awt.TextField text3;
    private java.awt.TextField text4;
    private java.awt.TextField text5;
    private java.awt.TextField text7;
    private java.awt.TextField text8;
    // End of variables declaration//GEN-END:variables

   
    
}


package ds;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data_Structure extends javax.swing.JFrame {
    int cnt=0;
    String linkText,nameText,TeamText,PlayerText,ActionText;
    Linklist videos = new Linklist();
    public Data_Structure() {
        this.setTitle("World Cup Highlights Tube");
        initComponents();
        this.setLocationRelativeTo(null);      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLink = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyTable = new javax.swing.JTable();
        Play = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Sort_A = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        Sort_D = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Team_name = new javax.swing.JTextField();
        Action = new javax.swing.JTextField();
        Player_name = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        V_counter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Title");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        MyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Team Name", "Player Name", "Action", "Link"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MyTable.getTableHeader().setReorderingAllowed(false);
        MyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MyTable);
        if (MyTable.getColumnModel().getColumnCount() > 0) {
            MyTable.getColumnModel().getColumn(0).setResizable(false);
            MyTable.getColumnModel().getColumn(1).setResizable(false);
            MyTable.getColumnModel().getColumn(2).setResizable(false);
            MyTable.getColumnModel().getColumn(3).setResizable(false);
            MyTable.getColumnModel().getColumn(4).setResizable(false);
        }

        Play.setText("Play");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Sort_A.setText("Sort Asc");
        Sort_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sort_AActionPerformed(evt);
            }
        });

        jLabel3.setText("Link");

        next.setText("Next Video");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        Sort_D.setText("Sort Dsc");
        Sort_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sort_DActionPerformed(evt);
            }
        });

        jLabel4.setText("Team Name");

        jLabel5.setText("Player Name");

        jLabel6.setText("Action");

        Team_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Team_nameActionPerformed(evt);
            }
        });

        Player_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_nameActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Videos: ");

        V_counter.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(next))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Update)
                                .addGap(18, 18, 18)
                                .addComponent(Delete)
                                .addGap(18, 18, 18)
                                .addComponent(Search)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Action, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sort_A)
                                    .addComponent(Sort_D))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Refresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(V_counter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sort_A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sort_D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search)
                            .addComponent(Insert)
                            .addComponent(Update)
                            .addComponent(Delete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next)
                            .addComponent(Play))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Action, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
   
    try {
            Desktop.getDesktop().open(new File(linkText)); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No Video");

        
        }    }//GEN-LAST:event_PlayActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        nameText = txtName.getText();
        linkText = txtLink.getText();
        if (nameText.equals("") || linkText.equals("") || Team_name.equals("") || Player_name.equals("") || Action.equals("")  ) {
            JOptionPane.showMessageDialog(this, "invalid insertion");
        }
        else{
            videos.insert(txtName.getText(), Team_name.getText(), Player_name.getText(), Action.getText(), txtLink.getText());
            String data[]= {txtName.getText(),Team_name.getText(),Player_name.getText(), Action.getText(), txtLink.getText() };
            DefaultTableModel tb1Model = (DefaultTableModel) MyTable.getModel();
            tb1Model.addRow(data);
            videos.print();
            txtName.setText("");
            txtLink.setText("");
            Team_name.setText("");
            Player_name.setText("");
            Action.setText("");
            JOptionPane.showMessageDialog(this, "Inserted successfully ✔");
            cnt ++;
            V_counter.setText(String.valueOf(cnt));
            linkText = txtLink.getText();
            
            
        }    }//GEN-LAST:event_InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
         nameText = txtName.getText();
         linkText = txtLink.getText();
        if (nameText.equals("")) JOptionPane.showMessageDialog(this, "Empty Name");
        else{
            String[] video_data=videos.search(nameText);
            videos.update(nameText, linkText);
            JOptionPane.showMessageDialog(this, "Updated successfully ✔");
            txtName.setText("");
            txtLink.setText("");
            Team_name.setText("");
            Player_name.setText("");
            Action.setText("");
            refresh();
        }
        videos.print();
    }//GEN-LAST:event_UpdateActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        nameText = txtName.getText();
        if (nameText.equals("")) JOptionPane.showMessageDialog(this, "Enter Video Name‼");
        else{
               String[] test=new String[5];
               test = videos.search(nameText);
                if (test==null) {
                    JOptionPane.showMessageDialog(this, "not found");
                }
            else{
                     String[] video_data= new String[5];
                    video_data=videos.search(nameText);
                   txtName.setText(video_data[0]);
                   Team_name.setText(video_data[1]);
                   Player_name.setText(video_data[2]);
                   Action.setText(video_data[3]);
                   txtLink.setText(video_data[4]);
                DefaultTableModel tb1Model = (DefaultTableModel) MyTable.getModel();
                tb1Model.setRowCount(0);
                tb1Model.addRow(video_data);
                linkText= video_data[4];
            } 
                    
                
            
             }    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel tb1Model = (DefaultTableModel) MyTable.getModel();
         if(MyTable.getSelectedRowCount()==0){
             JOptionPane.showMessageDialog(this, "No Videos selected");
         }
         else if(MyTable.getSelectedRowCount()==1){
          String test = tb1Model.getValueAt(MyTable.getSelectedRow(), 0).toString(); 
          tb1Model.removeRow(MyTable.getSelectedRow());
          videos.delete(test); 
          JOptionPane.showMessageDialog(this, "Deleted successfully ✔");
            txtName.setText("");
            txtLink.setText("");
            Team_name.setText("");
            Player_name.setText("");
            Action.setText("");
            videos.pnt = videos.head;
            cnt --;
            V_counter.setText(String.valueOf(cnt));
        }else if(MyTable.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(this, "Please Select Single Row For Delete.. !");
        }
        videos.print();  
    }//GEN-LAST:event_DeleteActionPerformed

    private void MyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyTableMouseClicked

        DefaultTableModel tb1Model = (DefaultTableModel) MyTable.getModel();
        String tb1Name = tb1Model.getValueAt(MyTable.getSelectedRow(), 0).toString();
        String tb1Team= tb1Model.getValueAt(MyTable.getSelectedRow(), 1).toString();
        String tb1Player= tb1Model.getValueAt(MyTable.getSelectedRow(), 2).toString();
        String tb1Action= tb1Model.getValueAt(MyTable.getSelectedRow(), 3).toString();
        String tb1Link= tb1Model.getValueAt(MyTable.getSelectedRow(), 4).toString();
            txtName.setText(tb1Name);
            Team_name.setText(tb1Team);
            Player_name.setText(tb1Player);
            Action.setText(tb1Action);
            txtLink.setText(tb1Link);
            linkText = tb1Link;
    }//GEN-LAST:event_MyTableMouseClicked

    private void Sort_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sort_AActionPerformed

        videos.sortLinkedListasc();
        videos.print();
        refresh();
        videos.pnt = videos.head;
    }//GEN-LAST:event_Sort_AActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
 
        if(videos.size == 0){
            JOptionPane.showMessageDialog(this, "No Videos !");
        }   
        else if(videos.pnt == null){
                 JOptionPane.showMessageDialog(this, "Last Video !");
            }  
            else{
                 txtName.setText(videos.pnt.name);
                 Team_name.setText(videos.pnt.Team);
                 Player_name.setText(videos.pnt.Player);
                 Action.setText(videos.pnt.Action);
                 txtLink.setText(videos.pnt.link);
                 videos.pnt = videos.pnt.next;
                 try {
            Desktop.getDesktop().open(new File(txtLink.getText())); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No Video");
        }
        }    
    }//GEN-LAST:event_nextActionPerformed
   
  
    private void Sort_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sort_DActionPerformed

        videos.sortLinkedListdsc();
        videos.print();
        refresh();
        videos.pnt = videos.head;
    }//GEN-LAST:event_Sort_DActionPerformed

    private void Player_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player_nameActionPerformed

    private void Team_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Team_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Team_nameActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed

     refresh();
    }//GEN-LAST:event_RefreshActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
  public void refresh(){
     Node current = videos.head;
     DefaultTableModel tb1Model = (DefaultTableModel) MyTable.getModel();
     tb1Model.setRowCount(0);
     String[] refresh_data = new String[5] ; 
     while (current != null) {
         refresh_data[0]= current.name ; 
         refresh_data[1]= current.Team ;
         refresh_data[2]= current.Player ;
         refresh_data[3]= current.Action ;
         refresh_data[4]= current.link ;
         tb1Model.addRow(refresh_data);
         current = current.next;
         videos.pnt= videos.head;
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
            java.util.logging.Logger.getLogger(Data_Structure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Structure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Structure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Structure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Structure().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Action;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JTable MyTable;
    private javax.swing.JButton Play;
    private javax.swing.JTextField Player_name;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Search;
    private javax.swing.JButton Sort_A;
    private javax.swing.JButton Sort_D;
    private javax.swing.JTextField Team_name;
    private javax.swing.JButton Update;
    private javax.swing.JLabel V_counter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

package Folder1;

public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\men.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\folder.png")); // NOI18N
        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\exit.png")); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\add.png")); // NOI18N
        jMenu2.setText("Add");

        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\addemployee.png")); // NOI18N
        jMenuItem2.setText("Add New Employee");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\job.png")); // NOI18N
        jMenuItem3.setText("Add New Job");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\edit.png")); // NOI18N
        jMenu3.setText("Edit");

        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\edit.png")); // NOI18N
        jMenuItem4.setText("Edit Employee");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
            AddEmployee add= new AddEmployee();
             add.setVisible(true);
            add.setLocationRelativeTo(null);
           //  this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
            AddNewJob add=new AddNewJob();
            add.setVisible(true);
            add.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        
         EditEmployee add=new EditEmployee();
            add.setVisible(true);
            add.setLocationRelativeTo(null);
      
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

 
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}

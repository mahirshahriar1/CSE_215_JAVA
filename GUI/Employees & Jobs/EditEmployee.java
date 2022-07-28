package Folder1;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.text.*;


public class EditEmployee extends javax.swing.JFrame {
    
    ArrayList<Job> jobs;
    ArrayList<Employee>  employees;
    DecimalFormat formatter;
    

    public EditEmployee() {
        initComponents();
        
        jobs=new ArrayList<Job>();
        employees=new ArrayList<Employee>();
        formatter=new DecimalFormat("#,####.00");
        populateArrayList();
        
        String []  jobsArray= new String[jobs.size()];
         
        for(int i=0;i<jobs.size();i++)
        {
            jobsArray[i]=jobs.get(i).getNameOfJob()+", R"+formatter.format(jobs.get(i).getSalary());
        }
        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(jobsArray));  
        
        String []  empArray= new String[employees.size()];
         
        for(int i=0;i<employees.size();i++)
        {
            empArray[i]=employees.get(i).getName()+", "+employees.get(i).getSurname();
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(empArray));   
        
        
        jComboBox1.setSelectedIndex(0);
        
    }
    
     public void populateArrayList()
    {
        try{
            FileInputStream file=new FileInputStream("Jobs.dat");
            ObjectInputStream inputFile=new ObjectInputStream(file);
            
            boolean endOfFile=false;
     
            while(!endOfFile)
            {
                try{
                    jobs.add((Job)inputFile.readObject());
                }catch(EOFException e)
                {
                     endOfFile=true;
                }catch(Exception f)
                {
                      JOptionPane.showMessageDialog(null, f.getMessage());
                }             
                
            }
            inputFile.close();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
                
        try{
            FileInputStream file2=new FileInputStream("Employees.dat");
            ObjectInputStream inputFile2=new ObjectInputStream(file2);
            
            boolean endOfFile=false;
     
            while(!endOfFile)
            {
                try{
                    employees.add((Employee)inputFile2.readObject());
                }catch(EOFException e)
                {
                     endOfFile=true;
                }catch(Exception f)
                {
                      JOptionPane.showMessageDialog(null, f.getMessage());
                }             
                
            }
            inputFile2.close();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
      public void saveEmployeesToFile()
    {
        try{
            FileOutputStream file=new FileOutputStream("Employees.dat");
            ObjectOutputStream outputFile=new ObjectOutputStream(file);
        
            for(int i=0;i<employees.size();i++)
            {
                outputFile.writeObject(employees.get(i));
            }
            
            outputFile.close();
             JOptionPane.showMessageDialog(null, "Successfully Saved");
             this.dispose();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
      
      public void saveEmployeesToFileDelete()
    {
        try{
            FileOutputStream file=new FileOutputStream("Employees.dat");
            ObjectOutputStream outputFile=new ObjectOutputStream(file);
        
            for(int i=0;i<employees.size();i++)
            {
                outputFile.writeObject(employees.get(i));
            }
            
            outputFile.close();
             JOptionPane.showMessageDialog(null, "Successfully Deleted");
             this.dispose();
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Employee Data");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel1.setText("Edit Employee data");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Choose employee:");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Employee name:");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Employee surname:");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Employee job:");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Employee staff number:");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\1MAHIR\\semester 3 (cse215 mat130 his103 phy107)\\cse215\\1_Java file projects\\Pics\\Pics\\exit.png")); // NOI18N
        jButton2.setText("Delete");
        jButton2.setMaximumSize(new java.awt.Dimension(106, 54));
        jButton2.setMinimumSize(new java.awt.Dimension(106, 54));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 204, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
        int selectedIndex=jComboBox1.getSelectedIndex();
        
        jTextField1.setText(employees.get(selectedIndex).getName());
        jTextField2.setText(employees.get(selectedIndex).getSurname());
        jTextField3.setText(employees.get(selectedIndex).getStaffNr()+"");
        
        Job job=employees.get(selectedIndex).getJob();
        
        int index=0;
        for(int i=0;i<jobs.size();i++)
        {
            if(jobs.get(i).equals(job))
            {
                index =i;
                break;
            }
        }
        
        jComboBox2.setSelectedIndex(index);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()||
                jTextField3.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        }
        else
        {
            int selectedIndex= jComboBox1.getSelectedIndex();
            employees.get(selectedIndex).setName(jTextField1.getText().trim());
            employees.get(selectedIndex).setSurname(jTextField2.getText().trim());
            employees.get(selectedIndex).setStaffNr(Integer.parseInt(jTextField3.getText().trim()));
            
            Job job=jobs.get(jComboBox2.getSelectedIndex());
            employees.get(selectedIndex).setJob(job);
            
            saveEmployeesToFile();
            
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int selectedIndex=jComboBox1.getSelectedIndex();
        
        employees.remove(selectedIndex);
        saveEmployeesToFileDelete();
        
    }//GEN-LAST:event_jButton2ActionPerformed

     
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

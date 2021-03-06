/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorFibonacci;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Generador_Fibonacci extends javax.swing.JFrame {

    /**
     * Creates new form ventanaUno
     */
    public Generador_Fibonacci() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textSemilla1 = new javax.swing.JTextField();
        textSemilla2 = new javax.swing.JTextField();
        modulo = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaX1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaU1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        constante_s = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textPeriodo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        constante_r = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        operacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setText("N0");

        jLabel2.setText("N1");

        jLabel3.setText("Modulo");

        textSemilla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textSemilla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloActionPerformed(evt);
            }
        });

        Button1.setText("Ejecutar");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("Limpiar");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        TextAreaX1.setColumns(20);
        TextAreaX1.setRows(5);
        TextAreaX1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(TextAreaX1);

        TextAreaU1.setColumns(20);
        TextAreaU1.setRows(5);
        TextAreaU1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setViewportView(TextAreaU1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("N");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("           U");

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Algoritmo Fibonacci ");

        jLabel7.setText("Connstante s");

        constante_s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        constante_s.setName(""); // NOI18N
        constante_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constante_sActionPerformed(evt);
            }
        });

        jLabel8.setText("# Periodo (Cant. Iteraciones)");

        textPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Connstante r");

        constante_r.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Tipo de operacion");

        operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", " " }));
        operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSemilla1, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(textSemilla2, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modulo, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(constante_s, javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textPeriodo)
                            .addComponent(constante_r)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button2)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jScrollPane2)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textSemilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textSemilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(constante_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(constante_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2)
                    .addComponent(Button1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed

        /*Realizamos un parseo de los datos obtenidos de los TextBox*/
        int semilla1              = Integer.parseInt(textSemilla1.getText());
        int semilla2              = Integer.parseInt(textSemilla2.getText());
        int modulo_m             = Integer.parseInt(modulo.getText());
        int  const_s             = Integer.parseInt(constante_s.getText());
        int  const_r             = Integer.parseInt(constante_r.getText());
       String tipo_operacion      = operacion.getSelectedItem().toString();
        int periodo              = Integer.parseInt(textPeriodo.getText());
        double salida []            = new double[periodo];     

        /*Quemamos la funcion X0 = (aXn-¡ + c)mod(m)*/
        
          TextAreaX1.setText(TextAreaX1.getText() + "\n " + semilla1);
           TextAreaX1.setText(TextAreaX1.getText() + "\n " + semilla2);
      
        switch (tipo_operacion){
            
            case "+" :
           
          
    if (periodo==2){
            
          semilla1= periodo-const_s ;
          semilla2= periodo-const_r ;
        }
    for (int cont=1; cont<=periodo-2; cont++){
     int formula2= (semilla1+semilla2 )% modulo_m;
    semilla1=semilla2;
    semilla2= formula2;
    salida[cont]=formula2;
    String cadena2=String.valueOf(formula2); 
           
            TextAreaX1.setText(TextAreaX1.getText() + "\n " + cadena2);
          
    }
        
        
        for(int k = 0; k < periodo-2; k++)
        {
            
            double result2 =(salida[k]/modulo_m);
            String salidaCadena2= String.valueOf(result2);
            TextAreaU1.setText(TextAreaU1.getText() + "\n " + salidaCadena2);
        } 
            break;
            
            
     case "-":
         if (periodo==2){
            
          semilla1= periodo-const_s ;
          semilla2= periodo-const_r ;
        }
                
       for (int cont=1; cont<=periodo-2; cont++){
     int formula2= (semilla1-semilla2 )% modulo_m;
    semilla1=semilla2;
    semilla2= formula2;
    salida[cont]=formula2;
    String cadena2=String.valueOf(formula2); 
           
            TextAreaX1.setText(TextAreaX1.getText() + "\n " + cadena2);
          
    }
        
        
        for(int k = 0; k < periodo-2; k++)
        {
            
            double result2 =(salida[k]/modulo_m);
            String salidaCadena2= String.valueOf(result2);
            TextAreaU1.setText(TextAreaU1.getText() + "\n " + salidaCadena2);
        }
        
        
        break;
        
        
       case "*" :
           
           if (periodo==2){
            
          semilla1= periodo-const_s ;
          semilla2= periodo-const_r ;
        }
           for (int cont=1; cont<=periodo-2; cont++){
     int formula2= (semilla1*semilla2 )% modulo_m;
    semilla1=semilla2;
    semilla2= formula2;
    salida[cont]=formula2;
    String cadena2=String.valueOf(formula2); 
           
            TextAreaX1.setText(TextAreaX1.getText() + "\n " + cadena2);
          
    }
        
        
        for(int k = 0; k < periodo-2; k++)
        {
            
            double result2 =(salida[k]/modulo_m);
            String salidaCadena2= String.valueOf(result2);
            TextAreaU1.setText(TextAreaU1.getText() + "\n " + salidaCadena2);
        } 
            break;    
        }
           
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        String borrar = " ";
        modulo.setText("");
        textSemilla1.setText("");
        textSemilla2.setText("");
        textPeriodo.setText("");
        constante_s.setText("");
        TextAreaX1.setText(borrar);
        TextAreaU1.setText(borrar);
        constante_r.setText("");
    }//GEN-LAST:event_Button2ActionPerformed

    private void moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduloActionPerformed

    private void constante_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constante_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constante_sActionPerformed

    private void operacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operacionActionPerformed

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
            java.util.logging.Logger.getLogger(Generador_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generador_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generador_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generador_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador_Fibonacci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JTextArea TextAreaU1;
    private javax.swing.JTextArea TextAreaX1;
    private javax.swing.JTextField constante_r;
    private javax.swing.JTextField constante_s;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField modulo;
    private javax.swing.JComboBox<String> operacion;
    private javax.swing.JTextField textPeriodo;
    private javax.swing.JTextField textSemilla1;
    private javax.swing.JTextField textSemilla2;
    // End of variables declaration//GEN-END:variables
}

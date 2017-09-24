/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaImgen;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

public class areaImagen extends javax.swing.JFrame {

    /**
     * Creates new form areaImagen
     */
    public areaImagen() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextUrl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("SIMULACION AREA IMAGEN NRC 8090");

        jLabel2.setText("Ingrese Ruta de la Imagen");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setText("Colocar la ruta de la imagen y al final \\nombre_del_archivo.Su_Extension. Ejemplo C:\\Users\\elizabeth\\Documents\\imagenprueba.bmp ");
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(TextUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String ruta = TextUrl.getText();
        double ancho = 0,
                alto = 0,
                area = 0,
                semilla = 317,
                m = 30049,
                operacion = 0;
        int ejeX = 0;
        int ejeY = 0;
        double operacion1 = 0;

        try {

            /*Algoritmo de Blum, Blum y Shub
        Si en el algoritmo congruencial cuadrático a = ‘\ ,b = 0 y c = 0, entonces se construye un nueva ecuación recursiva:
        X í+1 = (X .2)m od (m ) / = 0,1,2,3 ,...n
        La ecuación anterior fue propuesta por Blum, Blum y Shub121 com o un nuevo m étodo para
        generar núm eros que no tienen un com portam iento predecible.
        Tomado del libro: Simulacion y analisis de sistemas Con Promodel
            Editorial:  Pearson
            C a p ítu lo 2 Números pseudoaleatorios
            pagina 31
             */
            String cadena = "";
            String contieneCadena = "";
            int cantidadCaracteres = 0;
            int cont = 1;

            BufferedImage img = ImageIO.read(new File(ruta));
            ancho = img.getWidth();
            alto = img.getHeight();
            area = ancho * alto;
            double areaOscura = 0;
            jTextArea1.setText(jTextArea1.getText()+ "\n " + "Ancho de la Imagen" + " " + ancho + " " + "Alto de la Imagen" + " " + alto);
            jTextArea1.setText(jTextArea1.getText() + "\n "+ "area de la imagen" + " " + area);
    

            double[] contenedor = new double[img.getWidth() - 1];
            for (int i = 0; i < img.getWidth() - 1; i++) {
                for (int z = img.getWidth() / 2; z < img.getWidth() - 1; z++) {

                    double result = (((double) Math.pow(semilla, 2))) % m;
                    semilla = result;

                    cadena = Double.toString(semilla);
                    cantidadCaracteres = cadena.length();

                    if (cantidadCaracteres == 3) {
                        contenedor[i] = semilla;

                    } else {

                        contieneCadena = cadena.substring(0, 3);
                        int subcadena = Integer.parseInt(contieneCadena);
                        contenedor[i] = subcadena;

                    }

                    if (contenedor[i] > img.getWidth()) {
                        operacion = contenedor[i];
                        String caracter = Double.toString(contenedor[i]);
                        contieneCadena = cadena.substring(0, 2);
                        ejeX = Integer.parseInt(contieneCadena);
                    } else {
                        ejeX = (int) contenedor[i];
                    }

                    operacion1 = contenedor[i] + contenedor[z];

                    if (operacion1 > img.getWidth()) {
                        String caracter = Double.toString(operacion1);
                        contieneCadena = cadena.substring(0, 2);
                        ejeY = Integer.parseInt(contieneCadena);
                    }

                    int rgb = img.getRGB(ejeX, ejeY);

                    Color color = new Color(rgb, true);
                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();

                    for (int j = 245; j < 255; j++) {
                        if (r == j && g == j && b == j) {

                            areaOscura = areaOscura + 1;

                        }

                    }
                }

            }

            double areaPorcentual = (areaOscura / area) * 100;
            jTextArea1.setText(jTextArea1.getText() + "\n "+ "total Porcentaje Area Oscura" + "  " + areaPorcentual);
    


        } catch (IOException e) {

            System.out.println(e.getMessage());

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    File fichero;
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
            java.util.logging.Logger.getLogger(areaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areaImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextUrl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}

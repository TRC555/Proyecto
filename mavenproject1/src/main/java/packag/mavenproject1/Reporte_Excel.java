
package packag.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reporte_Excel extends javax.swing.JFrame {

    int seleccion=0;
    
    boolean estado = false, terminar = false, estado2 = false;
    
    ArrayList<Registro> reportes = new ArrayList<>();
    
    ArrayList<String> fechas = new ArrayList<>();
    
    public Reporte_Excel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lista_inicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lista_final = new javax.swing.JComboBox<>();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_inicioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha inicio:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha final:");

        button2.setLabel("Cancelar");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button1.setLabel("Generar excel");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Reporte");
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
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(281, 281, 281))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_final, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(622, 622, 622)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lista_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        estado = true;
        terminar = true;
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        int start,end, bakup;
        
        start = Lista_inicio.getSelectedIndex();
        
        end = Lista_final.getSelectedIndex();
        
        if(start>end)
        {
            
            bakup = start;
            start = end;
            end = bakup;
        }
        
        ArrayList<Producto> imprimir = new ArrayList<>();
        ArrayList<String> imprimirfechas = new ArrayList<>();
        
        for(int i=start; i<=end; i++)
        {
            
            
            
            for(int j=0; j<reportes.get(i).getProducto().size(); j++)
            {
                
                imprimir.add(reportes.get(i).getproducto(j));
                
                if(reportes.get(i).dia==0 & reportes.get(i).mes==0 & reportes.get(i).año==0)
                {
                    imprimirfechas.add("hoy");
                }
                else
                {
                    imprimirfechas.add(reportes.get(i).getfecha());
                }
                
                
            }
        }
        
        
        
        
        
        
        Workbook libro = new XSSFWorkbook();
        
        Sheet hoja = libro.createSheet("Hoja 1");
        String nombreArchivo = "Reporte.xlsx";
        Row primeraFila = hoja.createRow(0);
        
        Cell ceroCelda = primeraFila.createCell(0);
        Cell primeraCelda = primeraFila.createCell(1);
        Cell segundaCelda = primeraFila.createCell(2);
        Cell terceraCelda = primeraFila.createCell(3);
        Cell cuartaCelda = primeraFila.createCell(4);
        Cell quintaCelda = primeraFila.createCell(5);
        
        ceroCelda.setCellValue("Factura");
        primeraCelda.setCellValue("Nombre");
        segundaCelda.setCellValue("Cantidad");
        terceraCelda.setCellValue("Venta");
        cuartaCelda.setCellValue("VentaTotal");
        quintaCelda.setCellValue("Ganancia");
       
        estado = true;
        
        JFileChooser pat = new JFileChooser();
        
        seleccion = pat.showOpenDialog(null);
     
        
        
        int Total=0, indicador=0;
        
        if(seleccion == JFileChooser.APPROVE_OPTION)
        {
            terminar=true;
            
            nombreArchivo = pat.getSelectedFile().getAbsolutePath()+".xlsx";
            
            for(int i=0; i<imprimir.size(); i++)
            {

                Row Filas = hoja.createRow(i+1);

                Cell a = Filas.createCell(0);
                Cell b = Filas.createCell(1);
                Cell c = Filas.createCell(2);
                Cell d = Filas.createCell(3);
                Cell e = Filas.createCell(4);
                Cell f = Filas.createCell(5);
                Cell g = Filas.createCell(6);

                a.setCellValue(imprimir.get(i).getfactura());
                b.setCellValue(imprimir.get(i).getnombre3());
                c.setCellValue(imprimir.get(i).getCantidad());
                d.setCellValue(imprimir.get(i).getPrecio());
                e.setCellValue(imprimir.get(i).getPrecio()*imprimir.get(i).getCantidad());
                f.setCellValue(imprimir.get(i).getPrecio()*imprimir.get(i).getCantidad()-imprimir.get(i).getpreciocosto()*imprimir.get(i).getCantidad());

                if(imprimirfechas.size()<i)
                {

                }
                else
                {
                    g.setCellValue((imprimirfechas.get(i)));
                }


                Total=Total+imprimir.get(i).getPrecio()*imprimir.get(i).getCantidad()-imprimir.get(i).getpreciocosto()*imprimir.get(i).getCantidad();

                indicador=i;

            }

            Row y = hoja.createRow(indicador+3);

            Cell x = y.createCell(5);
            Cell ind = y.createCell(4);

            x.setCellValue(Total);
            ind.setCellValue("Total:");

            File directorioActual = new File(".");
            String ubicacion = directorioActual.getAbsolutePath();
            String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nombreArchivo;
            FileOutputStream outputStream;

            try 
            {
                outputStream = new FileOutputStream(nombreArchivo);
                libro.write(outputStream);
                libro.close();
                System.out.println("Libro guardado correctamente");
            } 
            catch (FileNotFoundException ex) 
            {
                System.out.println("Error de filenotfound");
            } 
            catch (IOException ex) 
            {
                System.out.println("Error de IOException");
            }
            
        }
        else
        {
            
        }
        
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void Lista_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lista_inicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        estado = true;
        estado2 = true;
        terminar = true;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Reporte_Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Excel().setVisible(true);
            }
        });
    }

    public void setComboboxes(ArrayList<Registro> registros2)
    {
        
        this.reportes = registros2;
        update();
        
    }    
    
    public void update()
    {
        if(reportes.isEmpty())
        {
            
        }
        else
        {
            
            for(int i=0; i<reportes.size(); i++)
            {
                if(reportes.get(i).dia==0 & reportes.get(i).mes==0 & reportes.get(i).año==0)
                {
                    
                    Lista_inicio.addItem("hoy");
                    Lista_final.addItem("hoy");
                    for(int j=0; j<reportes.get(i).getProducto().size(); j++)
                    {
                        this.fechas.add("hoy");
                    }
                    
                    
                    
                }
                else
                {
                    Lista_inicio.addItem(reportes.get(i).getfecha());
                    Lista_final.addItem(reportes.get(i).getfecha());
                    
                    for(int j=0; j<reportes.get(i).getProducto().size(); j++)
                    {
                        this.fechas.add(reportes.get(i).getfecha());
                    }
                    
                    
                    
                }
                
            }
        }
        
        
        
    }
    
    public void Fondodemenu()
    {
        jPanelImage mImage = new jPanelImage(jPanel1,"/a.jpeg");
        jPanel1.add(mImage).repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lista_final;
    private javax.swing.JComboBox<String> Lista_inicio;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

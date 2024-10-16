
package packag.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Inventario extends javax.swing.JFrame {

    
    public Inventario() {
        initComponents();
    }

    int seleccion=0;
    
    boolean estado = false ,terminar=false;
    
    ArrayList<Categoria> categoria = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        Lista_categoria = new javax.swing.JComboBox<>();
        Lista_Producto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        Lista_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_categoriaActionPerformed(evt);
            }
        });

        Lista_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_ProductoActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Filtrar poca cantidad");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Lista_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(Lista_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(605, 605, 605)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lista_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Lista_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_ProductoActionPerformed
        
    }//GEN-LAST:event_Lista_ProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        estado = true;
        terminar = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Lista_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_categoriaActionPerformed
        Lista_Producto.removeAllItems();
        
        if(categoria.isEmpty())
        {
            
        }
        else
        {
            for(int i=0; i<categoria.get(Lista_categoria.getSelectedIndex()).getProductosize(); i++)
            {
                
                Lista_Producto.addItem(categoria.get(Lista_categoria.getSelectedIndex()).getProducto(i).getNombre());

            }
        }
    }//GEN-LAST:event_Lista_categoriaActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Workbook libro = new XSSFWorkbook();
        final String nombreArchivo = "Inventario.xlsx";
        Sheet hoja = libro.createSheet("Hoja 1");
        
        Row primeraFila = hoja.createRow(0);
        
        Cell ceroCelda = primeraFila.createCell(0);
        Cell primeraCelda = primeraFila.createCell(1);
        Cell segundaCelda = primeraFila.createCell(2);
        Cell cuartaCelda = primeraFila.createCell(3);
        
        ceroCelda.setCellValue("Categoria");
        primeraCelda.setCellValue("Nombre");
        segundaCelda.setCellValue("Cantidad");
        cuartaCelda.setCellValue("Venta");
       
        ArrayList<String> nombreCategorias = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        
        estado = true;
        
        JFileChooser pat = new JFileChooser();
        
        seleccion = pat.showOpenDialog(null);
        
        if(seleccion == JFileChooser.APPROVE_OPTION)
        {
            
            terminar=true;
            
            for(int i=0; i<categoria.size(); i++)
            {
                for(int j=0; j<categoria.get(i).getProductosize(); j++)
                {
                    productos.add(categoria.get(i).getProducto(j));
                    nombreCategorias.add(categoria.get(i).getNombre());
                }

            }

            for(int i=0; i<productos.size(); i++)
            {

                Row Filas = hoja.createRow(i+1); 

                Cell a = Filas.createCell(0);
                Cell b = Filas.createCell(1);
                Cell c = Filas.createCell(2);
                Cell e = Filas.createCell(3);

                a.setCellValue(nombreCategorias.get(i));
                b.setCellValue(productos.get(i).getnombre3());
                c.setCellValue(productos.get(i).getCantidad());
                e.setCellValue(productos.get(i).getPrecio());

            }

            String ubicacionArchivoSalida = pat.getSelectedFile().getPath()+".xlsx";
            FileOutputStream outputStream;

            try 
            {
                outputStream = new FileOutputStream(ubicacionArchivoSalida);
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
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
     
     if(Lista_categoria.isVisible())
     {
         for(int i=0; i<categoria.size(); i++)
         {
             for(int j=0; j<categoria.get(i).getProductos().size(); j++)
             {
                 
                 if(categoria.get(i).getProducto(j).getCantidad()<=2)
                 {
                     jComboBox1.addItem(categoria.get(i).getProducto(j).getNombreYCantidad());
                 }
             }
         }
         
         jComboBox1.setVisible(true);
         jButton2.setVisible(false);
         Lista_categoria.setVisible(false);
         Lista_Producto.setVisible(false);
     }
     else
     {
         jComboBox1.setVisible(false);
         jButton2.setVisible(true);
         Lista_categoria.setVisible(true);
         Lista_Producto.setVisible(true);
         
     }
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    public void setCategoria(ArrayList<Categoria> categoria)
    {
        this.categoria = categoria;
        
        jComboBox1.setVisible(false);
        
        for(int i=0; i<categoria.size(); i++)
        {
            Lista_categoria.addItem(categoria.get(i).getNombre()+" "+"("+categoria.get(i).getProductosize()+")");
            
        }
    }
    
    public void Fondodemenu()
    {
        jPanelImage mImage = new jPanelImage(jPanel1,"/a.jpeg");
        jPanel1.add(mImage).repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lista_Producto;
    private javax.swing.JComboBox<String> Lista_categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

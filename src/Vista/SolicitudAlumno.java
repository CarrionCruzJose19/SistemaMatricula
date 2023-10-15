package Vista;
import Modelo.*;
import LAL.ListaEnlazada;
import LAL.Nodo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class SolicitudAlumno extends javax.swing.JFrame {
DefaultTableModel model;
    ListaEnlazada listaEnlazada; 
    
    public SolicitudAlumno() {
        initComponents();
        model = (DefaultTableModel) jtblListaEstudiante.getModel();
        listaEnlazada = new ListaEnlazada();
        cargarProductosEnTabla();
    }
    
    private void cargarProductosEnTabla() {
    // Obtener el primer nodo de la lista enlazada
    Nodo nodoActual = listaEnlazada.cabeza;

    // Limpiar la tabla antes de cargar los productos
    model.setRowCount(0);

    // Recorrer la lista enlazada y agregar los productos a la tabla
        while (nodoActual != null) {
            Alumno alumno = nodoActual.obtenerValor();
            String cod = alumno.getCodigo();
            String nom = alumno.getNombre();
            String ape = alumno.getApellido();
            String dn = alumno.getDni();
            LocalDate Fechana = alumno.getFechanac();
            String num = alumno.getNumero();
            // Agregar el producto a la tabla
            model.addRow(new Object[]{cod, nom, ape,dn, Fechana,num});
            // Mover al siguiente nodo
            nodoActual = nodoActual.obtenerSiguiente();
        }
    }
    
    
    
    private void agregarAlumno() {
        String nombres = jtxtNombres.getText();
        String apellidos = jtxtApellido.getText();
        String dni = jtxtDni.getText();
        String fechaTexto = jtxtFechanac.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define el formato de fecha esperado
        LocalDate fechaNacimiento;
        try {
       fechaNacimiento = LocalDate.parse(fechaTexto, formatter);
        } catch (DateTimeParseException e) {
        fechaNacimiento = null;
        }
        String numero = jtxtTelefono.getText();
        
        // Crear un objeto Alumno sin proporcionar manualmente un código
        Alumno nuevoAlumno = new Alumno(null, nombres, apellidos, dni, fechaNacimiento, numero);
        // Agregar el alumno a la lista enlazada
        listaEnlazada.añadirAlumno(nuevoAlumno);
        
        // Agregar el alumno a la tabla
        model.addRow(new Object[]{nuevoAlumno.getCodigo(), nombres, apellidos ,dni, fechaNacimiento , numero});
    }
    
    public void LimpiarEntradas(){
        jtxtNombres.setText("");
        jtxtApellido.setText("");
        jtxtDni.setText("");
        jtxtFechanac.setText("");
        jtxtTelefono.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnRegistrarEstudiante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        jtxtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtFechanac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblListaEstudiante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matricula", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrarEstudiante.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegistrarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarEstudiante.setText("REGISTRAR");
        jbtnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDOS");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 40));
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 30));
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TELEFONO");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 40));
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 30));
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, 40));
        jPanel1.add(jtxtFechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NACIMIENTO");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información del Alumno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 590, 50));

        jtblListaEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jtblListaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Dni", "Nacimiento", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblListaEstudiante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 590, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarEstudianteActionPerformed
    agregarAlumno();
    LimpiarEntradas();

    }//GEN-LAST:event_jbtnRegistrarEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitudAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnRegistrarEstudiante;
    private javax.swing.JTable jtblListaEstudiante;
    public javax.swing.JTextField jtxtApellido;
    public javax.swing.JTextField jtxtDni;
    public javax.swing.JTextField jtxtFechanac;
    public javax.swing.JTextField jtxtNombres;
    public javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}

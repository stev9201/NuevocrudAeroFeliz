package com.mycompany.proyectoaerofeliz.igu;
import com.mycompany.proyectoaerofeliz.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Controladora control = new Controladora(); // Instancia para conectar nuestra Igu con la logica
            
    
    public Principal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabAgenciaDeViajesAerofeliz = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabIngreseLosDatos = new javax.swing.JLabel();
        LabTelefono = new javax.swing.JLabel();
        LabCorreo = new javax.swing.JLabel();
        LabMensaje = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        LabImagenLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtMensaje = new javax.swing.JTextArea();
        LabNcionales = new javax.swing.JLabel();
        LabInternacionales = new javax.swing.JLabel();
        cmbNacionales = new javax.swing.JComboBox<>();
        cmbInternacionales = new javax.swing.JComboBox<>();
        BtnEnviar = new javax.swing.JButton();
        LabImagen = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LabAgenciaDeViajesAerofeliz.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        LabAgenciaDeViajesAerofeliz.setText("Agencia de Viajes Aerofeliz");

        jPanel3.setBackground(new java.awt.Color(219, 235, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(""), javax.swing.BorderFactory.createTitledBorder("")));

        LabIngreseLosDatos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LabIngreseLosDatos.setText("Ingrese los datos");

        LabTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabTelefono.setText("Teléfono:");

        LabCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabCorreo.setText("Correo Electronico:");

        LabMensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabMensaje.setText("Mensaje:");

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        LabImagenLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ProyectoAerofeliz\\logo_agencia.jpg")); // NOI18N

        TxtMensaje.setColumns(20);
        TxtMensaje.setRows(5);
        jScrollPane1.setViewportView(TxtMensaje);

        LabNcionales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabNcionales.setText("Nacionales");

        LabInternacionales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabInternacionales.setText("Internacionales");

        cmbNacionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "San Andres", "Santa Marta", "Eje Cafetero", "Cartagena" }));
        cmbNacionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNacionalesActionPerformed(evt);
            }
        });

        cmbInternacionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Aruba", "Punta Cana", "Cancun" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(LabIngreseLosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LabMensaje)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabTelefono, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabInternacionales)
                                            .addComponent(LabNcionales))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbInternacionales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbNacionales, 0, 106, Short.MAX_VALUE)))
                                    .addComponent(TxtCorreo))
                                .addGap(5, 5, 5)))
                        .addComponent(LabImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(LabIngreseLosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LabTelefono)
                        .addGap(1, 1, 1)
                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabNcionales)
                            .addComponent(cmbNacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabInternacionales)
                            .addComponent(cmbInternacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        BtnEnviar.setText("Enviar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        LabImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\ProyectoAerofeliz\\callCenter.jpg")); // NOI18N

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabAgenciaDeViajesAerofeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabImagen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(BtnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabAgenciaDeViajesAerofeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEnviar)
                    .addComponent(BtnLimpiar))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed

       String telefono = TxtTelefono.getText(); // variables auxiliares
       String correo = TxtCorreo.getText(); // variables auxiliares
       String mensaje = TxtMensaje.getText(); // variables auxiliares
       String nacionales = (String) cmbNacionales.getSelectedItem(); // para los combos tener en cuenta que al declarar toda la variable nosm arrojara un error ya que nos devuelve un objeto, debemos seleccionar la sugerencia STRING para que no la devualva en tipo texto
       String internacionales = (String) cmbInternacionales.getSelectedItem(); //aca igual como es un combo seleccionamos alt + enter y seleccionamos String
               
        control.Enviar(telefono, correo, mensaje, nacionales, internacionales); // Se le pasan todos los parametros a nuestra controladora esta marca un error por que aun no existe un metodo a lo que al seleccionar el error se nos brindara la opcion de crear el metodo
        
        
        //Con esta opcion vamos a imprimir un mensaje en pantalla al enviar los datos que diga que se enviaron satisfactoriamente:
        JOptionPane optionPane = new JOptionPane("Los datos fueron cargados Exitosamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Envio Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void cmbNacionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNacionalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNacionalesActionPerformed
    // Boton Limpiar, con este boton se limpiara toda la informacion diligenciada en nuestro Form
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtTelefono.setText(""); //Limpiar Nombre del txtTelefono,el metodo SetText significa Setear Texto y la dobe comilla significa que lo va a dejar vacio.
        TxtCorreo.setText(""); //Limpiar Correo
        TxtMensaje.setText(""); // Limpiar Mensaje
        cmbInternacionales.setSelectedIndex(0); // Con los combos es cmb, como los combos trabajan con indices por ejemplo en este caso tenemos la primera opcion que es seleccionar y las demas los destinos, podemos usar el metodo Index(indices) (setSelectedIndex) de esta manera al colocar (0)le estamos indicando que regrece a la opcion 0.
        cmbNacionales.setSelectedIndex(0);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JLabel LabAgenciaDeViajesAerofeliz;
    private javax.swing.JLabel LabCorreo;
    private javax.swing.JLabel LabImagen;
    private javax.swing.JLabel LabImagenLogo;
    private javax.swing.JLabel LabIngreseLosDatos;
    private javax.swing.JLabel LabInternacionales;
    private javax.swing.JLabel LabMensaje;
    private javax.swing.JLabel LabNcionales;
    private javax.swing.JLabel LabTelefono;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextArea TxtMensaje;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JComboBox<String> cmbInternacionales;
    private javax.swing.JComboBox<String> cmbNacionales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

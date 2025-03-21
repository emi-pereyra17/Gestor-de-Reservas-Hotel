package com.mycompany.hoteleria.igu;

import com.mycompany.hoteleria.Cliente;
import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.controladora.Controladora;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class datosReserva extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public datosReserva() {
        initComponents();
        cargarCbx();
    }

    private void cargarCbx() {
        List<Cliente> listaClientes = control.traerClientes();
        cbxClientesAsociados.removeAllItems();

        for (Cliente cliente : listaClientes) {
            cbxClientesAsociados.addItem(cliente);
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
        jLabel7 = new javax.swing.JLabel();
        btnContinuarReserva = new javax.swing.JButton();
        cbxTipoHabitacion = new javax.swing.JComboBox<>();
        cbxPreferencias = new javax.swing.JComboBox<>();
        cbxEstadoReserva = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxClientesAsociados = new javax.swing.JComboBox<>();
        txtCheckIn = new javax.swing.JFormattedTextField();
        txtCheckOut = new javax.swing.JFormattedTextField();
        txtCantHuespedes = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel1.setText("Fecha Check-In:");

        jLabel2.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel2.setText("Fecha Check-Out:");

        jLabel3.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel3.setText("Cant. Huespedes:");

        jLabel4.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel4.setText("Tipo Habitación:");

        jLabel5.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel5.setText("Preferencias:");

        jLabel6.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel6.setText("Estado de reserva:");

        jLabel7.setFont(new java.awt.Font("Graphik Regular", 1, 24)); // NOI18N
        jLabel7.setText("Datos Reserva");

        btnContinuarReserva.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        btnContinuarReserva.setText("Continuar -->");
        btnContinuarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarReservaActionPerformed(evt);
            }
        });

        cbxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIMPLE", "DOBLE", "SUIT" }));

        cbxPreferencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "CAMA MATRIMONIAL", "CON VISTA", "ACCESIBILIDAD" }));

        cbxEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "CONFIRMADA", "CANCELADA" }));

        jLabel8.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel8.setText("Cliente asociado: ");

        cbxClientesAsociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientesAsociadosActionPerformed(evt);
            }
        });

        try {
            txtCheckIn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCheckOut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCantHuespedes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPreferencias, 0, 281, Short.MAX_VALUE)
                            .addComponent(cbxEstadoReserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCheckIn)
                            .addComponent(txtCheckOut)
                            .addComponent(txtCantHuespedes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxClientesAsociados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContinuarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCantHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(cbxClientesAsociados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarReservaActionPerformed

        if (txtCheckOut.getText() == "" || txtCheckIn.getText() == "" || txtCantHuespedes.getText() == "") {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = (Cliente) cbxClientesAsociados.getSelectedItem();
            String checkout = txtCheckOut.getText();
            String checkin = txtCheckIn.getText();
            int cantHuespedes = Integer.parseInt(txtCantHuespedes.getText());
            String tipoHabitacion = (String) cbxTipoHabitacion.getSelectedItem();
            String preferencias = (String) cbxPreferencias.getSelectedItem();
            String estadoReserva = (String) cbxEstadoReserva.getSelectedItem();

            Reserva reserva = new Reserva();
            reserva.setCliente(cliente);
            reserva.setCheckout(checkout);
            reserva.setCheckin(checkin);
            reserva.setCantHuespedes(cantHuespedes);
            reserva.setTipoHabitacion(tipoHabitacion);
            reserva.setPreferencias(preferencias);
            reserva.setEstadoReserva(estadoReserva);

            control.crearReserva(reserva);
            
            JOptionPane.showMessageDialog(null, "Reserva completada correctamente!", "Finalizar", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
            menuPrincipal menuprincipal = new menuPrincipal();
            menuprincipal.setVisible(true);
            menuprincipal.setLocationRelativeTo(null);
        }


    }//GEN-LAST:event_btnContinuarReservaActionPerformed

    private void cbxClientesAsociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesAsociadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClientesAsociadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarReserva;
    private javax.swing.JComboBox<Cliente> cbxClientesAsociados;
    private javax.swing.JComboBox<String> cbxEstadoReserva;
    private javax.swing.JComboBox<String> cbxPreferencias;
    private javax.swing.JComboBox<String> cbxTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField txtCantHuespedes;
    private javax.swing.JFormattedTextField txtCheckIn;
    private javax.swing.JFormattedTextField txtCheckOut;
    // End of variables declaration//GEN-END:variables
}

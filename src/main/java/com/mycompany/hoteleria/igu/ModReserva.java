
package com.mycompany.hoteleria.igu;

import com.mycompany.hoteleria.Cliente;
import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.controladora.Controladora;
import java.util.List;
import javax.swing.JOptionPane;


public class ModReserva extends javax.swing.JFrame {

    Controladora control = null;
    Reserva reserva = new Reserva();
    
    public ModReserva(int idReserva) {
        control = new Controladora();
        initComponents();
        cargarCbx();
        cargarReservaDatos(idReserva);
    }
    private void cargarCbx() {
        List<Cliente> listaClientes = control.traerClientes();
        cbxClientesAsociadosMod.removeAllItems();

        for (Cliente cliente : listaClientes) {
            cbxClientesAsociadosMod.addItem(cliente);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantHuespedesMod = new javax.swing.JTextField();
        btnContinuarReservaMod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoHabitacionMod = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxPreferenciasMod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxEstadoReservaMod = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxClientesAsociadosMod = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCheckInMod = new javax.swing.JTextField();
        txtCheckOutMod = new javax.swing.JTextField();
        btnVolverMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCantHuespedesMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantHuespedesModActionPerformed(evt);
            }
        });

        btnContinuarReservaMod.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        btnContinuarReservaMod.setText("Modificar");
        btnContinuarReservaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarReservaModActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel1.setText("Fecha Check-In:");

        cbxTipoHabitacionMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIMPLE", "DOBLE", "SUIT" }));

        jLabel2.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel2.setText("Fecha Check-Out:");

        cbxPreferenciasMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "CAMA MATRIMONIAL", "CON VISTA", "ACCESIBILIDAD" }));

        jLabel3.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel3.setText("Cant. Huespedes:");

        cbxEstadoReservaMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "CONFIRMADA", "CANCELADA" }));

        jLabel4.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel4.setText("Tipo Habitación:");

        jLabel8.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel8.setText("Cliente asociado: ");

        jLabel5.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel5.setText("Preferencias:");

        cbxClientesAsociadosMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientesAsociadosModActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Graphik Regular", 0, 18)); // NOI18N
        jLabel6.setText("Estado de reserva:");

        jLabel7.setFont(new java.awt.Font("Graphik Regular", 1, 24)); // NOI18N
        jLabel7.setText("Datos Reserva");

        btnVolverMod.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        btnVolverMod.setText("<-- Volver");
        btnVolverMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnVolverMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(txtCheckInMod)
                                    .addComponent(txtCheckOutMod)
                                    .addComponent(txtCantHuespedesMod)
                                    .addComponent(cbxTipoHabitacionMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPreferenciasMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxEstadoReservaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxClientesAsociadosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnContinuarReservaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnVolverMod))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCheckInMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCheckOutMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantHuespedesMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipoHabitacionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxPreferenciasMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEstadoReservaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuarReservaMod, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(cbxClientesAsociadosMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantHuespedesModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantHuespedesModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantHuespedesModActionPerformed

    private void btnContinuarReservaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarReservaModActionPerformed

        if (txtCheckOutMod.getText() == "" || txtCheckInMod.getText() == "" || txtCantHuespedesMod.getText() == "") {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = (Cliente) cbxClientesAsociadosMod.getSelectedItem();
            String checkout = txtCheckOutMod.getText();
            String checkin = txtCheckInMod.getText();
            int cantHuespedes = Integer.parseInt(txtCantHuespedesMod.getText());
            String tipoHabitacion = (String) cbxTipoHabitacionMod.getSelectedItem();
            String preferencias = (String) cbxPreferenciasMod.getSelectedItem();
            String estadoReserva = (String) cbxEstadoReservaMod.getSelectedItem();
            
            control.modificarReserva(reserva, cliente, checkout, checkin, cantHuespedes, tipoHabitacion, preferencias, estadoReserva);

            JOptionPane.showMessageDialog(null, "Reserva modificada correctamente!", "Modificar", JOptionPane.INFORMATION_MESSAGE);

            this.dispose();

            menuPrincipal menuprincipal = new menuPrincipal();
            menuprincipal.setVisible(true);
            menuprincipal.setLocationRelativeTo(null);
        }

    }//GEN-LAST:event_btnContinuarReservaModActionPerformed

    private void cbxClientesAsociadosModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesAsociadosModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClientesAsociadosModActionPerformed

    private void btnVolverModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverModActionPerformed
        listaHospedajes listahospedajes = new listaHospedajes();
        listahospedajes.setVisible(true);
        listahospedajes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarReservaMod;
    private javax.swing.JButton btnVolverMod;
    private javax.swing.JComboBox<Cliente> cbxClientesAsociadosMod;
    private javax.swing.JComboBox<String> cbxEstadoReservaMod;
    private javax.swing.JComboBox<String> cbxPreferenciasMod;
    private javax.swing.JComboBox<String> cbxTipoHabitacionMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCantHuespedesMod;
    private javax.swing.JTextField txtCheckInMod;
    private javax.swing.JTextField txtCheckOutMod;
    // End of variables declaration//GEN-END:variables

    private void cargarReservaDatos(int idReserva) {
        reserva = control.traerReserva(idReserva);
        txtCheckInMod.setText(reserva.getCheckin());
        txtCheckOutMod.setText(reserva.getCheckout());
        txtCantHuespedesMod.setText(String.valueOf(reserva.getCantHuespedes()));
        cbxTipoHabitacionMod.setSelectedItem(reserva.getTipoHabitacion());
        cbxPreferenciasMod.setSelectedItem(reserva.getPreferencias());
        cbxEstadoReservaMod.setSelectedItem(reserva.getEstadoReserva());
        
    }
}

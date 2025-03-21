package com.mycompany.hoteleria.igu;

import com.mycompany.hoteleria.Reserva;
import com.mycompany.hoteleria.controladora.Controladora;
import static java.awt.SystemColor.control;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listaHospedajes extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public listaHospedajes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEliminarHospedaje = new javax.swing.JButton();
        btnModificarHospedaje = new javax.swing.JButton();
        btnVolverLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Graphik Regular", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Hospedajes");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnEliminarHospedaje.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        btnEliminarHospedaje.setText("Eliminar");
        btnEliminarHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHospedajeActionPerformed(evt);
            }
        });

        btnModificarHospedaje.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        btnModificarHospedaje.setText("Modificar");
        btnModificarHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHospedajeActionPerformed(evt);
            }
        });

        btnVolverLista.setFont(new java.awt.Font("Graphik Regular", 0, 14)); // NOI18N
        btnVolverLista.setText("<-- Volver");
        btnVolverLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarHospedaje, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnVolverLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnEliminarHospedaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarHospedaje)
                        .addGap(95, 95, 95)
                        .addComponent(btnVolverLista)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHospedajeActionPerformed
        if (tabla.getRowCount() > 0) {
            if (tabla.getSelectedRow() != -1) {
                int idReserva = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                control.borrarReserva(idReserva);
                JOptionPane.showMessageDialog(null, "Reserva eliminada correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No seleccionó un registro para modificar", "Error al modificar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error al modificar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarHospedajeActionPerformed

    private void btnModificarHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHospedajeActionPerformed
        if (tabla.getRowCount() > 0) {
            if (tabla.getSelectedRow() != -1) {
                int idReserva = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                ModReserva modif = new ModReserva(idReserva);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                
                this.dispose();
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No seleccionó un registro para modificar", "Error al modificar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error al modificar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarHospedajeActionPerformed

    private void btnVolverListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverListaActionPerformed
       menuPrincipal menu = new menuPrincipal();
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnVolverListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarHospedaje;
    private javax.swing.JButton btnModificarHospedaje;
    private javax.swing.JButton btnVolverLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        String titulos[] = {"Reserva ID", "Cliente ID", "Cliente Nombre", "Estado", "Tipo de habitación", "Cant. Huespedes", "Fec. CheckIn", "Fec. CheckOut", "Preferencias"};
        modeloTabla.setColumnIdentifiers(titulos);
        tabla.setModel(modeloTabla);

        List<Reserva> listaReservas = control.traerReservas();

        if (listaReservas != null) {
            for (Reserva reserva : listaReservas) {
                Object[] objeto = {reserva.getId(), reserva.getCliente().getId(), reserva.getCliente().getNombre(), reserva.getEstadoReserva(), reserva.getTipoHabitacion(), reserva.getCantHuespedes(), reserva.getCheckin(), reserva.getCheckout(), reserva.getPreferencias()};
                modeloTabla.addRow(objeto);
            }
        }
    }
}

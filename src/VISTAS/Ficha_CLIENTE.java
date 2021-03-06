/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;
import static VISTAS.Menu_PRINCIPAL_VETERINARIA.escritorio;
import java.util.List;

import veterinaria_MODELO.Mascota;

/**
 *
 * @author Barbara
 */
public class Ficha_CLIENTE extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ficha_CLIENTE
     */
    public Ficha_CLIENTE() {
        initComponents();

        // inicio la funcion de validacion de campos para el formulario
        validacionDeCampos();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel(){
            String str="/IMAGENES/fondo_cliente.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(str));
            Image image = icon.getImage();

            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }
        };
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlDNI = new javax.swing.JLabel();
        jlN_DE_CLIENTE = new javax.swing.JLabel();
        jlNOMBRE = new javax.swing.JLabel();
        jlCONTACTO_ALTERNATIVO = new javax.swing.JLabel();
        jlAPELLIDO2 = new javax.swing.JLabel();
        jlDIRECCION1 = new javax.swing.JLabel();
        jlTELEFONO1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jrbACTIVO = new javax.swing.JRadioButton();
        jLMascotasASuCargo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLSalir = new javax.swing.JLabel();
        jLAgregarCliente = new javax.swing.JLabel();
        jLBorrarCliente = new javax.swing.JLabel();
        jLModificarCliente = new javax.swing.JLabel();
        jLBuscarCliente = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLAgregarMascota = new javax.swing.JLabel();
        jLLimpiar = new javax.swing.JLabel();
        jtexto_Apellido = new javax.swing.JTextField();
        jtexto_Nombre = new javax.swing.JTextField();
        jtexto_Direccion = new javax.swing.JTextField();
        jtexto_ContactoA = new javax.swing.JTextField();
        jtexto_Telefono = new javax.swing.JTextField();
        jltexto_dni = new javax.swing.JTextField();
        jltexto_n_cliente = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 580, 10));

        jlDNI.setBackground(new java.awt.Color(255, 255, 255));
        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(255, 255, 255));
        jlDNI.setText("DNI :");
        jPanel1.add(jlDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jlN_DE_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlN_DE_CLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jlN_DE_CLIENTE.setText("N??  de Cliente:");
        jPanel1.add(jlN_DE_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jlNOMBRE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jlNOMBRE.setText("Nombre: ");
        jPanel1.add(jlNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 20));

        jlCONTACTO_ALTERNATIVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCONTACTO_ALTERNATIVO.setForeground(new java.awt.Color(255, 255, 255));
        jlCONTACTO_ALTERNATIVO.setText("Contacto Alternativo: ");
        jPanel1.add(jlCONTACTO_ALTERNATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, 20));

        jlAPELLIDO2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAPELLIDO2.setForeground(new java.awt.Color(255, 255, 255));
        jlAPELLIDO2.setText("Apellido: ");
        jPanel1.add(jlAPELLIDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 20));

        jlDIRECCION1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDIRECCION1.setForeground(new java.awt.Color(255, 255, 255));
        jlDIRECCION1.setText("Direccion:");
        jPanel1.add(jlDIRECCION1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 70, 20));

        jlTELEFONO1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTELEFONO1.setForeground(new java.awt.Color(255, 255, 255));
        jlTELEFONO1.setText("Telefono:");
        jPanel1.add(jlTELEFONO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 70, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 590, 20));

        jrbACTIVO.setBackground(new java.awt.Color(255, 255, 255));
        jrbACTIVO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbACTIVO.setText("Activo");
        jrbACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jrbACTIVO.setEnabled(false);
        jPanel1.add(jrbACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 70, 20));

        jLMascotasASuCargo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLMascotasASuCargo.setForeground(new java.awt.Color(51, 0, 204));
        jLMascotasASuCargo.setText("MASCOTAS A SU CARGO :");
        jPanel1.add(jLMascotasASuCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 350, 70));

        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/close.png"))); // NOI18N
        jLSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jLSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 60, 50));

        jLAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/add.png"))); // NOI18N
        jLAgregarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, 50));

        jLBorrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/delete.png"))); // NOI18N
        jLBorrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBorrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBorrarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, 50));

        jLModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edit.png"))); // NOI18N
        jLModificarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 60, 50));

        jLBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search.png"))); // NOI18N
        jLBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 50));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, -1));

        jLAgregarMascota.setText("Agregar Mascota");
        jPanel1.add(jLAgregarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        jLLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clear.png"))); // NOI18N
        jLLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(jLLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 50));
        jPanel1.add(jtexto_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));
        jPanel1.add(jtexto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, -1));
        jPanel1.add(jtexto_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, -1));
        jPanel1.add(jtexto_ContactoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 290, -1));
        jPanel1.add(jtexto_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 210, -1));
        jPanel1.add(jltexto_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 140, -1));

        jltexto_n_cliente.setEnabled(false);
        jPanel1.add(jltexto_n_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarClienteMouseClicked
        int result = JOptionPane.showOptionDialog(this, "Buscar Cliente:", "Buscar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Por N?? de Cliente", "Por DNI"}, "");

        if (result == 0) {

            String clienteN = JOptionPane.showInputDialog(this, "Ingrese el numero de cliente");

            // el n?? existe que lo busque
            if (clienteN != null) {

                Cliente encontrado = Menu_PRINCIPAL_VETERINARIA.cd.buscarCliente(Integer.parseInt(clienteN));

                if (encontrado != null) {
                    rellenarCampos(encontrado);

                } else {

                    JOptionPane.showInputDialog(this, "Cliente no encontrado, verifique el numero de cliente o agregue un nuevo cliente");
                    jltexto_n_cliente.requestFocus();

                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ingreso ningun numero de cliente");
            }

        } else if (result == 1) {

            String clienteDNI = JOptionPane.showInputDialog(this, "Ingrese el numero de DNI");
            if (clienteDNI != null) {
                Cliente encontrado = Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Integer.parseInt(clienteDNI));
                if (encontrado != null) {
                    System.out.println(encontrado.toString());
                    rellenarCampos(encontrado);
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente no encontrado, verifique el numero de DNI o agregue un nuevo cliente");
                    jltexto_n_cliente.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ingreso ningun numero de DNI");
            }

        }


    }//GEN-LAST:event_jLBuscarClienteMouseClicked


    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jLLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jLLimpiarMouseClicked

    private void jLAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarClienteMouseClicked
        int result = JOptionPane.showOptionDialog(this, "??Crear un cliente nuevo con los valores del formulario o limpiar y agregar nuevos valores?", "Agregar cliente nuevo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, "");
        if (result == 0) {
            // crear un nuevo cliente
            if (revisarCampos()) {
                Cliente nuevoCliente = crearClienteDesdeForm();
                nuevoCliente.setActivo(true);
                if (Menu_PRINCIPAL_VETERINARIA.cd.buscarClientexDNI(Long.parseLong(jltexto_dni.getText())) == null) {
                    Menu_PRINCIPAL_VETERINARIA.cd.agregarCliente(nuevoCliente);
                    JOptionPane.showMessageDialog(this, "Cliente agregado con exito");
                    // rellenar id cliente con nuevoCliente.getIdCliente()
                    jltexto_n_cliente.setText(String.valueOf(nuevoCliente.getId_cliente()));
                } else {
                    JOptionPane.showMessageDialog(this, "El DNI: " + jltexto_dni.getText() + " ya existe en la base de datos");
                }

            }
        } else if (result == 1) {
            // limpiar campos
            limpiarCampos();
        }
    }//GEN-LAST:event_jLAgregarClienteMouseClicked

    private void jLBorrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorrarClienteMouseClicked
        if(!jltexto_n_cliente.getText().isEmpty()){
            
        }
    }//GEN-LAST:event_jLBorrarClienteMouseClicked

    private Cliente crearClienteDesdeForm() {
        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setNombreD(jtexto_Nombre.getText());
        nuevoCliente.setApellido(jtexto_Apellido.getText());
        nuevoCliente.setDni(Integer.parseInt(jltexto_dni.getText()));
        nuevoCliente.setDireccion(jtexto_Direccion.getText());
        nuevoCliente.setTelefono(jtexto_Telefono.getText());
        nuevoCliente.setContactoA(jtexto_ContactoA.getText());
        return nuevoCliente;
    }

    private boolean revisarCampos() {
        if (jtexto_Nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre esta vacio");
            jtexto_Nombre.requestFocus();
            return false;
        } else if (jtexto_Direccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Direccion esta vacio");
            jtexto_Direccion.requestFocus();
            return false;
        } else if (jtexto_ContactoA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Contacto alternativo esta vacio");
            jtexto_ContactoA.requestFocus();
            return false;
        } else if (jtexto_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Telefono esta vacio");
            jtexto_Telefono.requestFocus();
            return false;
        } else if (jltexto_dni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo DNI esta vacio");
            jltexto_dni.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    private void validacionDeCampos() {

        Menu_PRINCIPAL_VETERINARIA.vcampos.SNumero(jltexto_dni);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SLetras(jtexto_Apellido);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SLetras(jtexto_Nombre);
        Menu_PRINCIPAL_VETERINARIA.vcampos.SNumero(jtexto_Telefono);

    }

    private void rellenarCampos(Cliente p_cliente) {
        jtexto_Apellido.setText(p_cliente.getApellido());
        jtexto_Nombre.setText(p_cliente.getNombreD());
        jtexto_Direccion.setText(p_cliente.getDireccion());
        jtexto_ContactoA.setText(p_cliente.getContactoA());
        jtexto_Telefono.setText(p_cliente.getTelefono());
        jltexto_dni.setText(Long.toString(p_cliente.getDni()));
        jltexto_n_cliente.setText(Integer.toString(p_cliente.getId_cliente()));
        jrbACTIVO.setEnabled(p_cliente.getActivo());
    }

    private void limpiarCampos() {
        jtexto_Apellido.setText("");
        jtexto_Nombre.setText("");
        jtexto_Direccion.setText("");
        jtexto_ContactoA.setText("");
        jtexto_Telefono.setText("");
        jltexto_dni.setText("");
        jltexto_n_cliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAgregarCliente;
    private javax.swing.JLabel jLAgregarMascota;
    private javax.swing.JLabel jLBorrarCliente;
    private javax.swing.JLabel jLBuscarCliente;
    private javax.swing.JLabel jLLimpiar;
    private javax.swing.JLabel jLMascotasASuCargo;
    private javax.swing.JLabel jLModificarCliente;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jlAPELLIDO2;
    private javax.swing.JLabel jlCONTACTO_ALTERNATIVO;
    private javax.swing.JLabel jlDIRECCION1;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNOMBRE;
    private javax.swing.JLabel jlN_DE_CLIENTE;
    private javax.swing.JLabel jlTELEFONO1;
    private javax.swing.JTextField jltexto_dni;
    private javax.swing.JTextField jltexto_n_cliente;
    private javax.swing.JRadioButton jrbACTIVO;
    private javax.swing.JTextField jtexto_Apellido;
    private javax.swing.JTextField jtexto_ContactoA;
    private javax.swing.JTextField jtexto_Direccion;
    private javax.swing.JTextField jtexto_Nombre;
    private javax.swing.JTextField jtexto_Telefono;
    // End of variables declaration//GEN-END:variables
}

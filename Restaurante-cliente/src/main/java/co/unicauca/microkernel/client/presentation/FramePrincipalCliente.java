package co.unicauca.microkernel.client.presentation;

import static co.unicauca.microkernel.client.access.Factory.getInstance;
import co.unicauca.microkernel.client.access.IClienteAccess;
import co.unicauca.microkernel.client.domain.ClienteService;
import co.unicauca.microkernel.client.gestionTabla.TablaHistorialPed;
import co.unicauca.microkernel.client.gestionTabla.TableRestaurantesHaPed;
import co.unicauca.microkernel.common.entities.Cliente;
import co.unicauca.microkernel.common.entities.ClienteCrypt;
import co.unicauca.microkernel.common.entities.HistorialPed;
import co.unicauca.microkernel.common.entities.Pedido;
import co.unicauca.microkernel.common.entities.Restaurante;
import co.unicauca.microkernel.common.infra.Utilities;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Interfaz del Usuario cliente
 * @author Edynson, Jhonfer, Mateo, Camilo, James
 */
public class FramePrincipalCliente extends javax.swing.JFrame {
    //listas
    List<Restaurante> restaurantes;
    List<HistorialPed> historiaPedidos;
    //tablas
    TableRestaurantesHaPed tabRestaurantes;
    TablaHistorialPed tabHistoria;
    //servicios
    IClienteAccess service;
    ClienteService servicioRestaurante;
    private static String tipoRestaurante;
    private static String estadoPedido;
    private static int idCliente;
    /**
     * Creates new form FramePrincipalClientes
     */
    public FramePrincipalCliente(int parIdCliente) {
    try {
            service = getInstance().getClienteService();
            servicioRestaurante = new ClienteService(service);
            //INICIALIZANDO TABLAS
            tabRestaurantes = new TableRestaurantesHaPed();
            tabHistoria = new TablaHistorialPed();
            //INICIANDO COMPONENENTES
            initComponents();
            //INICIALIZANDO TABLAS Y LLENANDO LISTAS
            restaurantes = new ArrayList<>();
            historiaPedidos = new ArrayList<>();
            idCliente = parIdCliente;
            tipoRestaurante = "Todos";
            estadoPedido = "CREADO";
            //crear index debe estar antes de fiar texto para lblNomUsu
            this.crearTablaRestaurantes(tipoRestaurante);
            this.crearTablaHistoria(estadoPedido);
        } catch (Exception ex) {
            getLogger(FramePrincipalAdmin.class.getName()).log(SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pstFrmPrnCli = new javax.swing.JTabbedPane();
        pstHacerPedido = new javax.swing.JPanel();
        lblTipoRestaurante = new javax.swing.JLabel();
        cbxTipoRestaurante = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantes = new javax.swing.JTable();
        lblImagenRestaurante = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        pstHistorialPedido = new javax.swing.JPanel();
        lblEstadoDelPedido = new javax.swing.JLabel();
        cbxEstadoDelPedido = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidosEstado = new javax.swing.JTable();
        btnCerrarSesion2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pstFrmPrnCli.setBackground(new java.awt.Color(30, 100, 85));

        pstHacerPedido.setBackground(new java.awt.Color(30, 100, 85));

        lblTipoRestaurante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoRestaurante.setText("Tipo de restaurante: ");

        cbxTipoRestaurante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoRestaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Tradicional", "Oriental", "Mexicano" }));
        cbxTipoRestaurante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoRestauranteItemStateChanged(evt);
            }
        });

        tblRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CALLE", "CARRERA", "ACCION 1"
            }
        ));
        tblRestaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestaurantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestaurantes);

        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pstHacerPedidoLayout = new javax.swing.GroupLayout(pstHacerPedido);
        pstHacerPedido.setLayout(pstHacerPedidoLayout);
        pstHacerPedidoLayout.setHorizontalGroup(
            pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                .addGroup(pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                                .addComponent(lblTipoRestaurante)
                                .addGap(26, 26, 26)
                                .addComponent(cbxTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblImagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnCerrarSesion)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pstHacerPedidoLayout.setVerticalGroup(
            pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                        .addComponent(lblImagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pstHacerPedidoLayout.createSequentialGroup()
                        .addGroup(pstHacerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoRestaurante)
                            .addComponent(cbxTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCerrarSesion)
                        .addContainerGap())))
        );

        pstFrmPrnCli.addTab("HACER PEDIDO", pstHacerPedido);

        pstHistorialPedido.setBackground(new java.awt.Color(30, 100, 85));

        lblEstadoDelPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstadoDelPedido.setText("Estado del pedido: ");

        cbxEstadoDelPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxEstadoDelPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Creado", "Pagado" }));
        cbxEstadoDelPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoDelPedidoItemStateChanged(evt);
            }
        });

        tblPedidosEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "RESTAURANTE", "FECHA CREADO", "FECHA PAGADO", "ACCION 1"
            }
        ));
        tblPedidosEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidosEstadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPedidosEstado);

        btnCerrarSesion2.setText("CERRAR SESION");
        btnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pstHistorialPedidoLayout = new javax.swing.GroupLayout(pstHistorialPedido);
        pstHistorialPedido.setLayout(pstHistorialPedidoLayout);
        pstHistorialPedidoLayout.setHorizontalGroup(
            pstHistorialPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pstHistorialPedidoLayout.createSequentialGroup()
                .addGroup(pstHistorialPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pstHistorialPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pstHistorialPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pstHistorialPedidoLayout.createSequentialGroup()
                                .addComponent(lblEstadoDelPedido)
                                .addGap(18, 18, 18)
                                .addComponent(cbxEstadoDelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pstHistorialPedidoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnCerrarSesion2)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        pstHistorialPedidoLayout.setVerticalGroup(
            pstHistorialPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pstHistorialPedidoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pstHistorialPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoDelPedido)
                    .addComponent(cbxEstadoDelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pstFrmPrnCli.addTab("HISTORIAL PEDIDO", pstHistorialPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pstFrmPrnCli, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pstFrmPrnCli, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoRestauranteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoRestauranteItemStateChanged
        try {
            this.crearTablaRestaurantes(validarTipoRes());
        } catch (Exception ex) {
            Logger.getLogger(FramePrincipalCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxTipoRestauranteItemStateChanged

    private void tblRestaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestaurantesMouseClicked
        int column = tblRestaurantes.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblRestaurantes.getRowHeight();
        byte[] imagen = this.restaurantes.get(row).getImagen();
        //instanciar imagen
        this.servicioRestaurante.fijarImagen(this.lblImagenRestaurante, imagen, "FOTONULA");
        if (row < tblRestaurantes.getRowCount() && row >= 0 && column < tblRestaurantes.getColumnCount() && column >= 0) {
            Object value = tblRestaurantes.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                var boton = (JButton) value;
                if (boton.getName().equals("Pedir")) {
                    Pedido pedido = new Pedido(idCliente,this.restaurantes.get(row).getId());
                    try {
                        int idPedido = Integer.parseInt(this.servicioRestaurante.addPedido(pedido));
                        Pedido aux = new Pedido(idPedido,idCliente,this.restaurantes.get(row).getId());
                        HacerPedido frameRacion = new HacerPedido(aux,this.servicioRestaurante);
                        frameRacion.setVisible(true);
                        this.setVisible(false);
                    } catch (Exception ex) {
                        Logger.getLogger(FramePrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_tblRestaurantesMouseClicked

    private void cbxEstadoDelPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoDelPedidoItemStateChanged
        try {
            this.crearTablaHistoria(validarEstadoPed());
        } catch (Exception ex) {
            Logger.getLogger(FramePrincipalCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxEstadoDelPedidoItemStateChanged

    private void tblPedidosEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidosEstadoMouseClicked
        int column = tblPedidosEstado.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblPedidosEstado.getRowHeight();
        
        if (row < tblPedidosEstado.getRowCount() && row >= 0 && column < tblPedidosEstado.getColumnCount() && column >= 0) {
            Object value = tblPedidosEstado.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                var boton = (JButton) value;
                if (boton.getName().equals("Visualizar")) {
                    String aux = String.valueOf(cbxEstadoDelPedido.getSelectedItem());
                    if (aux.equals("Creado")){
                        Pedido pedido = new Pedido(this.historiaPedidos.get(row).getIdPed(),idCliente);
                        try {
                            HacerPedido frameRacion = new HacerPedido(pedido,this.servicioRestaurante);
                            frameRacion.setVisible(true);
                        }catch (Exception ex) {
                            Logger.getLogger(FramePrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        Pedido pedido = new Pedido(this.historiaPedidos.get(row).getIdPed(),idCliente);
                        try {
                            HacerPedido frameRacion = new HacerPedido(pedido,this.servicioRestaurante);
                            frameRacion.setVisible(true);
                        }catch (Exception ex) {
                            Logger.getLogger(FramePrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                }
            }
        }
    }//GEN-LAST:event_tblPedidosEstadoMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion2ActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesion2ActionPerformed
    
    private void cerrarSesion(){
        GUILogin guiLogin = new GUILogin();
        this.setVisible(false);
        String name = getNombreCliente(idCliente);
        JOptionPane.showMessageDialog(null, "Hasta pronto "+name);
        guiLogin.setVisible(true);
        this.dispose();
    }
    private String getNombreCliente(int idCliente){
        try {
            Cliente  cli= this.servicioRestaurante.getClient(idCliente);
            return Utilities.desencriptar(cli.getNombre());
        } catch (Exception e) {
            System.out.println("Fallo al encontrar cliente");
            return "";
        }
    } 
    
    public void crearTablaHistoria(String estado) throws Exception {
        this.tblPedidosEstado.removeAll();
        this.serviceListarHistorial(estado);
        tabHistoria.ver_tabla(tblPedidosEstado, historiaPedidos);
    }
    public void crearTablaRestaurantes(String validar) throws Exception {
        this.tblRestaurantes.removeAll();
        this.serviceListarRestaruntes(validar);
        tabRestaurantes.ver_tabla(tblRestaurantes, restaurantes);
    }
    private void serviceListarRestaruntes(String validar) throws Exception {
        this.restaurantes = servicioRestaurante.listRestaurante(validar);

    }
    private void serviceListarHistorial(String estado) throws Exception {
        this.historiaPedidos = servicioRestaurante.listHistoryPed(idCliente, estado);

    }
    public String validarTipoRes(){
        switch (cbxTipoRestaurante.getSelectedIndex()){
            case 0:
                return "Todos";
            case 1:
                return "tr";
            case 2:
                return "or";
            case 3:
                return "mx";
            default:
                return "Todos";
        }
    }
    public String validarEstadoPed(){
        switch (cbxEstadoDelPedido.getSelectedIndex()){
            case 0:
                return "CREADO";
            case 1:
                return "PAGADO";
            default:
                return "CREADO";
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCerrarSesion2;
    private javax.swing.JComboBox<String> cbxEstadoDelPedido;
    private javax.swing.JComboBox<String> cbxTipoRestaurante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEstadoDelPedido;
    private javax.swing.JLabel lblImagenRestaurante;
    private javax.swing.JLabel lblTipoRestaurante;
    private javax.swing.JTabbedPane pstFrmPrnCli;
    private javax.swing.JPanel pstHacerPedido;
    private javax.swing.JPanel pstHistorialPedido;
    private javax.swing.JTable tblPedidosEstado;
    private javax.swing.JTable tblRestaurantes;
    // End of variables declaration//GEN-END:variables
}

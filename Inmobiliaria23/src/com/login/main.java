package com.login;

import fonts.fuentes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author mgandolfo
 */
///https://www.youtube.com/watch?v=BIYryPMI1xE
public class main extends javax.swing.JFrame {

    private JMenuItem menuAdministracion;
    private JMenuItem menuCliente;
    private JMenuItem menuPropietario;
    private JMenuItem menuBuscar;
    private JMenuItem menuSalir;

    private String logo_administracion = "/recursos/logo_administracion.png";
    private String logo_cliente = "/recursos/clientes.png";
    private String logo_Propietario = "/recursos/llave.png";
    private String logo_buscar = "/recursos/buscar.png";
    private String logo_salir = "/recursos/cerrar-sesion.png";

    Color mMenuBarra = new Color(255, 215, 0);
    Insets margin = new Insets(10, 10, 10, 10);
    Border borderBottom = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE);
    //llama a la clase fuentes
    fuentes tipoFuente;

    public main() {
        initComponents();
        tipoFuente = new fuentes();
        menuAdministracion = new JMenuItem(" Administración ", getIcono(logo_administracion));
        menuAdministracion.setFont(tipoFuente.fuente(tipoFuente.RBold, 0, 14));
        menuCliente = new JMenuItem("Clientes", getIcono(logo_cliente));
        menuCliente.setFont(tipoFuente.fuente(tipoFuente.RBold, 0, 14));
        menuPropietario = new JMenuItem("Propietario", getIcono(logo_Propietario));
        menuPropietario.setFont(tipoFuente.fuente(tipoFuente.RBold, 0, 14));
        menuBuscar = new JMenuItem("Buscar", getIcono(logo_buscar));
        menuBuscar.setFont(tipoFuente.fuente(tipoFuente.RBold, 0, 14));
        menuSalir = new JMenuItem("Salir", getIcono(logo_salir));
        menuSalir.setFont(tipoFuente.fuente(tipoFuente.RBold, 0, 14));
        mbmenu.setBorder(borderBottom);//Borderbottom
        txt_Administracion.setFont(tipoFuente.fuente(tipoFuente.RBlack, 0, 20));
        txt_Clientes.setFont(tipoFuente.fuente(tipoFuente.RBlack, 0, 20));
        txt_Propietarios.setFont(tipoFuente.fuente(tipoFuente.RBlack, 0, 20));
        txt_Buscar.setFont(tipoFuente.fuente(tipoFuente.RBlack, 0, 20));

        //Administración
        mbmenu.add(menuAdministracion);
        menuAdministracion.setMargin(margin);
        menuAdministracion.setOpaque(true);
        menuAdministracion.setBackground(mMenuBarra);
        menuAdministracion.setForeground(Color.BLACK);
        //Clientes
        mbmenu.add(menuCliente);
        menuCliente.setMargin(margin);
        menuCliente.setOpaque(true);
        menuCliente.setBackground(mMenuBarra);
        menuCliente.setForeground(Color.BLACK);
        //Propietario
        mbmenu.add(menuPropietario);
        menuPropietario.setMargin(margin);
        menuPropietario.setOpaque(true);
        menuPropietario.setBackground(mMenuBarra);
        menuPropietario.setForeground(Color.BLACK);
        //Buscar
        mbmenu.add(menuBuscar);
        menuBuscar.setMargin(margin);
        menuBuscar.setOpaque(true);
        menuBuscar.setBackground(mMenuBarra);
        menuBuscar.setForeground(Color.BLACK);
        //Salir
        mbmenu.add(menuSalir);
        menuSalir.setMargin(margin);
        menuSalir.setOpaque(true);
        menuSalir.setBackground(mMenuBarra);
        menuSalir.setForeground(Color.BLACK);

        menuAdministracion.addActionListener((ActionEvent e) -> {
            CambiarVistas(jPanelAdministracion);

        });

        menuCliente.addActionListener((ActionEvent e) -> {
            CambiarVistas(jPanelClientes);

        });

        menuPropietario.addActionListener((ActionEvent e) -> {
            CambiarVistas(jPanelPropietario);

        });

        menuBuscar.addActionListener((ActionEvent e) -> {
            CambiarVistas(jPanelBuscar);

        });

        menuSalir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

    }

    private void CambiarVistas(JPanel jpanel) {
        jpanel.setSize(jPanelPrincipal.getWidth(), jPanelPrincipal.getHeight());
        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(jpanel);
        jPanelPrincipal.repaint();
        ActivarVistas(jpanel);
    }

    private void ActivarVistas(JPanel jpanel) {
        //Administración
        jPanelAdministracion.setEnabled(false);
        jPanelAdministracion.setVisible(false);

        //Clientes
        jPanelClientes.setEnabled(false);
        jPanelClientes.setVisible(false);

        //Propietarios
        jPanelPropietario.setEnabled(false);
        jPanelPropietario.setVisible(false);

        //Buscar
        jPanelBuscar.setEnabled(false);
        jPanelBuscar.setVisible(false);

        jpanel.setVisible(true);
        jpanel.setEnabled(true);

    }

    private Icon getIcono(String ruta) {

        return new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(35, 35, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelFondo = new javax.swing.JLabel();
        jPanelAdministracion = new javax.swing.JPanel();
        txt_Administracion = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        txt_Clientes = new javax.swing.JLabel();
        jPanelPropietario = new javax.swing.JPanel();
        txt_Propietarios = new javax.swing.JLabel();
        jPanelBuscar = new javax.swing.JPanel();
        txt_Buscar = new javax.swing.JLabel();
        mbmenu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/fondomain.png"))); // NOI18N

        jPanelAdministracion.setBackground(new java.awt.Color(51, 51, 255));

        txt_Administracion.setText("ADMINISTRACIÓN");

        javax.swing.GroupLayout jPanelAdministracionLayout = new javax.swing.GroupLayout(jPanelAdministracion);
        jPanelAdministracion.setLayout(jPanelAdministracionLayout);
        jPanelAdministracionLayout.setHorizontalGroup(
            jPanelAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanelAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAdministracionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Administracion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAdministracionLayout.setVerticalGroup(
            jPanelAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanelAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAdministracionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Administracion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelClientes.setBackground(new java.awt.Color(0, 153, 0));

        txt_Clientes.setText("CLIENTES");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Clientes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Clientes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelPropietario.setBackground(new java.awt.Color(204, 204, 255));

        txt_Propietarios.setText("PROPIETARIO");

        javax.swing.GroupLayout jPanelPropietarioLayout = new javax.swing.GroupLayout(jPanelPropietario);
        jPanelPropietario.setLayout(jPanelPropietarioLayout);
        jPanelPropietarioLayout.setHorizontalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Propietarios)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelPropietarioLayout.setVerticalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Propietarios)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        txt_Buscar.setText("BUSCAR");

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBuscarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Buscar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBuscarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_Buscar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFondo)
            .addComponent(jPanelPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFondo)
            .addComponent(jPanelPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setJMenuBar(mbmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame();
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
                Dimension ventana = frame.getSize();
                int x = (pantalla.width - ventana.width) / 2;
                int y = (pantalla.height - ventana.height) / 2;

                frame.setLocation(x, y);

                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanelAdministracion;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelPropietario;
    private javax.swing.JMenuBar mbmenu;
    private javax.swing.JLabel txt_Administracion;
    private javax.swing.JLabel txt_Buscar;
    private javax.swing.JLabel txt_Clientes;
    private javax.swing.JLabel txt_Propietarios;
    // End of variables declaration//GEN-END:variables
}

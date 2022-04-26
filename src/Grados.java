
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Grados extends javax.swing.JFrame {

    UIManager UI;

    public Grados() {
        initComponents();
        UI = new UIManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Eleccion2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Eleccion1 = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Unidad = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eleccion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centigrados", "Fahrenheit", "Kelvin" }));
        Eleccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleccion2ActionPerformed(evt);
            }
        });
        jPanel1.add(Eleccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Selecciona la unidad de temperatura a convertir:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        Eleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centigrados", "Fahrenheit", "Kelvin" }));
        Eleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eleccion1ActionPerformed(evt);
            }
        });
        jPanel1.add(Eleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        Valor.setToolTipText("Valor Numerico");
        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        jPanel1.add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Tu conversión es de:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Selecciona la unidad de temperatura de conversión:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        Resultado.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 30));

        Calcular.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Calcular.setForeground(new java.awt.Color(153, 51, 255));
        Calcular.setText("CALCULAR");
        Calcular.setToolTipText("Convertir");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 130));

        Unidad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 30));
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 140, 130));
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("°");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 10, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Eleccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eleccion2ActionPerformed

    private void Eleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eleccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eleccion1ActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        double Valor1 = 0;
        this.Unidad.setText(this.Eleccion2.getSelectedItem().toString());
        try {
            Valor1 = Double.parseDouble(this.Valor.getText());
            if (this.Eleccion1.getSelectedIndex() == 0) {
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.gif")));
                if (this.Eleccion2.getSelectedIndex() == 0) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.gif")));
                }
                if (this.Eleccion2.getSelectedIndex() == 1) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f.gif")));
                    Valor1 = (Valor1 * (9 / 5)) + 32;
                }
                if (this.Eleccion2.getSelectedIndex() == 2) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k.gif")));
                    Valor1 = (Valor1 + 273.15);
                }
                this.Resultado.setText(String.valueOf(Valor1));
                if (Double.parseDouble(this.Valor.getText()) < 38) {
                    this.jPanel1.setBackground(Color.CYAN);
                } else {
                    this.jPanel1.setBackground(Color.red);
                    this.UI.put("OptionPane.background", Color.red);
                    this.UI.put("Panel.background", Color.red);
                    JOptionPane.showMessageDialog(null, "La temperatura en grados centigrados es demasiado alta", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (this.Eleccion1.getSelectedIndex() == 1) {
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f.gif")));
                if (this.Eleccion2.getSelectedIndex() == 0) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.gif")));
                    Valor1 = (Valor1 - 32) * (5 / 9);
                }
                if (this.Eleccion2.getSelectedIndex() == 1) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f.gif")));
                }
                if (this.Eleccion2.getSelectedIndex() == 2) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k.gif")));
                    Valor1 = (Valor1 - 32) * (5 / 9) + 273.15;
                }
                this.Resultado.setText(String.valueOf(Valor1));
                if (Double.parseDouble(this.Valor.getText()) < 100.4) {
                    this.jPanel1.setBackground(Color.CYAN);
                } else {
                    this.jPanel1.setBackground(Color.red);
                    this.UI.put("OptionPane.background", Color.red);
                    this.UI.put("Panel.background", Color.red);
                    JOptionPane.showMessageDialog(null, "La temperatura en grados farenheid es demasiado alta", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (this.Eleccion1.getSelectedIndex() == 2) {
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k.gif")));
                if (this.Eleccion2.getSelectedIndex() == 0) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.gif")));
                    Valor1 = Valor1 - 273.15;
                }
                if (this.Eleccion2.getSelectedIndex() == 1) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f.gif")));
                    Valor1 = (Valor1 - 273.15) * (9 / 5) + 32;
                }
                if (this.Eleccion2.getSelectedIndex() == 2) {
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k.gif")));
                }
                this.Resultado.setText(String.valueOf(Valor1));
                if (Double.parseDouble(this.Valor.getText()) < 311.15) {
                    this.jPanel1.setBackground(Color.CYAN);
                } else {
                    this.jPanel1.setBackground(Color.red);
                    this.UI.put("OptionPane.background", Color.red);
                    this.UI.put("Panel.background", Color.red);
                    JOptionPane.showMessageDialog(null, "La temperatura en grados kelvin es demasiado alta", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
            this.Resultado.setText(String.valueOf(Valor1));
            if (Double.parseDouble(this.Valor.getText()) < 0) {
                this.UI.put("OptionPane.background", Color.cyan);
                this.UI.put("Panel.background", Color.cyan);
                JOptionPane.showMessageDialog(null, "Esta Helando!!!");
            }
            this.UI.put("OptionPane.background", Color.MAGENTA);
            this.UI.put("Panel.background", Color.MAGENTA);
            int ventana = JOptionPane.showOptionDialog(null,
                    "Quieres salir del programa?",
                    "Programa de Sofia",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"SI", "NO", "LIMPIAR"},
                    "default");
            if (ventana == 0) {
                this.UI.put("OptionPane.background", Color.pink);
                this.UI.put("Panel.background", Color.pink);
                JOptionPane.showMessageDialog(null, "Hasta luego :)", "SALIDA", 0);
                exit(0);
            } else if (ventana == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por seguir en nuestro programa :)");
            } else if (ventana == 2) {
                this.Valor.setText("");
                this.Eleccion1.setSelectedIndex(0);
                this.Eleccion2.setSelectedIndex(0);
                this.a.setIcon(null);
                this.b.setIcon(null);
                jPanel1.setBackground(new java.awt.Color(255, 204, 204));
                this.Unidad.setText("");
                this.Resultado.setText("");
                JOptionPane.showMessageDialog(null, "Gracias por seguir en nuestro programa :)");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos Invalidos");
        }
    }//GEN-LAST:event_CalcularActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JComboBox<String> Eleccion1;
    private javax.swing.JComboBox<String> Eleccion2;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel Unidad;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


package component;

import java.awt.Color;

public class ChatTitle extends javax.swing.JPanel {


    public ChatTitle() {
        initComponents();
    }

    public void setUserName(String userName) {
        lbName.setText(userName);
    }

    public void statusActive() {
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
    }

    public void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setBackground(new java.awt.Color(204, 204, 255));
        lbName.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 18)); // NOI18N
        lbName.setText("Mike Tyson");
        lbName.setMaximumSize(new java.awt.Dimension(41, 17));
        lbName.setMinimumSize(new java.awt.Dimension(41, 17));
        lbName.setPreferredSize(new java.awt.Dimension(41, 17));
        layer.add(lbName);

        lbStatus.setBackground(new java.awt.Color(0, 0, 0));
        lbStatus.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(0, 204, 51));
        lbStatus.setText("Active now");
        lbStatus.setMaximumSize(new java.awt.Dimension(41, 17));
        lbStatus.setMinimumSize(new java.awt.Dimension(41, 17));
        lbStatus.setPreferredSize(new java.awt.Dimension(41, 17));
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layer, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
package component;


import java.awt.Color ;
import java.awt.event.MouseAdapter ;
import java.awt.event.MouseEvent ;

    public class Itempeople extends javax.swing.JPanel {

        public Itempeople(String name) {
            initComponents();
            PeopleName.setText(name);
            init();
        }

        private void init() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                    setBackground(new Color(230, 230, 230));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    setBackground(new Color(226,226,226));
                }
            });
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Avatar = new swing.Avatar();
        PeopleName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 226, 226));

        Avatar.setBorderSize(0);
        Avatar.setImage(new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/component/profile.png"));

        PeopleName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PeopleName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PeopleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Avatar Avatar;
    private javax.swing.JLabel PeopleName;
    // End of variables declaration//GEN-END:variables
}

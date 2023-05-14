package form;

import component.Itempeople;
import swing.ScrollBar;
import net.miginfocom.swing.MigLayout;


/**
 *
 * @author filberthamijoyo
 */
public class Leftmenu extends javax.swing.JPanel {

    /**
     * Creates new form Leftmenu
     */
    public Leftmenu() {
        initComponents();
        init();
    
    }

    
    private void init() {
        scrollpane.setVerticalScrollBar(new ScrollBar());
        MenuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showFriends();
    }
    
    private void showFriends() {    
        MenuList.removeAll();
        MenuList.add(new Itempeople("Mike Tyson"), "wrap");
         for (int i = 0; i < 11; i++) {
            MenuList.add(new Itempeople("Others" + i), "wrap");
        }
        refreshMenuList();
    }
    private void showChats() {
        MenuList.removeAll();
        for (int i=0; i<9; i++) {
            MenuList.add(new Itempeople("Chat" + i), "wrap");
        }
        refreshMenuList();
    }
    private void showGroups(){ 
        MenuList.removeAll();
    for(int i = 0;i<2;i++){
        MenuList.add(new Itempeople("Group" + i),"wrap");
    }
        refreshMenuList();

    }
    private void refreshMenuList(){
        MenuList.repaint();
        MenuList.revalidate();
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuFriends = new component.menuBut();
        menuChats = new component.menuBut();
        menuGroups = new component.menuBut();
        scrollpane = new javax.swing.JScrollPane();
        MenuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(204, 204, 255));

        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuFriends.setBackground(new java.awt.Color(0, 204, 204));
        menuFriends.setText("Friends");
        menuFriends.setSelected(true);
        menuFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFriendsActionPerformed(evt);
            }
        });
        menu.add(menuFriends);

        menuChats.setBackground(new java.awt.Color(0, 204, 204));
        menuChats.setText("Chats");
        menuChats.setIconSelected(null);
        menuChats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChatsActionPerformed(evt);
            }
        });
        menu.add(menuChats);

        menuGroups.setBackground(new java.awt.Color(0, 204, 204));
        menuGroups.setText("Group");
        menuGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupsActionPerformed(evt);
            }
        });
        menu.add(menuGroups);

        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setPreferredSize(new java.awt.Dimension(2, 666));

        MenuList.setBackground(new java.awt.Color(255, 255, 255));
        MenuList.setOpaque(true);
        MenuList.setPreferredSize(new java.awt.Dimension(0, 664));

        javax.swing.GroupLayout MenuListLayout = new javax.swing.GroupLayout(MenuList);
        MenuList.setLayout(MenuListLayout);
        MenuListLayout.setHorizontalGroup(
            MenuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        MenuListLayout.setVerticalGroup(
            MenuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        scrollpane.setViewportView(MenuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupsActionPerformed
        // TODO add your handling code here:
        if (!menuGroups.isSelected()) {
        menuFriends.setSelected(false);
        menuGroups.setSelected(true);
        menuChats.setSelected(false);
        showGroups();
    }//GEN-LAST:event_menuGroupsActionPerformed
    }
    private void menuFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFriendsActionPerformed
        // TODO add your handling code here:
        if (!menuGroups.isSelected()) {
        menuFriends.setSelected(true);
        menuGroups.setSelected(false);
        menuChats.setSelected(false);
        showFriends();

    }//GEN-LAST:event_menuFriendsActionPerformed
    }
    private void menuChatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChatsActionPerformed
        // TODO add your handling code here:
        if (!menuChats.isSelected()) {
        menuFriends.setSelected(false);
        menuGroups.setSelected(false);
        menuChats.setSelected(true);
        showChats();
    }//GEN-LAST:event_menuChatsActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MenuList;
    private javax.swing.JLayeredPane menu;
    private component.menuBut menuChats;
    private component.menuBut menuFriends;
    private component.menuBut menuGroups;
    private javax.swing.JScrollPane scrollpane;
    // End of variables declaration//GEN-END:variables
}

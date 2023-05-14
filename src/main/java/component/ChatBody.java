package component;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

public final class ChatBody extends javax.swing.JPanel {

    public ChatBody() {
        initComponents();
        init();
        addDate("Both of you are friends now, start chatting!");
        addDate("04/05/2021");
        addItemRight("hello\nHi");
        addItemRight("Hello\nWhat is your name?");
        //addItemRight("Send a text message to a group of contacts. Include photos, personalize your texts, and track who clicked your links.", new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/sunse2.jpg"), new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/shinchan.jpg"));
       
        //addItemLeft("Simpletext started as a passion project because I couldn’t find what I was looking for. Most apps were trying to do too much and ended up bloated with features I don’t need. So I built Simpletext based on a simple premise — what if there’s an app that refuses to do more, choosing instead to do just one thing, and do it well? For Simpletext, that one thing is writing.", "Mike Tyson", new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/sunse2.jpg"), new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/shinchan.jpg"));
        addDate("05/05/2021");
        addItemLeft("Hello my name is Mike\nwhat is your name\n", "Mike Tyson");
        addItemRight("hello\nmy name is Filbert\nlets go eat", new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/shinchan.jpg"));
        addItemLeft("ok lets go", "Mike Tyson", new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/photongentod.jpg"), new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/shinchan.jpg"));
        addItemRight("Ok\nsee you later");
        //addItemLeft("", "Ryan Garcia", new javax.swing.ImageIcon("/Users/filberthamijoyo/NetBeansProjects/mavenproject1/src/main/java/icon/sunse2.jpg"));


    }

    private void init() {
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }

    public void addItemLeft(String text, String user, Icon ...image) {
        ChatLeftProfile item = new ChatLeftProfile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }
     public void addItemLeft(String text, String user, String[] image) {
        ChatLeftProfile item = new ChatLeftProfile();
        item.setText(text);
       
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        //  ::80% set max with 80%
        body.repaint();
        body.revalidate();
    
    }
   

    public void addItemRight(String text, Icon... image) {
        ChatRight item = new ChatRight();
        item.setText(text);
        body.add(item, "wrap, al right, w 100::80%");
        //  ::80% set max with 80%
        body.repaint();
        body.revalidate();
        item.setTime();
        scrollToBottom();
    
    }
        

    public void addDate(String date) {
        ChatDate item = new ChatDate();
        item.setDate(date);
        body.add(item, "wrap, al center");
        body.repaint();
        body.revalidate();
        scrollToBottom();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

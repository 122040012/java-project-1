package component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

public class menuBut extends JButton {
    
    public Icon getIconSimple() {
        return iconSimple;
    }
    
    public void setIconSimple(Icon iconSimple) {
        this.iconSimple=iconSimple;
    }
    
    public Icon getIconSelceted() {
        return iconSelected;
    }
    
     public void setIconSelected(Icon iconSelected) {
        this.iconSelected=iconSelected;
     }
     
    private Icon iconSimple;
    private Icon iconSelected;
    
    public menuBut() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
    }
    
    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if(bln) {
            setIcon(iconSelected);
        } else {
            setIcon(iconSimple);
        }
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (isSelected()) {
            grphcs.setColor(new Color(110, 213, 255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
}
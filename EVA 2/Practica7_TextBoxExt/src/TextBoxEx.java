
import java.awt.Color;

public class TextBoxEx extends javax.swing.JTextField{
    private java.awt.Color colorOriginal = Color.white;
    
    public TextBoxEx() {
        super();
        java.awt.event.FocusAdapter fl = new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                jtfTextBoxExFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                jtfTextBoxExFocusLost(evt);
            }
        };
        addFocusListener(fl);
        
    }
    
    private void jtfTextBoxExFocusGained(java.awt.event.FocusEvent evt){
        if(getCambiarColor()){
            colorOriginal = getBackground();
            setBackground(Color.PINK);
        }
        else{
            setBackground(colorOriginal);
        }
    }
    private void jtfTextBoxExFocusLost(java.awt.event.FocusEvent evt){
        setBackground(colorOriginal);
    }
    
    private boolean CambiarColor = true;

    /**
     * Get the value of CambiarColor
     *
     * @return the value of CambiarColor
     */
    public boolean isCambiarColor() {
        return CambiarColor;
    }

    /**
     * Set the value of CambiarColor
     *
     * @param CambiarColor new value of CambiarColor
     */
    public void setCambiarColor(boolean CambiarColor) {
        this.CambiarColor = CambiarColor;
    }

    private boolean getCambiarColor() {
        return CambiarColor;
    }

    
}

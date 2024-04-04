package UI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.Color;
import java.awt.Insets;
import java.awt.List;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author harvous
 */
public class FlatLafTheme {
    private javax.swing.LookAndFeel currentLookAndFeel;
    public FlatLafTheme() {
        FlatLightLaf.registerCustomDefaultsSource("style");
        UIManager.put("Component.focusWidth", 2);
        UIManager.put("Button.arc", 13);
        //  UIManager.put("TextComponent.arc", 5);
        UIManager.put("Component.arc", 999);
        UIManager.put("ProgressBar.arc", 999);

        UIManager.put("TextComponent.arc", 999);

        UIManager.put("ScrollBar.trackArc", 999);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("ScrollBar.trackInsets", new Insets(2, 4, 2, 4));
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
        UIManager.put("ScrollBar.track", new Color(0xe0e0e0));

        // LIST 
    }

    public void setCurrentLookAndFeel(LookAndFeel lookAndFeel) {
        try {
            UIManager.setLookAndFeel(lookAndFeel);
            // Cập nhật giao diện hiện tại
            currentLookAndFeel = lookAndFeel;

        } catch (Exception ex) {
            System.err.println("Failed to set Look and Feel: " + ex.getMessage());
        }
    }
}

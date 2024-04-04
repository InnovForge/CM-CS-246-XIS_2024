/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package UI;
import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.LookAndFeel;
/**
 *
 * @author harvous
 */
public enum Theme {
    FLATLAF_LIGHT("FlatLaf Light", new FlatLightLaf()),
    FLATLAF_DARK("FlatLaf Dark", new FlatDarkLaf()),
    FLATLAF_INTELLIJ("FlatLaf IntelliJ (based on Light)", new FlatIntelliJLaf()),
    FLATLAF_DARCULA("FlatLaf Darcula (based on Dark)", new FlatDarculaLaf()),
    FLATLAF_MACOS_LIGHT("FlatLaf macOS Light v3", new FlatMacLightLaf()),
    FLATLAF_MACOS_DARK("FlatLaf macOS Dark v3", new FlatMacDarkLaf()),
    ARC("Arc", new FlatArcIJTheme()),
    ARC_ORANGE("Arc - Orange", new FlatArcOrangeIJTheme()),
    ARC_DARK("Arc Dark", new FlatArcDarkIJTheme()),
    ARC_DARK_ORANGE("Arc Dark - Orange", new FlatArcDarkOrangeIJTheme()),
    CARBON("Carbon", new FlatCarbonIJTheme()),
    COBALT_2("Cobalt 2", new FlatCobalt2IJTheme()),
    CYAN_LIGHT("Cyan light", new FlatCyanLightIJTheme()),
    DARK_FLAT("Dark Flat", new FlatDarkFlatIJTheme()),
    DARK_PURPLE("Dark purple", new FlatDarkPurpleIJTheme()),
    DRACULA("Dracula", new FlatDraculaIJTheme()),
    GRADIANTE_DARK_FUCHSIA("Gradianto Dark Fuchsia", new FlatGradiantoDarkFuchsiaIJTheme()),
    GRADIANTE_DEEP_OCEAN("Gradianto Deep Ocean", new FlatGradiantoDeepOceanIJTheme()),
    GRADIANTE_MIDNIGHT_BLUE("Gradianto Midnight Blue", new FlatGradiantoMidnightBlueIJTheme()),
    GRADIANTE_NATURE_GREEN("Gradianto Nature Green", new FlatGradiantoNatureGreenIJTheme()),
    GRAY("Gray", new FlatGrayIJTheme()),
    GRUVBOX_DARK_HARD("Gruvbox Dark Hard", new FlatGruvboxDarkHardIJTheme()),
    GRUVBOX_DARK_MEDIUM("Gruvbox Dark Medium", new FlatGruvboxDarkMediumIJTheme()),
    GRUVBOX_DARK_SOFT("Gruvbox Dark Soft", new FlatGruvboxDarkSoftIJTheme()),
    HIBERBEE_DARK("Hiberbee Dark", new FlatHiberbeeDarkIJTheme()),
    HIGH_CONTRAST("High contrast", new FlatHighContrastIJTheme()),
    LIGHT_FLAT("Light Flat", new FlatLightFlatIJTheme()),
    MATERIAL_DESIGN_DARK("Material Design Dark", new FlatMaterialDesignDarkIJTheme()),
    MONOCAI("Monocai", new FlatMonocaiIJTheme()),
    MONOKAI_PRO("Monokai Pro", new FlatMonokaiProIJTheme()),
    NORD("Nord", new FlatNordIJTheme()),
    ONE_DARK("One Dark", new FlatOneDarkIJTheme()),
    SOLARIZED_DARK("Solarized Dark", new FlatSolarizedDarkIJTheme()),
    SOLARIZED_LIGHT("Solarized Light", new FlatSolarizedLightIJTheme()),
    SPACEGRAY("Spacegray", new FlatSpacegrayIJTheme()),
    VUESION("Vuesion", new FlatVuesionIJTheme()),
    XCODE_DARK("Xcode-Dark", new FlatXcodeDarkIJTheme());


    private final String _nameTheme;
    private final LookAndFeel _objTheme;

    private Theme(String nameTheme, LookAndFeel objTheme) {
        this._nameTheme = nameTheme;
        this._objTheme = objTheme;
    }

    public String getNameTheme() {
        return _nameTheme;
    }

    public LookAndFeel getObjTheme() {
        return _objTheme;
    }

    public static String[] getAllThemeNames() {
        List<String> themeNames = new ArrayList<>();
        for (Theme theme : Theme.values()) {
            themeNames.add(theme.getNameTheme());
        }
        String[] themeNamesArray = new String[themeNames.size()];
        themeNamesArray = themeNames.toArray(themeNamesArray);
        return themeNamesArray;
    }
}

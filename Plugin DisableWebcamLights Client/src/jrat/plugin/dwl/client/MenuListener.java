package jrat.plugin.dwl.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

import jrat.api.PacketBuilder;
import jrat.api.RATMenuItemActionListener;
import jrat.api.RATObject;

public class MenuListener implements RATMenuItemActionListener {
	
	private boolean enable;
	
	public MenuListener(boolean enable) {
		this.enable = enable;
	}

	@Override
	public void onClick(List<RATObject> servers) {
		try {
			if (servers.size() > 0) {
				RATObject server = servers.get(0);

				server.addToSendQueue(new PacketBuilder(DWLPlugin.HEADER, server) {
					@Override
					public void write(RATObject rat, DataOutputStream dos, DataInputStream dis) throws Exception {
						dos.writeBoolean(enable);
					}		
				});				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

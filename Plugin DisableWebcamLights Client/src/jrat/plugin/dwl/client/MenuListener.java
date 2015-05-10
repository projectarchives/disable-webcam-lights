package jrat.plugin.dwl.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

import jrat.api.PacketBuilder;
import jrat.api.Client;
import jrat.api.ui.RATMenuItemActionListener;

public class MenuListener implements RATMenuItemActionListener {
	
	private boolean enable;
	
	public MenuListener(boolean enable) {
		this.enable = enable;
	}

	@Override
	public void onClick(List<Client> clients) {
		try {
			for (Client client : clients) {
				client.addToSendQueue(new PacketBuilder(DWLPlugin.HEADER, client) {
					@Override
					public void write(Client rat, DataOutputStream dos, DataInputStream dis) throws Exception {
						dos.writeBoolean(enable);
					}		
				});	
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

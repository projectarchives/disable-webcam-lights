package jrat.plugin.dwl.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import jrat.api.Client;
import jrat.api.net.PacketBuilder;

public class Packet extends PacketBuilder {

	public Packet(Client rat) {
		super(DWLPlugin.HEADER, rat);
	}

	@Override
	public void write(Client rat, DataOutputStream dos, DataInputStream dis) throws Exception {
		dos.writeBoolean(DWLPlugin.enabled);
	}

}

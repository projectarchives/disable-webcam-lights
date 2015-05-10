package jrat.plugin.dwl.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import jrat.api.PacketBuilder;
import jrat.api.RATObject;

public class Packet extends PacketBuilder {

	public Packet(RATObject rat) {
		super(DWLPlugin.HEADER, rat);
	}

	@Override
	public void write(RATObject rat, DataOutputStream dos, DataInputStream dis) throws Exception {
		dos.writeBoolean(DWLPlugin.enabled);
	}

}

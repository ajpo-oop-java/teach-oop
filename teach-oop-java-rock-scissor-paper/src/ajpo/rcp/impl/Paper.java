package ajpo.rcp.impl;

import ajpo.rcp.ifaces.GameRCP;

public class Paper implements GameRCP{

	@Override
	public boolean play(GameRCP v) {
		// TODO Auto-generated method stub
		ganador boolean = false;
		
		if (v instanceof Rock){
			ganador = true;
		}
		if (v instanceof Paper) {
		}
		if (v instanceof Scissor) {
		}
		return ganador;
	}

}
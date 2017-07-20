package ajpo.rcp.impl;

import ajpo.rcp.ifaces.GameRCP;

public abstract class Paper implements GameRCP{

	@Override
	public boolean playwithif(GameRCP v) {
		//return v.playWithPaper(this);
		boolean ganador  = false;
		
		if (v instanceof Rock){
			ganador = true;
		}
		if (v instanceof Paper) {
		}
		if (v instanceof Scissor) {
		}
		return ganador;
	}
	
	public boolean playWithRock(Rock r) {
		return true;
	}
	
	public boolean playWithPaper(Paper p) {
		return false;
	}
	
	public boolean playWithScissor(Scissor p) {
		return false;
	}

}
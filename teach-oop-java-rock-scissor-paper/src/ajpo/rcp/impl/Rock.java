package ajpo.rcp.impl;

import ajpo.rcp.ifaces.GameRCP;

public abstract class Rock implements GameRCP{

	@Override
	public boolean playwithif(GameRCP v) {
		// TODO Auto-generated method stub
		boolean ganador  = false;
		
		if (v instanceof Rock){
		}
		if (v instanceof Paper) {
		}
		if (v instanceof Scissor) {
			ganador = true;
		}
		return ganador;
	}

	@Override
	public boolean playWithPaper(Paper paper) {
		return false;
	}

	@Override
	public boolean playWithRock(Rock rock) {
		return false;
	}

	@Override
	public boolean playWithScissor(Scissor scissor) {
		return true;
	}

}

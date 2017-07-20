package ajpo.rcp.impl;

import ajpo.rcp.ifaces.GameRCP;

public abstract class Scissor implements GameRCP{

	@Override
	public boolean playwithif(GameRCP v) {
		// TODO Auto-generated method stub
		boolean ganador  = false;
		
		if (v instanceof Rock){
		}
		if (v instanceof Paper) {
			ganador = true;
		}
		if (v instanceof Scissor) {
		}
		return ganador;
	}

	@Override
	public boolean playWithPaper(Paper paper) {
		return true;
	}

	@Override
	public boolean playWithRock(Rock rock) {
		return false;
	}

	@Override
	public boolean playWithScissor(Scissor scissor) {
		return false;
	}

}
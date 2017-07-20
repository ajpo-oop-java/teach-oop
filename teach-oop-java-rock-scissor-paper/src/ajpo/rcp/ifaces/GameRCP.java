package ajpo.rcp.ifaces;

import ajpo.rcp.impl.Paper;
import ajpo.rcp.impl.Rock;
import ajpo.rcp.impl.Scissor;

public interface GameRCP {

	boolean playwithif(GameRCP v);

	boolean playWithPaper(Paper paper);
	boolean playWithRock(Rock rock);
	boolean playWithScissor(Scissor scissor);
	
}

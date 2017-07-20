package ajpo.rcp.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ajpo.rcp.ifaces.GameRCP;
import ajpo.rcp.impl.Paper;
import ajpo.rcp.impl.Rock;
import ajpo.rcp.impl.Scissor;

public class TestPlayGameRCP {

	@Test
	public void test() {
		
		GameRCP rock = new Rock();
		GameRCP scissor = new Scissor();
		GameRCP paper = new Paper();
		
		// Start to play
		Assert.assertTrue(false == rock.play(rock));
		Assert.assertTrue(true == rock.play(scissor));
		Assert.assertTrue(false == rock.play(paper));
		
		Assert.assertTrue(false == scissor.play(rock));
		Assert.assertTrue(false == scissor.play(scissor));
		Assert.assertTrue(true == scissor.play(paper));
		
		Assert.assertTrue(true == paper.play(rock));
		Assert.assertTrue(false == paper.play(scissor));
		Assert.assertTrue(false == paper.play(paper));
		
	}

}

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
		/*
		GameRCP rock = new Rock();
		GameRCP scissor = new Scissor();
		GameRCP paper = new Paper();
		*/
		
		// Start to play
		Assert.assertTrue(false == rock.playwithif(rock));
		Assert.assertTrue(true == rock.playwithif(scissor));
		Assert.assertTrue(false == rock.playwithif(paper));
		
		Assert.assertTrue(false == scissor.playwithif(rock));
		Assert.assertTrue(false == scissor.playwithif(scissor));
		Assert.assertTrue(true == scissor.playwithif(paper));
		
		Assert.assertTrue(true == paper.playwithif(rock));
		Assert.assertTrue(false == paper.playwithif(scissor));
		Assert.assertTrue(false == paper.playwithif(paper));
		
	}
	
	@Test
	public void testOnlyRock() {
		
		/*
		GameRCP rock = new Rock();
		GameRCP scissor = new Scissor();
		GameRCP paper = new Paper();
		*/
		
		// Start to play
		Assert.assertTrue(false == rock.playwithif(rock));
		Assert.assertTrue(true == rock.playwithif(scissor));
		Assert.assertTrue(false == rock.playwithif(paper));
		
	}
	
	@Test
	public void testOnlyScissor() {
		
		/*
		GameRCP rock = new Rock();
		GameRCP scissor = new Scissor();
		GameRCP paper = new Paper();
		*/
		
		// Start to play
		Assert.assertTrue(false == scissor.playwithif(rock));
		Assert.assertTrue(false == scissor.playwithif(scissor));
		Assert.assertTrue(true == scissor.playwithif(paper));
		
	}
	
	@Test
	public void testOnlyPaper() {
		
		/*
		GameRCP rock = new Rock();
		GameRCP scissor = new Scissor();
		GameRCP paper = new Paper();
		*/
		
		// Start to play
		Assert.assertTrue(true == paper.playwithif(rock));
		Assert.assertTrue(false == paper.playwithif(scissor));
		Assert.assertTrue(false == paper.playwithif(paper));
		
	}
	

}

package com.triton.game;

import java.awt.event.KeyEvent;

import com.triton.engine.AbstractGame;
import com.triton.engine.GameContainer;
import com.triton.engine.Renderer;

public class GameManager extends AbstractGame {

	public GameManager() {
	}

	@Override
	public void update(GameContainer gc, float dt) {
		if(gc.getInput().isKeyDown(KeyEvent.VK_A)) {
			System.out.println("A pressed");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {

	}
	
	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}

}

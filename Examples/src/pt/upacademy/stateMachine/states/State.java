package pt.upacademy.stateMachine.states;

import io.altar.jseproject.textinterface.ScannerUtils.ScannerUtils;

//copiado do sigleton indicado no enunciado

public abstract class State  {
	public static final ScannerUtils sc = new ScannerUtils();
	
	
		public abstract int run();
	}


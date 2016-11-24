package controller;

import controller.action.Action;
import controller.action.BoardListAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory(){
		super();
	}
	
	public static ActionFactory getInstance(){
		return instance;
		
	}
	public Action getAction(String command){
		Action action = null;
		System.out.println(""+command+"");
		
		if(command.equals("board_list")||command.equals("")){
			action = new BoardListAction();
		}
		
		return action;
	}

}

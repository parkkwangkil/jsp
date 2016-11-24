package controller;

import controller.action.Action;
import controller.action.BoardDeleteAction;
import controller.action.BoardListAction;
import controller.action.BoardPopularAction;
import controller.action.BoardUpdateAction;
import controller.action.BoardUpdateFormAction;
import controller.action.BoardViewAction;
import controller.action.BoardWriteAction;
import controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;

	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("" + command + "");

		if (command.equals("board_list")) {
			action = new BoardListAction();
			
		} else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();

		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
					
		}else if(command.equals("board_view")){
			action = new BoardViewAction();
		}else if(command.equals("board_update_form")){
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")){
			action = new BoardUpdateAction();
		}else if(command.equals("board_delete")){
			action = new BoardDeleteAction();
		}else if(command.equals("board_popular")){
			action = new BoardPopularAction();
		}
		return action;
	}

}

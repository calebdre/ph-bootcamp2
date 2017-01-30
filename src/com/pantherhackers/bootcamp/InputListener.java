package com.pantherhackers.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class InputListener {

    private List<EventAction> actionList = new ArrayList<>();
    private List<String> inputList = new ArrayList<>();

    public void addListener(String event, EventAction action) {
         inputList.add(event);
         actionList.add(action);
    }

    public void executeEvent(String event){
        for (int i = 0; i < inputList.size(); i++) {
            if(event.equals(inputList.get(i))) {
                actionList.get(i).onKeyEvent();

                inputList.remove(i);
                actionList.remove(i);
            }
        }
    }

    public interface EventAction {
        void onKeyEvent();
    }
}

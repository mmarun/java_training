package com.javaTutorials;

import com.javaTutorials.interfaces.IParent2;

public class AppHelper {
    public void showInfo(IParent2 parent , int randomInteger) {
        parent.printMessage(randomInteger);
        parent.showObjectClass();
    }
}

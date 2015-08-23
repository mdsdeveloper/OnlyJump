package com.magui.draw;

import com.magui.storage.General;

/**
 * Created by matias on 20/8/15.
 */
public class Menu {

    public static void draw() {
        com.magui.storage.Menu.spBackGroundGame.draw(General.batch);

        com.magui.storage.Menu.button.spButton.draw(General.batch);
        com.magui.storage.Menu.button.isClicked();
        com.magui.storage.Menu.buttonMusic.spButton.draw(General.batch);
        com.magui.storage.Menu.buttonMusic.isClicked();
        com.magui.storage.Menu.buttonSound.spButton.draw(General.batch);
        com.magui.storage.Menu.buttonSound.isClicked();
    }
}

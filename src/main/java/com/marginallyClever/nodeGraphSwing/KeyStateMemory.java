package com.marginallyClever.nodeGraphSwing;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Remembers the state of important keys.
 * @author Dan Royer
 * @since 2022-03-08
 */
public class KeyStateMemory {
    private boolean shiftKeyDown = false;

    public void keyPressed(int keyCode) {
        if(keyCode==KeyEvent.VK_SHIFT) shiftKeyDown = true;
    }

    public void keyReleased(int keyCode) {
        if(keyCode==KeyEvent.VK_SHIFT) shiftKeyDown = false;
    }

    public boolean isShiftKeyDown() {
        return shiftKeyDown;
    }
}

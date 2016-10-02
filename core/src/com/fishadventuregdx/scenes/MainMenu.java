package com.fishadventuregdx.scenes;

import com.fishadventuregdx.layers.BackgroundLayer;
import com.netthreads.libgdx.scene.Layer;
import com.netthreads.libgdx.scene.Scene;
import com.fishadventuregdx.layers.MenuLayer;

/**
 * Created by Biskal on 30/09/2016.
 */
public class MainMenu extends Scene{

    private Layer menuLayer;
    private Layer menuBackgroundLayer;

    public MainMenu()
    {
        // ---------------------------------------------------------------
        // Stars layer.
        // ---------------------------------------------------------------
        menuBackgroundLayer = new BackgroundLayer(getWidth(), getHeight());


        addLayer(menuBackgroundLayer);

        // ---------------------------------------------------------------
        // Main menu layer.
        // ---------------------------------------------------------------
        menuLayer = new MenuLayer();//(getWidth(), getHeight());

        addLayer(menuLayer);
    }

}

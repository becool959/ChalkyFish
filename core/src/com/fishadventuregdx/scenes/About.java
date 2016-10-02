package com.fishadventuregdx.scenes;

/**
 * Created by Biskal on 30/09/2016.
 */

import com.netthreads.libgdx.scene.Layer;
import com.netthreads.libgdx.scene.Scene;
import com.fishadventuregdx.layers.*;

public class About extends Scene{

    private Layer controlLayer;
    private Layer aboutLayer;
    private Layer starsLayer;

    public About()
    {
        // ---------------------------------------------------------------
        // Control layer
        // ---------------------------------------------------------------
        controlLayer = new ControlLayer();
        getInputMultiplexer().addProcessor(controlLayer);
        addLayer(controlLayer);

        // ---------------------------------------------------------------
        // Menu background layer
        // ---------------------------------------------------------------
        starsLayer = new BackgroundLayer(getWidth(), getHeight());

        addLayer(starsLayer);

        // ---------------------------------------------------------------
        // About layer
        // ---------------------------------------------------------------
        aboutLayer = new BackgroundLayer(getWidth(), getHeight());
        addLayer(aboutLayer);
    }
}

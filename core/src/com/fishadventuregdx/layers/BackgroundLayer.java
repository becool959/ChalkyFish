package com.fishadventuregdx.layers;

import com.fishadventuregdx.eventsDefinitions.AppTextureDefinitions;
import com.fishadventuregdx.sprites.Background;
import com.netthreads.libgdx.scene.Layer;
import com.badlogic.gdx.Input.Orientation;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
//import com.netthreads.gdx.app.definition.AppTextureDefinitions;
import com.netthreads.libgdx.director.AppInjector;
import com.netthreads.libgdx.texture.TextureCache;
import com.netthreads.libgdx.texture.TextureDefinition;


/**
 * Created by Biskal on 01/10/2016.
 */
public class BackgroundLayer extends Layer{

    private static final float BACKGROUND_FRAME_DURATION = 5.0f;

    private Texture background;
    private Background backGroundSprite;

    /**
     * Singletons.
     */
    private TextureCache textureCache;

    /**
     * Create layer.
     *
     * @param stage
     */

    public BackgroundLayer(float width, float height)
    {
        setWidth(width);
        setHeight(height);

        textureCache = AppInjector.getInjector().getInstance(TextureCache.class);

        loadTextures();

        buildElements();
    }

    /**
     * Load view textures.
     *
     */
    private void loadTextures()
    {
        TextureDefinition definition = textureCache.getDefinition(AppTextureDefinitions.TEXTURE_BACKGROUND);

        background = textureCache.getTexture(definition).getTexture();
    }

    /**
     * Build view elements.
     *
     */
    private void buildElements()
    {
        // ---------------------------------------------------------------
        // Background.
        // ---------------------------------------------------------------
        backGroundSprite = new Background(background, this.getWidth(), this.getHeight(), BACKGROUND_FRAME_DURATION, Orientation.Portrait, -1);
    }

    /**
     * Draw background.
     *
     */
    @Override
    public void draw(Batch batch, float parentAlpha)
    {
        backGroundSprite.draw(batch, parentAlpha);
    }



}

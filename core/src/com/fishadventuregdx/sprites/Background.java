package com.fishadventuregdx.sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Orientation;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.g2d.Batch;



/**
 * Created by Biskal on 30/09/2016.
 */
public class Background extends Sprite {

    private float scrollTimer;
    private float frameDuration;
    private Orientation orientation;
    private int direction;

    private float frameDurationFactor;

    /**
     * Create scrolling background sprite.
     *
     * @param texture
     *            The texture to scroll.
     * @param width
     *            Texture width.
     * @param height
     *            Texture height.
     * @param frameDuration
     *            Frame duration seconds.
     * @param orientation
     *            Portrait==vertical, Landscape=horizontal.
     * @param direction
     *            Direction of scroll 1 or -1.
     */
    public Background(Texture texture, float width, float height, float frameDuration, Orientation orientation, int direction)
    {
        super(texture, (int)width, (int)height);

        this.frameDuration = frameDuration;
        this.orientation = orientation;
        this.direction = direction;

        // Do this once so we don't have to do it repeatedly.
        this.frameDurationFactor = 1.0f / frameDuration;

        scrollTimer = 0.0f;

        texture.setWrap(TextureWrap.Repeat, TextureWrap.Repeat);
    }

    /**
     * Scroll the background across the frame duration.
     *
     */
    @Override
    public void draw(Batch batch, float parentAlpha)
    {
        scrollTimer += Gdx.graphics.getDeltaTime();

        float scaled = direction * frameDurationFactor * scrollTimer;

        if (scrollTimer > frameDuration)
        {
            scrollTimer = 0.0f;
        }

        if (orientation == Orientation.Landscape)
        {
            setU(scaled);
            setU2(scaled + 1);
        }
        else
        {
            setV(scaled);
            setV2(scaled + 1);
        }

        super.draw(batch);
    }

}

/**
 * The purpose of this class is to model a television.
 * Code by Tyreq Bevett at 04/17/2025
 */

public class Television
{
    // television manufacturer
    private final String MANUFACTURER;

    // the screen size of the television
    private final int SCREEN_SIZE;

    // whether the TV is on or off (true = on, false = off)
    private boolean powerOn;

    // stores the current channel
    private int channel;

    // stores the current volume level
    private int volume;

    /**
     * This is the constructor to initialize brand and screen size.
     * Sets power to off, volume to 20, and channel to 2.
     */
    //Code By Tyreq
    public Television(String brand, int size)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    /**
     * this returns the current volume level.
     * @return the volume
     */
    //Code By Tyreq Bevett
    public int getVolume()
    {
        return volume;
    }

    /**
     * this returns the current channel.
     * @return the channel
     */
    public int getChannel()
    {
        return channel;
    }

    /**
     * this returns the manufacturer.
     * @return the manufacturer name
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }

    /**
     * this returns the screen size.
     * @return the screen size
     */
    //Code By Tyreq Bevett
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }

    /**
     * this sets the channel to the given value.
     * @param station the desired channel
     */
    public void setChannel(int station)
    {
        channel = station;
    }

    /**
     * this will toggle the power state between on and off.
     */
    public void power()
    {
        powerOn = !powerOn;
    }

    /**
     * increases the volume by 1.
     */
    public void increaseVolume()
    {
        volume++;
    }

    /**
     * decreases the volume by 1.
     */
    public void decreaseVolume()
    {
        volume--;
    }
}

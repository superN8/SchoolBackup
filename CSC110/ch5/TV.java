/*Name: Nathan DeLano
Date:3/22/2018
Program Name: TV
Class: CSC110	
Pseudocode: create a class to support the TestTV
*/

package ch5;

public class TV
{
	private int channel,volume,maxChannel,maxVolume;
	private boolean on;
	public TV()
	{
		channel=1;
		volume=1;
		maxChannel=1;
		maxVolume=1;
		on=false;
	}
	public int getChannel()
	{
		return channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public boolean isOn()
	{
		return on;
	}
	public int getMaxChannel()
	{
		return maxChannel;
	}
	public int getMaxVolume()
	{
		return maxVolume;
	}
	public void setChannel(int someChannel)
	{
		if (someChannel >= 1 && someChannel <= maxChannel)
		{
			channel=someChannel;
		}
	}
	public void setVolume(int someVolume)
	{
		if (someVolume >= 0 && someVolume <= maxVolume)
		{
			volume=someVolume;
		}
	}
	public void setMaxChannel(int maxC)
	{
		maxChannel=maxC;
	}
	public void setMaxVolume(int maxVol)
	{
			maxVolume=maxVol;
	}
	public void turnOn()
	{
		on=true;
	}
	public void turnOff()
	{
		on=false;
	}
	public void channelUp()
	{
		if(on=true)
		{
			channel=channel+1;
			if (channel>maxChannel)
			{
				channel=1;
			}
		}
	}
	public void channelDown()
	{
		if(on=true)
		{
			channel=channel-1;
			if(channel<1)
			{
				channel=maxChannel;
			}
		}
	}
	public void volumeUp()
	{
		if(on=true)
		{
			if(volume<maxVolume)
			{
				volume=volume+1;
			}
		}
	}
	public void volumeDown()
	{
		if(on=true)
		{
			if(volume>0)
			{
				volume=volume-1;
			}
		}
	}
	public String toString()
	{
		return("\n\tchannel: "+channel+"\n\tvolume: "+volume+"\n\ton: "+on
			  +"\n\tmaxChannel: "+maxChannel+"\n\tmaxVolume: "+maxVolume);
	}
		
	
}

/*
output:
tv1:
	channel:  1
	volume:   1
tv2 State of: 
	channel: 3
	volume: 2
	on: true
	maxChannel: 120
	maxVolume: 7
tv3:
	channel:  2
tv4:
	volume:  0
	on: true
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi4jled;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.wiringpi.Gpio;

/**
 *
 * @author johnanderson1
 */
public class Pi4JLed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("in");
        GpioController gpio=GpioFactory.getInstance();
        GpioPinDigitalOutput led=gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);
        
        for(int i=0;i<10;i++)
        {
            led.setState(i%2==0);
            Gpio.delay(500);
            
            System.out.println(i);
        }
        System.out.println("out");
        gpio.shutdown();
    }
    
}

SMS
SMS stands for Short Message Service. It is a technology that enables the sending and receiving of messages between mobile phones. SMS first appeared in Europe in 1992. It was included in the GSM (Global System for Mobile Communications) standards right at the beginning. Later it was ported to wireless technologies like CDMA and TDMA. The GSM and SMS standards were originally developed by ETSI. ETSI is the abbreviation for European Telecommunications Standards Institute. Now the 3GPP (Third Generation Partnership Project) is responsible for the development and maintenance of the GSM and SMS standards.

As suggested by the name "Short Message Service", the data that can be held by an SMS message is very limited. One SMS message can contain at most 140 bytes (1120 bits) of data, so one SMS message can contain up to:

160 characters if 7-bit character encoding is used. (7-bit character encoding is suitable for encoding Latin characters like English alphabets.)

70 characters if 16-bit Unicode UCS2 character encoding is used. (SMS text messages containing non-Latin characters like Chinese characters should use 16-bit character encoding.)

SMS text messaging supports languages internationally. It works fine with all languages supported by Unicode, including Arabic, Chinese, Japanese and Korean.

Besides text, SMS messages can also carry binary data. It is possible to send ringtones, pictures, operator logos, wallpapers, animations, business cards (e.g. VCards) and WAP configurations to a mobile phone with SMS messages.
.................................................................................................................
What Makes SMS Messaging So Successful Worldwide?
SMS is a success all over the world. The number of SMS messages exchanged every day is enormous. SMS messaging is now one of the most important revenue sources of wireless carriers. What is so special about SMS that makes it so popular worldwide? Some of the reasons are discussed below.
1-  SMS Messages can be Sent and Read at Any Time
2- SMS Messages can be Sent to an Offline Mobile Phone
3- SMS Messaging is Less Disturbing While You can Still Stay in Touch
4- SMS Messages are Supported by 100% GSM Mobile Phones and They can be Exchanged between Different Wireless Carriers
5- SMS is a Suitable Technology for Wireless Applications to Build on
..................................................................................................
What is an SMS Center / SMSC?
An SMS center (SMSC) is responsible for handling the SMS operations of a wireless network. When an SMS message is sent from a mobile phone, it will reach an SMS center first. The SMS center then forwards the SMS message towards the destination. An SMS message may need to pass through more than one network entity (e.g. SMSC and SMS gateway) before reaching the destination. The main duty of an SMSC is to route SMS messages and regulate the process. If the recipient is unavailable (for example, when the mobile phone is switched off), the SMSC will store the SMS message. It will forward the SMS message when the recipient is available.

Very often an SMSC is dedicated to handle the SMS traffic of one wireless network. A network operator usually manages its own SMSC(s) and locates them inside its wireless network system. However, it is possible for a network operator to use a third-party SMSC that is located outside the wireless network system.

You must know the address of the wireless network operator's SMSC in order to use SMS messaging with your mobile phone. Typically an SMSC address is an ordinary phone number in the international format. A mobile phone should have a menu option that can be used to configure the SMSC address. Normally, the SMSC address is pre-set in the SIM card by the wireless network operator, which means you do not need to make any changes to it.
.................................................................................................................................
Basic Concepts of SMS Technology
1-Validity Period of an SMS Message
2- Message Status Reports
3- Message Submission Reports
4-  Message Delivery Reports
...................................................................................................
Intra-operator SMS Messages
The transmission of an intra-operator SMS message involves only one SMS center. After leaving the sender, the intra-operator SMS message reaches the SMS center. The SMS center then delivers the SMS message to the recipient mobile phone. If the recipient mobile phone is offline, the SMS center stores the SMS message. It will deliver the SMS message when the recipient mobile phone is online. If the SMS message's validity period expires and the recipient mobile phone is still offline, the SMS center will remove the SMS message.

When the SMS center receives the message delivery report from the recipient mobile phone or removes the SMS message (for example, when the validity period expires), it sends a status report to the sender if the sender requested one earlier
.................................................................................................................
 Inter-operator SMS Messages
The transmission of an inter-operator SMS message involves one or more SMS centers. Generally, there are two different ways for the transmission of inter-operator SMS messages. In the first way, signaling interconnections are set up between two wireless networks. When the originator SMS center receives an inter-operator SMS message, it gets the routing information from the recipient wireless network and delivers the SMS message to the recipient mobile phone directly. The following figure illustrates the transmission process:
...............................................................................................................
International SMS Messages
Inter-operator SMS messages can be further divided into two categories -- local inter-operator SMS messages and international inter-operator SMS messages (international SMS messages). A local inter-operator SMS message is an SMS message that is sent from one wireless network operator to another wireless network operator in the same country, while an international SMS message is an SMS message that is sent from a wireless network operator in one country to a wireless network operator in another country.

Usually the cost for sending an international SMS message from a mobile phone is higher than that for sending a local inter-operator SMS message. Hence, the cost for sending an intra-operator SMS message <= the cost for sending a local inter-operator SMS message <= the cost for sending an international SMS message.

The interoperability of SMS messaging between two wireless networks locally and even internationally is undoubtedly a main factor that contributes to the success of SMS worldwide.
.........................................................................................................................
What is an SMS Gateway?
One problem of SMS messaging is that SMSCs developed by different companies use their own communication protocol and most of these protocols are proprietary. For example, Nokia has an SMSC protocol called CIMD whereas another SMSC vendor, CMG, has an SMSC protocol called EMI. We cannot connect two SMSCs if they do not support a common SMSC protocol. To deal with this problem, an SMS gateway is placed between two SMSCs. This is illustrated in the following figure. The SMS gateway acts as a relay between the two SMSCs. It translates one SMSC protocol to another one. This way can be used by two different wireless carriers to interconnect their SMSCs for purposes such as enabling the exchange of inter-operator SMS messages.
.........................................................................................................
Flash SMS
A Flash SMS is a type of SMS that appears directly on the main screen without user interaction and is not automatically stored in the inbox. It can be useful in cases such as an emergency (for example, a fire alarm) or confidentiality (for example, a one-time password).

.............................................................................................................................

How to Send SMS Messages from a Computer / PC?

Steps for Cell phone Modem Intallation

1- Install Nokia PC suite
2- Check modem port from control panel  (phones and modems)
3- install hyperterminal (not included in windows 7)
4- Check the following Modem At Commands
...............................................................................
Command: AT    (This will verify that you are communicating with the modem,the modem should respond with OK)

Command: AT+CMGF=1  (Set message format to TEXT mode.)

COMMAND: AT+CMGS="+923214880408"  

COMMAND:  MSG  CTRL + Z

Note :  If you cannot see characters entered on the screen, enter ATE1V1
..............................................................................
Introduction to AT Commands
AT commands are instructions used to control a modem. AT is the abbreviation of ATtention. Every command line starts with "AT" or "at". That's why modem commands are called AT commands. Many of the commands that are used to control wired dial-up modems, such as ATD (Dial), ATA (Answer), ATH (Hook control) and ATO (Return to online data state), are also supported by GSM/GPRS modems and mobile phones. Besides this common AT command set, GSM/GPRS modems and mobile phones support an AT command set that is specific to the GSM technology, which includes SMS-related commands like AT+CMGS (Send SMS message), AT+CMSS (Send SMS message from storage), AT+CMGL (List SMS messages) and AT+CMGR (Read SMS messages).

Note that the starting "AT" is the prefix that informs the modem about the start of a command line. It is not part of the AT command name. For example, D is the actual AT command name in ATD and +CMGS is the actual AT command name in AT+CMGS. However, some books and web sites use them interchangeably as the name of an AT command.

...........................................................................................................................
Operating Mode: SMS Text Mode and SMS PDU Mode
The SMS specification has defined two modes in which a GSM/GPRS modem or mobile phone can operate. They are called SMS text mode and SMS PDU mode. (PDU stands for Protocol Data Unit.) The mode that a GSM/GPRS modem or mobile phone is operating in determines the syntax of some SMS AT commands and the format of the responses returned after execution. Below are the SMS AT commands affected:

+CMGS (Send Message)

+CMSS (Send Message from Storage)

+CMGR (Read Message)

+CMGL (List Messages)

+CMGW (Write Message to Memory)

+CNMA (New Message Acknowledgement to ME/TA)

+CMGC (Send Command)

The syntax of the unsolicited result codes below also depends on the mode in which the GSM/GPRS modem or mobile phone is operating:

+CMT (Used to forward received SMS messages to the computer / PC.)

+CBM (Used to forward received cell broadcast messages to the computer / PC.)

+CDS (Used to forward received status reports to the computer / PC.)

These two AT commands are useful to you only if SMS text mode is used:

+CSMP (Set Text Mode Parameters)

+CSDH (Show Text Mode Parameters)
....................................................................................
Sending SMS Messages from a Computer / PC Using AT Commands (AT+CMGS, AT+CMSS)

Either of the AT commands +CMGS (command name in text: Send Message) and +CMSS (command name in text: Send Message from Storage) can be used to send SMS messages from a computer / PC. The key difference between them is that the +CMGS AT command takes the SMS message to be sent as a parameter, while the +CMSS AT command takes the index number that specifies the location of the SMS message in the message storage area as a parameter. Following is an example for illustrating the difference. Suppose you want to send the text message "Sending text messages is easy." from a computer / PC to the mobile phone number 91234567 using the +CMGS AT command in SMS text mode. Here is the command line to be used:


AT+CMGS="91234567"<CR>Sending text messages is easy.<Ctrl+z>

To send the same text message using the +CMSS AT command, first you have to use the AT command +CMGW (command name in text: Write Message to Memory) to write the text message to the message storage area. In SMS text mode, the command line should be:


AT+CMGW="91234567"<CR>Sending text messages is easy.<Ctrl+z>


Let's say the SMS text message is now located at index 3 of the message storage area. You can use the +CMSS AT command to send the text message to the message center by the following command line:


AT+CMSS=3


As storage space is limited, if every SMS text message sent is left in the message storage area, there will come a time when no more SMS text messages can be written. To free some storage space, you can use the AT command +CMGD (command name in text: Delete Message) to delete the SMS text message from the message storage area, like this:


AT+CMGD=3


As you can see above, sending an SMS message by the +CMSS AT command is a bit cumbersome, since it involves more steps and AT commands. However, a copy of the sent SMS message can be saved in the message storage area. This is not achievable with the +CMGS AT command.

In some situations, it is more convenient to send SMS messages by the +CMSS AT command than the +CMGS AT command. For example, if you have to send the same SMS message to multiple recipients, using the +CMSS AT command is more convenient:


AT+CMSS=3,"91234567"

AT+CMSS=3,"97777777"

AT+CMSS=3,"96666666"

...


Note: To keep things simple in the above examples, we assume that the same message storage area is used by the AT commands +CMSS, +CMGW, +CMGD and for receiving SMS messages. But this may not be true in real situations. To learn how to set the message storage areas to be used by different SMS operations, please refer to the earlier section "Preferred Message Storage (AT+CPMS)" of this SMS tutorial.
...........................................................................................

What is a GSM Modem?
A GSM modem is a wireless modem that works with a GSM wireless network. A wireless modem behaves like a dial-up modem. The main difference between them is that a dial-up modem sends and receives data through a fixed telephone line while a wireless modem sends and receives data through radio waves.

A GSM modem can be an external device or a PC Card / PCMCIA Card. Typically, an external GSM modem is connected to a computer through a serial cable or a USB cable. A GSM modem in the form of a PC Card / PCMCIA Card is designed for use with a laptop computer. It should be inserted into one of the PC Card / PCMCIA Card slots of a laptop computer.

Like a GSM mobile phone, a GSM modem requires a SIM card from a wireless carrier in order to operate.

As mentioned in earlier sections of this SMS tutorial, computers use AT commands to control modems. Both GSM modems and dial-up modems support a common set of standard AT commands. You can use a GSM modem just like a dial-up modem.

..........................................................................................................
What is a GPRS Modem?
A GPRS modem is a GSM modem that additionally supports the GPRS technology for data transmission. GPRS stands for General Packet Radio Service. It is a packet-switched technology that is an extension of GSM. (GSM is a circuit-switched technology.) A key advantage of GPRS over GSM is that GPRS has a higher data transmission speed.

GPRS can be used as the bearer of SMS. If SMS over GPRS is used, an SMS transmission speed of about 30 SMS messages per minute may be achieved. This is much faster than using the ordinary SMS over GSM, whose SMS transmission speed is about 6 to 10 SMS messages per minute. A GPRS modem is needed to send and receive SMS over GPRS. Note that some wireless carriers do not support the sending and receiving of SMS over GPRS.

If you need to send or receive MMS messages, a GPRS modem is typically needed.
.....................................................................................................................



Comparison of SMS Text Mode and SMS PDU Mode

Below we compare SMS text mode and SMS PDU mode from various aspects. The comparison should help you learn the differences between these two modes and decide which mode should be used by your SMS messaging application.


Syntax of SMS AT Commands and Responses

When the GSM/GPRS modem or mobile phone is operating in different modes, the syntax of certain SMS AT commands and the responses returned after command execution is different. Here's an example for illustration. Let's say you would like to send the SMS message "It is easy to send text messages." to the mobile phone number +85291234567. In SMS text mode, this is the command line that you should enter:


AT+CMGS="+85291234567"<CR>It is easy to send text messages.<Ctrl+z>


However, if the GSM/GPRS modem or mobile phone is operating in SMS PDU mode, executing the above command line will cause an error to occur. This is because the syntax of the +CMGS AT command is different in SMS PDU mode. To do the same task, the following command line should be used instead:
AT+CMGS=42<CR>07915892000000F001000B915892214365F7000021493A283D0795C3F33C88FE06CDCB6E32885EC6D341EDF27C1E3E97E72E<Ctrl+z>
.....................................................................................
Sendig SMS through java
- java support serial port programming 


Steps to Run Java Based SMS Program

1- Copy rxtxParallel.dll and rxtxSerial into system32 folder 

2- Copy RXTXcomm.jar into jre\lib\ext 

3- For Console based application you just need MySms.java file.


..........................................................................................
Example : Send a simple SMS

class  Test{
public static void main(String args[]){
    MySms sms = new MySms("COM6");
    boolean isSent = sms.sendSMS("+923458884420","Test Message");
    if(isSent){
        System.out.println("Sent");
    }
    else{
        System.out.println("Not Sent");
    }
}

..............................................................................................

- The following sms should be in same folder with Test

			MySms.java

import gnu.io.*;
import java.util.Enumeration;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MySms {
	static Enumeration portList;
	static CommPortIdentifier portId;
	static SerialPort serialPort;
	static OutputStream outputStream;
	static InputStream inputStream;
	static boolean outputBufferEmptyFlag = false;
	public String defaultPort;
	public MySms(String comport){
		// File Variable Initialization
		try{
			file=new FileOutputStream("Record.txt");
			out=new PrintWriter(file,true);
		}catch(Exception e){System.out.println("File Error!!!");}
		
		
		defaultPort=comport;
		boolean portFound = false;
		portList = CommPortIdentifier.getPortIdentifiers();
		while (portList.hasMoreElements()) {
			portId = (CommPortIdentifier) portList.nextElement();
		    if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
		    	if (portId.getName().equals(defaultPort)) {
		    		System.out.println("Got Hold on " + defaultPort);
					portFound = true;
		    		try {		    			
		    			serialPort =(SerialPort) portId.open("BULK-SMS", 2000);
		    		}
		    		catch (PortInUseException e) {
		    			System.out.println("Port in use.");
		    			JOptionPane.showMessageDialog(null, "Mobile Not Connected 1...", "Simple SMS Machine", JOptionPane.ERROR_MESSAGE); 
		    		}

		    		try {		    			
		    			outputStream = serialPort.getOutputStream();
		    			inputStream = serialPort.getInputStream();
		    		}catch (IOException e) {
		    			e.printStackTrace();
		    			JOptionPane.showMessageDialog(null, "Mobile Not Connected 2...", "Simple SMS Machine", JOptionPane.ERROR_MESSAGE); 
		    		}

		    		try {
		    			serialPort.setSerialPortParams(460800,
							       SerialPort.DATABITS_8,
							       SerialPort.STOPBITS_1,
							       SerialPort.PARITY_NONE);
		    		}
		    		catch (UnsupportedCommOperationException e) {
		    				JOptionPane.showMessageDialog(null, "Mobile Not Connected 3...", "Simple SMS Machine", JOptionPane.ERROR_MESSAGE); 
		    		}

		    		try {
		    			serialPort.notifyOnOutputEmpty(true);
		    		}catch (Exception e) {
		    			System.out.println("Error setting event notification");
		    			System.out.println(e.toString());
		    			JOptionPane.showMessageDialog(null, "Mobile Not Connected 4...", "Simple SMS Machine", JOptionPane.ERROR_MESSAGE); 
		    		}
			    }
		    }
		}

		if (!portFound) {
		    System.out.println("port " + defaultPort + " not found.");
		    JOptionPane.showMessageDialog(null, "Mobile Not Connected 5...", "Simple SMS Machine", JOptionPane.ERROR_MESSAGE);
		}
		
		
		try{
		
		String sendCmd = "AT+CMGF=1\r";
			outputStream.write(sendCmd.getBytes());
			Thread.sleep(500);
			if(!read(sendCmd.length(),1))
				System.exit(0);
		
		/*		
		//	New Command Which set SMSC number for ZONG
			String smscCmd = "AT+CSCA=\"+923189244444\",145\r";
			outputStream.write(sendCmd.getBytes());
			Thread.sleep(500);
			if(!read(sendCmd.length(),1))
				System.exit(0);*/
				
			JOptionPane.showMessageDialog(null, "Mobile Connected Successfully...", "Simple SMS Machine", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception ex){ex.printStackTrace();}
	}
	public boolean sendSMS(String phone,String msg){
		try {
			Thread.sleep(500);
			String sendCmd = "AT+CMGS=\"" + phone + "\"\r";
			outputStream.write(sendCmd.getBytes());
			Thread.sleep(500);
			if(!read(sendCmd.length(),0)){
				System.exit(0);
			}
			outputStream.write(msg.getBytes());
			this.ctrlZ();
			System.out.println("This is The Point 1");
			Thread.sleep(4000);
			if(!read(msg.length(),1)){
				System.out.println("This is The Point");
				System.exit(0);
				return false;
			}
			count++;
			System.out.println("Count= "+count);			
			out.println(""+count+"               "+phone+"               "+status);
			
					
			return true;
		
		}
		catch (Exception e) {System.out.println("SMS Error");return false;}
	}

	public void ctrlZ(){
		try {

			outputStream.write(26);
		}catch (Exception e) {}
	}
	
	
	public boolean read(int length,int check) {
		while(true){
			
			try{
				
				if(inputStream.available()>0){
					msg=msg+(char)inputStream.read();
					//System.out.println("Response: "+msg);
				}
				if(msg.indexOf("OK")!=-1&&check==1){
					System.out.println("Response: "+msg);
					msg="";
					return true;
				}
				if(msg.indexOf(">")!=-1&&check==0){
					System.out.println("Response: "+msg);
					msg="";
					return true;
				}
				
				
			}catch(Exception e){System.out.println("Reading Error!!! Modem Not Responding!!!");}
		}
		
	}

private int count=0;
private String status="Message Sent";
private String msg;
FileOutputStream file;
PrintWriter out;
}
.........................................................................................................


References

1- http://en.wikipedia.org/wiki/SMS

2- http://www.developershome.com/sms/smsIntro.asp

3- http://www.testech-elect.com/enfora/tutorial_send_receive_sms_using_gsm_modem.htm     

4- http://www.testech-elect.com/enfora/enfora_doc.htm                      

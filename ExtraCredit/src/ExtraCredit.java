
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N Shanel Hickman
 */
public class ExtraCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //create a Message object
        
        Message newMessage = new Message();
        //Message(String sender, ArrayList<String> list_of_recipients,String timeStamp, String body)
        
        newMessage.setSender("aaa@bbb.edu");
        newMessage.addRecipient("bbb@ccc.edu");
        newMessage.addRecipient("fff@foo.com");
        newMessage.setTimeStamp();
        newMessage.setBody("This is the sample body of the message it is multiline \n with " 
                    + newMessage.getNumOfRecipients() + " recipients"
                    + " and a timestamp of " + newMessage.getTimeStamp());
        
        System.out.println(newMessage.toString());
                
    }
    
    static class Message{
        //attributes
        String sender;
        ArrayList <String> list_of_recipients= new ArrayList<>(10);
        String timeStamp;
        String body;
        
        //methods
        public void setSender(String s){    
            this.sender = s;
        }  
        public String getSender(){
        return sender;
        }
        
        public void addRecipient(String s){  
            list_of_recipients.add(s);
        }
        ArrayList<String> getRecipients(){
            return list_of_recipients;
        }
        //fix getRecipients above
        
        int getNumOfRecipients(){
            return list_of_recipients.size();
            }
        
        String setTimeStamp(){
            this.timeStamp = new java.util.Date().toString();
            return timeStamp;
        }
        String getTimeStamp(){
            return timeStamp;
        }
         public void setBody(String s){    
            this.body = s;
        }  
        public String getBody(){
        return sender;
        }
       
        
        @Override
        public String toString(){
            //String s = "It was the best of times, it was the worst of times,\n"
            StringBuilder message1 = new StringBuilder()
                .append("From: ")
                .append(sender)
                .append(System.lineSeparator())    
                .append("To: ")
                .append(Arrays.toString((list_of_recipients.toArray())))
                .append(System.lineSeparator())    
                .append("Date: ") 
                .append(timeStamp)
                .append(System.lineSeparator())
                .append(System.lineSeparator())   
                .append("Hello")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .append(body);
                
            String message2 = message1.toString();
        System.out.println();
        return message2;
        }
        
        //constructor
        Message(){       
        }
    }
    
}

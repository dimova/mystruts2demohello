/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import com.opensymphony.xwork2.ActionSupport;
import model.Message;

/**
 *
 * @author Desi
 */
public class HelloWorld extends ActionSupport{
    private Message message = new Message();
    /**
     *
     * @return
     */
    @Override
    public String execute(){
        setMessage(message);//get data from model
        return "success";
        
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    
}

package com.company;

import by.belstu.it.prykhach.TextFunction;
import by.belstu.it.prykhach.basejava.WrapperString;


public class Main {
    /** @return void
    * @throws Exception
     * @param args
     */
    public static void main(String[] args) {
	//TODO write your code here
        TextFunction Function = new TextFunction();
        System.out.println("anna");

        WrapperString wrapperString = new WrapperString("Prikhach Anna, Java");
        System.out.println(wrapperString.getTempStr());
        wrapperString.replace('i', 'y');

        WrapperString wrapperStringAnon = new WrapperString("Anna Pr") {
            @Override
            public void replace(char oldchar, char newchar) {
                System.out.println(getTempStr());
                delete('a');
            }
             public void delete(char newchar)
            {
                System.out.println(getTempStr().replace(newchar, ' '));
            }
        };

        wrapperStringAnon.replace('J', 'j');





    }
}

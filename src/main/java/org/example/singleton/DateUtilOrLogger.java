package org.example.singleton;

import java.io.Serializable;

/*
problem
* serialize class store in file and then deserialize it we get different instance to avoid
* this problem we need to define method called readResolve which return same instance while de-serializing
*
Reflection breaks singleton pattern so use ENUMS
* */
public class DateUtilOrLogger implements Serializable {

    private static volatile DateUtilOrLogger instance = null;

    private DateUtilOrLogger(){}
/*not adding synchronize at method level as synchronize is very expensive
operation and checking for null as no need to goto sync if instance is already available
*/
    public static DateUtilOrLogger getInstance(){
        if(instance==null){
            synchronized (DateUtilOrLogger.class){
                if(instance==null){
                    instance = new DateUtilOrLogger();
                }
            }
        }

        return instance;
    }

    /*
    * static method only allows static variables whereas vice-versa is not true
    * */
}

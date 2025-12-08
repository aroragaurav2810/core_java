package interview_preparation_oops_and_core_java_coding_set4;

public class Logger

{


    static Logger log=new Logger();


    private Logger()
    {

    }

    public static Logger getLoggerInstance()
    {
        return log;
    }


}


class LoggerImplementationClass1
{
    static void main() {
        Logger log1=Logger.getLoggerInstance();
        Logger log2=Logger.getLoggerInstance();
        if(log1==log2)
        {
            System.out.println("Both objects of Logger Singleton class are same in LoggerImplementationClass1");
        }
        else
        {
            System.out.println("Both objects of Logger Singleton class are not same");
        }
    }
}


class LoggerImplementationClass2
{
    static void main() {
        Logger log1=Logger.getLoggerInstance();
        Logger log2=Logger.getLoggerInstance();
        if(log1==log2)
        {
            System.out.println("Both objects of Logger Singleton class are same in LoggerImplementationClass2");
        }
        else
        {
            System.out.println("Both objects of Logger Singleton class are not same");
        }
    }
}
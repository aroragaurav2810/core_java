package interview_preparation_oops_and_core_java_coding_set4;



public class DatabaseConnections
{

    static DatabaseConnections obj=new DatabaseConnections();

    private DatabaseConnections()

    {
    }

    public static DatabaseConnections getDatabaseInstance()
    {
        return obj;
    }


}




class DatabaseConnectionUsage1
{

    static void main() {
        DatabaseConnections con1=DatabaseConnections.getDatabaseInstance();
        DatabaseConnections con2=DatabaseConnections.getDatabaseInstance();
        if(con1==con2)
        {
            System.out.println("Both objects of DatabaseConnections Singleton class are same in DatabaseConnectionUsage1");
        }
        else
        {
            System.out.println("Both objects of DatabaseConnections Singleton class are not same");
        }
    }

}


class DatabaseConnectionUsage2
{

    static void main() {
        DatabaseConnections con1=DatabaseConnections.getDatabaseInstance();
        DatabaseConnections con2=DatabaseConnections.getDatabaseInstance();
        if(con1==con2)
        {
            System.out.println("Both objects of DatabaseConnections Singleton class are same in DatabaseConnectionUsage2");
        }
        else
        {
            System.out.println("Both objects of DatabaseConnections Singleton class are not same");
        }
    }

}
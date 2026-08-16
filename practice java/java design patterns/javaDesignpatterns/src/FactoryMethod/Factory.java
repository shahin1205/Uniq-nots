package FactoryMethod;
interface  DataBase{
    void connection();
}

class MySql implements DataBase{
    @Override
    public void connection() {
        System.out.println("connected to MySql");
    }
}
class MongoDB implements DataBase{
    public void connection(){
        System.out.println("connected to MongoDB");
    }
}

class DbFactory{
    static DataBase getconnection(String database){
        switch (database){
            case "MySql":
                return new MySql();
            case "MongoDB":
                return new MongoDB();
        }
        return null;
    }
}


public class Factory {
    public static void main(String[] args) {
        DataBase db=DbFactory.getconnection("MySql");
        db.connection();
        DataBase db1=DbFactory.getconnection("MongoDB");
        db1.connection();
    }
}

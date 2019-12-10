import Model.Mediator.Database;
import Model.Server.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Database database=new Database("Simpluhhh1");
        Server sv=new Server(database);

    }
}

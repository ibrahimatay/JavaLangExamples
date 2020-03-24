package interfaces;

import models.Connection;
import models.SqlServerConnection;

public interface ConnectionBuilder {
    SqlServerConnection build(Connection connection);
}

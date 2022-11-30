package com.mjc.stage2;

import java.sql.SQLException;

public interface Connection {

     void close() throws SQLException;

     boolean isClosed() throws SQLException;
}

package nutricionalappfx.modelo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author LEGION
 */
public class ConexionBD {
    static final Properties propiedades = new Properties();
    
    static {
        try {
            InputStream input = ConexionBD.class.getResourceAsStream("database.properties");
            if(input == null){
                throw new RuntimeException("Error: No se encontró el archivo database.properties");
            }
            
            propiedades.load(input);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static Connection obtenerConexion() throws SQLException{
        try {
            Class.forName(propiedades.getProperty("db.driver"));
            return DriverManager.getConnection(propiedades.getProperty("db.url"), propiedades.getProperty("db.user"), propiedades.getProperty("db.password"));
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
            
}

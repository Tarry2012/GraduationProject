package sqlmap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by tqy on 15-11-28.
 */
public class SQLMapHandle {
    public static SqlSessionFactory sqlSessionFactory;
    public static Reader reader;
    static{
        try{
            reader = Resources.getResourceAsReader("sqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

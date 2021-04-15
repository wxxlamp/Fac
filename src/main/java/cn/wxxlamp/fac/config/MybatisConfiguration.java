package cn.wxxlamp.fac.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wxxlamp
 * @date 2021/03/29~15:56
 */
public class MybatisConfiguration {

    private static SqlSessionFactory sqlSessionFactory;

    private static final String RESOURCE = "mybatis-config.xml";

    public static SqlSessionFactory getSessionFactory() {
        if (sqlSessionFactory == null) {
            try (InputStream inputStream = Resources.getResourceAsStream(RESOURCE)) {
                sqlSessionFactory = new
                        SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    public static <T> T getDao(Class<T> type) {
        return getSessionFactory().openSession(true).getMapper(type);
    }

}

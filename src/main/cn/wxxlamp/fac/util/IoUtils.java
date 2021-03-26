package cn.wxxlamp.fac.util;

import cn.wxxlamp.fac.model.FinancialAppDesc;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wxxlamp
 * @date 2021/03/26~09:26
 */
public class IoUtils {

    private static final Map<String, File> FILE_MAP = new HashMap<>(4);

    private static final Log LOG = LogFactory.getLog(IoUtils.class);

    private static File checkFile(String fileName) {
        File file = FILE_MAP.get(fileName);
        if (file == null) {
            file = new File("wxx\\" + fileName);
            FILE_MAP.put(fileName, file);
            LOG.info(fileName + "was existed");
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static void writeFile(Map<String, List<FinancialAppDesc>> map, boolean append) {
        for (String key : map.keySet()) {
            File file = checkFile(key);
            try {
                try (FileWriter writer = new FileWriter(file,append);
                     BufferedWriter out = new BufferedWriter(writer)
                ) {
                    List<FinancialAppDesc> list = map.get(key);
                    for (FinancialAppDesc fad : list) {
                        out.write(fad + "\r\n");
                        out.flush();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile(String key, List<FinancialAppDesc> list, boolean append) {
        File file = checkFile(key);
        try {
            try (FileWriter writer = new FileWriter(file,append);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                for (FinancialAppDesc fad : list) {
                    out.write(fad + "\r\n");
                    out.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String key, FinancialAppDesc fad) {
        File file = checkFile(key);
        try {
            try (FileWriter writer = new FileWriter(file,true);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write(fad + "\r\n");
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

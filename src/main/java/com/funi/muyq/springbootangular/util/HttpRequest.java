package com.funi.muyq.springbootangular.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Package: [com.funi.muyq.springbootangular.utilHttpRequest]
 * @Description: []
 * @Author: [yuanqiang.mou@funi365.com]
 * @CreateDate: [2018/4/1611:21]
 * @UpdateUser: []
 * @UpdateDate: []
 * @UpdateRemark: []
 * @Version: [v1.0]
 */
@Slf4j
public class HttpRequest {
    public static void main(String[] args) throws IOException, SQLException {
        getDataFromBrowserSearch();
    }

    public static void getDataFromBrowserSearch() throws IOException {
        String key = "留邮箱"; //查询关键字
        key = URLEncoder.encode(key, "utf-8");
        // http://www.baidu.com/s?wd={query}
        URL url = new URL("http://www.goole.com/search?q=" + key);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                connection.getInputStream(), "utf-8"));

        String str;
        Pattern urlPattern = Pattern.compile("(https?)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
        while ((str = reader.readLine()) != null) {
            log.info("response data: {}", str);

            Matcher u = urlPattern.matcher(str);
            while (u.find()) {
                String result = u.group();
                log.info("response data: {}", result);
                // writedata(result);
            }
        }
        reader.close();
    }

    public static void writedata(String url) throws IOException {
        URL u2 = new URL(url);
        BufferedReader rea = new BufferedReader(new InputStreamReader(
                u2.openStream(), "utf-8"));
        String str = null;
        Pattern emailr = Pattern.compile("\\w{6,15}[@]\\w+(\\.[a-zA-Z]+){1,3}");
        while ((str = rea.readLine()) != null) {
            Matcher em = emailr.matcher(str);
            while (em.find()) {
                String result = em.group();
                // Database d = Database.getDatabase();
                // d.update(result);
            }
        }
    }
}

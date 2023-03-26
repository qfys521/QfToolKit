package cn.qfys521.QfToolKit.HttpUtil;


import okhttp3.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import static cn.qfys521.QfToolKit.HttpUtil.SslUtils.trustAllHttpsCertificates;

/**
 * @author qfys521
 */
public class HttpUtils {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    /**
     * @param url url
     * @return sb.toString()
     * @throws IOException IOE
     */
    public String getUrlData(String url) throws Exception {
        trustAllHttpsCertificates();
        URL Url = new URL(url);
        URLConnection conn = Url.openConnection();

        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        isr.close();
        is.close();
        return sb.toString();
    }

    /**
     * @param Url      Url
     * @param PostData PostData
     * @return sb.toString()
     * @throws IOException IOE
     */
    public String PostUrlData(String Url, String PostData) throws Exception {
        trustAllHttpsCertificates();
        URL url = new URL(Url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");

        OutputStream os = connection.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(PostData);
        bw.flush();

        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line;
        StringBuilder sb = new StringBuilder();
        if ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        isr.close();
        is.close();
        bw.close();
        osw.close();
        os.close();
        return sb.toString();
    }

    public String post(String url, String json) throws Exception {
        trustAllHttpsCertificates();
        RequestBody body = RequestBody.create(json, JSON);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}



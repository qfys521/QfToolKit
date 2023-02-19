package cn.qfys521.Utils.HttpUtil;


import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import static cn.qfys521.Utils.HttpUtil.SslUtils.trustAllHttpsCertificates;

/**
 * @author qfys521
 */
public class getURLData {
    /**
     * @param url url
     * @return sb.toString()
     * @throws IOException IOE
     */
    public String getUrlData(String url) throws Exception {
        trustAllHttpsCertificates();
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
                return true;
            }
        };
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
    public String PostUrlData(String Url, String PostData) throws IOException {
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
}



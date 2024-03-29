package cn.qfys521.QfToolKit.DataUtil;


import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class yamlUtil {

    private String path;

    public Map<Object, Object> read(String path) throws IOException {
        Yaml yml = new Yaml();
        FileReader reader = new FileReader(path);
        BufferedReader buffer = new BufferedReader(reader);
        Map<Object, Object> map = yml.load(buffer);
        buffer.close();
        reader.close();
        return map;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<Object, Object> read() throws IOException {
        Yaml yml = new Yaml();
        FileReader reader = new FileReader(this.path);
        BufferedReader buffer = new BufferedReader(reader);
        Map<Object, Object> map = yml.load(buffer);
        buffer.close();
        reader.close();
        return map;
    }

    public void write(Map<Object, Object> map) throws IOException {
        if(new File(path).length()!=0){
            Map<Object, Object> m = this.read();
            m.putAll(map);
            w(this.path,m);
        }else {
            w(this.path,map);
        }

    }

    public void write(String path, Map<Object, Object> map) throws IOException {
        if(new File(path).length()!=0){
            Map<Object, Object> m = this.read();
            m.putAll(map);
            w(path,m);
        }else {
            w(path,map);
        }
    }
    private void w(String path,Map<Object,Object> map) throws IOException {
        Yaml yml = new Yaml();
        FileWriter writer = new FileWriter(path, false);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.newLine();
        yml.dump(map, buffer);
        buffer.close();
        writer.close();
    }

}

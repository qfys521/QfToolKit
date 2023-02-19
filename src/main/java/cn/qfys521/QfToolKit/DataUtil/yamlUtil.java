package cn.qfys521.Utils.DataUtil;

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

    public void write(String path, Map<Object, Object> map) throws IOException {
        Yaml yml = new Yaml();
        FileWriter writer = new FileWriter(path, true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.newLine();
        yml.dump(map, buffer);
        buffer.close();
        writer.close();
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
        Yaml yml = new Yaml();
        FileWriter writer = new FileWriter(this.path, true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.newLine();
        yml.dump(map, buffer);
        buffer.close();
        writer.close();
    }


}

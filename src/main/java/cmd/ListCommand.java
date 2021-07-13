package main.java.cmd;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import main.java.dep.Module;


/**
 * Created by IntelliJ IDEA.
 * User: christian
 */
public class ListCommand implements Command {


    @Override
    public Map<String, Object> execute(List<String> args) {
        Map<String, Object> result = new LinkedHashMap<>();
        Module.getInstalled().forEach(m -> result.put(m.getName(),""));
        return result;
    }

}

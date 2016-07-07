package collectionpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TaskList {
    private static HashMap<Integer, String[]> dataz = new HashMap<Integer, String[]>();
    private static HashMap<Integer, String[]> screen_dataz = new HashMap<Integer, String[]>();
    public final static String[][] longValues = {
            { "10", "kstc-proc", "10.10.10.10.10.", "5", "O" },
            { "11", "proc-lvk1", "12.1.2.", "4", "O" },
            { "13", "trng-lvk1", "4.6.1.", "3", "O" } };
    private static String sl, pid, tid, mval, status;

    public static void main(String args[]) {
        addTask();
    }

    public static void addTask() {
        for (int k = 0; k < longValues.length; k++) {
            screen_dataz.put(k, longValues[k]);
        }
        Set<Entry<Integer, String[]>> mapSet = screen_dataz.entrySet();
        Iterator<Entry<Integer, String[]>> mapIterator = mapSet.iterator();
        while (mapIterator.hasNext()) {
            Entry<Integer, String[]> mapEntry = mapIterator.next();
            Integer keyValue = mapEntry.getKey();
            String[] value = mapEntry.getValue();
            System.out.println(Arrays.toString(value));
        
        }
    }
}
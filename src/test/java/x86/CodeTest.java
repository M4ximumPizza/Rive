package x86;

import mi.m4x.rive.Code;

import java.lang.reflect.Field;
import java.util.*;

public class CodeTest {
    public static void run() {
        Map<Integer, String> idToName = new TreeMap<>();
        try {
            for (Field field : Code.class.getDeclaredFields()) {
                if (field.getType() == int.class) {
                    field.setAccessible(true);
                    int value = field.getInt(null);
                    idToName.put(value, field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Total int fields: " + idToName.size());

        Integer previousId = null;
        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            int currentId = entry.getKey();

            if (previousId != null && currentId != previousId + 1) {
                System.out.println("Missing ID(s) between " + previousId + " and " + currentId);
            }

            System.out.println("Name: " + entry.getValue() + ", ID: " + currentId);
            previousId = currentId;
        }
    }
}

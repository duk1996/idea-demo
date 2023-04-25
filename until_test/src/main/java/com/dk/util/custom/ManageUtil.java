package com.dk.util.custom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * @author dukun
 * @description 针对模型管理提供的工具类（本地测试）
 */
public class ManageUtil {

    private static int level;

    enum ModelSourceTest {

        MODEL_CONVERSION(new HashMap<String, String>() {{
            put("MODEL_CONVERSION", "1");
        }}),
        MODEL_OPT(new HashMap<String, String>() {{
            put("MODEL_OPT", "2");
        }});

        final Map<String, String> value;

        ModelSourceTest(Map<String, String> value) {
            this.value = value;
        }

        public Map<String, String> getValue() {
            return value;
        }
    }

    enum A {
        TEST
    }

    public static void main(String[] args) {

        String s = numberIncr("1.0.0", "3");
        System.out.println(s);


    }


    public static String numberIncr(String version, String source) {
        int level;
        switch (source) {
            case "2":
                level = 2;
                break;
            case "3":
                level = 3;
                break;
            case "4":
                level = 4;
                break;
            default:
                level = 1;
                break;
        }
        String[] versionNumber = version.split("\\.");

        if (versionNumber.length <= 3) {
            String[] newVersion = new String[4];
            for (int i = 0; i < newVersion.length; i++) {
                if (versionNumber.length - 1 >= i) {
                    newVersion[i] = versionNumber[i];
                    continue;
                }
                newVersion[i] = "0";
            }
            versionNumber = newVersion;
        }

        String incrNumber = versionNumber[level - 1];
        int i = Integer.parseInt(incrNumber) + 1;
        versionNumber[level - 1] = String.valueOf(i);
        StringJoiner joiner = new StringJoiner(".");
        Arrays.stream(versionNumber).forEach(joiner::add);

        return joiner.toString();
    }

}

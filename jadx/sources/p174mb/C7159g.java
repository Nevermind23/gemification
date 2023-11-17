package p174mb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.zxing.C5754d;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: mb.g */
public abstract class C7159g {

    /* renamed from: a */
    private static final String f21193a = "g";

    /* renamed from: b */
    private static final Pattern f21194b = Pattern.compile(",");

    /* renamed from: a */
    public static Map m27542a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5754d.class);
        for (C5754d dVar : C5754d.values()) {
            if (!(dVar == C5754d.CHARACTER_SET || dVar == C5754d.NEED_RESULT_POINT_CALLBACK || dVar == C5754d.POSSIBLE_FORMATS)) {
                String name = dVar.name();
                if (extras.containsKey(name)) {
                    if (dVar.mo18877a().equals(Void.class)) {
                        enumMap.put(dVar, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(name);
                        if (dVar.mo18877a().isInstance(obj)) {
                            enumMap.put(dVar, obj);
                        } else {
                            Log.w(f21193a, "Ignoring hint " + dVar + " because it is not assignable from " + obj);
                        }
                    }
                }
            }
        }
        Log.i(f21193a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}

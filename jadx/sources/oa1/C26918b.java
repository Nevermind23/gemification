package oa1;

import androidx.appcompat.widget.SwitchCompat;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p316xa.C8982a;

/* renamed from: oa1.b */
public abstract class C26918b {

    /* renamed from: oa1.b$a */
    public static final class C26919a extends C8982a<Map<String, ? extends Object>> {
    }

    /* renamed from: a */
    public static final boolean m83689a(SwitchCompat switchCompat) {
        C41536l.m120489i(switchCompat, "<this>");
        boolean isChecked = switchCompat.isChecked();
        switchCompat.toggle();
        switchCompat.jumpDrawablesToCurrentState();
        return isChecked;
    }

    /* renamed from: b */
    public static final Map m83690b(Object obj) {
        Object obj2;
        try {
            Gson gson = new Gson();
            obj2 = gson.mo18171m(gson.mo18181w(obj), new C26919a().getType());
        } catch (Exception unused) {
            obj2 = null;
        }
        Map map = (Map) obj2;
        if (map == null) {
            return C41344r0.m119928j();
        }
        return map;
    }

    /* renamed from: c */
    public static final Map m83691c(Map map) {
        C41536l.m120489i(map, "<this>");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                hashMap.put(entry.getKey(), value);
            }
        }
        return hashMap;
    }
}

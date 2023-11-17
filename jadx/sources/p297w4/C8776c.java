package p297w4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w4.c */
public abstract class C8776c {

    /* renamed from: a */
    private static final Map f24640a;

    /* renamed from: w4.c$a */
    static class C8777a implements C8784h {
        C8777a() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: w4.c$b */
    static class C8778b implements C8784h {
        C8778b() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: w4.c$c */
    static class C8779c implements C8784h {
        C8779c() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: w4.c$d */
    static class C8780d implements C8784h {
        C8780d() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: w4.c$e */
    static class C8781e implements C8784h {
        C8781e() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: w4.c$f */
    static class C8782f implements C8784h {
        C8782f() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: w4.c$g */
    static class C8783g implements C8784h {
        C8783g() {
        }

        /* renamed from: a */
        public void mo24188a(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: w4.c$h */
    public interface C8784h {
        /* renamed from: a */
        void mo24188a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f24640a = hashMap;
        hashMap.put(Boolean.class, new C8777a());
        hashMap.put(Integer.class, new C8778b());
        hashMap.put(Long.class, new C8779c());
        hashMap.put(Double.class, new C8780d());
        hashMap.put(String.class, new C8781e());
        hashMap.put(String[].class, new C8782f());
        hashMap.put(JSONArray.class, new C8783g());
    }

    /* renamed from: a */
    public static Bundle m32719a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m32719a((JSONObject) obj));
                } else {
                    C8784h hVar = (C8784h) f24640a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.mo24188a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}

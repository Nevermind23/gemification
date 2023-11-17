package p244s3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s3.k */
public final class C8179k implements C8176i {

    /* renamed from: c */
    private final Map f23330c;

    /* renamed from: d */
    private volatile Map f23331d;

    /* renamed from: s3.k$a */
    public static final class C8180a {

        /* renamed from: d */
        private static final String f23332d;

        /* renamed from: e */
        private static final Map f23333e;

        /* renamed from: a */
        private boolean f23334a = true;

        /* renamed from: b */
        private Map f23335b = f23333e;

        /* renamed from: c */
        private boolean f23336c = true;

        static {
            String b = m30875b();
            f23332d = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C8181b(b)));
            }
            f23333e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m30875b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C8179k mo23375a() {
            this.f23334a = true;
            return new C8179k(this.f23335b);
        }
    }

    /* renamed from: s3.k$b */
    static final class C8181b implements C8178j {

        /* renamed from: a */
        private final String f23337a;

        C8181b(String str) {
            this.f23337a = str;
        }

        /* renamed from: a */
        public String mo23371a() {
            return this.f23337a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8181b) {
                return this.f23337a.equals(((C8181b) obj).f23337a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23337a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f23337a + '\'' + '}';
        }
    }

    C8179k(Map map) {
        this.f23330c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m30872b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((C8178j) list.get(i)).mo23371a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map m30873c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f23330c.entrySet()) {
            String b = m30872b((List) entry.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(entry.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map mo23370a() {
        if (this.f23331d == null) {
            synchronized (this) {
                if (this.f23331d == null) {
                    this.f23331d = Collections.unmodifiableMap(m30873c());
                }
            }
        }
        return this.f23331d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8179k) {
            return this.f23330c.equals(((C8179k) obj).f23330c);
        }
        return false;
    }

    public int hashCode() {
        return this.f23330c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f23330c + '}';
    }
}

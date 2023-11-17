package p248s7;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: s7.b */
public final class C8245b {

    /* renamed from: b */
    public static final C8245b f23454b = new C8245b((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final EnumMap f23455a;

    public C8245b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(C8243a.class);
        this.f23455a = enumMap;
        enumMap.put(C8243a.AD_STORAGE, bool);
        enumMap.put(C8243a.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C8245b m31052a(Bundle bundle) {
        if (bundle == null) {
            return f23454b;
        }
        EnumMap enumMap = new EnumMap(C8243a.class);
        for (C8243a aVar : C8243a.values()) {
            enumMap.put(aVar, m31057n(bundle.getString(aVar.f23453d)));
        }
        return new C8245b(enumMap);
    }

    /* renamed from: b */
    public static C8245b m31053b(String str) {
        EnumMap enumMap = new EnumMap(C8243a.class);
        if (str != null) {
            int i = 0;
            while (true) {
                C8243a[] aVarArr = C8243a.f23451g;
                int length = aVarArr.length;
                if (i >= 2) {
                    break;
                }
                C8243a aVar = aVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(aVar, bool);
                }
                i++;
            }
        }
        return new C8245b(enumMap);
    }

    /* renamed from: g */
    public static String m31054g(Bundle bundle) {
        String string;
        for (C8243a aVar : C8243a.values()) {
            if (bundle.containsKey(aVar.f23453d) && (string = bundle.getString(aVar.f23453d)) != null && m31057n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m31055j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    static final int m31056m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    private static Boolean m31057n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C8245b mo23428c(C8245b bVar) {
        boolean z;
        EnumMap enumMap = new EnumMap(C8243a.class);
        for (C8243a aVar : C8243a.values()) {
            Boolean bool = (Boolean) this.f23455a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f23455a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (!bool.booleanValue() || !bool2.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put(aVar, bool);
        }
        return new C8245b(enumMap);
    }

    /* renamed from: d */
    public final C8245b mo23429d(C8245b bVar) {
        EnumMap enumMap = new EnumMap(C8243a.class);
        for (C8243a aVar : C8243a.values()) {
            Boolean bool = (Boolean) this.f23455a.get(aVar);
            if (bool == null) {
                bool = (Boolean) bVar.f23455a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new C8245b(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo23430e() {
        return (Boolean) this.f23455a.get(C8243a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8245b)) {
            return false;
        }
        C8245b bVar = (C8245b) obj;
        for (C8243a aVar : C8243a.values()) {
            if (m31056m((Boolean) this.f23455a.get(aVar)) != m31056m((Boolean) bVar.f23455a.get(aVar))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo23432f() {
        return (Boolean) this.f23455a.get(C8243a.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo23433h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        C8243a[] aVarArr = C8243a.f23451g;
        int length = aVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f23455a.get(aVarArr[i]);
            if (bool == null) {
                c = '-';
            } else if (bool.booleanValue()) {
                c = '1';
            } else {
                c = '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f23455a.values()) {
            i = (i * 31) + m31056m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo23435i(C8243a aVar) {
        Boolean bool = (Boolean) this.f23455a.get(aVar);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo23436k(C8245b bVar) {
        return mo23437l(bVar, (C8243a[]) this.f23455a.keySet().toArray(new C8243a[0]));
    }

    /* renamed from: l */
    public final boolean mo23437l(C8245b bVar, C8243a... aVarArr) {
        for (C8243a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f23455a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f23455a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        C8243a[] values = C8243a.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C8243a aVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(aVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f23455a.get(aVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C8245b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C8243a.class);
        this.f23455a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}

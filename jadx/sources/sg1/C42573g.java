package sg1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: sg1.g */
public abstract class C42573g implements C42569c {

    /* renamed from: a */
    private byte[] f100183a;

    /* renamed from: b */
    private TreeMap f100184b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: a */
    public void mo98023a(String str, String str2) {
        this.f100184b.put(str, str2);
    }

    /* renamed from: c */
    public boolean mo98027c(String str) {
        return this.f100184b.containsKey(str);
    }

    /* renamed from: e */
    public Iterator mo98028e() {
        return Collections.unmodifiableSet(this.f100184b.keySet()).iterator();
    }

    /* renamed from: f */
    public byte[] mo98029f() {
        return this.f100183a;
    }

    /* renamed from: j */
    public String mo98030j(String str) {
        String str2 = (String) this.f100184b.get(str);
        return str2 == null ? "" : str2;
    }
}

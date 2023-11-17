package p166m3;

import androidx.collection.ArrayMap;
import java.security.MessageDigest;
import p089g4.C6209b;

/* renamed from: m3.h */
public final class C7088h implements C7083e {

    /* renamed from: b */
    private final ArrayMap f21049b = new C6209b();

    /* renamed from: g */
    private static void m27370g(C7085g gVar, Object obj, MessageDigest messageDigest) {
        gVar.mo21309g(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        for (int i = 0; i < this.f21049b.size(); i++) {
            m27370g((C7085g) this.f21049b.keyAt(i), this.f21049b.valueAt(i), messageDigest);
        }
    }

    /* renamed from: c */
    public Object mo21312c(C7085g gVar) {
        return this.f21049b.containsKey(gVar) ? this.f21049b.get(gVar) : gVar.mo21307c();
    }

    /* renamed from: d */
    public void mo21313d(C7088h hVar) {
        this.f21049b.putAll(hVar.f21049b);
    }

    /* renamed from: e */
    public C7088h mo21314e(C7085g gVar) {
        this.f21049b.remove(gVar);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7088h) {
            return this.f21049b.equals(((C7088h) obj).f21049b);
        }
        return false;
    }

    /* renamed from: f */
    public C7088h mo21315f(C7085g gVar, Object obj) {
        this.f21049b.put(gVar, obj);
        return this;
    }

    public int hashCode() {
        return this.f21049b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f21049b + '}';
    }
}

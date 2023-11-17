package p076f4;

import java.security.MessageDigest;
import p089g4.C6223k;
import p166m3.C7083e;

/* renamed from: f4.d */
public final class C6156d implements C7083e {

    /* renamed from: b */
    private final Object f19138b;

    public C6156d(Object obj) {
        this.f19138b = C6223k.m24730d(obj);
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(this.f19138b.toString().getBytes(C7083e.f21042a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6156d) {
            return this.f19138b.equals(((C6156d) obj).f19138b);
        }
        return false;
    }

    public int hashCode() {
        return this.f19138b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f19138b + '}';
    }
}

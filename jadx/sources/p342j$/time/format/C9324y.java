package p342j$.time.format;

import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.y */
public final class C9324y {

    /* renamed from: a */
    public static final C9324y f25841a = new C9324y();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C9324y() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9324y)) {
            return false;
        }
        ((C9324y) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}

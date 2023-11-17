package androidx.core.content;

import android.content.LocusId;

public final class LocusIdCompat {

    /* renamed from: a */
    private final String f3396a;

    /* renamed from: b */
    private final LocusId f3397b;

    /* renamed from: a */
    private String m2889a() {
        int length = this.f3396a.length();
        return length + "_chars";
    }

    /* renamed from: b */
    public LocusId mo3238b() {
        return this.f3397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f3396a;
        if (str != null) {
            return str.equals(locusIdCompat.f3396a);
        }
        if (locusIdCompat.f3396a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3396a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m2889a() + "]";
    }
}

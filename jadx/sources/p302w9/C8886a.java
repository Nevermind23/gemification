package p302w9;

import java.util.List;

/* renamed from: w9.a */
final class C8886a extends C8899l {

    /* renamed from: a */
    private final String f24894a;

    /* renamed from: b */
    private final List f24895b;

    C8886a(String str, List list) {
        if (str != null) {
            this.f24894a = str;
            if (list != null) {
                this.f24895b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    /* renamed from: b */
    public List mo24310b() {
        return this.f24895b;
    }

    /* renamed from: c */
    public String mo24311c() {
        return this.f24894a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8899l)) {
            return false;
        }
        C8899l lVar = (C8899l) obj;
        if (!this.f24894a.equals(lVar.mo24311c()) || !this.f24895b.equals(lVar.mo24310b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f24894a.hashCode() ^ 1000003) * 1000003) ^ this.f24895b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f24894a + ", usedDates=" + this.f24895b + "}";
    }
}

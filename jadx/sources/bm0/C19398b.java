package bm0;

import kotlin.jvm.internal.C41536l;

/* renamed from: bm0.b */
public final class C19398b {

    /* renamed from: a */
    private final String f53621a;

    public C19398b(String str) {
        C41536l.m120489i(str, "insurance");
        this.f53621a = str;
    }

    /* renamed from: a */
    public final String mo47619a() {
        return this.f53621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19398b) && C41536l.m120484d(this.f53621a, ((C19398b) obj).f53621a);
    }

    public int hashCode() {
        return this.f53621a.hashCode();
    }

    public String toString() {
        String str = this.f53621a;
        return "TravelInsuranceInfoModel(insurance=" + str + ")";
    }
}

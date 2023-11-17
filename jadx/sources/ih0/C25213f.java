package ih0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ih0.f */
public final class C25213f {

    /* renamed from: a */
    private final String f64780a;

    public C25213f(String str) {
        C41536l.m120489i(str, "gamificationToken");
        this.f64780a = str;
    }

    /* renamed from: a */
    public final String mo63736a() {
        return this.f64780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25213f) && C41536l.m120484d(this.f64780a, ((C25213f) obj).f64780a);
    }

    public int hashCode() {
        return this.f64780a.hashCode();
    }

    public String toString() {
        String str = this.f64780a;
        return "GamificationToken(gamificationToken=" + str + ")";
    }
}

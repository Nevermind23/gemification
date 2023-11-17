package p684yi;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: yi.c */
public final class C18921c {

    /* renamed from: a */
    private final String f52916a;

    /* renamed from: b */
    private final String f52917b;

    /* renamed from: c */
    private final Color f52918c;

    public C18921c(String str, String str2, Color color) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "amountText");
        C41536l.m120489i(color, "backgroundColor");
        this.f52916a = str;
        this.f52917b = str2;
        this.f52918c = color;
    }

    /* renamed from: a */
    public final String mo46954a() {
        return this.f52917b;
    }

    /* renamed from: b */
    public final Color mo46955b() {
        return this.f52918c;
    }

    /* renamed from: c */
    public final String mo46956c() {
        return this.f52916a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18921c)) {
            return false;
        }
        C18921c cVar = (C18921c) obj;
        return C41536l.m120484d(this.f52916a, cVar.f52916a) && C41536l.m120484d(this.f52917b, cVar.f52917b) && C41536l.m120484d(this.f52918c, cVar.f52918c);
    }

    public int hashCode() {
        return (((this.f52916a.hashCode() * 31) + this.f52917b.hashCode()) * 31) + this.f52918c.hashCode();
    }

    public String toString() {
        String str = this.f52916a;
        String str2 = this.f52917b;
        Color color = this.f52918c;
        return "LimitInfoData(title=" + str + ", amountText=" + str2 + ", backgroundColor=" + color + ")";
    }
}

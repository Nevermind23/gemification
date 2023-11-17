package oj0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oj0.d */
public final class C27024d {

    /* renamed from: a */
    private final String f67844a;

    /* renamed from: b */
    private final int f67845b;

    /* renamed from: c */
    private final List f67846c;

    public C27024d(String str, int i, List list) {
        C41536l.m120489i(str, "buttonText");
        C41536l.m120489i(list, "sliders");
        this.f67844a = str;
        this.f67845b = i;
        this.f67846c = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C27024d m83846b(C27024d dVar, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.f67844a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f67845b;
        }
        if ((i2 & 4) != 0) {
            list = dVar.f67846c;
        }
        return dVar.mo66255a(str, i, list);
    }

    /* renamed from: a */
    public final C27024d mo66255a(String str, int i, List list) {
        C41536l.m120489i(str, "buttonText");
        C41536l.m120489i(list, "sliders");
        return new C27024d(str, i, list);
    }

    /* renamed from: c */
    public final String mo66256c() {
        return this.f67844a;
    }

    /* renamed from: d */
    public final int mo66257d() {
        return this.f67845b;
    }

    /* renamed from: e */
    public final List mo66258e() {
        return this.f67846c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27024d)) {
            return false;
        }
        C27024d dVar = (C27024d) obj;
        return C41536l.m120484d(this.f67844a, dVar.f67844a) && this.f67845b == dVar.f67845b && C41536l.m120484d(this.f67846c, dVar.f67846c);
    }

    public int hashCode() {
        return (((this.f67844a.hashCode() * 31) + this.f67845b) * 31) + this.f67846c.hashCode();
    }

    public String toString() {
        String str = this.f67844a;
        int i = this.f67845b;
        List list = this.f67846c;
        return "State(buttonText=" + str + ", sliderCurrentItem=" + i + ", sliders=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27024d(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "giftcard.terms.of.use.next.button" : str, (i2 & 2) != 0 ? 0 : i, list);
    }
}

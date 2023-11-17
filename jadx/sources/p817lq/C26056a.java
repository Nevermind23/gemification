package p817lq;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p970zw.C30412a;

/* renamed from: lq.a */
public final class C26056a {

    /* renamed from: a */
    private final List f66149a;

    /* renamed from: b */
    private final C30412a f66150b;

    /* renamed from: c */
    private final String f66151c;

    /* renamed from: d */
    private final String f66152d;

    public C26056a(List list, C30412a aVar, String str, String str2) {
        C41536l.m120489i(list, "dropdownValues");
        C41536l.m120489i(aVar, "serviceCenters");
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str2, "contactEmail");
        this.f66149a = list;
        this.f66150b = aVar;
        this.f66151c = str;
        this.f66152d = str2;
    }

    /* renamed from: a */
    public final String mo64955a() {
        return this.f66152d;
    }

    /* renamed from: b */
    public final List mo64956b() {
        return this.f66149a;
    }

    /* renamed from: c */
    public final String mo64957c() {
        return this.f66151c;
    }

    /* renamed from: d */
    public final C30412a mo64958d() {
        return this.f66150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26056a)) {
            return false;
        }
        C26056a aVar = (C26056a) obj;
        return C41536l.m120484d(this.f66149a, aVar.f66149a) && C41536l.m120484d(this.f66150b, aVar.f66150b) && C41536l.m120484d(this.f66151c, aVar.f66151c) && C41536l.m120484d(this.f66152d, aVar.f66152d);
    }

    public int hashCode() {
        return (((((this.f66149a.hashCode() * 31) + this.f66150b.hashCode()) * 31) + this.f66151c.hashCode()) * 31) + this.f66152d.hashCode();
    }

    public String toString() {
        List list = this.f66149a;
        C30412a aVar = this.f66150b;
        String str = this.f66151c;
        String str2 = this.f66152d;
        return "BecomeSoloApplicationData(dropdownValues=" + list + ", serviceCenters=" + aVar + ", phoneNumber=" + str + ", contactEmail=" + str2 + ")";
    }
}

package yt0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: yt0.c */
public final class C40062c {

    /* renamed from: a */
    private final String f95212a;

    /* renamed from: b */
    private final String f95213b;

    /* renamed from: c */
    private final int f95214c;

    /* renamed from: d */
    private final int f95215d;

    /* renamed from: e */
    private final List f95216e;

    public C40062c(String str, String str2, int i, int i2, List list) {
        C41536l.m120489i(str, "labelType");
        C41536l.m120489i(str2, "labelDesc");
        C41536l.m120489i(list, "plusBenefitList");
        this.f95212a = str;
        this.f95213b = str2;
        this.f95214c = i;
        this.f95215d = i2;
        this.f95216e = list;
    }

    /* renamed from: a */
    public final String mo93966a() {
        return this.f95213b;
    }

    /* renamed from: b */
    public final int mo93967b() {
        return this.f95214c;
    }

    /* renamed from: c */
    public final String mo93968c() {
        return this.f95212a;
    }

    /* renamed from: d */
    public final int mo93969d() {
        return this.f95215d;
    }

    /* renamed from: e */
    public final List mo93970e() {
        return this.f95216e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40062c)) {
            return false;
        }
        C40062c cVar = (C40062c) obj;
        return C41536l.m120484d(this.f95212a, cVar.f95212a) && C41536l.m120484d(this.f95213b, cVar.f95213b) && this.f95214c == cVar.f95214c && this.f95215d == cVar.f95215d && C41536l.m120484d(this.f95216e, cVar.f95216e);
    }

    public int hashCode() {
        return (((((((this.f95212a.hashCode() * 31) + this.f95213b.hashCode()) * 31) + this.f95214c) * 31) + this.f95215d) * 31) + this.f95216e.hashCode();
    }

    public String toString() {
        String str = this.f95212a;
        String str2 = this.f95213b;
        int i = this.f95214c;
        int i2 = this.f95215d;
        List list = this.f95216e;
        return "StatusBenefits(labelType=" + str + ", labelDesc=" + str2 + ", labelEntryScore=" + i + ", orderId=" + i2 + ", plusBenefitList=" + list + ")";
    }
}

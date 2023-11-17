package yt0;

import hd0.C24978b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: yt0.b */
public final class C40061b {

    /* renamed from: a */
    private final String f95203a;

    /* renamed from: b */
    private final String f95204b;

    /* renamed from: c */
    private final String f95205c;

    /* renamed from: d */
    private final C24978b f95206d;

    /* renamed from: e */
    private final String f95207e;

    /* renamed from: f */
    private final int f95208f;

    /* renamed from: g */
    private final C24978b f95209g;

    /* renamed from: h */
    private final int f95210h;

    /* renamed from: i */
    private final List f95211i;

    public C40061b(String str, String str2, String str3, C24978b bVar, String str4, int i, C24978b bVar2, int i2, List list) {
        C41536l.m120489i(str, "labelCategory");
        C41536l.m120489i(str2, "labelCategoryName");
        C41536l.m120489i(str3, "labelCategoryDesc");
        C41536l.m120489i(bVar, "isActive");
        C41536l.m120489i(str4, "iconName");
        C41536l.m120489i(bVar2, "hasDetails");
        this.f95203a = str;
        this.f95204b = str2;
        this.f95205c = str3;
        this.f95206d = bVar;
        this.f95207e = str4;
        this.f95208f = i;
        this.f95209g = bVar2;
        this.f95210h = i2;
        this.f95211i = list;
    }

    /* renamed from: a */
    public final List mo93955a() {
        return this.f95211i;
    }

    /* renamed from: b */
    public final C24978b mo93956b() {
        return this.f95209g;
    }

    /* renamed from: c */
    public final String mo93957c() {
        return this.f95207e;
    }

    /* renamed from: d */
    public final String mo93958d() {
        return this.f95205c;
    }

    /* renamed from: e */
    public final String mo93959e() {
        return this.f95204b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40061b)) {
            return false;
        }
        C40061b bVar = (C40061b) obj;
        return C41536l.m120484d(this.f95203a, bVar.f95203a) && C41536l.m120484d(this.f95204b, bVar.f95204b) && C41536l.m120484d(this.f95205c, bVar.f95205c) && this.f95206d == bVar.f95206d && C41536l.m120484d(this.f95207e, bVar.f95207e) && this.f95208f == bVar.f95208f && this.f95209g == bVar.f95209g && this.f95210h == bVar.f95210h && C41536l.m120484d(this.f95211i, bVar.f95211i);
    }

    /* renamed from: f */
    public final int mo93961f() {
        return this.f95208f;
    }

    /* renamed from: g */
    public final int mo93962g() {
        return this.f95210h;
    }

    /* renamed from: h */
    public final C24978b mo93963h() {
        return this.f95206d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f95203a.hashCode() * 31) + this.f95204b.hashCode()) * 31) + this.f95205c.hashCode()) * 31) + this.f95206d.hashCode()) * 31) + this.f95207e.hashCode()) * 31) + this.f95208f) * 31) + this.f95209g.hashCode()) * 31) + this.f95210h) * 31;
        List list = this.f95211i;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.f95203a;
        String str2 = this.f95204b;
        String str3 = this.f95205c;
        C24978b bVar = this.f95206d;
        String str4 = this.f95207e;
        int i = this.f95208f;
        C24978b bVar2 = this.f95209g;
        int i2 = this.f95210h;
        List list = this.f95211i;
        return "StarsGuideProducts(labelCategory=" + str + ", labelCategoryName=" + str2 + ", labelCategoryDesc=" + str3 + ", isActive=" + bVar + ", iconName=" + str4 + ", orderId=" + i + ", hasDetails=" + bVar2 + ", scoreNew=" + i2 + ", children=" + list + ")";
    }
}

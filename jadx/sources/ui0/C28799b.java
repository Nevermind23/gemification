package ui0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: ui0.b */
public final class C28799b {

    /* renamed from: a */
    private final List f73620a;

    /* renamed from: b */
    private final Set f73621b;

    /* renamed from: c */
    private final boolean f73622c;

    /* renamed from: d */
    private final Long f73623d;

    /* renamed from: e */
    private final String f73624e;

    /* renamed from: f */
    private final boolean f73625f;

    public C28799b(List list, Set set, boolean z, Long l, String str, boolean z2) {
        C41536l.m120489i(list, "categories");
        C41536l.m120489i(set, "categoriesFilter");
        this.f73620a = list;
        this.f73621b = set;
        this.f73622c = z;
        this.f73623d = l;
        this.f73624e = str;
        this.f73625f = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C28799b m88266b(C28799b bVar, List list, Set set, boolean z, Long l, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f73620a;
        }
        if ((i & 2) != 0) {
            set = bVar.f73621b;
        }
        Set set2 = set;
        if ((i & 4) != 0) {
            z = bVar.f73622c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            l = bVar.f73623d;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str = bVar.f73624e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z2 = bVar.f73625f;
        }
        return bVar.mo68526a(list, set2, z3, l2, str2, z2);
    }

    /* renamed from: a */
    public final C28799b mo68526a(List list, Set set, boolean z, Long l, String str, boolean z2) {
        C41536l.m120489i(list, "categories");
        C41536l.m120489i(set, "categoriesFilter");
        return new C28799b(list, set, z, l, str, z2);
    }

    /* renamed from: c */
    public final List mo68527c() {
        return this.f73620a;
    }

    /* renamed from: d */
    public final Set mo68528d() {
        return this.f73621b;
    }

    /* renamed from: e */
    public final boolean mo68529e() {
        return this.f73625f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28799b)) {
            return false;
        }
        C28799b bVar = (C28799b) obj;
        return C41536l.m120484d(this.f73620a, bVar.f73620a) && C41536l.m120484d(this.f73621b, bVar.f73621b) && this.f73622c == bVar.f73622c && C41536l.m120484d(this.f73623d, bVar.f73623d) && C41536l.m120484d(this.f73624e, bVar.f73624e) && this.f73625f == bVar.f73625f;
    }

    /* renamed from: f */
    public final String mo68531f() {
        return this.f73624e;
    }

    /* renamed from: g */
    public final Long mo68532g() {
        return this.f73623d;
    }

    /* renamed from: h */
    public final boolean mo68533h() {
        return this.f73622c;
    }

    public int hashCode() {
        int hashCode = ((this.f73620a.hashCode() * 31) + this.f73621b.hashCode()) * 31;
        boolean z = this.f73622c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Long l = this.f73623d;
        int i2 = 0;
        int hashCode2 = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f73624e;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.f73625f;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        List list = this.f73620a;
        Set set = this.f73621b;
        boolean z = this.f73622c;
        Long l = this.f73623d;
        String str = this.f73624e;
        boolean z2 = this.f73625f;
        return "GiftCardsFilterData(categories=" + list + ", categoriesFilter=" + set + ", showCategories=" + z + ", selectedCategoryId=" + l + ", searchQuery=" + str + ", forceUpdate=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C28799b(java.util.List r5, java.util.Set r6, boolean r7, java.lang.Long r8, java.lang.String r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0008
            java.util.List r5 = ie1.C41341q.m119907j()
        L_0x0008:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0010
            java.util.Set r6 = ie1.C41357x0.m119985e()
        L_0x0010:
            r12 = r6
            r6 = r11 & 4
            r0 = 0
            if (r6 == 0) goto L_0x0018
            r1 = r0
            goto L_0x0019
        L_0x0018:
            r1 = r7
        L_0x0019:
            r6 = r11 & 8
            r7 = 0
            if (r6 == 0) goto L_0x0020
            r2 = r7
            goto L_0x0021
        L_0x0020:
            r2 = r8
        L_0x0021:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0027
            r3 = r7
            goto L_0x0028
        L_0x0027:
            r3 = r9
        L_0x0028:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = r10
        L_0x002e:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ui0.C28799b.<init>(java.util.List, java.util.Set, boolean, java.lang.Long, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

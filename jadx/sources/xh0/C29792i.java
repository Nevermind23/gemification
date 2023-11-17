package xh0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.i */
public final class C29792i {

    /* renamed from: a */
    private final long f75377a;

    /* renamed from: b */
    private final String f75378b;

    /* renamed from: c */
    private final String f75379c;

    /* renamed from: d */
    private final String f75380d;

    /* renamed from: e */
    private final String f75381e;

    /* renamed from: f */
    private final List f75382f;

    /* renamed from: g */
    private final List f75383g;

    /* renamed from: h */
    private final List f75384h;

    public C29792i(long j, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        C41536l.m120489i(list, "purchaseMethods");
        this.f75377a = j;
        this.f75378b = str;
        this.f75379c = str2;
        this.f75380d = str3;
        this.f75381e = str4;
        this.f75382f = list;
        this.f75383g = list2;
        this.f75384h = list3;
    }

    /* renamed from: a */
    public final List mo69993a() {
        return this.f75384h;
    }

    /* renamed from: b */
    public final List mo69994b() {
        return this.f75383g;
    }

    /* renamed from: c */
    public final long mo69995c() {
        return this.f75377a;
    }

    /* renamed from: d */
    public final String mo69996d() {
        return this.f75379c;
    }

    /* renamed from: e */
    public final String mo69997e() {
        return this.f75380d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29792i)) {
            return false;
        }
        C29792i iVar = (C29792i) obj;
        return this.f75377a == iVar.f75377a && C41536l.m120484d(this.f75378b, iVar.f75378b) && C41536l.m120484d(this.f75379c, iVar.f75379c) && C41536l.m120484d(this.f75380d, iVar.f75380d) && C41536l.m120484d(this.f75381e, iVar.f75381e) && C41536l.m120484d(this.f75382f, iVar.f75382f) && C41536l.m120484d(this.f75383g, iVar.f75383g) && C41536l.m120484d(this.f75384h, iVar.f75384h);
    }

    /* renamed from: f */
    public final String mo69999f() {
        return this.f75381e;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f75377a) * 31;
        String str = this.f75378b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75379c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75380d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75381e;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f75382f.hashCode()) * 31;
        List list = this.f75383g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f75384h;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        long j = this.f75377a;
        String str = this.f75378b;
        String str2 = this.f75379c;
        String str3 = this.f75380d;
        String str4 = this.f75381e;
        List list = this.f75382f;
        List list2 = this.f75383g;
        List list3 = this.f75384h;
        return "GiftCardOffer(offerId=" + j + ", offerLogoStorageId=" + str + ", offerLogoStorageUrl=" + str2 + ", offerNameEn=" + str3 + ", offerNameGe=" + str4 + ", purchaseMethods=" + list + ", offerBrandListGe=" + list2 + ", offerBrandListEn=" + list3 + ")";
    }
}

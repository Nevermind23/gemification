package l31;

import j31.C36725a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l31.a */
public final class C37066a {

    /* renamed from: a */
    private final String f89217a;

    /* renamed from: b */
    private final String f89218b;

    /* renamed from: c */
    private final String f89219c;

    /* renamed from: d */
    private final int f89220d;

    /* renamed from: e */
    private final long f89221e;

    /* renamed from: f */
    private final String f89222f;

    /* renamed from: g */
    private final List f89223g;

    /* renamed from: h */
    private final C36725a f89224h;

    /* renamed from: i */
    private final boolean f89225i;

    public C37066a(String str, String str2, String str3, int i, long j, String str4, List list, C36725a aVar, boolean z) {
        C41536l.m120489i(str, "popupType");
        C41536l.m120489i(str2, "headerDictionaryKey");
        C41536l.m120489i(str3, "descriptionDictionaryKey");
        C41536l.m120489i(list, "popupActions");
        C41536l.m120489i(aVar, "externalFile");
        this.f89217a = str;
        this.f89218b = str2;
        this.f89219c = str3;
        this.f89220d = i;
        this.f89221e = j;
        this.f89222f = str4;
        this.f89223g = list;
        this.f89224h = aVar;
        this.f89225i = z;
    }

    /* renamed from: a */
    public final String mo89985a() {
        return this.f89222f;
    }

    /* renamed from: b */
    public final boolean mo89986b() {
        return this.f89225i;
    }

    /* renamed from: c */
    public final String mo89987c() {
        return this.f89219c;
    }

    /* renamed from: d */
    public final C36725a mo89988d() {
        return this.f89224h;
    }

    /* renamed from: e */
    public final long mo89989e() {
        return this.f89221e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37066a)) {
            return false;
        }
        C37066a aVar = (C37066a) obj;
        return C41536l.m120484d(this.f89217a, aVar.f89217a) && C41536l.m120484d(this.f89218b, aVar.f89218b) && C41536l.m120484d(this.f89219c, aVar.f89219c) && this.f89220d == aVar.f89220d && this.f89221e == aVar.f89221e && C41536l.m120484d(this.f89222f, aVar.f89222f) && C41536l.m120484d(this.f89223g, aVar.f89223g) && C41536l.m120484d(this.f89224h, aVar.f89224h) && this.f89225i == aVar.f89225i;
    }

    /* renamed from: f */
    public final String mo89991f() {
        return this.f89218b;
    }

    /* renamed from: g */
    public final List mo89992g() {
        return this.f89223g;
    }

    /* renamed from: h */
    public final String mo89993h() {
        return this.f89217a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f89217a.hashCode() * 31) + this.f89218b.hashCode()) * 31) + this.f89219c.hashCode()) * 31) + this.f89220d) * 31) + C7397t.m28148a(this.f89221e)) * 31;
        String str = this.f89222f;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f89223g.hashCode()) * 31) + this.f89224h.hashCode()) * 31;
        boolean z = this.f89225i;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f89217a;
        String str2 = this.f89218b;
        String str3 = this.f89219c;
        int i = this.f89220d;
        long j = this.f89221e;
        String str4 = this.f89222f;
        List list = this.f89223g;
        C36725a aVar = this.f89224h;
        boolean z = this.f89225i;
        return "CommonPopup(popupType=" + str + ", headerDictionaryKey=" + str2 + ", descriptionDictionaryKey=" + str3 + ", orderNumber=" + i + ", frequency=" + j + ", animation=" + str4 + ", popupActions=" + list + ", externalFile=" + aVar + ", closable=" + z + ")";
    }
}

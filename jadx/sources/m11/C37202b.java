package m11;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: m11.b */
public final class C37202b {

    /* renamed from: a */
    private final String f89612a;

    /* renamed from: b */
    private final boolean f89613b;

    /* renamed from: c */
    private final String f89614c;

    public C37202b(String str, boolean z, String str2) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        this.f89612a = str;
        this.f89613b = z;
        this.f89614c = str2;
    }

    /* renamed from: a */
    public final String mo90260a() {
        return this.f89614c;
    }

    /* renamed from: b */
    public final String mo90261b() {
        return this.f89612a;
    }

    /* renamed from: c */
    public final boolean mo90262c() {
        return this.f89613b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37202b)) {
            return false;
        }
        C37202b bVar = (C37202b) obj;
        return C41536l.m120484d(this.f89612a, bVar.f89612a) && this.f89613b == bVar.f89613b && C41536l.m120484d(this.f89614c, bVar.f89614c);
    }

    public int hashCode() {
        int hashCode = this.f89612a.hashCode() * 31;
        boolean z = this.f89613b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f89614c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f89612a;
        boolean z = this.f89613b;
        String str2 = this.f89614c;
        return "PreLoginBackground(url=" + str + ", isDark=" + z + ", fileSubType=" + str2 + ")";
    }
}

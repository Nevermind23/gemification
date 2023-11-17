package xe0;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.a */
public final class C29743a {

    /* renamed from: a */
    private final String f75176a;

    /* renamed from: b */
    private final String f75177b;

    public C29743a(String str, String str2) {
        C41536l.m120489i(str, "displayName");
        C41536l.m120489i(str2, C11769i.C11770a.f34149l);
        this.f75176a = str;
        this.f75177b = str2;
    }

    /* renamed from: a */
    public final String mo69752a() {
        return this.f75176a;
    }

    /* renamed from: b */
    public final String mo69753b() {
        return this.f75177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29743a)) {
            return false;
        }
        C29743a aVar = (C29743a) obj;
        return C41536l.m120484d(this.f75176a, aVar.f75176a) && C41536l.m120484d(this.f75177b, aVar.f75177b);
    }

    public int hashCode() {
        return (this.f75176a.hashCode() * 31) + this.f75177b.hashCode();
    }

    public String toString() {
        String str = this.f75176a;
        String str2 = this.f75177b;
        return "AccountFile(displayName=" + str + ", url=" + str2 + ")";
    }
}

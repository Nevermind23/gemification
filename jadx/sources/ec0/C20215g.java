package ec0;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: ec0.g */
public final class C20215g {

    /* renamed from: a */
    private final String f54920a;

    /* renamed from: b */
    private final String f54921b;

    public C20215g(String str, String str2) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(str2, "fileName");
        this.f54920a = str;
        this.f54921b = str2;
    }

    /* renamed from: a */
    public final String mo48645a() {
        return this.f54921b;
    }

    /* renamed from: b */
    public final String mo48646b() {
        return this.f54920a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20215g)) {
            return false;
        }
        C20215g gVar = (C20215g) obj;
        return C41536l.m120484d(this.f54920a, gVar.f54920a) && C41536l.m120484d(this.f54921b, gVar.f54921b);
    }

    public int hashCode() {
        return (this.f54920a.hashCode() * 31) + this.f54921b.hashCode();
    }

    public String toString() {
        String str = this.f54920a;
        String str2 = this.f54921b;
        return "DownloadData(url=" + str + ", fileName=" + str2 + ")";
    }
}

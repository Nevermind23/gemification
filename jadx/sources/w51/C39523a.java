package w51;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: w51.a */
public final class C39523a {

    /* renamed from: a */
    private final String f93968a;

    /* renamed from: b */
    private final String f93969b;

    /* renamed from: c */
    private final String f93970c;

    public C39523a(String str, String str2, String str3) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(str2, "fileNameExtension");
        C41536l.m120489i(str3, "mimeType");
        this.f93968a = str;
        this.f93969b = str2;
        this.f93970c = str3;
    }

    /* renamed from: a */
    public final String mo93177a() {
        return this.f93969b;
    }

    /* renamed from: b */
    public final String mo93178b() {
        return this.f93970c;
    }

    /* renamed from: c */
    public final String mo93179c() {
        return this.f93968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39523a)) {
            return false;
        }
        C39523a aVar = (C39523a) obj;
        return C41536l.m120484d(this.f93968a, aVar.f93968a) && C41536l.m120484d(this.f93969b, aVar.f93969b) && C41536l.m120484d(this.f93970c, aVar.f93970c);
    }

    public int hashCode() {
        return (((this.f93968a.hashCode() * 31) + this.f93969b.hashCode()) * 31) + this.f93970c.hashCode();
    }

    public String toString() {
        String str = this.f93968a;
        String str2 = this.f93969b;
        String str3 = this.f93970c;
        return "DownloadStatementParams(url=" + str + ", fileNameExtension=" + str2 + ", mimeType=" + str3 + ")";
    }
}

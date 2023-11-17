package l31;

import com.salesforce.marketingcloud.UrlHandler;
import kotlin.jvm.internal.C41536l;

/* renamed from: l31.b */
public final class C37067b {

    /* renamed from: a */
    private final String f89226a;

    /* renamed from: b */
    private final String f89227b;

    public C37067b(String str, String str2) {
        C41536l.m120489i(str, "eventName");
        C41536l.m120489i(str2, UrlHandler.ACTION);
        this.f89226a = str;
        this.f89227b = str2;
    }

    /* renamed from: a */
    public final String mo89996a() {
        return this.f89227b;
    }

    /* renamed from: b */
    public final String mo89997b() {
        return this.f89226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37067b)) {
            return false;
        }
        C37067b bVar = (C37067b) obj;
        return C41536l.m120484d(this.f89226a, bVar.f89226a) && C41536l.m120484d(this.f89227b, bVar.f89227b);
    }

    public int hashCode() {
        return (this.f89226a.hashCode() * 31) + this.f89227b.hashCode();
    }

    public String toString() {
        String str = this.f89226a;
        String str2 = this.f89227b;
        return "CommonPopupFirebaseEvent(eventName=" + str + ", action=" + str2 + ")";
    }
}

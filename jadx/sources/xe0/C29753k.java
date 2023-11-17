package xe0;

import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.k */
public final class C29753k {

    /* renamed from: a */
    private final Date f75227a;

    /* renamed from: b */
    private final String f75228b;

    public C29753k(Date date, String str) {
        C41536l.m120489i(date, "date");
        C41536l.m120489i(str, "price");
        this.f75227a = date;
        this.f75228b = str;
    }

    /* renamed from: a */
    public final Date mo69821a() {
        return this.f75227a;
    }

    /* renamed from: b */
    public final String mo69822b() {
        return this.f75228b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29753k)) {
            return false;
        }
        C29753k kVar = (C29753k) obj;
        return C41536l.m120484d(this.f75227a, kVar.f75227a) && C41536l.m120484d(this.f75228b, kVar.f75228b);
    }

    public int hashCode() {
        return (this.f75227a.hashCode() * 31) + this.f75228b.hashCode();
    }

    public String toString() {
        Date date = this.f75227a;
        String str = this.f75228b;
        return "ShareHistoryItem(date=" + date + ", price=" + str + ")";
    }
}

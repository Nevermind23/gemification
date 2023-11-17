package p674xm;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xm.c */
public final class C18795c {

    /* renamed from: a */
    private final List f52526a;

    /* renamed from: b */
    private final String f52527b;

    public C18795c(List list, String str) {
        C41536l.m120489i(list, "limits");
        this.f52526a = list;
        this.f52527b = str;
    }

    /* renamed from: a */
    public final List mo46609a() {
        return this.f52526a;
    }

    /* renamed from: b */
    public final String mo46610b() {
        return this.f52527b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18795c)) {
            return false;
        }
        C18795c cVar = (C18795c) obj;
        return C41536l.m120484d(this.f52526a, cVar.f52526a) && C41536l.m120484d(this.f52527b, cVar.f52527b);
    }

    public int hashCode() {
        int hashCode = this.f52526a.hashCode() * 31;
        String str = this.f52527b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List list = this.f52526a;
        String str = this.f52527b;
        return "CardDailyLimitData(limits=" + list + ", selectedLimitType=" + str + ")";
    }
}

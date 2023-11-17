package xh0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.m */
public final class C29797m {

    /* renamed from: a */
    private final long f75444a;

    /* renamed from: b */
    private final String f75445b;

    /* renamed from: c */
    private final String f75446c;

    /* renamed from: d */
    private final String f75447d;

    /* renamed from: e */
    private final int f75448e;

    /* renamed from: f */
    private final Integer f75449f;

    /* renamed from: g */
    private final String f75450g;

    /* renamed from: h */
    private final String f75451h;

    public C29797m(long j, String str, String str2, String str3, int i, Integer num, String str4, String str5) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookupName");
        C41536l.m120489i(str3, "lookupValue");
        this.f75444a = j;
        this.f75445b = str;
        this.f75446c = str2;
        this.f75447d = str3;
        this.f75448e = i;
        this.f75449f = num;
        this.f75450g = str4;
        this.f75451h = str5;
    }

    /* renamed from: a */
    public final String mo70034a() {
        return this.f75445b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29797m)) {
            return false;
        }
        C29797m mVar = (C29797m) obj;
        return this.f75444a == mVar.f75444a && C41536l.m120484d(this.f75445b, mVar.f75445b) && C41536l.m120484d(this.f75446c, mVar.f75446c) && C41536l.m120484d(this.f75447d, mVar.f75447d) && this.f75448e == mVar.f75448e && C41536l.m120484d(this.f75449f, mVar.f75449f) && C41536l.m120484d(this.f75450g, mVar.f75450g) && C41536l.m120484d(this.f75451h, mVar.f75451h);
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f75444a) * 31) + this.f75445b.hashCode()) * 31) + this.f75446c.hashCode()) * 31) + this.f75447d.hashCode()) * 31) + this.f75448e) * 31;
        Integer num = this.f75449f;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f75450g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75451h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f75444a;
        String str = this.f75445b;
        String str2 = this.f75446c;
        String str3 = this.f75447d;
        int i = this.f75448e;
        Integer num = this.f75449f;
        String str4 = this.f75450g;
        String str5 = this.f75451h;
        return "Lookup(id=" + j + ", dictionaryKey=" + str + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", orderNumber=" + i + ", dictionaryKeyId=" + num + ", dictionaryValue=" + str4 + ", dictionaryValueEn=" + str5 + ")";
    }
}

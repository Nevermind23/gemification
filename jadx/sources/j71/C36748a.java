package j71;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: j71.a */
public final class C36748a {

    /* renamed from: a */
    private final long f88648a;

    /* renamed from: b */
    private final long f88649b;

    /* renamed from: c */
    private final String f88650c;

    /* renamed from: d */
    private final String f88651d;

    /* renamed from: e */
    private final String f88652e;

    /* renamed from: f */
    private final String f88653f;

    /* renamed from: g */
    private final long f88654g;

    /* renamed from: h */
    private final String f88655h;

    /* renamed from: i */
    private final String f88656i;

    /* renamed from: j */
    private final C36751d f88657j;

    /* renamed from: k */
    private final List f88658k;

    public C36748a(long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, C36751d dVar, List list) {
        C41536l.m120489i(str, "cardClassCode");
        C41536l.m120489i(str2, "cardClass");
        C41536l.m120489i(str3, "lastFour");
        C41536l.m120489i(str4, "subProductCode");
        C41536l.m120489i(dVar, "cardLargeBackground");
        C41536l.m120489i(list, "passDevices");
        this.f88648a = j;
        this.f88649b = j2;
        this.f88650c = str;
        this.f88651d = str2;
        this.f88652e = str3;
        this.f88653f = str4;
        this.f88654g = j3;
        this.f88655h = str5;
        this.f88656i = str6;
        this.f88657j = dVar;
        this.f88658k = list;
    }

    /* renamed from: a */
    public final String mo89572a() {
        return this.f88651d;
    }

    /* renamed from: b */
    public final String mo89573b() {
        return this.f88650c;
    }

    /* renamed from: c */
    public final long mo89574c() {
        return this.f88649b;
    }

    /* renamed from: d */
    public final C36751d mo89575d() {
        return this.f88657j;
    }

    /* renamed from: e */
    public final String mo89576e() {
        return this.f88655h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36748a)) {
            return false;
        }
        C36748a aVar = (C36748a) obj;
        return this.f88648a == aVar.f88648a && this.f88649b == aVar.f88649b && C41536l.m120484d(this.f88650c, aVar.f88650c) && C41536l.m120484d(this.f88651d, aVar.f88651d) && C41536l.m120484d(this.f88652e, aVar.f88652e) && C41536l.m120484d(this.f88653f, aVar.f88653f) && this.f88654g == aVar.f88654g && C41536l.m120484d(this.f88655h, aVar.f88655h) && C41536l.m120484d(this.f88656i, aVar.f88656i) && C41536l.m120484d(this.f88657j, aVar.f88657j) && C41536l.m120484d(this.f88658k, aVar.f88658k);
    }

    /* renamed from: f */
    public final String mo89578f() {
        return this.f88656i;
    }

    /* renamed from: g */
    public final long mo89579g() {
        return this.f88654g;
    }

    /* renamed from: h */
    public final String mo89580h() {
        return this.f88652e;
    }

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.f88648a) * 31) + C7397t.m28148a(this.f88649b)) * 31) + this.f88650c.hashCode()) * 31) + this.f88651d.hashCode()) * 31) + this.f88652e.hashCode()) * 31) + this.f88653f.hashCode()) * 31) + C7397t.m28148a(this.f88654g)) * 31;
        String str = this.f88655h;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88656i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f88657j.hashCode()) * 31) + this.f88658k.hashCode();
    }

    /* renamed from: i */
    public final List mo89582i() {
        return this.f88658k;
    }

    public String toString() {
        long j = this.f88648a;
        long j2 = this.f88649b;
        String str = this.f88650c;
        String str2 = this.f88651d;
        String str3 = this.f88652e;
        String str4 = this.f88653f;
        long j3 = this.f88654g;
        String str5 = this.f88655h;
        String str6 = this.f88656i;
        C36751d dVar = this.f88657j;
        List list = this.f88658k;
        return "ActiveCard(clientKey=" + j + ", cardId=" + j2 + ", cardClassCode=" + str + ", cardClass=" + str2 + ", lastFour=" + str3 + ", subProductCode=" + str4 + ", expDate=" + j3 + ", cardName=" + str5 + ", cardNameDictionaryKey=" + str6 + ", cardLargeBackground=" + dVar + ", passDevices=" + list + ")";
    }
}

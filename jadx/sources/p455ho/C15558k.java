package p455ho;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ho.k */
public final class C15558k {

    /* renamed from: a */
    private final long f44188a;

    /* renamed from: b */
    private final long f44189b;

    /* renamed from: c */
    private final String f44190c;

    /* renamed from: d */
    private final String f44191d;

    /* renamed from: e */
    private final String f44192e;

    /* renamed from: f */
    private String f44193f;

    /* renamed from: g */
    private final String f44194g;

    /* renamed from: h */
    private final String f44195h;

    /* renamed from: i */
    private final List f44196i;

    public C15558k(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "pointType");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str5, "hasSoloSc");
        C41536l.m120489i(str6, "customerType");
        this.f44188a = j;
        this.f44189b = j2;
        this.f44190c = str;
        this.f44191d = str2;
        this.f44192e = str3;
        this.f44193f = str4;
        this.f44194g = str5;
        this.f44195h = str6;
        this.f44196i = list;
    }

    /* renamed from: a */
    public final String mo42774a() {
        return this.f44195h;
    }

    /* renamed from: b */
    public final String mo42775b() {
        return this.f44194g;
    }

    /* renamed from: c */
    public final long mo42776c() {
        return this.f44188a;
    }

    /* renamed from: d */
    public final String mo42777d() {
        return this.f44190c;
    }

    /* renamed from: e */
    public final long mo42778e() {
        return this.f44189b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15558k)) {
            return false;
        }
        C15558k kVar = (C15558k) obj;
        return this.f44188a == kVar.f44188a && this.f44189b == kVar.f44189b && C41536l.m120484d(this.f44190c, kVar.f44190c) && C41536l.m120484d(this.f44191d, kVar.f44191d) && C41536l.m120484d(this.f44192e, kVar.f44192e) && C41536l.m120484d(this.f44193f, kVar.f44193f) && C41536l.m120484d(this.f44194g, kVar.f44194g) && C41536l.m120484d(this.f44195h, kVar.f44195h) && C41536l.m120484d(this.f44196i, kVar.f44196i);
    }

    /* renamed from: f */
    public final String mo42780f() {
        return this.f44193f;
    }

    /* renamed from: g */
    public final String mo42781g() {
        return this.f44191d;
    }

    /* renamed from: h */
    public final String mo42782h() {
        return this.f44192e;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f44188a) * 31) + C7397t.m28148a(this.f44189b)) * 31) + this.f44190c.hashCode()) * 31) + this.f44191d.hashCode()) * 31) + this.f44192e.hashCode()) * 31;
        String str = this.f44193f;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f44194g.hashCode()) * 31) + this.f44195h.hashCode()) * 31;
        List list = this.f44196i;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final List mo42784i() {
        return this.f44196i;
    }

    public String toString() {
        long j = this.f44188a;
        long j2 = this.f44189b;
        String str = this.f44190c;
        String str2 = this.f44191d;
        String str3 = this.f44192e;
        String str4 = this.f44193f;
        String str5 = this.f44194g;
        String str6 = this.f44195h;
        List list = this.f44196i;
        return "ServiceCenter(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }
}

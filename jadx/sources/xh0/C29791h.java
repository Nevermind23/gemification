package xh0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.h */
public final class C29791h {

    /* renamed from: a */
    private final long f75371a;

    /* renamed from: b */
    private final String f75372b;

    /* renamed from: c */
    private final String f75373c;

    /* renamed from: d */
    private final String f75374d;

    /* renamed from: e */
    private final String f75375e;

    /* renamed from: f */
    private final List f75376f;

    public C29791h(long j, String str, String str2, String str3, String str4, List list) {
        C41536l.m120489i(list, "offers");
        this.f75371a = j;
        this.f75372b = str;
        this.f75373c = str2;
        this.f75374d = str3;
        this.f75375e = str4;
        this.f75376f = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C29791h m90496b(C29791h hVar, long j, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        C29791h hVar2 = hVar;
        return hVar.mo69984a((i & 1) != 0 ? hVar2.f75371a : j, (i & 2) != 0 ? hVar2.f75372b : str, (i & 4) != 0 ? hVar2.f75373c : str2, (i & 8) != 0 ? hVar2.f75374d : str3, (i & 16) != 0 ? hVar2.f75375e : str4, (i & 32) != 0 ? hVar2.f75376f : list);
    }

    /* renamed from: a */
    public final C29791h mo69984a(long j, String str, String str2, String str3, String str4, List list) {
        List list2 = list;
        C41536l.m120489i(list2, "offers");
        return new C29791h(j, str, str2, str3, str4, list2);
    }

    /* renamed from: c */
    public final String mo69985c() {
        return this.f75372b;
    }

    /* renamed from: d */
    public final String mo69986d() {
        return this.f75373c;
    }

    /* renamed from: e */
    public final long mo69987e() {
        return this.f75371a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29791h)) {
            return false;
        }
        C29791h hVar = (C29791h) obj;
        return this.f75371a == hVar.f75371a && C41536l.m120484d(this.f75372b, hVar.f75372b) && C41536l.m120484d(this.f75373c, hVar.f75373c) && C41536l.m120484d(this.f75374d, hVar.f75374d) && C41536l.m120484d(this.f75375e, hVar.f75375e) && C41536l.m120484d(this.f75376f, hVar.f75376f);
    }

    /* renamed from: f */
    public final String mo69989f() {
        return this.f75374d;
    }

    /* renamed from: g */
    public final List mo69990g() {
        return this.f75376f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f75371a) * 31;
        String str = this.f75372b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75373c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75374d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75375e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f75376f.hashCode();
    }

    public String toString() {
        long j = this.f75371a;
        String str = this.f75372b;
        String str2 = this.f75373c;
        String str3 = this.f75374d;
        String str4 = this.f75375e;
        List list = this.f75376f;
        return "GiftCardCategory(categoryId=" + j + ", categoryDescEn=" + str + ", categoryDescGe=" + str2 + ", categoryImageUrl=" + str3 + ", dictionaryKey=" + str4 + ", offers=" + list + ")";
    }
}

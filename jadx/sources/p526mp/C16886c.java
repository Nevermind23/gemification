package p526mp;

import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;

/* renamed from: mp.c */
public final class C16886c {

    /* renamed from: a */
    private final String f47203a;

    /* renamed from: b */
    private final String f47204b;

    /* renamed from: c */
    private final ArrayList f47205c;

    /* renamed from: d */
    private final C16883a f47206d;

    /* renamed from: e */
    private final String f47207e;

    /* renamed from: f */
    private final Integer f47208f;

    /* renamed from: g */
    private final Integer f47209g;

    /* renamed from: h */
    private final String f47210h;

    public C16886c(String str, String str2, ArrayList arrayList, C16883a aVar, String str3, Integer num, Integer num2, String str4) {
        this.f47203a = str;
        this.f47204b = str2;
        this.f47205c = arrayList;
        this.f47206d = aVar;
        this.f47207e = str3;
        this.f47208f = num;
        this.f47209g = num2;
        this.f47210h = str4;
    }

    /* renamed from: a */
    public final String mo44028a() {
        return this.f47203a;
    }

    /* renamed from: b */
    public final Integer mo44029b() {
        return this.f47208f;
    }

    /* renamed from: c */
    public final Integer mo44030c() {
        return this.f47209g;
    }

    /* renamed from: d */
    public final ArrayList mo44031d() {
        return this.f47205c;
    }

    /* renamed from: e */
    public final C16883a mo44032e() {
        return this.f47206d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16886c)) {
            return false;
        }
        C16886c cVar = (C16886c) obj;
        return C41536l.m120484d(this.f47203a, cVar.f47203a) && C41536l.m120484d(this.f47204b, cVar.f47204b) && C41536l.m120484d(this.f47205c, cVar.f47205c) && this.f47206d == cVar.f47206d && C41536l.m120484d(this.f47207e, cVar.f47207e) && C41536l.m120484d(this.f47208f, cVar.f47208f) && C41536l.m120484d(this.f47209g, cVar.f47209g) && C41536l.m120484d(this.f47210h, cVar.f47210h);
    }

    /* renamed from: f */
    public final String mo44034f() {
        return this.f47204b;
    }

    /* renamed from: g */
    public final String mo44035g() {
        return this.f47207e;
    }

    public int hashCode() {
        String str = this.f47203a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47204b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList = this.f47205c;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        C16883a aVar = this.f47206d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f47207e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f47208f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f47209g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f47210h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f47203a;
        String str2 = this.f47204b;
        ArrayList arrayList = this.f47205c;
        C16883a aVar = this.f47206d;
        String str3 = this.f47207e;
        Integer num = this.f47208f;
        Integer num2 = this.f47209g;
        String str4 = this.f47210h;
        return "PackageBenefitUiModel(benefitDictionaryKey=" + str + ", type=" + str2 + ", parameters=" + arrayList + ", productStatus=" + aVar + ", valueDictionaryKey=" + str3 + ", benefitIcon=" + num + ", endIcon=" + num2 + ", standardConditionDictionaryKey=" + str4 + ")";
    }
}

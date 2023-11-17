package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.a */
public final class C17069a {

    /* renamed from: a */
    private final long f47678a;

    /* renamed from: b */
    private final long f47679b;

    /* renamed from: c */
    private final String f47680c;

    /* renamed from: d */
    private final long f47681d;

    /* renamed from: e */
    private final String f47682e;

    /* renamed from: f */
    private final long f47683f;

    /* renamed from: g */
    private final long f47684g;

    /* renamed from: h */
    private final long f47685h;

    /* renamed from: i */
    private final String f47686i;

    /* renamed from: j */
    private final String f47687j;

    /* renamed from: k */
    private final String f47688k;

    /* renamed from: l */
    private final String f47689l;

    /* renamed from: m */
    private final C17086h f47690m;

    public C17069a(long j, long j2, String str, long j3, String str2, long j4, long j5, long j6, String str3, String str4, String str5, String str6, C17086h hVar) {
        String str7 = str3;
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str7, "subProductCode");
        this.f47678a = j;
        this.f47679b = j2;
        this.f47680c = str;
        this.f47681d = j3;
        this.f47682e = str2;
        this.f47683f = j4;
        this.f47684g = j5;
        this.f47685h = j6;
        this.f47686i = str7;
        this.f47687j = str4;
        this.f47688k = str5;
        this.f47689l = str6;
        this.f47690m = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17069a)) {
            return false;
        }
        C17069a aVar = (C17069a) obj;
        return this.f47678a == aVar.f47678a && this.f47679b == aVar.f47679b && C41536l.m120484d(this.f47680c, aVar.f47680c) && this.f47681d == aVar.f47681d && C41536l.m120484d(this.f47682e, aVar.f47682e) && this.f47683f == aVar.f47683f && this.f47684g == aVar.f47684g && this.f47685h == aVar.f47685h && C41536l.m120484d(this.f47686i, aVar.f47686i) && C41536l.m120484d(this.f47687j, aVar.f47687j) && C41536l.m120484d(this.f47688k, aVar.f47688k) && C41536l.m120484d(this.f47689l, aVar.f47689l) && C41536l.m120484d(this.f47690m, aVar.f47690m);
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.f47678a) * 31) + C7397t.m28148a(this.f47679b)) * 31) + this.f47680c.hashCode()) * 31) + C7397t.m28148a(this.f47681d)) * 31) + this.f47682e.hashCode()) * 31) + C7397t.m28148a(this.f47683f)) * 31) + C7397t.m28148a(this.f47684g)) * 31) + C7397t.m28148a(this.f47685h)) * 31) + this.f47686i.hashCode()) * 31;
        String str = this.f47687j;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47688k;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47689l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C17086h hVar = this.f47690m;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f47678a;
        long j2 = this.f47679b;
        String str = this.f47680c;
        long j3 = this.f47681d;
        String str2 = this.f47682e;
        long j4 = this.f47683f;
        long j5 = this.f47684g;
        long j6 = this.f47685h;
        String str3 = this.f47686i;
        String str4 = this.f47687j;
        String str5 = this.f47688k;
        String str6 = this.f47689l;
        C17086h hVar = this.f47690m;
        return "ActiveCard(id=" + j + ", cardForTypeDescKeyId=" + j2 + ", lastFour=" + str + ", expDate=" + j3 + ", acctNo=" + str2 + ", acctKey=" + j4 + ", clientKey=" + j5 + ", cardId=" + j6 + ", subProductCode=" + str3 + ", cardNameKey=" + str4 + ", cardNameValue=" + str5 + ", cardNickName=" + str6 + ", cardExternalFile=" + hVar + ")";
    }
}

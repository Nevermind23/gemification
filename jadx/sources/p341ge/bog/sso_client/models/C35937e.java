package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.e */
public final class C35937e {

    /* renamed from: a */
    private final String f86940a;

    /* renamed from: b */
    private final Boolean f86941b;

    /* renamed from: c */
    private final Boolean f86942c;

    /* renamed from: d */
    private final Integer f86943d;

    /* renamed from: e */
    private final String f86944e;

    /* renamed from: f */
    private final Boolean f86945f;

    /* renamed from: g */
    private final String f86946g;

    public C35937e(String str, Boolean bool, Boolean bool2, Integer num, String str2, Boolean bool3, String str3) {
        this.f86940a = str;
        this.f86941b = bool;
        this.f86942c = bool2;
        this.f86943d = num;
        this.f86944e = str2;
        this.f86945f = bool3;
        this.f86946g = str3;
    }

    /* renamed from: a */
    public final String mo88485a() {
        return this.f86946g;
    }

    /* renamed from: b */
    public final Boolean mo88486b() {
        return this.f86942c;
    }

    /* renamed from: c */
    public final Boolean mo88487c() {
        return this.f86945f;
    }

    /* renamed from: d */
    public final String mo88488d() {
        return this.f86944e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35937e)) {
            return false;
        }
        C35937e eVar = (C35937e) obj;
        return C41536l.m120484d(this.f86940a, eVar.f86940a) && C41536l.m120484d(this.f86941b, eVar.f86941b) && C41536l.m120484d(this.f86942c, eVar.f86942c) && C41536l.m120484d(this.f86943d, eVar.f86943d) && C41536l.m120484d(this.f86944e, eVar.f86944e) && C41536l.m120484d(this.f86945f, eVar.f86945f) && C41536l.m120484d(this.f86946g, eVar.f86946g);
    }

    public int hashCode() {
        String str = this.f86940a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f86941b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86942c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f86943d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f86944e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.f86945f;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.f86946g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "FinancialContactApprove(contactId=" + this.f86940a + ", isNewUser=" + this.f86941b + ", needApproveContact=" + this.f86942c + ", retryCount=" + this.f86943d + ", operationReference=" + this.f86944e + ", needToSetMail=" + this.f86945f + ", country=" + this.f86946g + ')';
    }
}

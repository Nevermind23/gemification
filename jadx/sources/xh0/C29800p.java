package xh0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xh0.p */
public final class C29800p {

    /* renamed from: a */
    private final int f75457a;

    /* renamed from: b */
    private final String f75458b;

    /* renamed from: c */
    private final boolean f75459c;

    /* renamed from: d */
    private final String f75460d;

    /* renamed from: e */
    private final Long f75461e;

    public C29800p(int i, String str, boolean z, String str2, Long l) {
        this.f75457a = i;
        this.f75458b = str;
        this.f75459c = z;
        this.f75460d = str2;
        this.f75461e = l;
    }

    /* renamed from: a */
    public final Long mo70048a() {
        return this.f75461e;
    }

    /* renamed from: b */
    public final String mo70049b() {
        return this.f75460d;
    }

    /* renamed from: c */
    public final boolean mo70050c() {
        return this.f75459c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29800p)) {
            return false;
        }
        C29800p pVar = (C29800p) obj;
        return this.f75457a == pVar.f75457a && C41536l.m120484d(this.f75458b, pVar.f75458b) && this.f75459c == pVar.f75459c && C41536l.m120484d(this.f75460d, pVar.f75460d) && C41536l.m120484d(this.f75461e, pVar.f75461e);
    }

    public int hashCode() {
        int i = this.f75457a * 31;
        String str = this.f75458b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f75459c;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f75460d;
        int hashCode2 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f75461e;
        if (l != null) {
            i2 = l.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        int i = this.f75457a;
        String str = this.f75458b;
        boolean z = this.f75459c;
        String str2 = this.f75460d;
        Long l = this.f75461e;
        return "PhoneNumberValidationResult(resultCode=" + i + ", resultMessage=" + str + ", isBankCustomer=" + z + ", owner=" + str2 + ", clientKey=" + l + ")";
    }
}

package nt0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nt0.b */
public final class C37460b {

    /* renamed from: a */
    private final String f90061a;

    /* renamed from: b */
    private final String f90062b;

    /* renamed from: c */
    private final Integer f90063c;

    /* renamed from: d */
    private final String f90064d;

    public C37460b(String str, String str2, Integer num, String str3) {
        this.f90061a = str;
        this.f90062b = str2;
        this.f90063c = num;
        this.f90064d = str3;
    }

    /* renamed from: b */
    public static /* synthetic */ C37460b m110361b(C37460b bVar, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f90061a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f90062b;
        }
        if ((i & 4) != 0) {
            num = bVar.f90063c;
        }
        if ((i & 8) != 0) {
            str3 = bVar.f90064d;
        }
        return bVar.mo90592a(str, str2, num, str3);
    }

    /* renamed from: a */
    public final C37460b mo90592a(String str, String str2, Integer num, String str3) {
        return new C37460b(str, str2, num, str3);
    }

    /* renamed from: c */
    public final String mo90593c() {
        return this.f90062b;
    }

    /* renamed from: d */
    public final String mo90594d() {
        return this.f90064d;
    }

    /* renamed from: e */
    public final String mo90595e() {
        return this.f90061a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37460b)) {
            return false;
        }
        C37460b bVar = (C37460b) obj;
        return C41536l.m120484d(this.f90061a, bVar.f90061a) && C41536l.m120484d(this.f90062b, bVar.f90062b) && C41536l.m120484d(this.f90063c, bVar.f90063c) && C41536l.m120484d(this.f90064d, bVar.f90064d);
    }

    /* renamed from: f */
    public final Integer mo90597f() {
        return this.f90063c;
    }

    /* renamed from: g */
    public final boolean mo90598g() {
        boolean z;
        boolean z2;
        boolean z3;
        String str = this.f90061a;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        String str2 = this.f90062b;
        if (str2 == null || C40439w.m117118v(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        String str3 = this.f90064d;
        if (str3 == null || C40439w.m117118v(str3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f90063c == null || this.f90061a.length() != 11) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f90061a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90062b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f90063c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f90064d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f90061a;
        String str2 = this.f90062b;
        Integer num = this.f90063c;
        String str3 = this.f90064d;
        return "PlusPointsTransferData(idNumber=" + str + ", beneficiaryName=" + str2 + ", transferPoints=" + num + ", comment=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37460b(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}

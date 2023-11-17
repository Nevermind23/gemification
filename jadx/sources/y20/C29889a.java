package y20;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p812kv.C25782e;

/* renamed from: y20.a */
public final class C29889a {

    /* renamed from: a */
    private final C25782e f75617a;

    /* renamed from: b */
    private final String f75618b;

    /* renamed from: c */
    private final boolean f75619c;

    public C29889a(C25782e eVar, String str, boolean z) {
        this.f75617a = eVar;
        this.f75618b = str;
        this.f75619c = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C29889a m90703b(C29889a aVar, C25782e eVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = aVar.f75617a;
        }
        if ((i & 2) != 0) {
            str = aVar.f75618b;
        }
        if ((i & 4) != 0) {
            z = aVar.f75619c;
        }
        return aVar.mo70164a(eVar, str, z);
    }

    /* renamed from: a */
    public final C29889a mo70164a(C25782e eVar, String str, boolean z) {
        return new C29889a(eVar, str, z);
    }

    /* renamed from: c */
    public final String mo70165c() {
        return this.f75618b;
    }

    /* renamed from: d */
    public final C25782e mo70166d() {
        return this.f75617a;
    }

    /* renamed from: e */
    public final boolean mo70167e() {
        return this.f75619c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29889a)) {
            return false;
        }
        C29889a aVar = (C29889a) obj;
        return this.f75617a == aVar.f75617a && C41536l.m120484d(this.f75618b, aVar.f75618b) && this.f75619c == aVar.f75619c;
    }

    /* renamed from: f */
    public final boolean mo70169f() {
        return this.f75617a != null && !this.f75619c;
    }

    public int hashCode() {
        C25782e eVar = this.f75617a;
        int i = 0;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        String str = this.f75618b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f75619c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        C25782e eVar = this.f75617a;
        String str = this.f75618b;
        boolean z = this.f75619c;
        return "CompleteButtonState(requestState=" + eVar + ", buttonDescriptionText=" + str + ", isDisabled=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29889a(C25782e eVar, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, str, (i & 4) != 0 ? false : z);
    }
}

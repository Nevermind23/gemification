package hs0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hs0.a */
public final class C36188a {

    /* renamed from: a */
    private final String f87384a;

    /* renamed from: b */
    private final boolean f87385b;

    public C36188a(String str, boolean z) {
        C41536l.m120489i(str, "headerText");
        this.f87384a = str;
        this.f87385b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C36188a m107623b(C36188a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f87384a;
        }
        if ((i & 2) != 0) {
            z = aVar.f87385b;
        }
        return aVar.mo88947a(str, z);
    }

    /* renamed from: a */
    public final C36188a mo88947a(String str, boolean z) {
        C41536l.m120489i(str, "headerText");
        return new C36188a(str, z);
    }

    /* renamed from: c */
    public final boolean mo88948c() {
        return this.f87385b;
    }

    /* renamed from: d */
    public final String mo88949d() {
        return this.f87384a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36188a)) {
            return false;
        }
        C36188a aVar = (C36188a) obj;
        return C41536l.m120484d(this.f87384a, aVar.f87384a) && this.f87385b == aVar.f87385b;
    }

    public int hashCode() {
        int hashCode = this.f87384a.hashCode() * 31;
        boolean z = this.f87385b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f87384a;
        boolean z = this.f87385b;
        return "PawnLoanUiModel(headerText=" + str + ", canScrollUp=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36188a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}

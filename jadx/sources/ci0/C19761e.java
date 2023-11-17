package ci0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ci0.e */
public final class C19761e {

    /* renamed from: a */
    private final boolean f54123a;

    /* renamed from: b */
    private final Long f54124b;

    /* renamed from: c */
    private final String f54125c;

    /* renamed from: d */
    private final boolean f54126d;

    public C19761e(boolean z, Long l, String str, boolean z2) {
        this.f54123a = z;
        this.f54124b = l;
        this.f54125c = str;
        this.f54126d = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C19761e m65470b(C19761e eVar, boolean z, Long l, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eVar.f54123a;
        }
        if ((i & 2) != 0) {
            l = eVar.f54124b;
        }
        if ((i & 4) != 0) {
            str = eVar.f54125c;
        }
        if ((i & 8) != 0) {
            z2 = eVar.f54126d;
        }
        return eVar.mo47977a(z, l, str, z2);
    }

    /* renamed from: a */
    public final C19761e mo47977a(boolean z, Long l, String str, boolean z2) {
        return new C19761e(z, l, str, z2);
    }

    /* renamed from: c */
    public final Long mo47978c() {
        return this.f54124b;
    }

    /* renamed from: d */
    public final String mo47979d() {
        return this.f54125c;
    }

    /* renamed from: e */
    public final boolean mo47980e() {
        return this.f54126d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19761e)) {
            return false;
        }
        C19761e eVar = (C19761e) obj;
        return this.f54123a == eVar.f54123a && C41536l.m120484d(this.f54124b, eVar.f54124b) && C41536l.m120484d(this.f54125c, eVar.f54125c) && this.f54126d == eVar.f54126d;
    }

    /* renamed from: f */
    public final boolean mo47982f() {
        return this.f54123a;
    }

    public int hashCode() {
        boolean z = this.f54123a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f54124b;
        int i2 = 0;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f54125c;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z3 = this.f54126d;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f54123a;
        Long l = this.f54124b;
        String str = this.f54125c;
        boolean z2 = this.f54126d;
        return "TimePickerInputState(isInputVisible=" + z + ", chosenDate=" + l + ", infoText=" + str + ", shouldUpdateTimePickerState=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19761e(boolean z, Long l, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2);
    }
}

package hi0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hi0.c */
public final class C25030c {

    /* renamed from: a */
    private final boolean f64373a;

    /* renamed from: b */
    private final String f64374b;

    public C25030c(boolean z, String str) {
        this.f64373a = z;
        this.f64374b = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C25030c m79960b(C25030c cVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cVar.f64373a;
        }
        if ((i & 2) != 0) {
            str = cVar.f64374b;
        }
        return cVar.mo63445a(z, str);
    }

    /* renamed from: a */
    public final C25030c mo63445a(boolean z, String str) {
        return new C25030c(z, str);
    }

    /* renamed from: c */
    public final String mo63446c() {
        return this.f64374b;
    }

    /* renamed from: d */
    public final boolean mo63447d() {
        return this.f64373a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25030c)) {
            return false;
        }
        C25030c cVar = (C25030c) obj;
        return this.f64373a == cVar.f64373a && C41536l.m120484d(this.f64374b, cVar.f64374b);
    }

    public int hashCode() {
        boolean z = this.f64373a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f64374b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f64373a;
        String str = this.f64374b;
        return "InputUiState(hasPermissionGranted=" + z + ", chosenContact=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25030c(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}

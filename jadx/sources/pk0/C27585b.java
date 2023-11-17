package pk0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.model.OptionalActionsData;

/* renamed from: pk0.b */
public final class C27585b {

    /* renamed from: d */
    public static final C27586a f70507d = new C27586a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final boolean f70508a;

    /* renamed from: b */
    private final boolean f70509b;

    /* renamed from: c */
    private final String f70510c;

    /* renamed from: pk0.b$a */
    public static final class C27586a {
        private C27586a() {
        }

        public /* synthetic */ C27586a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27585b mo66942a(OptionalActionsData optionalActionsData, boolean z, String str) {
            C41536l.m120489i(optionalActionsData, "optionalActionsData");
            return new C27585b(optionalActionsData.getShowInstantCard(), z, str);
        }
    }

    public C27585b(boolean z, boolean z2, String str) {
        this.f70508a = z;
        this.f70509b = z2;
        this.f70510c = str;
    }

    /* renamed from: a */
    public final String mo66937a() {
        return this.f70510c;
    }

    /* renamed from: b */
    public final boolean mo66938b() {
        return this.f70509b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27585b)) {
            return false;
        }
        C27585b bVar = (C27585b) obj;
        return this.f70508a == bVar.f70508a && this.f70509b == bVar.f70509b && C41536l.m120484d(this.f70510c, bVar.f70510c);
    }

    public int hashCode() {
        boolean z = this.f70508a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f70509b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.f70510c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f70508a;
        boolean z2 = this.f70509b;
        String str = this.f70510c;
        return "HubOptionalActionsData(showInstantCard=" + z + ", isAuthorized=" + z2 + ", avatarUrl=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27585b(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
    }
}

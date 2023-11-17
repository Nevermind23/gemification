package l10;

import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import t10.C28297b;
import t10.C28298c;

/* renamed from: l10.a */
public final class C25799a {

    /* renamed from: a */
    private final boolean f65620a;

    /* renamed from: b */
    private final boolean f65621b;

    /* renamed from: c */
    private final C28298c f65622c;

    /* renamed from: d */
    private final C28297b f65623d;

    /* renamed from: e */
    private final ArrayList f65624e;

    /* renamed from: f */
    private final boolean f65625f;

    /* renamed from: g */
    private final boolean f65626g;

    public C25799a(boolean z, boolean z2, C28298c cVar, C28297b bVar, ArrayList arrayList, boolean z3, boolean z4) {
        C41536l.m120489i(cVar, "profilePictureItem");
        C41536l.m120489i(bVar, "namesItem");
        C41536l.m120489i(arrayList, "accounts");
        this.f65620a = z;
        this.f65621b = z2;
        this.f65622c = cVar;
        this.f65623d = bVar;
        this.f65624e = arrayList;
        this.f65625f = z3;
        this.f65626g = z4;
    }

    /* renamed from: a */
    public final ArrayList mo64420a() {
        return this.f65624e;
    }

    /* renamed from: b */
    public final boolean mo64421b() {
        return this.f65626g;
    }

    /* renamed from: c */
    public final boolean mo64422c() {
        return this.f65621b;
    }

    /* renamed from: d */
    public final C28297b mo64423d() {
        return this.f65623d;
    }

    /* renamed from: e */
    public final C28298c mo64424e() {
        return this.f65622c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25799a)) {
            return false;
        }
        C25799a aVar = (C25799a) obj;
        return this.f65620a == aVar.f65620a && this.f65621b == aVar.f65621b && C41536l.m120484d(this.f65622c, aVar.f65622c) && C41536l.m120484d(this.f65623d, aVar.f65623d) && C41536l.m120484d(this.f65624e, aVar.f65624e) && this.f65625f == aVar.f65625f && this.f65626g == aVar.f65626g;
    }

    /* renamed from: f */
    public final boolean mo64426f() {
        return this.f65620a;
    }

    /* renamed from: g */
    public final boolean mo64427g() {
        return this.f65625f;
    }

    public int hashCode() {
        boolean z = this.f65620a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f65621b;
        if (z3) {
            z3 = true;
        }
        int hashCode = (((((((i + (z3 ? 1 : 0)) * 31) + this.f65622c.hashCode()) * 31) + this.f65623d.hashCode()) * 31) + this.f65624e.hashCode()) * 31;
        boolean z4 = this.f65625f;
        if (z4) {
            z4 = true;
        }
        int i2 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f65626g;
        if (!z5) {
            z2 = z5;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f65620a;
        boolean z2 = this.f65621b;
        C28298c cVar = this.f65622c;
        C28297b bVar = this.f65623d;
        ArrayList arrayList = this.f65624e;
        boolean z3 = this.f65625f;
        boolean z4 = this.f65626g;
        return "DetailsItem(isBudgetContact=" + z + ", canRequestMoney=" + z2 + ", profilePictureItem=" + cVar + ", namesItem=" + bVar + ", accounts=" + arrayList + ", isVerified=" + z3 + ", canBeVerified=" + z4 + ")";
    }
}

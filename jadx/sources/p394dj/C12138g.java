package p394dj;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: dj.g */
public final class C12138g {

    /* renamed from: a */
    private final boolean f35656a;

    /* renamed from: b */
    private final CharSequence f35657b;

    /* renamed from: c */
    private final CharSequence f35658c;

    /* renamed from: d */
    private final CharSequence f35659d;

    /* renamed from: e */
    private final C12139h f35660e;

    /* renamed from: f */
    private final boolean f35661f;

    /* renamed from: g */
    private final C43064a f35662g;

    public C12138g(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C12139h hVar, boolean z2, C43064a aVar) {
        this.f35656a = z;
        this.f35657b = charSequence;
        this.f35658c = charSequence2;
        this.f35659d = charSequence3;
        this.f35660e = hVar;
        this.f35661f = z2;
        this.f35662g = aVar;
    }

    /* renamed from: a */
    public final CharSequence mo32360a() {
        return this.f35659d;
    }

    /* renamed from: b */
    public final C43064a mo32361b() {
        return this.f35662g;
    }

    /* renamed from: c */
    public final CharSequence mo32362c() {
        return this.f35658c;
    }

    /* renamed from: d */
    public final CharSequence mo32363d() {
        return this.f35657b;
    }

    /* renamed from: e */
    public final C12139h mo32364e() {
        return this.f35660e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12138g)) {
            return false;
        }
        C12138g gVar = (C12138g) obj;
        return this.f35656a == gVar.f35656a && C41536l.m120484d(this.f35657b, gVar.f35657b) && C41536l.m120484d(this.f35658c, gVar.f35658c) && C41536l.m120484d(this.f35659d, gVar.f35659d) && this.f35660e == gVar.f35660e && this.f35661f == gVar.f35661f && C41536l.m120484d(this.f35662g, gVar.f35662g);
    }

    /* renamed from: f */
    public final boolean mo32366f() {
        return this.f35656a;
    }

    /* renamed from: g */
    public final boolean mo32367g() {
        return this.f35661f;
    }

    public int hashCode() {
        boolean z = this.f35656a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        CharSequence charSequence = this.f35657b;
        int i2 = 0;
        int hashCode = (i + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f35658c;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f35659d;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        C12139h hVar = this.f35660e;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        boolean z3 = this.f35661f;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        C43064a aVar = this.f35662g;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        boolean z = this.f35656a;
        CharSequence charSequence = this.f35657b;
        CharSequence charSequence2 = this.f35658c;
        CharSequence charSequence3 = this.f35659d;
        C12139h hVar = this.f35660e;
        boolean z2 = this.f35661f;
        C43064a aVar = this.f35662g;
        return "TextBadgeData(isErrorBadge=" + z + ", badgeText=" + charSequence + ", badgeSecondText=" + charSequence2 + ", badgeCaption=" + charSequence3 + ", textBadgeStatus=" + hVar + ", isSingleLineMedium=" + z2 + ", badgeClickListener=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12138g(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C12139h hVar, boolean z2, C43064a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, charSequence, (i & 4) != 0 ? null : charSequence2, charSequence3, (i & 16) != 0 ? C12139h.NEUTRAL : hVar, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : aVar);
    }
}

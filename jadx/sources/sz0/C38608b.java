package sz0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p683yh.C18917a;

/* renamed from: sz0.b */
public final class C38608b {

    /* renamed from: a */
    private final C18917a f92470a;

    /* renamed from: b */
    private final boolean f92471b;

    /* renamed from: c */
    private final String f92472c;

    public C38608b(C18917a aVar, boolean z, String str) {
        C41536l.m120489i(aVar, "cardInfo");
        this.f92470a = aVar;
        this.f92471b = z;
        this.f92472c = str;
    }

    /* renamed from: a */
    public final C18917a mo92235a() {
        return this.f92470a;
    }

    /* renamed from: b */
    public final String mo92236b() {
        return this.f92472c;
    }

    /* renamed from: c */
    public final boolean mo92237c() {
        return this.f92471b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38608b)) {
            return false;
        }
        C38608b bVar = (C38608b) obj;
        return C41536l.m120484d(this.f92470a, bVar.f92470a) && this.f92471b == bVar.f92471b && C41536l.m120484d(this.f92472c, bVar.f92472c);
    }

    public int hashCode() {
        int hashCode = this.f92470a.hashCode() * 31;
        boolean z = this.f92471b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f92472c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C18917a aVar = this.f92470a;
        boolean z = this.f92471b;
        String str = this.f92472c;
        return "CreditCardInfoUiModel(cardInfo=" + aVar + ", isScoolCard=" + z + ", vcPlasticCardStatus=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38608b(C18917a aVar, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z, (i & 4) != 0 ? null : str);
    }
}

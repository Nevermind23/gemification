package dl0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dl0.a */
public final class C20038a {

    /* renamed from: a */
    private final boolean f54655a;

    /* renamed from: b */
    private final C20039b f54656b;

    public C20038a(boolean z, C20039b bVar) {
        C41536l.m120489i(bVar, "hubAppearance");
        this.f54655a = z;
        this.f54656b = bVar;
    }

    /* renamed from: a */
    public final C20039b mo48438a() {
        return this.f54656b;
    }

    /* renamed from: b */
    public final boolean mo48439b() {
        return this.f54655a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20038a)) {
            return false;
        }
        C20038a aVar = (C20038a) obj;
        return this.f54655a == aVar.f54655a && C41536l.m120484d(this.f54656b, aVar.f54656b);
    }

    public int hashCode() {
        boolean z = this.f54655a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f54656b.hashCode();
    }

    public String toString() {
        boolean z = this.f54655a;
        C20039b bVar = this.f54656b;
        return "BankingGroupingHubsAppearance(isAuthorized=" + z + ", hubAppearance=" + bVar + ")";
    }
}

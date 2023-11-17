package y91;

import kotlin.jvm.internal.C41536l;

/* renamed from: y91.f */
public final class C40041f {

    /* renamed from: a */
    private final String f95141a;

    /* renamed from: b */
    private final String f95142b;

    /* renamed from: c */
    private final boolean f95143c;

    public C40041f(String str, String str2, boolean z) {
        C41536l.m120489i(str2, "wishDescription");
        this.f95141a = str;
        this.f95142b = str2;
        this.f95143c = z;
    }

    /* renamed from: a */
    public final String mo93910a() {
        return this.f95141a;
    }

    /* renamed from: b */
    public final String mo93911b() {
        return this.f95142b;
    }

    /* renamed from: c */
    public final boolean mo93912c() {
        return this.f95143c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40041f)) {
            return false;
        }
        C40041f fVar = (C40041f) obj;
        return C41536l.m120484d(this.f95141a, fVar.f95141a) && C41536l.m120484d(this.f95142b, fVar.f95142b) && this.f95143c == fVar.f95143c;
    }

    public int hashCode() {
        String str = this.f95141a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f95142b.hashCode()) * 31;
        boolean z = this.f95143c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f95141a;
        String str2 = this.f95142b;
        boolean z = this.f95143c;
        return "WishCampaignHeaderUiModel(background=" + str + ", wishDescription=" + str2 + ", isDark=" + z + ")";
    }
}

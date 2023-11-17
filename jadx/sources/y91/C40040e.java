package y91;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y91.e */
public final class C40040e {

    /* renamed from: a */
    private final String f95140a;

    public C40040e(String str) {
        this.f95140a = str;
    }

    /* renamed from: a */
    public final String mo93906a() {
        return this.f95140a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40040e) && C41536l.m120484d(this.f95140a, ((C40040e) obj).f95140a);
    }

    public int hashCode() {
        String str = this.f95140a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f95140a;
        return "WishCampaignDepositBannerUiModel(depositType=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40040e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

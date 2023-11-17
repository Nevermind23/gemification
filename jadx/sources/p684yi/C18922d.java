package p684yi;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: yi.d */
public final class C18922d {

    /* renamed from: a */
    private final String f52919a;

    /* renamed from: b */
    private final C43064a f52920b;

    /* renamed from: c */
    private final String f52921c;

    /* renamed from: d */
    private final C43064a f52922d;

    public C18922d(String str, C43064a aVar, String str2, C43064a aVar2) {
        this.f52919a = str;
        this.f52920b = aVar;
        this.f52921c = str2;
        this.f52922d = aVar2;
    }

    /* renamed from: a */
    public final C43064a mo46960a() {
        return this.f52920b;
    }

    /* renamed from: b */
    public final String mo46961b() {
        return this.f52919a;
    }

    /* renamed from: c */
    public final C43064a mo46962c() {
        return this.f52922d;
    }

    /* renamed from: d */
    public final String mo46963d() {
        return this.f52921c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18922d)) {
            return false;
        }
        C18922d dVar = (C18922d) obj;
        return C41536l.m120484d(this.f52919a, dVar.f52919a) && C41536l.m120484d(this.f52920b, dVar.f52920b) && C41536l.m120484d(this.f52921c, dVar.f52921c) && C41536l.m120484d(this.f52922d, dVar.f52922d);
    }

    public int hashCode() {
        String str = this.f52919a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C43064a aVar = this.f52920b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f52921c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C43064a aVar2 = this.f52922d;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f52919a;
        C43064a aVar = this.f52920b;
        String str2 = this.f52921c;
        C43064a aVar2 = this.f52922d;
        return "PackageCardButtonData(primaryButtonText=" + str + ", primaryButtonAction=" + aVar + ", secondaryButtonText=" + str2 + ", secondaryButtonAction=" + aVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18922d(String str, C43064a aVar, String str2, C43064a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : aVar2);
    }
}

package p394dj;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;

/* renamed from: dj.a */
public final class C12132a {

    /* renamed from: a */
    private final String f35643a;

    /* renamed from: b */
    private final List f35644b;

    /* renamed from: c */
    private final List f35645c;

    /* renamed from: d */
    private final TextProgressBarView.ProgressModel f35646d;

    /* renamed from: e */
    private final C12138g f35647e;

    /* renamed from: f */
    private final boolean f35648f;

    /* renamed from: g */
    private final boolean f35649g;

    public C12132a(String str, List list, List list2, TextProgressBarView.ProgressModel progressModel, C12138g gVar, boolean z, boolean z2) {
        C41536l.m120489i(list, "totalAmount");
        this.f35643a = str;
        this.f35644b = list;
        this.f35645c = list2;
        this.f35646d = progressModel;
        this.f35647e = gVar;
        this.f35648f = z;
        this.f35649g = z2;
    }

    /* renamed from: a */
    public final List mo32341a() {
        return this.f35645c;
    }

    /* renamed from: b */
    public final boolean mo32342b() {
        return this.f35649g;
    }

    /* renamed from: c */
    public final String mo32343c() {
        return this.f35643a;
    }

    /* renamed from: d */
    public final TextProgressBarView.ProgressModel mo32344d() {
        return this.f35646d;
    }

    /* renamed from: e */
    public final C12138g mo32345e() {
        return this.f35647e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12132a)) {
            return false;
        }
        C12132a aVar = (C12132a) obj;
        return C41536l.m120484d(this.f35643a, aVar.f35643a) && C41536l.m120484d(this.f35644b, aVar.f35644b) && C41536l.m120484d(this.f35645c, aVar.f35645c) && C41536l.m120484d(this.f35646d, aVar.f35646d) && C41536l.m120484d(this.f35647e, aVar.f35647e) && this.f35648f == aVar.f35648f && this.f35649g == aVar.f35649g;
    }

    /* renamed from: f */
    public final List mo32347f() {
        return this.f35644b;
    }

    /* renamed from: g */
    public final boolean mo32348g() {
        return this.f35648f;
    }

    public int hashCode() {
        String str = this.f35643a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f35644b.hashCode()) * 31;
        List list = this.f35645c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TextProgressBarView.ProgressModel progressModel = this.f35646d;
        int hashCode3 = (hashCode2 + (progressModel == null ? 0 : progressModel.hashCode())) * 31;
        C12138g gVar = this.f35647e;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f35648f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f35649g;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f35643a;
        List list = this.f35644b;
        List list2 = this.f35645c;
        TextProgressBarView.ProgressModel progressModel = this.f35646d;
        C12138g gVar = this.f35647e;
        boolean z = this.f35648f;
        boolean z2 = this.f35649g;
        return "NewProductHeaderData(productName=" + str + ", totalAmount=" + list + ", amounts=" + list2 + ", progress=" + progressModel + ", textBadge=" + gVar + ", isFavorite=" + z + ", chevronVisible=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12132a(String str, List list, List list2, TextProgressBarView.ProgressModel progressModel, C12138g gVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : progressModel, (i & 16) != 0 ? null : gVar, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2);
    }
}

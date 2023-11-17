package xe0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus;

/* renamed from: xe0.n */
public final class C29756n {

    /* renamed from: a */
    private final String f75253a;

    /* renamed from: b */
    private final String f75254b;

    /* renamed from: c */
    private final String f75255c;

    /* renamed from: d */
    private final C29747e f75256d;

    /* renamed from: e */
    private final ShareStatus f75257e;

    /* renamed from: f */
    private final List f75258f;

    public C29756n(String str, String str2, String str3, C29747e eVar, ShareStatus shareStatus, List list) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "currency");
        C41536l.m120489i(list, "shareWatchLists");
        this.f75253a = str;
        this.f75254b = str2;
        this.f75255c = str3;
        this.f75256d = eVar;
        this.f75257e = shareStatus;
        this.f75258f = list;
    }

    /* renamed from: a */
    public final C29747e mo69856a() {
        return this.f75256d;
    }

    /* renamed from: b */
    public final String mo69857b() {
        return this.f75254b;
    }

    /* renamed from: c */
    public final String mo69858c() {
        return this.f75255c;
    }

    /* renamed from: d */
    public final String mo69859d() {
        return this.f75253a;
    }

    /* renamed from: e */
    public final List mo69860e() {
        return this.f75258f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29756n)) {
            return false;
        }
        C29756n nVar = (C29756n) obj;
        return C41536l.m120484d(this.f75253a, nVar.f75253a) && C41536l.m120484d(this.f75254b, nVar.f75254b) && C41536l.m120484d(this.f75255c, nVar.f75255c) && C41536l.m120484d(this.f75256d, nVar.f75256d) && this.f75257e == nVar.f75257e && C41536l.m120484d(this.f75258f, nVar.f75258f);
    }

    /* renamed from: f */
    public final ShareStatus mo69862f() {
        return this.f75257e;
    }

    public int hashCode() {
        int hashCode = ((this.f75253a.hashCode() * 31) + this.f75254b.hashCode()) * 31;
        String str = this.f75255c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29747e eVar = this.f75256d;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ShareStatus shareStatus = this.f75257e;
        if (shareStatus != null) {
            i = shareStatus.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f75258f.hashCode();
    }

    public String toString() {
        String str = this.f75253a;
        String str2 = this.f75254b;
        String str3 = this.f75255c;
        C29747e eVar = this.f75256d;
        ShareStatus shareStatus = this.f75257e;
        List list = this.f75258f;
        return "ShareSymbolMetaData(name=" + str + ", currency=" + str2 + ", info=" + str3 + ", clientPosition=" + eVar + ", status=" + shareStatus + ", shareWatchLists=" + list + ")";
    }
}

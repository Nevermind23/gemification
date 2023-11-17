package m01;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.AtmApiModel;

/* renamed from: m01.h */
public final class C37194h {

    /* renamed from: a */
    private final String f89583a;

    /* renamed from: b */
    private final C37190d f89584b;

    /* renamed from: c */
    private final int f89585c;

    /* renamed from: d */
    private final long f89586d;

    /* renamed from: e */
    private final List f89587e;

    /* renamed from: f */
    private final AtmApiModel f89588f;

    public C37194h(String str, C37190d dVar, int i, long j, List list, AtmApiModel atmApiModel) {
        C41536l.m120489i(str, "requestId");
        C41536l.m120489i(dVar, "atmData");
        C41536l.m120489i(list, "denominationData");
        C41536l.m120489i(atmApiModel, "atmApiModel");
        this.f89583a = str;
        this.f89584b = dVar;
        this.f89585c = i;
        this.f89586d = j;
        this.f89587e = list;
        this.f89588f = atmApiModel;
    }

    /* renamed from: a */
    public final AtmApiModel mo90239a() {
        return this.f89588f;
    }

    /* renamed from: b */
    public final int mo90240b() {
        return this.f89585c;
    }

    /* renamed from: c */
    public final List mo90241c() {
        return this.f89587e;
    }

    /* renamed from: d */
    public final String mo90242d() {
        return this.f89583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37194h)) {
            return false;
        }
        C37194h hVar = (C37194h) obj;
        return C41536l.m120484d(this.f89583a, hVar.f89583a) && C41536l.m120484d(this.f89584b, hVar.f89584b) && this.f89585c == hVar.f89585c && this.f89586d == hVar.f89586d && C41536l.m120484d(this.f89587e, hVar.f89587e) && C41536l.m120484d(this.f89588f, hVar.f89588f);
    }

    public int hashCode() {
        return (((((((((this.f89583a.hashCode() * 31) + this.f89584b.hashCode()) * 31) + this.f89585c) * 31) + C7397t.m28148a(this.f89586d)) * 31) + this.f89587e.hashCode()) * 31) + this.f89588f.hashCode();
    }

    public String toString() {
        String str = this.f89583a;
        C37190d dVar = this.f89584b;
        int i = this.f89585c;
        long j = this.f89586d;
        List list = this.f89587e;
        AtmApiModel atmApiModel = this.f89588f;
        return "QrCashOutData(requestId=" + str + ", atmData=" + dVar + ", atmRequestTimeout=" + i + ", inpDate=" + j + ", denominationData=" + list + ", atmApiModel=" + atmApiModel + ")";
    }
}

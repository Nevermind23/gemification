package ec0;

import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;

/* renamed from: ec0.f */
public final class C20214f {

    /* renamed from: a */
    private final String f54914a;

    /* renamed from: b */
    private final String f54915b;

    /* renamed from: c */
    private final String f54916c;

    /* renamed from: d */
    private final String f54917d;

    /* renamed from: e */
    private final InlineFeedback2.C13350a f54918e;

    /* renamed from: f */
    private final C25168f f54919f;

    public C20214f(String str, String str2, String str3, String str4, InlineFeedback2.C13350a aVar, C25168f fVar) {
        C41536l.m120489i(str, "description");
        C41536l.m120489i(str2, "descriptionShort");
        C41536l.m120489i(str3, "analyticsLabel");
        C41536l.m120489i(str4, "buttonText");
        C41536l.m120489i(aVar, "status");
        C41536l.m120489i(fVar, "type");
        this.f54914a = str;
        this.f54915b = str2;
        this.f54916c = str3;
        this.f54917d = str4;
        this.f54918e = aVar;
        this.f54919f = fVar;
    }

    /* renamed from: a */
    public final String mo48636a() {
        return this.f54916c;
    }

    /* renamed from: b */
    public final String mo48637b() {
        return this.f54917d;
    }

    /* renamed from: c */
    public final String mo48638c() {
        return this.f54914a;
    }

    /* renamed from: d */
    public final String mo48639d() {
        return this.f54915b;
    }

    /* renamed from: e */
    public final InlineFeedback2.C13350a mo48640e() {
        return this.f54918e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20214f)) {
            return false;
        }
        C20214f fVar = (C20214f) obj;
        return C41536l.m120484d(this.f54914a, fVar.f54914a) && C41536l.m120484d(this.f54915b, fVar.f54915b) && C41536l.m120484d(this.f54916c, fVar.f54916c) && C41536l.m120484d(this.f54917d, fVar.f54917d) && this.f54918e == fVar.f54918e && this.f54919f == fVar.f54919f;
    }

    /* renamed from: f */
    public final C25168f mo48642f() {
        return this.f54919f;
    }

    public int hashCode() {
        return (((((((((this.f54914a.hashCode() * 31) + this.f54915b.hashCode()) * 31) + this.f54916c.hashCode()) * 31) + this.f54917d.hashCode()) * 31) + this.f54918e.hashCode()) * 31) + this.f54919f.hashCode();
    }

    public String toString() {
        String str = this.f54914a;
        String str2 = this.f54915b;
        String str3 = this.f54916c;
        String str4 = this.f54917d;
        InlineFeedback2.C13350a aVar = this.f54918e;
        C25168f fVar = this.f54919f;
        return "DepositProlongationInfo(description=" + str + ", descriptionShort=" + str2 + ", analyticsLabel=" + str3 + ", buttonText=" + str4 + ", status=" + aVar + ", type=" + fVar + ")";
    }
}

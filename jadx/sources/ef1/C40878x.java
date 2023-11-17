package ef1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: ef1.x */
final class C40878x {

    /* renamed from: a */
    public final Object f96594a;

    /* renamed from: b */
    public final C40831l f96595b;

    /* renamed from: c */
    public final C43075l f96596c;

    /* renamed from: d */
    public final Object f96597d;

    /* renamed from: e */
    public final Throwable f96598e;

    public C40878x(Object obj, C40831l lVar, C43075l lVar2, Object obj2, Throwable th) {
        this.f96594a = obj;
        this.f96595b = lVar;
        this.f96596c = lVar2;
        this.f96597d = obj2;
        this.f96598e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C40878x m118570b(C40878x xVar, Object obj, C40831l lVar, C43075l lVar2, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = xVar.f96594a;
        }
        if ((i & 2) != 0) {
            lVar = xVar.f96595b;
        }
        C40831l lVar3 = lVar;
        if ((i & 4) != 0) {
            lVar2 = xVar.f96596c;
        }
        C43075l lVar4 = lVar2;
        if ((i & 8) != 0) {
            obj2 = xVar.f96597d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = xVar.f96598e;
        }
        return xVar.mo95258a(obj, lVar3, lVar4, obj4, th);
    }

    /* renamed from: a */
    public final C40878x mo95258a(Object obj, C40831l lVar, C43075l lVar2, Object obj2, Throwable th) {
        return new C40878x(obj, lVar, lVar2, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo95259c() {
        return this.f96598e != null;
    }

    /* renamed from: d */
    public final void mo95260d(C40843o oVar, Throwable th) {
        C40831l lVar = this.f96595b;
        if (lVar != null) {
            oVar.mo95204n(lVar, th);
        }
        C43075l lVar2 = this.f96596c;
        if (lVar2 != null) {
            oVar.mo95205p(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40878x)) {
            return false;
        }
        C40878x xVar = (C40878x) obj;
        return C41536l.m120484d(this.f96594a, xVar.f96594a) && C41536l.m120484d(this.f96595b, xVar.f96595b) && C41536l.m120484d(this.f96596c, xVar.f96596c) && C41536l.m120484d(this.f96597d, xVar.f96597d) && C41536l.m120484d(this.f96598e, xVar.f96598e);
    }

    public int hashCode() {
        Object obj = this.f96594a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C40831l lVar = this.f96595b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C43075l lVar2 = this.f96596c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.f96597d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f96598e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f96594a + ", cancelHandler=" + this.f96595b + ", onCancellation=" + this.f96596c + ", idempotentResume=" + this.f96597d + ", cancelCause=" + this.f96598e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40878x(Object obj, C40831l lVar, C43075l lVar2, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : lVar, (i & 4) != 0 ? null : lVar2, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}

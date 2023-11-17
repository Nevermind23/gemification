package bh1;

import androidx.lifecycle.C1557a;
import androidx.lifecycle.C1580f0;
import androidx.lifecycle.C1613n0;
import dh1.C40708a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh1.C41769a;
import ph1.C42203a;
import ue1.C43064a;
import yg1.C43401b;

/* renamed from: bh1.b */
public final class C40386b extends C1557a {

    /* renamed from: e */
    private final C42203a f95964e;

    /* renamed from: f */
    private final C43401b f95965f;

    /* renamed from: bh1.b$a */
    static final class C40387a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40386b f95966d;

        /* renamed from: e */
        final /* synthetic */ C1580f0 f95967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40387a(C40386b bVar, C1580f0 f0Var) {
            super(0);
            this.f95966d = bVar;
            this.f95967e = f0Var;
        }

        /* renamed from: b */
        public final C41769a invoke() {
            C41769a aVar;
            C43064a c = this.f95966d.mo94446f().mo102079c();
            if (c == null || (aVar = (C41769a) c.invoke()) == null) {
                aVar = new C41769a((List) null, 1, (DefaultConstructorMarker) null);
            }
            return C40708a.f96386d.mo94870a(this.f95967e, aVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40386b(ph1.C42203a r3, yg1.C43401b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            x0.d r0 = r4.mo102081e()
            if (r0 == 0) goto L_0x001c
            android.os.Bundle r1 = r4.mo102078b()
            r2.<init>(r0, r1)
            r2.f95964e = r3
            r2.f95965f = r4
            return
        L_0x001c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't create SavedStateViewModelFactory without a proper stateRegistryOwner"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bh1.C40386b.<init>(ph1.a, yg1.b):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1613n0 mo4842e(String str, Class cls, C1580f0 f0Var) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(f0Var, "handle");
        Object g = this.f95964e.mo97675g(this.f95965f.mo102077a(), this.f95965f.mo102080d(), new C40387a(this, f0Var));
        if (g != null) {
            return (C1613n0) g;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    /* renamed from: f */
    public final C43401b mo94446f() {
        return this.f95965f;
    }
}

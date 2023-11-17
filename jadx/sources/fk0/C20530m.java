package fk0;

import ck0.C19764a;
import ed1.C40762x;
import ed1.C40763y;
import g91.C32343x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p313x7.C8973b;
import p337z7.Task;
import ue1.C43075l;
import vj0.C29095f;

/* renamed from: fk0.m */
public final class C20530m {

    /* renamed from: a */
    private final C8973b f55551a;

    /* renamed from: fk0.m$a */
    static final class C20531a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40763y f55552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20531a(C40763y yVar) {
            super(1);
            this.f55552d = yVar;
        }

        /* renamed from: a */
        public final void mo49058a(String str) {
            C40763y yVar = this.f55552d;
            C41536l.m120488h(str, "id");
            yVar.mo95093a(new C19764a(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49058a((String) obj);
            return C41238w.f97225a;
        }
    }

    public C20530m(C8973b bVar) {
        C41536l.m120489i(bVar, "tapAndPayClient");
        this.f55551a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m66767d(C20530m mVar, C40763y yVar) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(yVar, "emitter");
        Task g = mVar.f55551a.mo21129g();
        g.mo24864i(new C20529l(new C20531a(yVar)));
        g.mo24861f(new C29095f(yVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m66768e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public C40762x mo49057c() {
        C40762x e = C40762x.m118157e(new C20528k(this));
        C41536l.m120488h(e, "create { emitter ->\n    …:onError)\n        }\n    }");
        return C32343x.m95456i1(e);
    }
}

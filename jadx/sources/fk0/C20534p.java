package fk0;

import bk0.C19394c;
import ck0.C19765b;
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

/* renamed from: fk0.p */
public final class C20534p implements C19394c {

    /* renamed from: a */
    private final C8973b f55555a;

    /* renamed from: fk0.p$a */
    static final class C20535a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40763y f55556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20535a(C40763y yVar) {
            super(1);
            this.f55556d = yVar;
        }

        /* renamed from: a */
        public final void mo49059a(String str) {
            C40763y yVar = this.f55556d;
            C41536l.m120488h(str, "id");
            yVar.mo95093a(new C19765b(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49059a((String) obj);
            return C41238w.f97225a;
        }
    }

    public C20534p(C8973b bVar) {
        C41536l.m120489i(bVar, "tapAndPayClient");
        this.f55555a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m66775c(C20534p pVar, C40763y yVar) {
        C41536l.m120489i(pVar, "this$0");
        C41536l.m120489i(yVar, "emitter");
        Task f = pVar.f55555a.mo21128f();
        f.mo24864i(new C20533o(new C20535a(yVar)));
        f.mo24861f(new C29095f(yVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m66776d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public C40762x invoke() {
        C40762x e = C40762x.m118157e(new C20532n(this));
        C41536l.m120488h(e, "create { emitter ->\n    …:onError)\n        }\n    }");
        return C32343x.m95456i1(e);
    }
}

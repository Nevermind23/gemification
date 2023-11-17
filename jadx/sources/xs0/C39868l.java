package xs0;

import ed1.C40735b0;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import zs0.C40249b;
import zs0.C40253f;

/* renamed from: xs0.l */
public final class C39868l {

    /* renamed from: a */
    private final C39878q f94614a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C39876o f94615b;

    /* renamed from: xs0.l$a */
    static final class C39869a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39868l f94616d;

        /* renamed from: xs0.l$a$a */
        static final class C39870a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40253f f94617d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39870a(C40253f fVar) {
                super(1);
                this.f94617d = fVar;
            }

            /* renamed from: a */
            public final C40249b invoke(List list) {
                C41536l.m120489i(list, "history");
                C40253f fVar = this.f94617d;
                C41536l.m120488h(fVar, "cas");
                return new C40249b(fVar, list, (String) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39869a(C39868l lVar) {
            super(1);
            this.f94616d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40249b m115642c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40249b) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C40253f fVar) {
            C41536l.m120489i(fVar, "cas");
            return this.f94616d.f94615b.mo93578a(fVar.mo94250j()).mo95062A(new C39866k(new C39870a(fVar)));
        }
    }

    public C39868l(C39878q qVar, C39876o oVar) {
        C41536l.m120489i(qVar, "getCasService");
        C41536l.m120489i(oVar, "getCasHistory");
        this.f94614a = qVar;
        this.f94615b = oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m115639d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo93571c(long j, boolean z) {
        C40762x r = this.f94614a.mo93580a(j, z).mo95087r(new C39864j(new C39869a(this)));
        C41536l.m120488h(r, "operator fun invoke(depo…cas, history) }\n        }");
        return r;
    }
}

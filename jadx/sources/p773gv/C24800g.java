package p773gv;

import ed1.C40734b;
import ed1.C40739f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p792iv.C25260a;
import p881ru.C28103l;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: gv.g */
public final class C24800g {

    /* renamed from: a */
    private final C25260a f63709a;

    /* renamed from: b */
    private final C28103l f63710b;

    /* renamed from: gv.g$a */
    static final class C24801a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24800g f63711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24801a(C24800g gVar) {
            super(1);
            this.f63711d = gVar;
        }

        /* renamed from: a */
        public final C40739f invoke(C28261a aVar) {
            C41536l.m120489i(aVar, "it");
            return this.f63711d.mo63214b().mo63785X3(aVar);
        }
    }

    public C24800g(C25260a aVar, C28103l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "getContactByIdUseCase");
        this.f63709a = aVar;
        this.f63710b = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40739f m79426d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C25260a mo63214b() {
        return this.f63709a;
    }

    /* renamed from: c */
    public final C40734b mo63215c(long j) {
        C40734b s = this.f63710b.mo67637b(j).mo95088s(new C24798f(new C24801a(this)));
        C41536l.m120488h(s, "operator fun invoke(cont…eiver(it)\n        }\n    }");
        return s;
    }
}

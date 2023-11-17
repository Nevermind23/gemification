package p773gv;

import ed1.C40734b;
import ed1.C40739f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p792iv.C25260a;
import p881ru.C28103l;
import p891su.C28261a;
import p891su.C28267d;
import p891su.C28269e;
import ue1.C43075l;

/* renamed from: gv.j */
public final class C24807j {

    /* renamed from: a */
    private final C25260a f63717a;

    /* renamed from: b */
    private final C28103l f63718b;

    /* renamed from: gv.j$a */
    static final class C24808a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24807j f63719d;

        /* renamed from: e */
        final /* synthetic */ String f63720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24808a(C24807j jVar, String str) {
            super(1);
            this.f63719d = jVar;
            this.f63720e = str;
        }

        /* renamed from: a */
        public final C40739f invoke(C28261a aVar) {
            C41536l.m120489i(aVar, "it");
            return this.f63719d.mo63218b().mo63785X3(C28261a.m86864b(aVar, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (C28267d) null, (List) null, (C28269e) null, 0, false, false, false, false, this.f63720e, false, false, 114687, (Object) null));
        }
    }

    public C24807j(C25260a aVar, C28103l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "getContactByIdUseCase");
        this.f63717a = aVar;
        this.f63718b = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40739f m79432d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C25260a mo63218b() {
        return this.f63717a;
    }

    /* renamed from: c */
    public final C40734b mo63219c(long j, String str) {
        C41536l.m120489i(str, "phone");
        C40734b s = this.f63718b.mo67637b(j).mo95088s(new C24805i(new C24808a(this, str)));
        C41536l.m120488h(s, "operator fun invoke(cont…= phone))\n        }\n    }");
        return s;
    }
}

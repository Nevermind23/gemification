package xj0;

import ak0.C19259a;
import dk0.C20035e;
import ed1.C40762x;
import j51.C36735g;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.googlepay.data.entity.PushTokenizeEntity;
import ue1.C43075l;
import uj0.C28800a;
import wj0.C29449a;

/* renamed from: xj0.b */
public final class C29814b implements C19259a {

    /* renamed from: a */
    private final C28800a f75487a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C29449a f75488b;

    /* renamed from: c */
    private final C36735g f75489c;

    /* renamed from: xj0.b$a */
    static final class C29815a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29814b f75490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29815a(C29814b bVar) {
            super(1);
            this.f75490d = bVar;
        }

        /* renamed from: a */
        public final C20035e invoke(PushTokenizeEntity pushTokenizeEntity) {
            C41536l.m120489i(pushTokenizeEntity, "it");
            return this.f75490d.f75488b.mo69298b(pushTokenizeEntity);
        }
    }

    public C29814b(C28800a aVar, C29449a aVar2, C36735g gVar) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "googlePayMapper");
        C41536l.m120489i(gVar, "loginInfoUseCase");
        this.f75487a = aVar;
        this.f75488b = aVar2;
        this.f75489c = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C20035e m90570d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20035e) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47491a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f75487a.mo68536a(hashMap).mo95062A(new C29813a(new C29815a(this)));
        C41536l.m120488h(A, "override fun generateOpc…apper.transform(it)\n    }");
        return A;
    }
}

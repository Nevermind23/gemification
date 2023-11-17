package p523mm;

import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p509lm.C16586a;
import ue1.C43075l;

/* renamed from: mm.u */
public final class C16775u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16586a f47019a;

    /* renamed from: b */
    private final C16735d f47020b;

    /* renamed from: mm.u$a */
    static final class C16776a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16775u f47021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16776a(C16775u uVar) {
            super(1);
            this.f47021d = uVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(Boolean bool) {
            C41536l.m120489i(bool, "canUseNickname");
            if (bool.booleanValue()) {
                return this.f47021d.f47019a.mo42420t0();
            }
            return C40762x.m118162z((Object) null);
        }
    }

    public C16775u(C16586a aVar, C16735d dVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(dVar, "getCanClientUseNicknameUseCase");
        this.f47019a = aVar;
        this.f47020b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m59205d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo43888c() {
        C40762x r = this.f47020b.mo43864a().mo95087r(new C16773t(new C16776a(this)));
        C41536l.m120488h(r, "operator fun invoke(): S…ust(null)\n        }\n    }");
        return r;
    }
}

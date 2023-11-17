package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import df0.C20000j;
import dg0.C20002b;
import dg0.C20003c;
import dg0.C20004d;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredViewModel$ViewModel */
public final class KycRequiredViewModel$ViewModel extends C21481a implements C20002b, C20003c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20000j f61608d;

    /* renamed from: e */
    private final C20002b f61609e = this;

    /* renamed from: f */
    private final C20003c f61610f = this;

    /* renamed from: g */
    private final C40767b f61611g;

    /* renamed from: h */
    private final C1644x f61612h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredViewModel$ViewModel$a */
    static final class C23621a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ KycRequiredViewModel$ViewModel f61613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23621a(KycRequiredViewModel$ViewModel kycRequiredViewModel$ViewModel) {
            super(1);
            this.f61613d = kycRequiredViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92878g(this.f61613d.f61608d.mo48375a(), -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KycRequiredViewModel$ViewModel(C20000j jVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(jVar, "uploadGTDocumentData");
        this.f61608d = jVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f61611g = h1;
        C1644x xVar = new C1644x();
        this.f61612h = xVar;
        C40749p L0 = h1.mo94989L0(new C20004d(new C23621a(this)));
        C41536l.m120488h(L0, "uploadGTDocumentSubject.…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m76357ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: b7 */
    public void mo48377b7() {
        this.f61611g.onNext(C41238w.f97225a);
    }

    /* renamed from: gw */
    public final C20002b mo60495gw() {
        return this.f61609e;
    }

    /* renamed from: hw */
    public final C20003c mo60496hw() {
        return this.f61610f;
    }

    /* renamed from: x4 */
    public LiveData mo48378x4() {
        return this.f61612h;
    }
}

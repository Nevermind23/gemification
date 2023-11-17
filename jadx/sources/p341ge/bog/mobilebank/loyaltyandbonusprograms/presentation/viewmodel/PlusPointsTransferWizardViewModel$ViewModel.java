package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ot0.C37778r0;
import ot0.C37780s0;
import ot0.C37782t0;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.plustransfer.ClientInitialsUIModel;
import ue1.C43075l;
import xs0.C39881t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel */
public final class PlusPointsTransferWizardViewModel$ViewModel extends C21481a implements C37778r0, C37780s0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39881t f81201d;

    /* renamed from: e */
    private final C37778r0 f81202e = this;

    /* renamed from: f */
    private final C37780s0 f81203f = this;

    /* renamed from: g */
    private final C1644x f81204g = new C1644x();

    /* renamed from: h */
    private final C1644x f81205h;

    /* renamed from: i */
    private final C40765a f81206i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ClientInitialsUIModel f81207j;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel$a */
    static final class C33146a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardViewModel$ViewModel f81208d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel$a$a */
        static final class C33147a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PlusPointsTransferWizardViewModel$ViewModel f81209d;

            /* renamed from: e */
            final /* synthetic */ String f81210e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33147a(PlusPointsTransferWizardViewModel$ViewModel plusPointsTransferWizardViewModel$ViewModel, String str) {
                super(1);
                this.f81209d = plusPointsTransferWizardViewModel$ViewModel;
                this.f81210e = str;
            }

            /* renamed from: a */
            public final void mo75290a(String str) {
                PlusPointsTransferWizardViewModel$ViewModel plusPointsTransferWizardViewModel$ViewModel = this.f81209d;
                String str2 = this.f81210e;
                C41536l.m120488h(str2, "pin");
                C41536l.m120488h(str, "it");
                plusPointsTransferWizardViewModel$ViewModel.f81207j = new ClientInitialsUIModel(str2, str);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo75290a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33146a(PlusPointsTransferWizardViewModel$ViewModel plusPointsTransferWizardViewModel$ViewModel) {
            super(1);
            this.f81208d = plusPointsTransferWizardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m97758c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "pin");
            C40749p E = this.f81208d.f81201d.mo93583a(str).mo95075O().mo94978E(new C33156f(new C33147a(this.f81208d, str)));
            C41536l.m120488h(E, "@HiltViewModel\n    class… = loaded\n        }\n    }");
            return C31270e.m92879h(E, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlusPointsTransferWizardViewModel$ViewModel(C39881t tVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(tVar, "getClientInitials");
        this.f81201d = tVar;
        C1644x xVar = new C1644x();
        this.f81205h = xVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f81206i = h1;
        C40749p L0 = h1.mo94989L0(new C37782t0(new C33146a(this)));
        C41536l.m120488h(L0, "clientInitialsSubject.sw…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m97748ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: F4 */
    public void mo75283F4(ClientInitialsUIModel clientInitialsUIModel) {
        this.f81207j = clientInitialsUIModel;
    }

    /* renamed from: Sg */
    public LiveData mo75284Sg() {
        return this.f81205h;
    }

    /* renamed from: Td */
    public void mo75285Td(String str) {
        String str2;
        C41536l.m120489i(str, "pin");
        ClientInitialsUIModel clientInitialsUIModel = this.f81207j;
        if (clientInitialsUIModel != null) {
            str2 = clientInitialsUIModel.mo75205b();
        } else {
            str2 = null;
        }
        if (C41536l.m120484d(str2, str)) {
            C1644x xVar = this.f81205h;
            ClientInitialsUIModel clientInitialsUIModel2 = this.f81207j;
            C41536l.m120486f(clientInitialsUIModel2);
            xVar.mo4823o(new C31128a.C31131c(clientInitialsUIModel2.mo75204a(), 0, 2, (DefaultConstructorMarker) null));
            this.f81204g.mo4823o(C32343x.m95466m(C41238w.f97225a));
            return;
        }
        this.f81206i.onNext(str);
    }

    /* renamed from: h6 */
    public LiveData mo75286h6() {
        return this.f81204g;
    }

    /* renamed from: hw */
    public final C37778r0 mo75287hw() {
        return this.f81202e;
    }

    /* renamed from: iw */
    public final C37780s0 mo75288iw() {
        return this.f81203f;
    }
}

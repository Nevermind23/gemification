package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17020c;
import p535nk.C17025g;
import p563pk.C17381k;
import p658wk.C18604c;
import p658wk.C18605d;
import p658wk.C18606e;
import p658wk.C18607f;
import p658wk.C18608g;
import p672xk.C18777a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsViewModel$ViewModel */
public final class PolicyDetailsViewModel$ViewModel extends C21481a implements C18605d, C18606e {

    /* renamed from: d */
    private final C18606e f40826d = this;

    /* renamed from: e */
    private final C18605d f40827e = this;

    /* renamed from: f */
    private final C1644x f40828f;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsViewModel$ViewModel$a */
    static final class C13671a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C18777a f40829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13671a(C18777a aVar) {
            super(2);
            this.f40829d = aVar;
        }

        /* renamed from: a */
        public final C18604c invoke(C17381k kVar, List list) {
            C41536l.m120489i(kVar, "policyDetails");
            C41536l.m120489i(list, "providers");
            return this.f40829d.mo46571a(kVar, list);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsViewModel$ViewModel$b */
    static final class C13672b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDetailsViewModel$ViewModel f40830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13672b(PolicyDetailsViewModel$ViewModel policyDetailsViewModel$ViewModel) {
            super(1);
            this.f40830d = policyDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37556a(C18604c cVar) {
            this.f40830d.mo37552fb().mo4826r(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37556a((C18604c) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolicyDetailsViewModel$ViewModel(C17020c cVar, C17025g gVar, C18777a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C18777a aVar2 = aVar;
        C41536l.m120489i(cVar, "getCurrentPolicyDetailsUseCase");
        C41536l.m120489i(gVar, "getLastLoadedProvidersUseCase");
        C41536l.m120489i(aVar2, "mapper");
        C18604c cVar2 = r5;
        C18604c cVar3 = new C18604c((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, C11051p3.f31758b, (DefaultConstructorMarker) null);
        this.f40828f = new C1644x(cVar2);
        C40749p Y0 = cVar.mo44216a().mo95014Y0(gVar.mo44220a(), new C18607f(new C13671a(aVar2)));
        C41536l.m120488h(Y0, "getCurrentPolicyDetailsU…viders)\n                }");
        C41205b F0 = C32343x.m95413R0(Y0).mo94981F0(new C18608g(new C13672b(this)));
        C41536l.m120488h(F0, "getCurrentPolicyDetailsU…ue = it\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C18604c m51152fw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C18604c) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m51153gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final C18606e mo37553hw() {
        return this.f40826d;
    }

    /* renamed from: iw */
    public C1644x mo37552fb() {
        return this.f40828f;
    }
}

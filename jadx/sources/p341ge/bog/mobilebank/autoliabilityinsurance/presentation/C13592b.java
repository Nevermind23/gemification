package p341ge.bog.mobilebank.autoliabilityinsurance.presentation;

import androidx.lifecycle.C1644x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17044v;
import p535nk.C17047y;
import p577qk.C17521d;
import p577qk.C17522e;
import p577qk.C17523f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.b */
public final class C13592b extends C21481a implements C17521d, C17522e {

    /* renamed from: d */
    private final PolicyDetailsModel f40673d;

    /* renamed from: e */
    private final C17521d f40674e = this;

    /* renamed from: f */
    private final C17522e f40675f = this;

    /* renamed from: g */
    private final C1644x f40676g = new C1644x();

    /* renamed from: h */
    private final C1644x f40677h = new C1644x();

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.b$a */
    static final class C13593a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13592b f40678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13593a(C13592b bVar) {
            super(1);
            this.f40678d = bVar;
        }

        /* renamed from: a */
        public final void mo37459a(C41238w wVar) {
            this.f40678d.mo37457ew().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37459a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.b$b */
    public interface C13594b {
        /* renamed from: a */
        C13592b mo32550a(PolicyDetailsModel policyDetailsModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13592b(PolicyDetailsModel policyDetailsModel, C17044v vVar, C17047y yVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(vVar, "onPolicySelected");
        C41536l.m120489i(yVar, "updatePolicies");
        this.f40673d = policyDetailsModel;
        if (policyDetailsModel != null) {
            vVar.mo44235a(policyDetailsModel);
            mo37458fw().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }
        C41205b F0 = yVar.mo44238a().mo94981F0(new C17523f(new C13593a(this)));
        C41536l.m120488h(F0, "updatePolicies.observabl…          )\n            }");
        addDisposable(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ew */
    public C1644x mo37457ew() {
        return this.f40677h;
    }

    /* renamed from: fw */
    public C1644x mo37458fw() {
        return this.f40676g;
    }
}

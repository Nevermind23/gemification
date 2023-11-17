package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.C24525c;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel;
import tl0.C28463c;
import ue1.C43075l;
import ul0.C28877d;
import wl0.C29475e;
import xl0.C29818b;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.d */
public final class C24529d extends C21481a {

    /* renamed from: d */
    private final PolicyDetailsUiModel f63245d;

    /* renamed from: e */
    private final C28463c f63246e;

    /* renamed from: f */
    private final C1644x f63247f;

    /* renamed from: g */
    private final C1644x f63248g = new C1644x();

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.d$a */
    public interface C24530a {
        /* renamed from: a */
        C24529d mo32843a(PolicyDetailsUiModel policyDetailsUiModel);
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.d$b */
    static final class C24531b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24529d f63249d;

        /* renamed from: e */
        final /* synthetic */ String f63250e;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.d$b$a */
        static final class C24532a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24529d f63251d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24532a(C24529d dVar) {
                super(1);
                this.f63251d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C37224b.m109965d(this.f63251d.mo62658iw(), C24525c.C24526a.f63240a);
            }
        }

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.d$b$b */
        static final class C24533b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24529d f63252d;

            /* renamed from: e */
            final /* synthetic */ String f63253e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24533b(C24529d dVar, String str) {
                super(1);
                this.f63252d = dVar;
                this.f63253e = str;
            }

            /* renamed from: a */
            public final void mo62661a(C28877d dVar) {
                C41536l.m120489i(dVar, "policyUrl");
                C37224b.m109965d(this.f63252d.mo62658iw(), new C24525c.C24527b(dVar.mo68616a(), this.f63253e));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62661a((C28877d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24531b(C24529d dVar, String str) {
            super(1);
            this.f63249d = dVar;
            this.f63250e = str;
        }

        /* renamed from: a */
        public final void mo62659a(C31128a aVar) {
            C41536l.m120488h(aVar, "policyResult");
            C31132b.m92643e(aVar, (int[]) null, new C24532a(this.f63249d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C24533b(this.f63249d, this.f63250e), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62659a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24529d(PolicyDetailsUiModel policyDetailsUiModel, C28463c cVar, C29818b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(policyDetailsUiModel, "policyDetails");
        C41536l.m120489i(cVar, "policyUrlUseCase");
        C41536l.m120489i(bVar, "mapper");
        this.f63245d = policyDetailsUiModel;
        this.f63246e = cVar;
        this.f63247f = new C1644x(bVar.mo70074a(policyDetailsUiModel));
    }

    /* renamed from: ew */
    private final void m78800ew(long j, String str) {
        C41205b F0 = C31270e.m92880i(C32343x.m95465l1(this.f63246e.mo68089a((int) j)), -1).mo94981F0(new C29475e(new C24531b(this, str)));
        C41536l.m120488h(F0, "private fun downloadPdf(…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final void m78801fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: gw */
    public void mo62656gw(String str, String str2, long j, Long l) {
        C41238w wVar;
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(str2, "policyNo");
        if (l != null) {
            l.longValue();
            C37224b.m109965d(mo62658iw(), new C24525c.C24528c(str, str2));
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            m78800ew(j, str2);
        }
    }

    /* renamed from: hw */
    public C1644x mo62657hw() {
        return this.f63247f;
    }

    /* renamed from: iw */
    public C1644x mo62658iw() {
        return this.f63248g;
    }
}

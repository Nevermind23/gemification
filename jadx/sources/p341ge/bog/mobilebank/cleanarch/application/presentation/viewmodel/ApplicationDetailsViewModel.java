package p341ge.bog.mobilebank.cleanarch.application.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p705aq.C19264a;
import p705aq.C19265b;
import p705aq.C19266c;
import p935wu.C29574a;
import p946xu.C29859a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel */
public final class ApplicationDetailsViewModel extends C21481a {

    /* renamed from: d */
    private final C29574a f56066d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f56067e = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel$a */
    static final class C20810a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsViewModel f56068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20810a(ApplicationDetailsViewModel applicationDetailsViewModel) {
            super(1);
            this.f56068d = applicationDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49476a(C41205b bVar) {
            C21484c.m69417i(this.f56068d.f56067e, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49476a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel$b */
    static final class C20811b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsViewModel f56069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20811b(ApplicationDetailsViewModel applicationDetailsViewModel) {
            super(1);
            this.f56069d = applicationDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49477a(C29859a aVar) {
            C1644x gw = this.f56069d.f56067e;
            C41536l.m120488h(aVar, "application");
            C21484c.m69418j(gw, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49477a((C29859a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel$c */
    static final class C20812c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsViewModel f56070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20812c(ApplicationDetailsViewModel applicationDetailsViewModel) {
            super(1);
            this.f56070d = applicationDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56070d.f56067e, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplicationDetailsViewModel(C29574a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getCreditApplicationDetailsUseCase");
        this.f56066d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m67343iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m67344jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m67345kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final void mo49474hw(long j) {
        C41205b I = this.f56066d.mo69419a(j).mo95063B(C40992a.m118827a()).mo95083l(new C19264a(new C20810a(this))).mo95070I(new C19265b(new C20811b(this)), new C19266c(new C20812c(this)));
        C41536l.m120488h(I, "fun getCreditApplication…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: lw */
    public final LiveData mo49475lw() {
        return this.f56067e;
    }
}

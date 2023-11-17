package p341ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed0.C20217b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.Client;
import p855oy.C27094a;
import p916ux.C28950a;
import p949xx.C29862a;
import p949xx.C29863b;
import p949xx.C29864c;
import p949xx.C29865d;
import p949xx.C29866e;
import p949xx.C29867f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel */
public final class InstallmentReversalViewModel extends C21481a {

    /* renamed from: l */
    public static final C21105a f56643l = new C21105a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C20217b f56644d;

    /* renamed from: e */
    private final C28950a f56645e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C27094a f56646f;

    /* renamed from: g */
    private final Client f56647g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f56648h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f56649i = new C1644x();

    /* renamed from: j */
    private String f56650j;

    /* renamed from: k */
    private Long f56651k;

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$a */
    public static final class C21105a {
        private C21105a() {
        }

        public /* synthetic */ C21105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$b */
    static final class C21106b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstallmentReversalViewModel f56652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21106b(InstallmentReversalViewModel installmentReversalViewModel) {
            super(1);
            this.f56652d = installmentReversalViewModel;
        }

        /* renamed from: a */
        public final void mo52334a(C41205b bVar) {
            C21484c.m69417i(this.f56652d.f56648h, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52334a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$c */
    static final class C21107c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstallmentReversalViewModel f56653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21107c(InstallmentReversalViewModel installmentReversalViewModel) {
            super(1);
            this.f56653d = installmentReversalViewModel;
        }

        /* renamed from: a */
        public final void mo52335a(List list) {
            C1644x kw = this.f56653d.f56648h;
            C27094a jw = this.f56653d.f56646f;
            C41536l.m120488h(list, "it");
            C21484c.m69418j(kw, jw.mo66388b(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52335a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$d */
    static final class C21108d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstallmentReversalViewModel f56654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21108d(InstallmentReversalViewModel installmentReversalViewModel) {
            super(1);
            this.f56654d = installmentReversalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56654d.f56648h, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$e */
    static final class C21109e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstallmentReversalViewModel f56655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21109e(InstallmentReversalViewModel installmentReversalViewModel) {
            super(1);
            this.f56655d = installmentReversalViewModel;
        }

        /* renamed from: a */
        public final void mo52337a(C41205b bVar) {
            C21484c.m69417i(this.f56655d.f56649i, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52337a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel$f */
    static final class C21110f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InstallmentReversalViewModel f56656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21110f(InstallmentReversalViewModel installmentReversalViewModel) {
            super(1);
            this.f56656d = installmentReversalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56656d.f56649i, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstallmentReversalViewModel(C20217b bVar, C28950a aVar, C27094a aVar2, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(aVar, "reverseInstallmentUseCase");
        C41536l.m120489i(aVar2, "lookupMapper");
        C41536l.m120489i(client, "client");
        this.f56644d = bVar;
        this.f56645e = aVar;
        this.f56646f = aVar2;
        this.f56647g = client;
        mo52328mw();
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m68286nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m68287ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m68288pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m68289vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m68290ww(InstallmentReversalViewModel installmentReversalViewModel) {
        C41536l.m120489i(installmentReversalViewModel, "this$0");
        installmentReversalViewModel.f56647g.requestLoans(true);
        C21484c.m69418j(installmentReversalViewModel.f56649i, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m68291xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: mw */
    public final void mo52328mw() {
        C41205b I = this.f56644d.mo48650b("INSTALLMENT_REVERSAL_REASONS").mo95063B(C40992a.m118827a()).mo95083l(new C29862a(new C21106b(this))).mo95070I(new C29863b(new C21107c(this)), new C29864c(new C21108d(this)));
        C41536l.m120488h(I, "fun getReversalReasons()… .bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: qw */
    public final LiveData mo52329qw() {
        return this.f56648h;
    }

    /* renamed from: rw */
    public final LiveData mo52330rw() {
        return this.f56649i;
    }

    /* renamed from: sw */
    public final void mo52331sw(String str, long j) {
        C41536l.m120489i(str, "productType");
        this.f56650j = str;
        this.f56651k = Long.valueOf(j);
    }

    /* renamed from: tw */
    public final void mo52332tw() {
        mo52328mw();
    }

    /* renamed from: uw */
    public final void mo52333uw(String str) {
        C41536l.m120489i(str, "reverseReason");
        String str2 = this.f56650j;
        if (str2 != null && this.f56651k != null) {
            C28950a aVar = this.f56645e;
            C41536l.m120486f(str2);
            Long l = this.f56651k;
            C41536l.m120486f(l);
            C41205b G = aVar.mo68803a(str2, l.longValue(), str).mo94906z(C40992a.m118827a()).mo94904r(new C29865d(new C21109e(this))).mo94888G(new C29866e(this), new C29867f(new C21110f(this)));
            C41536l.m120488h(G, "fun reverseInstallment(r…).bindToLifecycle()\n    }");
            bindToLifecycle(G);
        }
    }
}

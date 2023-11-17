package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C25969o;
import lf0.C25970p;
import lf0.C25971q;
import lf0.C25972r;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import ug0.C28786c;
import we0.C29367y;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel */
public final class GTTransferAccountsViewModel$ViewModel extends C21481a implements C25969o, C25970p {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29367y f61244d;

    /* renamed from: e */
    private final C25970p f61245e = this;

    /* renamed from: f */
    private final C25969o f61246f = this;

    /* renamed from: g */
    private final C1644x f61247g = new C1644x();

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel$a */
    static final class C23412a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTTransferAccountsViewModel$ViewModel f61248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23412a(GTTransferAccountsViewModel$ViewModel gTTransferAccountsViewModel$ViewModel) {
            super(1);
            this.f61248d = gTTransferAccountsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p O = this.f61248d.f61244d.mo69215a().mo95075O();
            C41536l.m120488h(O, "transferAccountsUseCase(…          .toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel$b */
    static final class C23413b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTTransferAccountsViewModel$ViewModel f61249d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel$b$a */
        static final class C23414a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTTransferAccountsViewModel$ViewModel f61250d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23414a(GTTransferAccountsViewModel$ViewModel gTTransferAccountsViewModel$ViewModel) {
                super(1);
                this.f61250d = gTTransferAccountsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60233a(TransferAccounts transferAccounts) {
                C1644x iw = this.f61250d.mo60228J();
                C41536l.m120488h(transferAccounts, "it");
                iw.mo4823o(new C31128a.C31131c(C28786c.m88248d(transferAccounts, "USD"), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60233a((TransferAccounts) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel$b$b */
        static final class C23415b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTTransferAccountsViewModel$ViewModel f61251d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23415b(GTTransferAccountsViewModel$ViewModel gTTransferAccountsViewModel$ViewModel) {
                super(1);
                this.f61251d = gTTransferAccountsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60234a(TransferAccounts transferAccounts) {
                this.f61251d.mo60228J().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60234a((TransferAccounts) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel$b$c */
        static final class C23416c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTTransferAccountsViewModel$ViewModel f61252d;

            /* renamed from: e */
            final /* synthetic */ C31128a f61253e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23416c(GTTransferAccountsViewModel$ViewModel gTTransferAccountsViewModel$ViewModel, C31128a aVar) {
                super(1);
                this.f61252d = gTTransferAccountsViewModel$ViewModel;
                this.f61253e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61252d.mo60228J().mo4823o(new C31128a.C31129a(th, this.f61253e.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23413b(GTTransferAccountsViewModel$ViewModel gTTransferAccountsViewModel$ViewModel) {
            super(1);
            this.f61249d = gTTransferAccountsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60232a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23414a(this.f61249d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23415b(this.f61249d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23416c(this.f61249d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60232a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTTransferAccountsViewModel$ViewModel(C29367y yVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(yVar, "transferAccountsUseCase");
        this.f61244d = yVar;
        C41205b F0 = onRefresh().mo94989L0(new C25971q(new C23412a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C25972r(new C23413b(this)));
        C41536l.m120488h(F0, "onRefresh().switchMap { …     }\n\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m75811fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m75812gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: iw */
    public C1644x mo60228J() {
        return this.f61247g;
    }

    /* renamed from: jw */
    public final C25970p mo60230jw() {
        return this.f61245e;
    }
}

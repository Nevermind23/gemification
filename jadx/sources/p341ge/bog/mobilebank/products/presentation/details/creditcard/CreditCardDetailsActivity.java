package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import a41.C30483b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.core.graphics.C0829d;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.appbar.AppBarLayout;
import g91.C32303f;
import g91.C32312j;
import g91.C32330r0;
import g91.C32343x;
import g91.C32359z0;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36605j;
import java.util.Iterator;
import java.util.List;
import jz0.C36852d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz0.C37025c;
import m41.C37224b;
import mz0.C37304a;
import mz0.C37306b;
import mz0.C37308c;
import mz0.C37310d;
import mz0.C37312e;
import mz0.C37314f;
import mz0.C37316g;
import mz0.C37333r;
import mz0.C37334s;
import o31.C37588a0;
import org.parceler.C42035e;
import oz0.C37846d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.activity.OperationsActivity;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.shared.products.presentation.LinearLayoutManagerAccurateOffset;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p380ck.C10457a;
import p380ck.C10463g;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p725cr.C19788a;
import p745er.C20288a;
import p920vq.C29133c;
import q31.C38122f;
import q31.C38125h;
import sz0.C38607a;
import sz0.C38609c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xy0.C39938b0;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity */
public final class CreditCardDetailsActivity extends C34005k implements C41185v.C41186a {

    /* renamed from: O */
    public static final C33890a f82501O = new C33890a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C33969f.C33979g f82502G;

    /* renamed from: H */
    public PreferencesApiManager f82503H;

    /* renamed from: I */
    public Client f82504I;

    /* renamed from: J */
    private final C41217g f82505J = C41219i.m119470b(new C33892b(this));

    /* renamed from: K */
    private final C41217g f82506K = new C1617p0(C41520a0.m120436b(C33969f.class), new C33901c0(this), new C33905e0(this), new C33903d0((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: L */
    public NewProductHeaderView.C13482a f82507L = NewProductHeaderView.C13482a.WHITE;

    /* renamed from: M */
    private final C41217g f82508M = C41219i.m119470b(new C33894c(this));

    /* renamed from: N */
    private long f82509N = -1;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$a */
    public static final class C33890a {
        private C33890a() {
        }

        public /* synthetic */ C33890a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82091a(Context context, long j) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, CreditCardDetailsActivity.class).putExtra("PRODUCT_ARG", j));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$a0 */
    static final class C33891a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33891a0(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(0);
            this.f82510d = creditCardDetailsActivity;
        }

        public final void invoke() {
            CommissionSummariesActivity.f57295I.mo53515a(this.f82510d);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$b */
    static final class C33892b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33892b(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(0);
            this.f82511d = creditCardDetailsActivity;
        }

        /* renamed from: b */
        public final C36605j invoke() {
            return C36605j.m108550d(this.f82511d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$b0 */
    static final class C33893b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82512d;

        /* renamed from: e */
        final /* synthetic */ C38609c.C38614e f82513e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33893b0(CreditCardDetailsActivity creditCardDetailsActivity, C38609c.C38614e eVar) {
            super(0);
            this.f82512d = creditCardDetailsActivity;
            this.f82513e = eVar;
        }

        public final void invoke() {
            this.f82512d.m99705p3(this.f82513e.mo92253a());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c */
    static final class C33894c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82514d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$a */
        /* synthetic */ class C33895a extends C41535k implements C43064a {
            C33895a(Object obj) {
                super(0, obj, C37334s.class, "requestGooglePayActionSheet", "requestGooglePayActionSheet()V", 0);
            }

            /* renamed from: b */
            public final void mo82094b() {
                ((C37334s) this.receiver).mo82214cn();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82094b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$b */
        /* synthetic */ class C33896b extends C41535k implements C43064a {
            C33896b(Object obj) {
                super(0, obj, C37334s.class, "hideGooglePayBanner", "hideGooglePayBanner()V", 0);
            }

            /* renamed from: b */
            public final void mo82095b() {
                ((C37334s) this.receiver).mo82228nq();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82095b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$c */
        /* synthetic */ class C33897c extends C41535k implements C43075l {
            C33897c(Object obj) {
                super(1, obj, C37334s.class, "onCloseAccountClicked", "onCloseAccountClicked(J)V", 0);
            }

            /* renamed from: b */
            public final void mo82096b(long j) {
                ((C37334s) this.receiver).mo82202Fp(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82096b(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$d */
        static final class C33898d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82515d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33898d(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82515d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82097a(NewProductHeaderView.C13482a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f82515d.f82507L = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82097a((NewProductHeaderView.C13482a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$e */
        static final class C33899e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82516d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33899e(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82516d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82098a(long j) {
                this.f82516d.m99696f3().mo82216dx().mo82211a1(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82098a(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c$f */
        static final class C33900f extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82517d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33900f(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(2);
                this.f82517d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82099a(long j, boolean z) {
                if (!z) {
                    this.f82517d.m99696f3().mo82216dx().mo82224l1(j);
                } else {
                    this.f82517d.m99696f3().mo82216dx().mo82229p1(j);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82099a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33894c(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(0);
            this.f82514d = creditCardDetailsActivity;
        }

        /* renamed from: b */
        public final C33935c invoke() {
            C33935c cVar = new C33935c(this.f82514d.m99696f3().mo82216dx(), this.f82514d.mo82088c3().getUserInfo().getClient().isSoloClient(), new C33895a(this.f82514d.m99696f3().mo82216dx()), new C33896b(this.f82514d.m99696f3().mo82216dx()), new C33897c(this.f82514d.m99696f3().mo82216dx()), new C33898d(this.f82514d));
            CreditCardDetailsActivity creditCardDetailsActivity = this.f82514d;
            cVar.mo82132u(new C33899e(creditCardDetailsActivity));
            cVar.mo82133v(new C33900f(creditCardDetailsActivity));
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$c0 */
    public static final class C33901c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33901c0(ComponentActivity componentActivity) {
            super(0);
            this.f82518d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82518d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$d */
    static final class C33902d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33902d(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82519d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82100a(C41224m mVar) {
            C41536l.m120489i(mVar, "params");
            C29133c.f74150P.mo68988a((String) mVar.mo95680f(), ((Number) mVar.mo95678e()).longValue()).mo4576A1(this.f82519d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82100a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$d0 */
    public static final class C33903d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82520d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82521e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33903d0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82520d = aVar;
            this.f82521e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82520d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82521e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$e */
    static final class C33904e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33904e(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82522d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82101a(CardInsSecCardModel cardInsSecCardModel) {
            C41536l.m120489i(cardInsSecCardModel, "it");
            this.f82522d.m99671F3(cardInsSecCardModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82101a((CardInsSecCardModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$e0 */
    static final class C33905e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82523d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$e0$a */
        static final class C33906a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82524d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33906a(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(0);
                this.f82524d = creditCardDetailsActivity;
            }

            /* renamed from: b */
            public final C33969f invoke() {
                return this.f82524d.mo82090g3().mo32545a(this.f82524d.getIntent().getLongExtra("PRODUCT_ARG", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33905e0(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(0);
            this.f82523d = creditCardDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33906a(this.f82523d));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$f */
    static final class C33907f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33907f(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82525d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82103a(C33950d.C33955e eVar) {
            C41536l.m120489i(eVar, "insuranceOffer");
            C37025c.f89170J.mo89950a(eVar.mo82152a()).mo4576A1(this.f82525d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82103a((C33950d.C33955e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$g */
    static final class C33908g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33908g(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82526d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82104a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C32303f.m95195f((String) mVar.mo95675a(), this.f82526d, (String) mVar.mo95676b(), "application/pdf");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82104a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$h */
    static final class C33909h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33909h(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82527d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82105a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f82527d.m99666C3(((Number) mVar.mo95678e()).longValue(), ((Number) mVar.mo95680f()).doubleValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82105a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$i */
    static final class C33910i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33910i(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82528d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82106a(long j) {
            this.f82528d.m99704o3(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82106a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$j */
    static final class C33911j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33911j(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82529d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82107a(AccountOperation accountOperation) {
            C41536l.m120489i(accountOperation, "accountOperation");
            this.f82529d.m99703n3(accountOperation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82107a((AccountOperation) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$k */
    static final class C33912k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33912k(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82530d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82108a(C38607a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f82530d.m99702m3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82108a((C38607a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$l */
    static final class C33913l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33913l(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82531d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82109a(long j) {
            if (this.f82531d.mo82089e3().getGooglePayState() == GooglePayState.WALLET_NEEDS_CREATION) {
                C38125h.m112238c(this.f82531d).mo91619n0(this.f82531d);
            } else {
                C38125h.m112238c(this.f82531d).mo91580V(Long.valueOf(j)).mo4576A1(this.f82531d.getSupportFragmentManager(), "FRAGMENT_TAG_GOOGLE_PAY");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82109a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$m */
    static final class C33914m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33914m(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82532d = creditCardDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            FrameLayout frameLayout = this.f82532d.m99693a3().f88281g;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C41536l.m120488h(bool, "isLoading");
            C32343x.m95483r1(frameLayout, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$n */
    static final class C33915n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33915n(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82533d = creditCardDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m99744c(CreditCardDetailsActivity creditCardDetailsActivity) {
            C41536l.m120489i(creditCardDetailsActivity, "this$0");
            creditCardDetailsActivity.m99693a3().f88280f.mo5257E0();
        }

        /* renamed from: b */
        public final void mo82111b(List list) {
            C33950d.C33967q qVar;
            Object obj;
            C41536l.m120488h(list, "list");
            Iterator it = list.iterator();
            while (true) {
                qVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C33950d) obj) instanceof C33950d.C33967q) {
                    break;
                }
            }
            if (obj instanceof C33950d.C33967q) {
                qVar = (C33950d.C33967q) obj;
            }
            if (qVar != null) {
                this.f82533d.m99695d3().mo6030j(list, new C33933a(this.f82533d));
                this.f82533d.f82507L = ((C30483b) qVar.mo82176a().get(qVar.mo82177b())).mo70822c();
                this.f82533d.m99673G3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82111b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$o */
    static final class C33916o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82534d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$o$a */
        static final class C33917a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82535d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33917a(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82535d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82113a(C38609c cVar) {
                C41536l.m120489i(cVar, "it");
                this.f82535d.m99698i3(cVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82113a((C38609c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$o$b */
        static final class C33918b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82536d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33918b(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82536d = creditCardDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f82536d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33916o(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82534d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82112a(C31128a aVar) {
            FrameLayout frameLayout = this.f82534d.m99693a3().f88281g;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95483r1(frameLayout, aVar instanceof C31128a.C31130b, false, 2, (Object) null);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33917a(this.f82534d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33918b(this.f82534d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82112a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$p */
    static final class C33919p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33919p(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82537d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82115a(String str) {
            C38125h.m112238c(this.f82537d).mo91605g0(this.f82537d, new P2PFlowType.P2PTopUp(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82115a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$q */
    static final class C33920q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33920q(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82538d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82116a(BillInfo billInfo) {
            C41536l.m120489i(billInfo, "billInfo");
            C37846d.f90903N.mo91201a(billInfo).mo4576A1(this.f82538d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82116a((BillInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$r */
    static final class C33921r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33921r(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82539d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82117a(String str) {
            C41536l.m120489i(str, "iban");
            CreditCardDetailsActivity creditCardDetailsActivity = this.f82539d;
            C32359z0.m95583n0(creditCardDetailsActivity, str, creditCardDetailsActivity.getString(C36274h.f87578r));
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_share");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82117a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$s */
    static final class C33922s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82540d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33922s(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82540d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82118a(long j) {
            C38122f c = C38125h.m112238c(this.f82540d);
            FragmentManager supportFragmentManager = this.f82540d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            C38122f.C38123a.m112213i(c, supportFragmentManager, (String) null, j, false, (Long) null, (Long) null, false, true, false, (String) null, 890, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82118a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$t */
    static final class C33923t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33923t(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82541d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82119a(long j) {
            this.f82541d.m99692Z2(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82119a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$u */
    static final class C33924u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33924u(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82542d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82120a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C38122f.C38123a.m112211g(C38125h.m112238c(this.f82542d), this.f82542d, ((Number) mVar.mo95675a()).longValue(), (C0173b) null, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82120a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$v */
    static final class C33925v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33925v(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82543d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82121a(C39938b0 b0Var) {
            C41536l.m120489i(b0Var, "params");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, b0Var.mo93674b(), b0Var.mo93673a(), (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = this.f82543d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82121a((C39938b0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$w */
    static final class C33926w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82544d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$w$a */
        static final class C33927a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82545d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33927a(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82545d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82123a(DigitalCardInfo digitalCardInfo) {
                C41536l.m120489i(digitalCardInfo, "it");
                C41185v N2 = this.f82545d.m99694b3();
                if (N2 != null) {
                    N2.mo4577k1();
                }
                C38125h.m112238c(this.f82545d).mo91582W(digitalCardInfo).mo4576A1(this.f82545d.getSupportFragmentManager(), (String) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82123a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$w$b */
        static final class C33928b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82546d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33928b(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82546d = creditCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82124a(DigitalCardInfo digitalCardInfo) {
                C41185v N2 = this.f82546d.m99694b3();
                if (N2 != null) {
                    N2.mo95635L2(true);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82124a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$w$c */
        static final class C33929c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreditCardDetailsActivity f82547d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33929c(CreditCardDetailsActivity creditCardDetailsActivity) {
                super(1);
                this.f82547d = creditCardDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                C41185v N2 = this.f82547d.m99694b3();
                if (N2 != null) {
                    N2.mo95635L2(false);
                }
                if (th instanceof ApiError) {
                    ApiError apiError = (ApiError) th;
                    if (apiError.mo84685a().isScaError()) {
                        C41185v N22 = this.f82547d.m99694b3();
                        if (N22 != null) {
                            N22.mo95634K2(C32343x.m95388F(apiError.mo84685a().getKey(), new Object[0]));
                            return;
                        }
                        return;
                    }
                    C41185v N23 = this.f82547d.m99694b3();
                    if (N23 != null) {
                        N23.mo4577k1();
                    }
                    this.f82547d.mo74709H1(th);
                    return;
                }
                C41185v N24 = this.f82547d.m99694b3();
                if (N24 != null) {
                    N24.mo4577k1();
                }
                this.f82547d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33926w(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82544d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82122a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33927a(this.f82544d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C33928b(this.f82544d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33929c(this.f82544d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82122a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$x */
    static final class C33930x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditCardDetailsActivity f82548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33930x(CreditCardDetailsActivity creditCardDetailsActivity) {
            super(1);
            this.f82548d = creditCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82126a(C41224m mVar) {
            C41536l.m120489i(mVar, "params");
            C29133c.f74150P.mo68988a((String) mVar.mo95680f(), ((Number) mVar.mo95678e()).longValue()).mo4576A1(this.f82548d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82126a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$y */
    public static final class C33931y extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ CreditCardDetailsActivity f82549a;

        C33931y(CreditCardDetailsActivity creditCardDetailsActivity) {
            this.f82549a = creditCardDetailsActivity;
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            this.f82549a.m99673G3();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity$z */
    static final class C33932z implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82550a;

        C33932z(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82550a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82550a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82550a.invoke(obj);
        }
    }

    /* renamed from: A3 */
    private final void m99664A3(C38609c.C38613d dVar) {
        m99712w3(this, (C13310d.C13312b) null, dVar.mo92249a(), (String) null, (C43064a) null, 13, (Object) null);
    }

    /* renamed from: B3 */
    private final void m99665B3(C38609c.C38614e eVar) {
        m99712w3(this, (C13310d.C13312b) null, eVar.mo92254b(), C32343x.m95388F("text.account.cancellation.error.dialog.button.transfer.funds", new Object[0]), new C33893b0(this, eVar), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m99666C3(long j, double d) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(getString(C36274h.f87566e0));
        String string = getString(C36274h.f87568f0);
        String o = C32303f.m95204o(d);
        dVar.mo35639Q1(string + " " + o);
        dVar.mo35642U1(getString(C36274h.f87567f));
        dVar.mo35641T1(new C37304a(dVar));
        dVar.mo35646Z1(getString(C36274h.f87572i));
        dVar.mo35645Y1(new C37306b(dVar, j));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m99667D3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m99669E3(C13310d dVar, long j, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        TransferForm.startWith((Fragment) dVar, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(j).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public final void m99671F3(CardInsSecCardModel cardInsSecCardModel) {
        C38125h.m112238c(this).mo91624q(cardInsSecCardModel.mo55706d(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m99673G3() {
        boolean z;
        boolean z2;
        boolean canScrollVertically = m99693a3().f88280f.canScrollVertically(-1);
        boolean z3 = true;
        if (this.f82507L == NewProductHeaderView.C13482a.BLACK) {
            z = true;
        } else {
            z = false;
        }
        ToolbarView toolbarView = m99693a3().f88282h;
        if (canScrollVertically || (C32343x.m95476p0(this) ^ z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        toolbarView.mo37106h0(canScrollVertically, z2);
        if (canScrollVertically) {
            z3 = C32343x.m95476p0(this);
        } else if (z) {
            z3 = false;
        }
        C32343x.m95444e1(this, z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m99692Z2(long j) {
        String b = mo82089e3().getLanguage().mo90433b();
        if (C32303f.m95213x(this)) {
            String d = C32303f.m95193d(j, b);
            String string = getString(C36274h.f87564d0);
            C32303f.m95195f(d, this, string + ".pdf", "application/pdf");
            return;
        }
        this.f82509N = j;
        new C32330r0((Activity) this).mo72838y(10016);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final C36605j m99693a3() {
        return (C36605j) this.f82505J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final C41185v m99694b3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C20288a.m66330e(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final C33935c m99695d3() {
        return (C33935c) this.f82508M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final C33969f m99696f3() {
        return (C33969f) this.f82506K.getValue();
    }

    /* renamed from: h3 */
    private final void m99697h3() {
        C36546y.m108282F().mo27137H("Conversion_Google_Pay", C10457a.f29785f, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m99698i3(C38609c cVar) {
        if (cVar instanceof C38609c.C38615f) {
            m99707r3(((C38609c.C38615f) cVar).mo92258a());
        } else if (cVar instanceof C38609c.C38612c) {
            m99706q3();
        } else if (cVar instanceof C38609c.C38614e) {
            m99665B3((C38609c.C38614e) cVar);
        } else if (cVar instanceof C38609c.C38610a) {
            m99714y3((C38609c.C38610a) cVar);
        } else if (cVar instanceof C38609c.C38611b) {
            m99715z3((C38609c.C38611b) cVar);
        } else if (cVar instanceof C38609c.C38613d) {
            m99664A3((C38609c.C38613d) cVar);
        }
    }

    /* renamed from: j3 */
    private final void m99699j3() {
        getWindow().setStatusBarColor(0);
        C32343x.m95429Z0(this);
        ViewCompat.m3550F0(m99693a3().mo3946b(), new C37314f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final WindowInsetsCompat m99700k3(CreditCardDetailsActivity creditCardDetailsActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(creditCardDetailsActivity, "this$0");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(windowInsetsCompat, "windowInsets");
        C0829d f = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e());
        C41536l.m120488h(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = f.f3465a;
                layoutParams2.bottomMargin = f.f3468d;
                layoutParams2.rightMargin = f.f3467c;
            }
            view.setLayoutParams(layoutParams);
            AppBarLayout appBarLayout = creditCardDetailsActivity.m99693a3().f88279e;
            C41536l.m120488h(appBarLayout, "binding.appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: l3 */
    private final void m99701l3() {
        m99696f3().mo82223kx().mo82192j().mo4819k(this, new C33932z(new C33915n(this)));
        C37224b.m109963b(m99696f3().mo82223kx().mo82180B6(), this, new C33920q(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82183Pg(), this, new C33921r(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82187Y(), this, new C33922s(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82184Sq(), this, new C33923t(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82198x2(), this, new C33924u(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82186W2(), this, new C33925v(this));
        m99696f3().mo82223kx().mo82194n2().mo4819k(this, new C33932z(new C33926w(this)));
        C37224b.m109963b(m99696f3().mo82223kx().mo82181M1(), this, new C33930x(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82181M1(), this, new C33902d(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82195o(), this, new C33904e(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82188c0(), this, new C33907f(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82179A2(), this, new C33908g(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82191ir(), this, new C33909h(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82193l2(), this, new C33910i(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82189c1(), this, new C33911j(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82185W0(), this, new C33912k(this));
        C37224b.m109963b(m99696f3().mo82223kx().mo82196p2(), this, new C33913l(this));
        m99696f3().mo82223kx().mo82190e().mo4819k(this, new C33932z(new C33914m(this)));
        m99696f3().mo82223kx().mo82182O2().mo4819k(this, new C33932z(new C33916o(this)));
        C37224b.m109963b(m99696f3().mo82223kx().mo82197q0(), this, new C33919p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m99702m3(C38607a aVar) {
        C38125h.m112238c(this).mo91639x0(this, Long.valueOf(aVar.mo92229a()), Integer.valueOf(aVar.mo92230b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m99703n3(AccountOperation accountOperation) {
        Intent intent = new Intent(this, OperationDetailsActivity.class);
        intent.putExtra("PAYMENT_OPERATION_TYPE", 30);
        intent.putExtra("PAYMENT_DETAILS_OBJECT", C42035e.m122121c(accountOperation));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m99704o3(long j) {
        OperationsActivity.f59076G.mo55129a(this, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m99705p3(Long l) {
        TransferForm.C34932I transferForm = TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN);
        if (l != null) {
            transferForm.setSrcAcctKey(l.longValue());
        }
        transferForm.start();
    }

    /* renamed from: q3 */
    private final void m99706q3() {
        C36852d.C36854b bVar = C36852d.C36854b.f88945f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo89778a(F);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(872415232);
        intent.putExtra("ACCOUNT_DEACTIVATION_SUCCESS_TEXT", C32343x.m95388F("text.account.cancellation.success.popup.green", new Object[0]));
        startActivity(intent);
    }

    /* renamed from: r3 */
    private final void m99707r3(long j) {
        C35388f2.m105072l2(this, C32343x.m95388F("text.account.cancellation.ok.dialog.header", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.acc.no.cards.body", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.yes.button", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.back.button", new Object[0]), new C37308c(this, j), new C37310d(), false, false, (String) null, new C37312e(), 448, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m99708s3(CreditCardDetailsActivity creditCardDetailsActivity, long j, View view) {
        C41536l.m120489i(creditCardDetailsActivity, "this$0");
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.YES);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
        creditCardDetailsActivity.m99696f3().mo82216dx().mo82206Xt(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m99709t3(View view) {
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.NO);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m99710u3(View view) {
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.X);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
    }

    /* renamed from: v3 */
    private final void m99711v3(C13310d.C13312b bVar, String str, String str2, C43064a aVar) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(bVar);
        dVar.mo35648c2(C32343x.m95388F("text.account.cancellation.error.dialog.cant.close.header", new Object[0]));
        dVar.mo35639Q1(str);
        dVar.mo35644X1(str2);
        dVar.mo35643V1(new C37316g(str, dVar, aVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: w3 */
    static /* synthetic */ void m99712w3(CreditCardDetailsActivity creditCardDetailsActivity, C13310d.C13312b bVar, String str, String str2, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = C13310d.C13312b.TITLE_CLOSE_SINGLE_BUTTON;
        }
        if ((i & 4) != 0) {
            str2 = C32343x.m95388F("text.account.cancellation.error.dialog.button.cant.close.confirm", new Object[0]);
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        creditCardDetailsActivity.m99711v3(bVar, str, str2, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m99713x3(String str, C13310d dVar, C43064a aVar, Button button) {
        C41536l.m120489i(str, "$body");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        C36852d.C36858f fVar = new C36852d.C36858f(str);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        fVar.mo89778a(F);
        dVar.mo4577k1();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: y3 */
    private final void m99714y3(C38609c.C38610a aVar) {
        m99712w3(this, (C13310d.C13312b) null, aVar.mo92241a(), C32343x.m95388F("text.account.cancellation.error.dialog.button.pay.now", new Object[0]), new C33891a0(this), 1, (Object) null);
    }

    /* renamed from: z3 */
    private final void m99715z3(C38609c.C38611b bVar) {
        m99712w3(this, C13310d.C13312b.TITLE_SINGLE_BUTTON, bVar.mo92245a(), (String) null, (C43064a) null, 12, (Object) null);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_CARD_DETAILS_TAG")) {
            m99696f3().mo82216dx().mo82201D2(str, str2, str3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m99693a3().mo3946b());
        super.mo37451O1(bundle);
        m99699j3();
        RecyclerView recyclerView = m99693a3().f88280f;
        recyclerView.setAdapter(m99695d3());
        recyclerView.setLayoutManager(new LinearLayoutManagerAccurateOffset(this));
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        recyclerView.mo5351j(new C37333r());
        m99693a3().f88280f.mo5363n(new C33931y(this));
        m99701l3();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* renamed from: c3 */
    public final Client mo82088c3() {
        Client client = this.f82504I;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: e3 */
    public final PreferencesApiManager mo82089e3() {
        PreferencesApiManager preferencesApiManager = this.f82503H;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* renamed from: g3 */
    public final C33969f.C33979g mo82090g3() {
        C33969f.C33979g gVar = this.f82502G;
        if (gVar != null) {
            return gVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C19788a aVar;
        super.onActivityResult(i, i2, intent);
        if (i != 10036) {
            if (i == 10037 && i2 == -1) {
                mo82089e3().setGooglePayState(GooglePayState.ACTIVE);
                m99696f3().mo82216dx().mo82214cn();
            }
        } else if (i2 == -1) {
            Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_GOOGLE_PAY");
            if (k0 instanceof C19788a) {
                aVar = (C19788a) k0;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.mo4577k1();
            }
            C21481a.onRefresh$default(m99696f3(), 0, 1, (Object) null);
            C12910e.m48797o(this, C32343x.m95388F(C32312j.f79736f, new Object[0]), C12902d.C12905b.C12907b.f38104a, false, 4, (Object) null);
            m99697h3();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    long j = this.f82509N;
                    if (j != -1) {
                        m99692Z2(j);
                        this.f82509N = -1;
                    }
                }
            }
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return "";
    }
}

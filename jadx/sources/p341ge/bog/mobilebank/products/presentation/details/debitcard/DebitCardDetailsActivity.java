package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import a81.C30722p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.C0829d;
import androidx.core.p016os.C0908e;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.appbar.AppBarLayout;
import g91.C32288b;
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
import he1.C41233s;
import he1.C41238w;
import hy0.C36271e;
import hy0.C36273g;
import hy0.C36274h;
import hz0.C36282f;
import iu0.C36546y;
import iy0.C36614m;
import iz0.C36657c;
import java.util.Iterator;
import java.util.List;
import jz0.C36852d;
import jz0.C36859e;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz0.C37025c;
import m41.C37223a;
import m41.C37224b;
import nz0.C37511a;
import nz0.C37514b;
import nz0.C37517c;
import nz0.C37519d;
import nz0.C37521e;
import nz0.C37523f;
import nz0.C37525g;
import nz0.C37527h;
import o31.C37588a0;
import org.parceler.C42035e;
import p017b.C2106d;
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
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
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
import tz0.C38903a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xy0.C39938b0;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity */
public final class DebitCardDetailsActivity extends C34163l implements C41185v.C41186a {

    /* renamed from: P */
    public static final C34008a f82717P = new C34008a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C34119g.C34133g f82718G;

    /* renamed from: H */
    public Client f82719H;

    /* renamed from: I */
    public PreferencesApiManager f82720I;

    /* renamed from: J */
    private final C41217g f82721J = C41219i.m119470b(new C34010b(this));

    /* renamed from: K */
    private final C41217g f82722K = new C1617p0(C41520a0.m120436b(C34119g.class), new C34041j0(this), new C34045l0(this), new C34043k0((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C0173b f82723L;

    /* renamed from: M */
    private final C41217g f82724M;

    /* renamed from: N */
    private final C30722p f82725N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f82726O;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$a */
    public static final class C34008a {
        private C34008a() {
        }

        public /* synthetic */ C34008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m100114b(C34008a aVar, Context context, long j, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.mo82285a(context, j, z);
        }

        /* renamed from: a */
        public final void mo82285a(Context context, long j, boolean z) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, DebitCardDetailsActivity.class).putExtras(C0908e.m3336b(C41233s.m119492a("PRODUCT_ARG", Long.valueOf(j)), C41233s.m119492a("FROM_ACTIVATE_CHILD_MBANK_PUSH_ARG", Boolean.valueOf(z)))));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$a0 */
    static final class C34009a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34009a0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82727d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82286a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f82727d.m100068P3(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82286a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$b */
    static final class C34010b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34010b(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(0);
            this.f82728d = debitCardDetailsActivity;
        }

        /* renamed from: b */
        public final C36614m invoke() {
            return C36614m.m108589d(this.f82728d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$b0 */
    static final class C34011b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34011b0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82729d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82288a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f82729d.m100070Q3(((Number) mVar.mo95678e()).longValue(), (String) mVar.mo95680f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82288a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c */
    static final class C34012c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82730d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$a */
        static final class C34013a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82731d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34013a(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82731d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82290a(NewProductHeaderView.C13482a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f82731d.m100090l3().mo82480xx().mo82364J8(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82290a((NewProductHeaderView.C13482a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$b */
        static final class C34014b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82732d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34014b(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(0);
                this.f82732d = debitCardDetailsActivity;
            }

            public final void invoke() {
                this.f82732d.m100090l3().mo82480xx().mo82362Ei(this.f82732d.f82726O);
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$c */
        static final class C34015c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82733d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34015c(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82733d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82291a(String str) {
                C41536l.m120489i(str, "it");
                C36546y.m108282F().mo27152s("accounts_page", "", "share_account_number_click");
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82733d;
                C32359z0.m95583n0(debitCardDetailsActivity, str, debitCardDetailsActivity.getString(C36274h.f87578r));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82291a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$d */
        static final class C34016d extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82734d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34016d(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(0);
                this.f82734d = debitCardDetailsActivity;
            }

            public final void invoke() {
                this.f82734d.m100090l3().mo82480xx().mo82359Bc();
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$e */
        static final class C34017e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82735d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34017e(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82735d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82292a(String str) {
                C41536l.m120489i(str, "it");
                C36546y.m108282F().mo27152s("accounts_page", "", "account_number_click");
                C32359z0.m95596x(str);
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82735d;
                String string = debitCardDetailsActivity.getString(C36274h.text_number_copied);
                C41536l.m120488h(string, "getString(R.string.text_number_copied)");
                C12910e.m48787e(debitCardDetailsActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82292a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$f */
        static final class C34018f extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82736d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34018f(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82736d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82293a(long j) {
                this.f82736d.m100090l3().mo82480xx().mo82370a1(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82293a(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$g */
        static final class C34019g extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82737d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34019g(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(2);
                this.f82737d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82294a(long j, boolean z) {
                if (!z) {
                    this.f82737d.m100090l3().mo82480xx().mo82372l1(j);
                } else {
                    this.f82737d.m100090l3().mo82480xx().mo82376p1(j);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82294a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$h */
        static final class C34020h extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82738d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34020h(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82738d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82295a(int i) {
                RecyclerView.C1747p layoutManager = this.f82738d.m100087g3().f88325f.getLayoutManager();
                C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                if (((LinearLayoutManager) layoutManager).mo5223q2() == i) {
                    this.f82738d.m100087g3().f88325f.mo5263G1(i);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82295a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c$i */
        static final class C34021i extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82739d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34021i(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82739d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82296a(long j) {
                C36852d.C36853a aVar = C36852d.C36853a.f88944f;
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                aVar.mo89778a(F);
                this.f82739d.m100090l3().mo82459Fp(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82296a(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34012c(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(0);
            this.f82730d = debitCardDetailsActivity;
        }

        /* renamed from: b */
        public final C34067c invoke() {
            C34067c cVar = new C34067c(this.f82730d.m100090l3().mo82480xx(), this.f82730d.mo82281i3().getUserInfo().getClient().isSoloClient(), new C34013a(this.f82730d));
            DebitCardDetailsActivity debitCardDetailsActivity = this.f82730d;
            cVar.mo82349z(new C34014b(debitCardDetailsActivity));
            cVar.mo82337B(new C34015c(debitCardDetailsActivity));
            cVar.mo82348y(new C34016d(debitCardDetailsActivity));
            cVar.mo82336A(new C34017e(debitCardDetailsActivity));
            cVar.mo82345v(new C34018f(debitCardDetailsActivity));
            cVar.mo82346w(new C34019g(debitCardDetailsActivity));
            cVar.mo82338C(new C34020h(debitCardDetailsActivity));
            cVar.mo82347x(new C34021i(debitCardDetailsActivity));
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$c0 */
    static final class C34022c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34022c0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82740d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82297a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82740d;
                ((Number) mVar.mo95675a()).longValue();
                C38125h.m112238c(debitCardDetailsActivity).mo91632u(debitCardDetailsActivity, new OtherTransferTypeState(debitCardDetailsActivity.f82726O, true, ((Boolean) mVar.mo95676b()).booleanValue()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82297a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$d */
    static final class C34023d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34023d(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82741d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82298a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f82741d.m100086f3(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82298a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$d0 */
    static final class C34024d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34024d0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82742d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82299a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82742d;
                long longValue = l.longValue();
                C38122f c = C38125h.m112238c(debitCardDetailsActivity);
                FragmentManager supportFragmentManager = debitCardDetailsActivity.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                C38122f.C38123a.m112213i(c, supportFragmentManager, (String) null, longValue, false, (Long) null, (Long) null, false, false, false, (String) null, 1018, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82299a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$e */
    static final class C34025e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34025e(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82743d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82300a(C37223a aVar) {
            C38607a aVar2 = (C38607a) aVar.mo90296a();
            if (aVar2 != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82743d;
                int c = aVar2.mo92231c();
                if (c == 3) {
                    C38122f.C38123a.m112229y(C38125h.m112238c(debitCardDetailsActivity), debitCardDetailsActivity, Long.valueOf(aVar2.mo92229a()), (Integer) null, 4, (Object) null);
                } else if (c != 4) {
                    debitCardDetailsActivity.m100099v3(aVar2);
                } else {
                    C38125h.m112238c(debitCardDetailsActivity).mo91606h(debitCardDetailsActivity, aVar2.mo92229a());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82300a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$e0 */
    public static final class C34026e0 extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ DebitCardDetailsActivity f82744a;

        C34026e0(DebitCardDetailsActivity debitCardDetailsActivity) {
            this.f82744a = debitCardDetailsActivity;
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            this.f82744a.m100090l3().mo82480xx().mo82367Rm();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$f */
    static final class C34027f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82745d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$f$a */
        /* synthetic */ class C34028a extends C41535k implements C43079p {
            C34028a(Object obj) {
                super(2, obj, C38122f.class, "startPiggyBankDetailsActivity", "startPiggyBankDetailsActivity(Landroid/content/Context;J)V", 0);
            }

            /* renamed from: b */
            public final void mo82302b(Context context, long j) {
                C41536l.m120489i(context, "p0");
                ((C38122f) this.receiver).mo91563M0(context, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82302b((Context) obj, ((Number) obj2).longValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$f$b */
        /* synthetic */ class C34029b extends C41535k implements C43079p {
            C34029b(Object obj) {
                super(2, obj, C38122f.class, "startCasDetailsActivityForCasService", "startCasDetailsActivityForCasService(Landroid/content/Context;J)V", 0);
            }

            /* renamed from: b */
            public final void mo82303b(Context context, long j) {
                C41536l.m120489i(context, "p0");
                ((C38122f) this.receiver).mo91609i0(context, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82303b((Context) obj, ((Number) obj2).longValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34027f(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82745d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82301a(C37223a aVar) {
            C43079p pVar;
            C34093e.C34105l lVar = (C34093e.C34105l) aVar.mo90296a();
            if (lVar != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82745d;
                if (lVar.mo82395d()) {
                    pVar = new C34028a(C38125h.m112238c(debitCardDetailsActivity));
                } else {
                    pVar = new C34029b(C38125h.m112238c(debitCardDetailsActivity));
                }
                pVar.invoke(debitCardDetailsActivity, Long.valueOf(lVar.mo82394c()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82301a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$f0 */
    static final class C34030f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34030f0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82746d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82304a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f82746d.mo86424F1(MainActivity.class, C32288b.OpenProductsOnMainActivity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82304a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$g */
    static final class C34031g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34031g(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82747d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82305a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            long longValue = ((Number) mVar.mo95675a()).longValue();
            C38122f c = C38125h.m112238c(this.f82747d);
            DebitCardDetailsActivity debitCardDetailsActivity = this.f82747d;
            c.mo91625q0(debitCardDetailsActivity, longValue, debitCardDetailsActivity.f82723L);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82305a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$g0 */
    static final class C34032g0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82748a;

        C34032g0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82748a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82748a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82748a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$h */
    static final class C34033h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34033h(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82749d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82308a(C39938b0 b0Var) {
            C41536l.m120489i(b0Var, "params");
            C36546y.m108282F().mo27152s("accounts_page", "", "top_up_overdraft_click");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, b0Var.mo93674b(), b0Var.mo93673a(), (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = this.f82749d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82308a((C39938b0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$h0 */
    static final class C34034h0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34034h0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(0);
            this.f82750d = debitCardDetailsActivity;
        }

        public final void invoke() {
            CommissionSummariesActivity.f57295I.mo53515a(this.f82750d);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$i */
    static final class C34035i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82751d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$i$a */
        static final class C34036a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82752d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34036a(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82752d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82310a(DigitalCardInfo digitalCardInfo) {
                C41536l.m120489i(digitalCardInfo, "it");
                C41185v P2 = this.f82752d.m100088h3();
                if (P2 != null) {
                    P2.mo4577k1();
                }
                C38125h.m112238c(this.f82752d).mo91582W(digitalCardInfo).mo4576A1(this.f82752d.getSupportFragmentManager(), (String) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82310a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$i$b */
        static final class C34037b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82753d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34037b(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82753d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82311a(DigitalCardInfo digitalCardInfo) {
                C41185v P2 = this.f82753d.m100088h3();
                if (P2 != null) {
                    P2.mo95635L2(true);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82311a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$i$c */
        static final class C34038c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82754d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34038c(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82754d = debitCardDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                C41185v P2 = this.f82754d.m100088h3();
                if (P2 != null) {
                    P2.mo95635L2(false);
                }
                if (th instanceof ApiError) {
                    ApiError apiError = (ApiError) th;
                    if (apiError.mo84685a().isScaError()) {
                        C41185v P22 = this.f82754d.m100088h3();
                        if (P22 != null) {
                            P22.mo95634K2(C32343x.m95388F(apiError.mo84685a().getKey(), new Object[0]));
                            return;
                        }
                        return;
                    }
                    C41185v P23 = this.f82754d.m100088h3();
                    if (P23 != null) {
                        P23.mo4577k1();
                    }
                    this.f82754d.mo74709H1(th);
                    return;
                }
                C41185v P24 = this.f82754d.m100088h3();
                if (P24 != null) {
                    P24.mo4577k1();
                }
                this.f82754d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34035i(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82751d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82309a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34036a(this.f82751d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C34037b(this.f82751d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34038c(this.f82751d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82309a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$i0 */
    static final class C34039i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82755d;

        /* renamed from: e */
        final /* synthetic */ C38609c.C38614e f82756e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34039i0(DebitCardDetailsActivity debitCardDetailsActivity, C38609c.C38614e eVar) {
            super(0);
            this.f82755d = debitCardDetailsActivity;
            this.f82756e = eVar;
        }

        public final void invoke() {
            this.f82755d.m100101x3(this.f82756e.mo92253a());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$j */
    static final class C34040j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34040j(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82757d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82313a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                C29133c.f74150P.mo68988a((String) mVar.mo95680f(), ((Number) mVar.mo95678e()).longValue()).mo4576A1(this.f82757d.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82313a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$j0 */
    public static final class C34041j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34041j0(ComponentActivity componentActivity) {
            super(0);
            this.f82758d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82758d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$k */
    static final class C34042k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34042k(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82759d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82314a(C37223a aVar) {
            CardInsSecCardModel cardInsSecCardModel = (CardInsSecCardModel) aVar.mo90296a();
            if (cardInsSecCardModel != null) {
                this.f82759d.m100064N3(cardInsSecCardModel);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82314a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$k0 */
    public static final class C34043k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82760d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34043k0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82760d = aVar;
            this.f82761e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82760d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82761e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$l */
    static final class C34044l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34044l(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82762d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82315a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                CardView cardView = this.f82762d.m100087g3().f88326g;
                C41536l.m120488h(cardView, "binding.progressBar");
                C32343x.m95455i0(cardView);
            } else if (aVar instanceof C31128a.C31130b) {
                CardView cardView2 = this.f82762d.m100087g3().f88326g;
                C41536l.m120488h(cardView2, "binding.progressBar");
                C32343x.m95447f1(cardView2);
            } else if (aVar instanceof C31128a.C31129a) {
                CardView cardView3 = this.f82762d.m100087g3().f88326g;
                C41536l.m120488h(cardView3, "binding.progressBar");
                C32343x.m95455i0(cardView3);
                this.f82762d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82315a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$l0 */
    static final class C34045l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82763d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$l0$a */
        static final class C34046a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82764d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34046a(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(0);
                this.f82764d = debitCardDetailsActivity;
            }

            /* renamed from: b */
            public final C34119g invoke() {
                return this.f82764d.mo82283m3().mo32547a(this.f82764d.getIntent().getLongExtra("PRODUCT_ARG", -1), this.f82764d.getIntent().getBooleanExtra("FROM_ACTIVATE_CHILD_MBANK_PUSH_ARG", false));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34045l0(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(0);
            this.f82763d = debitCardDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C34046a(this.f82763d));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$m */
    static final class C34047m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34047m(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82765d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82317a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82765d;
                C36657c.f88477Q.mo89486a("CONTRACT_REQUEST_CODE", "CONTRACT_RESULT_CODE", l.longValue()).mo4576A1(debitCardDetailsActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82317a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$n */
    static final class C34048n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34048n(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82766d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82318a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f82766d.m100100w3(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82318a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$o */
    static final class C34049o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34049o(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82767d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82319a(C37223a aVar) {
            CheckChildMBankActiveModel checkChildMBankActiveModel = (CheckChildMBankActiveModel) aVar.mo90296a();
            if (checkChildMBankActiveModel != null) {
                C36282f.f87596P.mo89004a("ADD_NUMBER_REQUEST_CODE", "ADD_NUMBER_RESULT_CODE", checkChildMBankActiveModel).mo4576A1(this.f82767d.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82319a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$p */
    static final class C34050p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82768d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$p$a */
        /* synthetic */ class C34051a extends C41535k implements C43079p {
            C34051a(Object obj) {
                super(2, obj, C38122f.class, "startPiggyBankDetailsActivity", "startPiggyBankDetailsActivity(Landroid/content/Context;J)V", 0);
            }

            /* renamed from: b */
            public final void mo82321b(Context context, long j) {
                C41536l.m120489i(context, "p0");
                ((C38122f) this.receiver).mo91563M0(context, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82321b((Context) obj, ((Number) obj2).longValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$p$b */
        /* synthetic */ class C34052b extends C41535k implements C43079p {
            C34052b(Object obj) {
                super(2, obj, C38122f.class, "startCasDetailsActivityForCasService", "startCasDetailsActivityForCasService(Landroid/content/Context;J)V", 0);
            }

            /* renamed from: b */
            public final void mo82322b(Context context, long j) {
                C41536l.m120489i(context, "p0");
                ((C38122f) this.receiver).mo91609i0(context, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82322b((Context) obj, ((Number) obj2).longValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34050p(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82768d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82320a(C37223a aVar) {
            C43079p pVar;
            C34093e.C34105l lVar = (C34093e.C34105l) aVar.mo90296a();
            if (lVar != null) {
                DebitCardDetailsActivity debitCardDetailsActivity = this.f82768d;
                if (lVar.mo82395d()) {
                    pVar = new C34051a(C38125h.m112238c(debitCardDetailsActivity));
                } else {
                    pVar = new C34052b(C38125h.m112238c(debitCardDetailsActivity));
                }
                pVar.invoke(debitCardDetailsActivity, Long.valueOf(lVar.mo82394c()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82320a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$q */
    static final class C34053q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34053q(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82769d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82323a(String str) {
            C41536l.m120489i(str, "it");
            this.f82769d.m100066O3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82323a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$r */
    static final class C34054r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34054r(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82770d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82324a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C32303f.m95195f((String) mVar.mo95675a(), this.f82770d, (String) mVar.mo95676b(), "application/pdf");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82324a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$s */
    static final class C34055s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34055s(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82771d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82325a(long j) {
            if (this.f82771d.mo82282k3().getGooglePayState() == GooglePayState.WALLET_NEEDS_CREATION) {
                C38125h.m112238c(this.f82771d).mo91619n0(this.f82771d);
            } else {
                C38125h.m112238c(this.f82771d).mo91580V(Long.valueOf(j)).mo4576A1(this.f82771d.getSupportFragmentManager(), "FRAGMENT_TAG_GOOGLE_PAY");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82325a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$t */
    static final class C34056t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82772d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$t$a */
        static final class C34057a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82773d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34057a(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82773d = debitCardDetailsActivity;
            }

            /* renamed from: a */
            public final void mo82327a(C38609c cVar) {
                C41536l.m120489i(cVar, "it");
                this.f82773d.m100092o3(cVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82327a((C38609c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$t$b */
        static final class C34058b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DebitCardDetailsActivity f82774d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34058b(DebitCardDetailsActivity debitCardDetailsActivity) {
                super(1);
                this.f82774d = debitCardDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f82774d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34056t(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82772d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82326a(C31128a aVar) {
            CardView cardView = this.f82772d.m100087g3().f88326g;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95483r1(cardView, aVar instanceof C31128a.C31130b, false, 2, (Object) null);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34057a(this.f82772d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34058b(this.f82772d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82326a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$u */
    static final class C34059u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34059u(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82775d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82329a(String str) {
            C38125h.m112238c(this.f82775d).mo91605g0(this.f82775d, new P2PFlowType.P2PTopUp(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82329a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$v */
    static final class C34060v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34060v(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82776d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82330a(NewProductHeaderView.C13482a aVar) {
            DebitCardDetailsActivity debitCardDetailsActivity = this.f82776d;
            C41536l.m120488h(aVar, "it");
            debitCardDetailsActivity.m100072R3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82330a((NewProductHeaderView.C13482a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$w */
    static final class C34061w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34061w(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82777d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82331a(C37223a aVar) {
            AccountOperation accountOperation = (AccountOperation) aVar.mo90296a();
            if (accountOperation != null) {
                this.f82777d.m100098u3(accountOperation);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82331a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$x */
    static final class C34062x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34062x(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82778d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82332a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f82778d.m100097t3(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82332a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$y */
    static final class C34063y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34063y(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82779d = debitCardDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m100161c(DebitCardDetailsActivity debitCardDetailsActivity) {
            C41536l.m120489i(debitCardDetailsActivity, "this$0");
            debitCardDetailsActivity.m100087g3().f88325f.mo5257E0();
        }

        /* renamed from: b */
        public final void mo82333b(List list) {
            C34093e.C34115v vVar;
            Object obj;
            C41536l.m120488h(list, "list");
            Iterator it = list.iterator();
            while (true) {
                vVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C34093e) obj) instanceof C34093e.C34115v) {
                    break;
                }
            }
            if (obj instanceof C34093e.C34115v) {
                vVar = (C34093e.C34115v) obj;
            }
            if (vVar != null) {
                this.f82779d.m100089j3().mo6030j(list, new C34065a(this.f82779d));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82333b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity$z */
    static final class C34064z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DebitCardDetailsActivity f82780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34064z(DebitCardDetailsActivity debitCardDetailsActivity) {
            super(1);
            this.f82780d = debitCardDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82334a(C37223a aVar) {
            C34093e.C34097d dVar = (C34093e.C34097d) aVar.mo90296a();
            if (dVar != null) {
                C37025c.f89170J.mo89950a(dVar.mo82383a()).mo4576A1(this.f82780d.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82334a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    public DebitCardDetailsActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C37511a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…del.onRefresh()\n        }");
        this.f82723L = registerForActivityResult;
        this.f82724M = C41219i.m119470b(new C34012c(this));
        this.f82725N = C30722p.ACCOUNT_DETAILS;
        this.f82726O = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m100041A3(DebitCardDetailsActivity debitCardDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(debitCardDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "result");
        if (bundle.getBoolean("CONTRACT_RESULT_CODE")) {
            debitCardDetailsActivity.m100090l3().mo82480xx().mo82369Xi();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m100042B3(DebitCardDetailsActivity debitCardDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(debitCardDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "result");
        if (bundle.getBoolean("ADD_NUMBER_RESULT_CODE")) {
            debitCardDetailsActivity.m100090l3().mo82480xx().mo82374mb();
        }
    }

    /* renamed from: C3 */
    private final void m100043C3(long j) {
        C35388f2.m105072l2(this, C32343x.m95388F("text.account.cancellation.ok.dialog.header", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.acc.no.cards.body", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.yes.button", new Object[0]), C32343x.m95388F("text.account.cancellation.ok.dialog.back.button", new Object[0]), new C37514b(this, j), new C37517c(), false, false, (String) null, new C37519d(), 448, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m100044D3(DebitCardDetailsActivity debitCardDetailsActivity, long j, View view) {
        C41536l.m120489i(debitCardDetailsActivity, "this$0");
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.YES);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
        debitCardDetailsActivity.m100090l3().mo82470Xt(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m100046E3(View view) {
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.NO);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m100048F3(View view) {
        C36852d.C36856d dVar = new C36852d.C36856d(C36852d.C36857e.X);
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        dVar.mo89778a(F);
    }

    /* renamed from: G3 */
    private final void m100050G3(C13310d.C13312b bVar, String str, String str2, C43064a aVar) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(bVar);
        dVar.mo35648c2(C32343x.m95388F("text.account.cancellation.error.dialog.cant.close.header", new Object[0]));
        dVar.mo35639Q1(str);
        dVar.mo35644X1(str2);
        dVar.mo35643V1(new C37525g(str, dVar, aVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: H3 */
    static /* synthetic */ void m100052H3(DebitCardDetailsActivity debitCardDetailsActivity, C13310d.C13312b bVar, String str, String str2, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = C13310d.C13312b.TITLE_CLOSE_SINGLE_BUTTON;
        }
        if ((i & 4) != 0) {
            str2 = C32343x.m95388F("text.account.cancellation.error.dialog.button.cant.close.confirm", new Object[0]);
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        debitCardDetailsActivity.m100050G3(bVar, str, str2, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m100054I3(String str, C13310d dVar, C43064a aVar, Button button) {
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

    /* renamed from: J3 */
    private final void m100056J3(C38609c.C38610a aVar) {
        m100052H3(this, (C13310d.C13312b) null, aVar.mo92241a(), C32343x.m95388F("text.account.cancellation.error.dialog.button.pay.now", new Object[0]), new C34034h0(this), 1, (Object) null);
    }

    /* renamed from: K3 */
    private final void m100058K3(C38609c.C38611b bVar) {
        m100052H3(this, C13310d.C13312b.TITLE_SINGLE_BUTTON, bVar.mo92245a(), (String) null, (C43064a) null, 12, (Object) null);
    }

    /* renamed from: L3 */
    private final void m100060L3(C38609c.C38613d dVar) {
        m100052H3(this, (C13310d.C13312b) null, dVar.mo92249a(), (String) null, (C43064a) null, 13, (Object) null);
    }

    /* renamed from: M3 */
    private final void m100062M3(C38609c.C38614e eVar) {
        m100052H3(this, (C13310d.C13312b) null, eVar.mo92254b(), C32343x.m95388F("text.account.cancellation.error.dialog.button.transfer.funds", new Object[0]), new C34039i0(this, eVar), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m100064N3(CardInsSecCardModel cardInsSecCardModel) {
        C38125h.m112238c(this).mo91624q(cardInsSecCardModel.mo55706d(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public final void m100066O3(String str) {
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setWithinBank(true).setTransfertype(TransferForm.TRANSFERTYPE.ACCOUNT).setDestinationAcctNo(str).setIsRealEstate(false).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m100068P3(long j) {
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.getTransferFormByDocType("PAYMENT_OWN_ACCOUNTS")).setSrcAcctKey(j).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m100070Q3(long j, String str) {
        boolean z;
        TransferForm.C34932I destinationAcctKey = TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.getTransferFormByDocType("PAYMENT_OWN_ACCOUNTS")).setDestinationAcctKey(j);
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            destinationAcctKey.setAmount(str);
        }
        destinationAcctKey.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m100072R3(NewProductHeaderView.C13482a aVar) {
        boolean z;
        boolean z2;
        boolean canScrollVertically = m100087g3().f88325f.canScrollVertically(-1);
        boolean z3 = false;
        if (aVar == NewProductHeaderView.C13482a.BLACK || (aVar == NewProductHeaderView.C13482a.COLOR && !C32343x.m95476p0(this))) {
            z = true;
        } else {
            z = false;
        }
        ToolbarView toolbarView = m100087g3().f88327h;
        if (canScrollVertically || (C32343x.m95476p0(this) ^ z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        toolbarView.mo37106h0(canScrollVertically, z2);
        if (canScrollVertically) {
            z3 = C32343x.m95476p0(this);
        } else if (!z) {
            z3 = true;
        }
        C32343x.m95444e1(this, z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m100086f3(long j) {
        String b = PreferencesApiManager.getInstance().getLanguage().mo90433b();
        if (C32303f.m95213x(this)) {
            String d = C32303f.m95193d(j, b);
            String string = getString(C36274h.f87564d0);
            C32303f.m95195f(d, this, string + ".pdf", "application/pdf");
            return;
        }
        this.f82726O = j;
        new C32330r0((Activity) this).mo72838y(10016);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final C36614m m100087g3() {
        return (C36614m) this.f82721J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final C41185v m100088h3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C20288a.m66330e(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final C34067c m100089j3() {
        return (C34067c) this.f82724M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final C34119g m100090l3() {
        return (C34119g) this.f82722K.getValue();
    }

    /* renamed from: n3 */
    private final void m100091n3() {
        C36546y.m108282F().mo27137H("Conversion_Google_Pay", C10457a.f29785f, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m100092o3(C38609c cVar) {
        if (cVar instanceof C38609c.C38615f) {
            m100043C3(((C38609c.C38615f) cVar).mo92258a());
        } else if (cVar instanceof C38609c.C38612c) {
            m100102y3();
        } else if (cVar instanceof C38609c.C38614e) {
            m100062M3((C38609c.C38614e) cVar);
        } else if (cVar instanceof C38609c.C38610a) {
            m100056J3((C38609c.C38610a) cVar);
        } else if (cVar instanceof C38609c.C38611b) {
            m100058K3((C38609c.C38611b) cVar);
        } else if (cVar instanceof C38609c.C38613d) {
            m100060L3((C38609c.C38613d) cVar);
        }
    }

    /* renamed from: p3 */
    private final void m100093p3() {
        getWindow().setStatusBarColor(0);
        C32343x.m95429Z0(this);
        ViewCompat.m3550F0(m100087g3().mo3946b(), new C37527h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final WindowInsetsCompat m100094q3(DebitCardDetailsActivity debitCardDetailsActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(debitCardDetailsActivity, "this$0");
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
            AppBarLayout appBarLayout = debitCardDetailsActivity.m100087g3().f88324e;
            C41536l.m120488h(appBarLayout, "binding.appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m100095r3(DebitCardDetailsActivity debitCardDetailsActivity, ActivityResult activityResult) {
        C41536l.m120489i(debitCardDetailsActivity, "this$0");
        C21481a.onRefresh$default(debitCardDetailsActivity.m100090l3(), 0, 1, (Object) null);
    }

    /* renamed from: s3 */
    private final void m100096s3() {
        m100090l3().mo82461Gx().mo82444l2().mo4819k(this, new C34032g0(new C34048n(this)));
        m100090l3().mo82461Gx().mo82440c1().mo4819k(this, new C34032g0(new C34061w(this)));
        m100090l3().mo82461Gx().mo82441fk().mo4819k(this, new C34032g0(new C34062x(this)));
        m100090l3().mo82461Gx().mo82442j().mo4819k(this, new C34032g0(new C34063y(this)));
        m100090l3().mo82461Gx().mo82439c0().mo4819k(this, new C34032g0(new C34064z(this)));
        m100090l3().mo82461Gx().mo82446m4().mo4819k(this, new C34032g0(new C34009a0(this)));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82451ss(), this, new C34011b0(this));
        m100090l3().mo82461Gx().mo82443j6().mo4819k(this, new C34032g0(new C34022c0(this)));
        m100090l3().mo82461Gx().mo82438Y().mo4819k(this, new C34032g0(new C34024d0(this)));
        m100090l3().mo82461Gx().mo82428Bl().mo4819k(this, new C34032g0(new C34023d(this)));
        m100090l3().mo82461Gx().mo82436W0().mo4819k(this, new C34032g0(new C34025e(this)));
        m100090l3().mo82461Gx().mo82430Fj().mo4819k(this, new C34032g0(new C34027f(this)));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82453x2(), this, new C34031g(this));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82437W2(), this, new C34033h(this));
        m100090l3().mo82461Gx().mo82447n2().mo4819k(this, new C34032g0(new C34035i(this)));
        m100090l3().mo82461Gx().mo82432M1().mo4819k(this, new C34032g0(new C34040j(this)));
        m100090l3().mo82461Gx().mo82448o().mo4819k(this, new C34032g0(new C34042k(this)));
        m100090l3().mo82461Gx().mo82445lb().mo4819k(this, new C34032g0(new C34044l(this)));
        m100090l3().mo82461Gx().mo82431Gv().mo4819k(this, new C34032g0(new C34047m(this)));
        m100090l3().mo82461Gx().mo82434Us().mo4819k(this, new C34032g0(new C34049o(this)));
        m100090l3().mo82461Gx().mo82430Fj().mo4819k(this, new C34032g0(new C34050p(this)));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82429F7(), this, new C34053q(this));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82435Vo(), this, new C34054r(this));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82449p2(), this, new C34055s(this));
        m100090l3().mo82461Gx().mo82433O2().mo4819k(this, new C34032g0(new C34056t(this)));
        C37224b.m109963b(m100090l3().mo82461Gx().mo82450q0(), this, new C34059u(this));
        m100090l3().mo82461Gx().mo82452tm().mo4819k(this, new C34032g0(new C34060v(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m100097t3(long j) {
        C38903a.f92981K.mo92601b(j, new C34030f0(this)).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m100098u3(AccountOperation accountOperation) {
        Intent intent = new Intent(this, OperationDetailsActivity.class);
        intent.putExtra("PAYMENT_OPERATION_TYPE", 30);
        intent.putExtra("PAYMENT_DETAILS_OBJECT", C42035e.m122121c(accountOperation));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m100099v3(C38607a aVar) {
        Intent intent = new Intent(this, ProductDetailedActivity.class);
        intent.putExtra("PRODUCT_TYPE_KEY", aVar.mo92231c());
        intent.putExtra("PRODUCT_KEY", aVar.mo92229a());
        intent.putExtra("PRODUCT_INDEX", aVar.mo92230b());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m100100w3(long j) {
        OperationsActivity.f59076G.mo55129a(this, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m100101x3(Long l) {
        TransferForm.C34932I transferForm = TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN);
        if (l != null) {
            transferForm.setSrcAcctKey(l.longValue());
        }
        transferForm.start();
    }

    /* renamed from: y3 */
    private final void m100102y3() {
        C36852d.C36854b bVar = C36852d.C36854b.f88945f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo89778a(F);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(872415232);
        intent.putExtra("ACCOUNT_DEACTIVATION_SUCCESS_TEXT", C32343x.m95388F("text.account.cancellation.success.popup.green", new Object[0]));
        startActivity(intent);
    }

    /* renamed from: z3 */
    private final void m100103z3() {
        getSupportFragmentManager().mo4367F1("CONTRACT_REQUEST_CODE", this, new C37521e(this));
        getSupportFragmentManager().mo4367F1("ADD_NUMBER_REQUEST_CODE", this, new C37523f(this));
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_CARD_DETAILS_TAG")) {
            m100090l3().mo82480xx().mo82360D2(str, str2, str3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m100087g3().mo3946b());
        super.mo37451O1(bundle);
        m100093p3();
        RecyclerView recyclerView = m100087g3().f88325f;
        recyclerView.setAdapter(m100089j3());
        recyclerView.setLayoutManager(new LinearLayoutManagerAccurateOffset(this));
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        recyclerView.mo5351j(new C36859e(this));
        m100087g3().f88325f.mo5363n(new C34026e0(this));
        m100096s3();
        m100103z3();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return C36273g.menu_toolbar_product_details_activity;
    }

    /* renamed from: i3 */
    public final Client mo82281i3() {
        Client client = this.f82719H;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: k3 */
    public final PreferencesApiManager mo82282k3() {
        PreferencesApiManager preferencesApiManager = this.f82720I;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* renamed from: m3 */
    public final C34119g.C34133g mo82283m3() {
        C34119g.C34133g gVar = this.f82718G;
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
                mo82282k3().setGooglePayState(GooglePayState.ACTIVE);
                m100090l3().mo82480xx().mo82359Bc();
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
            C21481a.onRefresh$default(m100090l3(), 0, 1, (Object) null);
            C12910e.m48797o(this, C32343x.m95388F(C32312j.f79736f, new Object[0]), C12902d.C12905b.C12907b.f38104a, false, 4, (Object) null);
            m100091n3();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != C36271e.f87545s1) {
            return super.onOptionsItemSelected(menuItem);
        }
        m100090l3().mo82480xx().mo82371d1();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    long j = this.f82726O;
                    if (j != -1) {
                        m100086f3(j);
                        this.f82726O = -1;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public C30722p mo40037w1() {
        return this.f82725N;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return "";
    }
}

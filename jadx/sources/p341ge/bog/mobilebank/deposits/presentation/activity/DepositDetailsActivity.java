package p341ge.bog.mobilebank.deposits.presentation.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
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
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import ba1.C10220y;
import cc0.C19695c;
import cc0.C19697d;
import cc0.C19698e;
import cc0.C19699f;
import cc0.C19702h;
import cc0.C19719i;
import com.google.android.material.appbar.AppBarLayout;
import ec0.C20206a;
import ec0.C20210b;
import ec0.C20211c;
import ec0.C20213e;
import ec0.C20214f;
import ec0.C20215g;
import g91.C32286a1;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kc0.C25704a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import nc0.C26423k;
import nc0.C26424l;
import nc0.C26425m;
import nc0.C26426n;
import nc0.C26427o;
import nc0.C26434v;
import o31.C37613p;
import o31.C37617t;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.deposits.presentation.actionsheet.C23008a;
import p341ge.bog.mobilebank.deposits.presentation.actionsheet.C23023l;
import p341ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet;
import p341ge.bog.mobilebank.deposits.presentation.model.C23183b;
import p341ge.bog.mobilebank.deposits.presentation.model.DepositBreakOptions;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivityArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlActionSheetArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeResultModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.StatementActivity;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18338b0;
import q31.C38125h;
import rb0.C27984c;
import rb0.C27988g;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29720h;
import xb0.C29738z;

/* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity */
public final class DepositDetailsActivity extends C23178x {

    /* renamed from: R */
    public static final C23082a f60610R = new C23082a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C26423k f60611G;

    /* renamed from: H */
    private final C41217g f60612H = C41219i.m119470b(new C23115j0(this));

    /* renamed from: I */
    private final C41217g f60613I = new C1617p0(C41520a0.m120436b(C26434v.class), new C23108h1(this), new C23116j1(this), new C23113i1((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f60614J = C41219i.m119470b(new C23128n0(this));

    /* renamed from: K */
    private final C41217g f60615K = C41219i.m119470b(C23130o0.f60656d);

    /* renamed from: L */
    private final C41217g f60616L = C41219i.m119470b(new C23132p0(this));

    /* renamed from: M */
    private final C41217g f60617M = C41219i.m119470b(new C23106h0(this));

    /* renamed from: N */
    private final C41217g f60618N = C41219i.m119470b(new C23122l0(this));

    /* renamed from: O */
    private final C41217g f60619O = C41219i.m119470b(new C23125m0(this));

    /* renamed from: P */
    private final C41217g f60620P = C41219i.m119470b(new C23110i0(this));

    /* renamed from: Q */
    private final C41217g f60621Q = C41219i.m119470b(new C23119k0(this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$a */
    public static final class C23082a {

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$a$a */
        /* synthetic */ class C23083a extends C41535k implements C43075l {
            C23083a(Object obj) {
                super(1, obj, C0173b.class, "launch", "launch(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: b */
            public final void mo57768b(Intent intent) {
                ((C0173b) this.receiver).mo404a(intent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo57768b((Intent) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$a$b */
        /* synthetic */ class C23084b extends C41535k implements C43075l {
            C23084b(Object obj) {
                super(1, obj, Context.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
            }

            /* renamed from: b */
            public final void mo57769b(Intent intent) {
                ((Context) this.receiver).startActivity(intent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo57769b((Intent) obj);
                return C41238w.f97225a;
            }
        }

        private C23082a() {
        }

        public /* synthetic */ C23082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57767a(Context context, long j, C0173b bVar) {
            C43075l lVar;
            C41536l.m120489i(context, "context");
            Intent a = C37613p.m110614a(new Intent(context, DepositDetailsActivity.class), C41233s.m119492a("PARAM_ID", Long.valueOf(j)));
            if (bVar != null) {
                lVar = new C23083a(bVar);
            } else {
                lVar = new C23084b(context);
            }
            lVar.invoke(a);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$a0 */
    /* synthetic */ class C23085a0 extends C41535k implements C43075l {
        C23085a0(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "setActionButtons", "setActionButtons(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo57770b(List list) {
            C41536l.m120489i(list, "p0");
            ((DepositDetailsActivity) this.receiver).m74842k4(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57770b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$a1 */
    static final class C23086a1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29738z f60622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23086a1(C29738z zVar) {
            super(1);
            this.f60622d = zVar;
        }

        /* renamed from: a */
        public final void mo57771a(List list) {
            this.f60622d.f75167j.mo53597e();
            LayerView c = this.f60622d.mo3946b();
            C41536l.m120488h(c, "section.root");
            C32343x.m95447f1(c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57771a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$b */
    static final class C23087b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23087b(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60623d = depositDetailsActivity;
        }

        public final void invoke() {
            this.f60623d.m74790K3().mo65739xw().mo65678ho();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$b0 */
    static final class C23088b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23088b0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60624d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57772a(List list) {
            DepositDetailsActivity depositDetailsActivity = this.f60624d;
            C29738z zVar = depositDetailsActivity.m74775A3().f75061m;
            C41536l.m120488h(zVar, "binding.interestSection");
            C41536l.m120488h(list, "it");
            depositDetailsActivity.m74867x3(zVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57772a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$b1 */
    static final class C23089b1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29738z f60625d;

        /* renamed from: e */
        final /* synthetic */ DepositDetailsActivity f60626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23089b1(C29738z zVar, DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60625d = zVar;
            this.f60626e = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57773a(List list) {
            C41536l.m120489i(list, "it");
            LayerView c = this.f60625d.mo3946b();
            C41536l.m120488h(c, "section.root");
            C32343x.m95447f1(c);
            this.f60626e.m74867x3(this.f60625d, list);
            this.f60625d.f75167j.mo53595c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57773a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$c */
    /* synthetic */ class C23090c extends C41535k implements C43075l {
        C23090c(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openTransferActivityForAddMoney", "openTransferActivityForAddMoney(J)V", 0);
        }

        /* renamed from: b */
        public final void mo57774b(long j) {
            ((DepositDetailsActivity) this.receiver).m74834g4(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57774b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$c0 */
    static final class C23091c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23091c0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60627d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57775a(List list) {
            DepositDetailsActivity depositDetailsActivity = this.f60627d;
            C29738z zVar = depositDetailsActivity.m74775A3().f75054f;
            C41536l.m120488h(zVar, "binding.additionalFunctionsSection");
            C41536l.m120488h(list, "it");
            depositDetailsActivity.m74867x3(zVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57775a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$c1 */
    static final class C23092c1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29738z f60628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23092c1(C29738z zVar) {
            super(1);
            this.f60628d = zVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60628d.f75167j.mo53596d();
            LayerView c = this.f60628d.mo3946b();
            C41536l.m120488h(c, "section.root");
            C32343x.m95447f1(c);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$d */
    /* synthetic */ class C23093d extends C41535k implements C43075l {
        C23093d(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openTransferActivityForTransfer", "openTransferActivityForTransfer(J)V", 0);
        }

        /* renamed from: b */
        public final void mo57777b(long j) {
            ((DepositDetailsActivity) this.receiver).m74836h4(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57777b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$d0 */
    static final class C23094d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23094d0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60629d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57778a(List list) {
            DepositDetailsActivity depositDetailsActivity = this.f60629d;
            C29738z zVar = depositDetailsActivity.m74775A3().f75057i;
            C41536l.m120488h(zVar, "binding.depositDetailsSection");
            C41536l.m120488h(list, "it");
            depositDetailsActivity.m74867x3(zVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57778a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$d1 */
    static final class C23095d1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23095d1(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60630d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57779a(C41238w wVar) {
            DepositDetailsActivity.m74810U3(this.f60630d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57779a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$e */
    static final class C23096e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23096e(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60631d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57780a(String str) {
            C41536l.m120489i(str, "it");
            this.f60631d.m74828d4((String) C32343x.m95409P0(str, C40439w.m117118v(str)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57780a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$e0 */
    static final class C23097e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23097e0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60632d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57781a(C31128a aVar) {
            DepositDetailsActivity depositDetailsActivity = this.f60632d;
            C29738z zVar = depositDetailsActivity.m74775A3().f75058j;
            C41536l.m120488h(zVar, "binding.depositOperationsSection");
            C41536l.m120488h(aVar, "it");
            depositDetailsActivity.m74806S3(zVar, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57781a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$e1 */
    static final class C23098e1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23098e1(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60633d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57782a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            DepositDetailsActivity.m74810U3(this.f60633d, false);
            DepositNameActionSheet Q2 = this.f60633d.m74788J3();
            if (Q2 != null) {
                Q2.mo4577k1();
            }
            this.f60633d.m74790K3().onRefresh(6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57782a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$f */
    /* synthetic */ class C23099f extends C41535k implements C43075l {
        C23099f(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onSetDepositNameResult", "onSetDepositNameResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57783b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74808T3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57783b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$f0 */
    /* synthetic */ class C23100f0 extends C41535k implements C43075l {
        C23100f0(Object obj) {
            super(1, obj, C19695c.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo57784b(List list) {
            ((C19695c) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57784b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$f1 */
    static final class C23101f1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23101f1(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60634d = depositDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41238w wVar;
            C41536l.m120489i(th, "t");
            DepositDetailsActivity.m74810U3(this.f60634d, false);
            DepositNameActionSheet Q2 = this.f60634d.m74788J3();
            if (Q2 != null) {
                Q2.handleError(th);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                this.f60634d.mo74709H1(th);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$g */
    static final class C23102g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23102g(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60635d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57786a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60635d.m74830e4();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57786a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$g0 */
    /* synthetic */ class C23103g0 extends C41535k implements C43075l {
        C23103g0(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openStatementActivity", "openStatementActivity(J)V", 0);
        }

        /* renamed from: b */
        public final void mo57787b(long j) {
            ((DepositDetailsActivity) this.receiver).m74832f4(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57787b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$g1 */
    static final class C23104g1 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60636a;

        C23104g1(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60636a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60636a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60636a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$h */
    /* synthetic */ class C23105h extends C41535k implements C43075l {
        C23105h(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onApiRequestResult", "onApiRequestResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57790b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74796N3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57790b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$h0 */
    static final class C23106h0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60637d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$h0$a */
        /* synthetic */ class C23107a implements C19719i, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60638a;

            C23107a(C26424l lVar) {
                this.f60638a = lVar;
            }

            /* renamed from: a */
            public final void mo47923a(C23183b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60638a.mo65676d7(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19719i) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60638a, C26424l.class, "onSectionItemClicked", "onSectionItemClicked(Lge/bog/mobilebank/deposits/presentation/model/DepositSectionItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23106h0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60637d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C19702h invoke() {
            return new C19702h(new C23107a(this.f60637d.m74790K3().mo65739xw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$h1 */
    public static final class C23108h1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23108h1(ComponentActivity componentActivity) {
            super(0);
            this.f60639d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60639d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$i */
    /* synthetic */ class C23109i extends C41535k implements C43075l {
        C23109i(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onCreateSavingGoalResult", "onCreateSavingGoalResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57794b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74798O3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57794b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$i0 */
    static final class C23110i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60640d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$i0$a */
        /* synthetic */ class C23111a implements C19697d, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60641a;

            C23111a(C26424l lVar) {
                this.f60641a = lVar;
            }

            /* renamed from: a */
            public final void mo47895a(C20210b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60641a.mo65677d8(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19697d) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60641a, C26424l.class, "onDepositBannerClicked", "onDepositBannerClicked(Lge/bog/mobilebank/deposits/presentation/model/DepositDetailsBanner;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$i0$b */
        /* synthetic */ class C23112b implements C19698e, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60642a;

            C23112b(C26424l lVar) {
                this.f60642a = lVar;
            }

            /* renamed from: a */
            public final void mo47896a(C20210b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60642a.mo65679ii(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19698e) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60642a, C26424l.class, "onDepositBannerClosed", "onDepositBannerClosed(Lge/bog/mobilebank/deposits/presentation/model/DepositDetailsBanner;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23110i0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60640d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C19695c invoke() {
            return new C19695c(new C23111a(this.f60640d.m74790K3().mo65739xw()), new C23112b(this.f60640d.m74790K3().mo65739xw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$i1 */
    public static final class C23113i1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60643d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23113i1(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60643d = aVar;
            this.f60644e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60643d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60644e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$j */
    /* synthetic */ class C23114j extends C41535k implements C43075l {
        C23114j(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onDeleteSavingGoalResult", "onDeleteSavingGoalResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57800b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74800P3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57800b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$j0 */
    static final class C23115j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23115j0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60645d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C29720h invoke() {
            return C29720h.m90246d(this.f60645d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$j1 */
    static final class C23116j1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60646d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$j1$a */
        static final class C23117a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DepositDetailsActivity f60647d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23117a(DepositDetailsActivity depositDetailsActivity) {
                super(0);
                this.f60647d = depositDetailsActivity;
            }

            /* renamed from: b */
            public final C26434v invoke() {
                C26423k F3 = this.f60647d.mo57765F3();
                Intent intent = this.f60647d.getIntent();
                long j = -1;
                if (intent != null) {
                    j = intent.getLongExtra("PARAM_ID", -1);
                }
                return F3.mo32554a(j);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23116j1(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60646d = depositDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C23117a(this.f60646d));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$k */
    /* synthetic */ class C23118k extends C41535k implements C43075l {
        C23118k(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onSavingGoalsResult", "onSavingGoalsResult(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo57803b(List list) {
            C41536l.m120489i(list, "p0");
            ((DepositDetailsActivity) this.receiver).m74804R3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57803b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$k0 */
    static final class C23119k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60648d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$k0$a */
        public static final class C23120a extends ViewPager2.C1928i {

            /* renamed from: a */
            final /* synthetic */ DepositDetailsActivity f60649a;

            C23120a(DepositDetailsActivity depositDetailsActivity) {
                this.f60649a = depositDetailsActivity;
            }

            public void onPageSelected(int i) {
                super.onPageSelected(i);
                this.f60649a.m74790K3().mo65739xw().mo65681mt(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23119k0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60648d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C23120a invoke() {
            return new C23120a(this.f60648d);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$l */
    /* synthetic */ class C23121l extends C41535k implements C43075l {
        C23121l(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "updateToolbar", "updateToolbar(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo57805b(boolean z) {
            ((DepositDetailsActivity) this.receiver).m74863u4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57805b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$l0 */
    static final class C23122l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60650d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$l0$a */
        /* synthetic */ class C23123a implements C19719i, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60651a;

            C23123a(C26424l lVar) {
                this.f60651a = lVar;
            }

            /* renamed from: a */
            public final void mo47923a(C23183b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60651a.mo65676d7(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19719i) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60651a, C26424l.class, "onSectionItemClicked", "onSectionItemClicked(Lge/bog/mobilebank/deposits/presentation/model/DepositSectionItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23122l0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60650d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C19702h invoke() {
            return new C19702h(new C23123a(this.f60650d.m74790K3().mo65739xw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$m */
    /* synthetic */ class C23124m extends C41535k implements C43075l {
        C23124m(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "onDepositDataResult", "onDepositDataResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57809b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74802Q3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57809b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$m0 */
    static final class C23125m0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60652d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$m0$a */
        /* synthetic */ class C23126a implements C19719i, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60653a;

            C23126a(C26424l lVar) {
                this.f60653a = lVar;
            }

            /* renamed from: a */
            public final void mo47923a(C23183b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60653a.mo65676d7(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19719i) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60653a, C26424l.class, "onSectionItemClicked", "onSectionItemClicked(Lge/bog/mobilebank/deposits/presentation/model/DepositSectionItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23125m0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60652d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C19702h invoke() {
            return new C19702h(new C23126a(this.f60652d.m74790K3().mo65739xw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$n */
    /* synthetic */ class C23127n extends C41535k implements C43075l {
        C23127n(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openCreateStoScreen", "openCreateStoScreen(J)V", 0);
        }

        /* renamed from: b */
        public final void mo57813b(long j) {
            ((DepositDetailsActivity) this.receiver).m74818Y3(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57813b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$n0 */
    static final class C23128n0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23128n0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60654d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C13364a invoke() {
            return new C13364a(C0767a.m2895e(this.f60654d, C27984c.f71248y));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$o */
    static final class C23129o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23129o(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60655d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57815a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            DDSTOListActivity.m103490M2(this.f60655d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57815a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$o0 */
    static final class C23130o0 extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C23130o0 f60656d = new C23130o0();

        C23130o0() {
            super(0);
        }

        /* renamed from: b */
        public final C19699f invoke() {
            return new C19699f();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$p */
    static final class C23131p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23131p(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60657d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57817a(long j) {
            C38125h.m112238c(this.f60657d).mo91609i0(this.f60657d, j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57817a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$p0 */
    static final class C23132p0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60658d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$p0$a */
        /* synthetic */ class C23133a implements C19719i, C41532h {

            /* renamed from: a */
            final /* synthetic */ C26424l f60659a;

            C23133a(C26424l lVar) {
                this.f60659a = lVar;
            }

            /* renamed from: a */
            public final void mo47923a(C23183b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f60659a.mo65676d7(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19719i) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60659a, C26424l.class, "onSectionItemClicked", "onSectionItemClicked(Lge/bog/mobilebank/deposits/presentation/model/DepositSectionItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23132p0(DepositDetailsActivity depositDetailsActivity) {
            super(0);
            this.f60658d = depositDetailsActivity;
        }

        /* renamed from: b */
        public final C19702h invoke() {
            return new C19702h(new C23133a(this.f60658d.m74790K3().mo65739xw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$q */
    static final class C23134q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23134q(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60660d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57821a(long j) {
            C38125h.m112238c(this.f60660d).mo91539A0(this.f60660d, j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57821a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$q0 */
    static final class C23135q0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23135q0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60661d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57822a(C41238w wVar) {
            this.f60661d.m74847m4(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57822a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$r */
    static final class C23136r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23136r(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60662d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57823a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C12910e.m48797o(this.f60662d, C32343x.m95452h0(C27988g.f71307b, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57823a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$r0 */
    static final class C23137r0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23137r0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60663d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57824a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60663d.m74847m4(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57824a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$s */
    /* synthetic */ class C23138s extends C41535k implements C43075l {
        C23138s(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "downloadUrl", "downloadUrl(Lge/bog/mobilebank/deposits/presentation/model/DownloadData;)V", 0);
        }

        /* renamed from: b */
        public final void mo57825b(C20215g gVar) {
            C41536l.m120489i(gVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74866w3(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57825b((C20215g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$s0 */
    static final class C23139s0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23139s0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60664d = depositDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60664d.m74847m4(false);
            this.f60664d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$t */
    /* synthetic */ class C23140t extends C41535k implements C43075l {
        C23140t(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openOperationDetails", "openOperationDetails(Lge/bog/mobilebank/model/account/AccountOperation;)V", 0);
        }

        /* renamed from: b */
        public final void mo57827b(AccountOperation accountOperation) {
            C41536l.m120489i(accountOperation, "p0");
            ((DepositDetailsActivity) this.receiver).m74826c4(accountOperation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57827b((AccountOperation) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$t0 */
    static final class C23141t0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23141t0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60665d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57828a(boolean z) {
            String str;
            DepositDetailsActivity depositDetailsActivity = this.f60665d;
            if (z) {
                str = "deposit.saving.goal.added";
            } else {
                str = "deposit.saving.goal.updated";
            }
            C12910e.m48797o(depositDetailsActivity, C32343x.m95388F(str, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            this.f60665d.m74790K3().onRefresh(6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57828a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$u */
    /* synthetic */ class C23142u extends C41535k implements C43075l {
        C23142u(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openDepositBreakActionSheet", "openDepositBreakActionSheet(Lge/bog/mobilebank/deposits/presentation/model/DepositBreakOptions;)V", 0);
        }

        /* renamed from: b */
        public final void mo57829b(DepositBreakOptions depositBreakOptions) {
            C41536l.m120489i(depositBreakOptions, "p0");
            ((DepositDetailsActivity) this.receiver).m74820Z3(depositBreakOptions);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57829b((DepositBreakOptions) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$u0 */
    static final class C23143u0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23143u0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60666d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57830a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C12910e.m48797o(this.f60666d, C32343x.m95388F("deposit.saving.goal.deleted", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            this.f60666d.m74790K3().onRefresh(6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57830a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$v */
    /* synthetic */ class C23144v extends C41535k implements C43075l {
        C23144v(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "updateDepositProlongationInfo", "updateDepositProlongationInfo(Lge/bog/mobilebank/deposits/presentation/model/DepositProlongationInfo;)V", 0);
        }

        /* renamed from: b */
        public final void mo57831b(C20214f fVar) {
            ((DepositDetailsActivity) this.receiver).m74861t4(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57831b((C20214f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$v0 */
    static final class C23145v0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23145v0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60667d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57832a(List list) {
            this.f60667d.m74775A3().f75063o.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57832a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$w */
    /* synthetic */ class C23146w extends C41535k implements C43075l {
        C23146w(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openDepositProlongationActionSheet", "openDepositProlongationActionSheet(Lge/bog/mobilebank/deposits/presentation/model/DepositProlongationInfo;)V", 0);
        }

        /* renamed from: b */
        public final void mo57833b(C20214f fVar) {
            C41536l.m120489i(fVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74822a4(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57833b((C20214f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$w0 */
    static final class C23147w0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23147w0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60668d = depositDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            String str;
            C41536l.m120489i(th, "err");
            this.f60668d.m74775A3().f75063o.mo53596d();
            PageState pageState = this.f60668d.m74775A3().f75048B;
            if (th instanceof ApiError) {
                str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
            } else {
                str = th.getMessage();
                if (str == null) {
                    str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
                }
            }
            pageState.setTitleText(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$x */
    /* synthetic */ class C23148x extends C41535k implements C43075l {
        C23148x(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "setHeaderData", "setHeaderData(Lge/bog/mobilebank/deposits/presentation/model/DepositDetailsHeaderData;)V", 0);
        }

        /* renamed from: b */
        public final void mo57835b(C20211c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74845l4(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57835b((C20211c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$x0 */
    static final class C23149x0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23149x0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60669d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57836a(List list) {
            this.f60669d.m74847m4(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57836a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$y */
    /* synthetic */ class C23150y extends C41535k implements C43075l {
        C23150y(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openDepositProlongationActivity", "openDepositProlongationActivity(Lge/bog/mobilebank/deposits/presentation/viewmodel/DepositDetailsViewModel$OpenDepositProlongationActivityModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo57837b(C26426n nVar) {
            C41536l.m120489i(nVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74824b4(nVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57837b((C26426n) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$y0 */
    static final class C23151y0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23151y0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60670d = depositDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60670d.mo74709H1(th);
            this.f60670d.m74847m4(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$z */
    /* synthetic */ class C23152z extends C41535k implements C43075l {
        C23152z(Object obj) {
            super(1, obj, DepositDetailsActivity.class, "openCancelDepositProlConfirmationDialog", "openCancelDepositProlConfirmationDialog(Lge/bog/mobilebank/deposits/presentation/viewmodel/DepositDetailsViewModel$OpenCancelDepositConfirmationModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo57839b(C26425m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((DepositDetailsActivity) this.receiver).m74812V3(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57839b((C26425m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity$z0 */
    static final class C23153z0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositDetailsActivity f60671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23153z0(DepositDetailsActivity depositDetailsActivity) {
            super(1);
            this.f60671d = depositDetailsActivity;
        }

        /* renamed from: a */
        public final void mo57840a(List list) {
            C41536l.m120489i(list, "it");
            this.f60671d.m74775A3().f75063o.mo53595c();
            this.f60671d.m74847m4(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57840a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final C29720h m74775A3() {
        return (C29720h) this.f60612H.getValue();
    }

    /* renamed from: B3 */
    private final ViewPager2.C1928i m74776B3() {
        return (ViewPager2.C1928i) this.f60621Q.getValue();
    }

    /* renamed from: C3 */
    private final C19702h m74777C3() {
        return (C19702h) this.f60618N.getValue();
    }

    /* renamed from: D3 */
    private final C19702h m74778D3() {
        return (C19702h) this.f60619O.getValue();
    }

    /* renamed from: E3 */
    private final C13364a m74780E3() {
        return (C13364a) this.f60614J.getValue();
    }

    /* renamed from: G3 */
    private final C19699f m74783G3() {
        return (C19699f) this.f60615K.getValue();
    }

    /* renamed from: I3 */
    private final C19702h m74786I3() {
        return (C19702h) this.f60616L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final DepositNameActionSheet m74788J3() {
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DEPOSIT_NAME");
        if (k0 instanceof DepositNameActionSheet) {
            return (DepositNameActionSheet) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public final C26434v m74790K3() {
        return (C26434v) this.f60613I.getValue();
    }

    /* renamed from: L3 */
    private final void m74792L3() {
        getWindow().setStatusBarColor(0);
        C32343x.m95429Z0(this);
        ViewCompat.m3550F0(m74775A3().mo3946b(), new C23165l(this));
        m74865v4(this, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final WindowInsetsCompat m74794M3(DepositDetailsActivity depositDetailsActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
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
            AppBarLayout appBarLayout = depositDetailsActivity.m74775A3().f75055g;
            C41536l.m120488h(appBarLayout, "binding.appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            LoadingView loadingView = depositDetailsActivity.m74775A3().f75073y;
            C41536l.m120488h(loadingView, "binding.skeletonLoading");
            loadingView.setPadding(loadingView.getPaddingLeft(), f.f3466b, loadingView.getPaddingRight(), loadingView.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m74796N3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23135q0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23137r0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23139s0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public final void m74798O3(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23141t0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m74800P3(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23143u0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m74802Q3(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1}, new C23145v0(this));
        C31132b.m92641c(aVar, new int[]{1}, new C23147w0(this));
        C31132b.m92645g(aVar, new int[]{6}, new C23149x0(this));
        C31132b.m92641c(aVar, new int[]{6}, new C23151y0(this));
        C31132b.m92648j(aVar, (int[]) null, new C23153z0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m74804R3(List list) {
        LayerView layerView = m74775A3().f75069u;
        C41536l.m120488h(layerView, "binding.savingGoalLayer");
        C32343x.m95483r1(layerView, !list.isEmpty(), false, 2, (Object) null);
        TextProgressBarView.ProgressModel progressModel = (TextProgressBarView.ProgressModel) C41358y.m120009Y(list);
        if (progressModel != null) {
            TextProgressBarView textProgressBarView = m74775A3().f75068t;
            C41536l.m120488h(textProgressBarView, "binding.savingGoal");
            textProgressBarView.setBudget(progressModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public final void m74806S3(C29738z zVar, C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23086a1(zVar), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23089b1(zVar, this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23092c1(zVar), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m74808T3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23095d1(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23098e1(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23101f1(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static final void m74810U3(DepositDetailsActivity depositDetailsActivity, boolean z) {
        DepositNameActionSheet J3 = depositDetailsActivity.m74788J3();
        if (J3 != null) {
            J3.mo57664l2(true);
        }
        depositDetailsActivity.m74847m4(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public final void m74812V3(C26425m mVar) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(C32343x.m95388F("deposit.prolong.decline.popup.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("deposit.prolong.decline.popup.body", Long.valueOf(mVar.mo65683a())));
        dVar.mo35642U1(C32343x.m95388F("deposit.prolong.decline.popup.back", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("deposit.prolong.decline.popup.yes", new Object[0]));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35641T1(new C23170q(dVar));
        dVar.mo35645Y1(new C23171r(this, mVar, dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m74814W3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m74816X3(DepositDetailsActivity depositDetailsActivity, C26425m mVar, C13310d dVar, Button button) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        C41536l.m120489i(mVar, "$model");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        depositDetailsActivity.m74790K3().mo65739xw().mo65682sb(mVar.mo65684b());
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public final void m74818Y3(long j) {
        boolean z;
        TransferForm.C34932I requestCode = TransferForm.startWith((Activity) this, "STO", "CREATE").setTransferForm(TransferForm.getTransferFormByDocType("PAYMENT_OWN_ACCOUNTS")).setDestinationAcctKey(j).setRequestCode(10019);
        if (C41536l.m120484d("B", "PAYMENT_OWN_ACCOUNTS") || C41536l.m120484d("G", "PAYMENT_OWN_ACCOUNTS")) {
            z = true;
        } else {
            z = false;
        }
        requestCode.setWithinBank(z).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public final void m74820Z3(DepositBreakOptions depositBreakOptions) {
        C23008a.f60530K.mo57691a(depositBreakOptions).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public final void m74822a4(C20214f fVar) {
        C25704a.f65475J.mo64277a(new DepositProlActionSheetArgs(fVar.mo48642f(), fVar.mo48639d())).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public final void m74824b4(C26426n nVar) {
        DepositProlongationActivity.f60824K.mo58117a(this, new DepositProlongationActivityArgs(nVar.mo65689b(), nVar.mo65688a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public final void m74826c4(AccountOperation accountOperation) {
        startActivity(C37613p.m110614a(new Intent(this, OperationDetailsActivity.class), C41233s.m119492a("PAYMENT_OPERATION_TYPE", 30), C41233s.m119492a("PAYMENT_DETAILS_OBJECT", C42035e.m122121c(accountOperation))));
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public final void m74828d4(String str) {
        DepositNameActionSheet.f60516K.mo57675a(str).mo4576A1(getSupportFragmentManager(), "FRAGMENT_TAG_DEPOSIT_NAME");
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public final void m74830e4() {
        C23023l lVar;
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_SAVING_GOAL");
        if (k0 instanceof C23023l) {
            lVar = (C23023l) k0;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            lVar = C23023l.f60550N.mo57701a();
        }
        lVar.mo4576A1(getSupportFragmentManager(), "FRAGMENT_TAG_SAVING_GOAL");
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final void m74832f4(long j) {
        startActivity(C37613p.m110614a(new Intent(this, StatementActivity.class), C41233s.m119492a("PRODUCT_TYPE_KEY", 4), C41233s.m119492a("PRODUCT_KEY", Long.valueOf(j))));
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public final void m74834g4(long j) {
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(j).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public final void m74836h4(long j) {
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setSrcAcctKey(j).start();
    }

    /* renamed from: i4 */
    private final void m74838i4(Button button, C20206a aVar) {
        C32343x.m95447f1(button);
        button.setOnClickListener(new C23167n(this, aVar));
        button.setButtonText(C34646b.m101752f(aVar.mo48610b(), (Context) null, 1, (Object) null));
        button.setButtonIcon(C0767a.m2895e(button.getContext(), aVar.mo48609a()));
        button.setEnabled(aVar.mo48611c());
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m74840j4(DepositDetailsActivity depositDetailsActivity, C20206a aVar, View view) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        C41536l.m120489i(aVar, "$item");
        depositDetailsActivity.m74790K3().mo65739xw().mo65674Cs(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public final void m74842k4(List list) {
        boolean z;
        Button button;
        LayerView layerView = m74775A3().f75053e;
        C41536l.m120488h(layerView, "binding.actionButtonsLayer");
        C32343x.m95483r1(layerView, !list.isEmpty(), false, 2, (Object) null);
        Group group = m74775A3().f75074z;
        C41536l.m120488h(group, "binding.smallActionButtons");
        C32343x.m95455i0(group);
        Button button2 = m74775A3().f75072x;
        C41536l.m120488h(button2, "binding.singleActionButton");
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(button2, z, false, 2, (Object) null);
        if (list.size() == 1) {
            Button button3 = m74775A3().f75072x;
            C41536l.m120488h(button3, "setActionButtons$lambda$19");
            m74838i4(button3, (C20206a) C41358y.m120007W(list));
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20206a aVar = (C20206a) it.next();
            if (aVar instanceof C20206a.C20208b) {
                button = m74775A3().f75050D;
            } else if (aVar instanceof C20206a.C20209c) {
                button = m74775A3().f75051E;
            } else if (aVar instanceof C20206a.C20207a) {
                button = m74775A3().f75047A;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C41536l.m120488h(button, "when (item) {\n          …tButton\n                }");
            m74838i4(button, aVar);
        }
    }

    /* renamed from: l1 */
    private final void m74843l1() {
        C26427o yw = m74790K3().mo65740yw();
        yw.mo65700Ug().mo4819k(this, new C23104g1(new C23124m(this)));
        yw.mo65713l0().mo4819k(this, new C23104g1(new C23148x(this)));
        yw.mo65710gr().mo4819k(this, new C23104g1(new C23085a0(this)));
        yw.mo65721zc().mo4819k(this, new C23104g1(new C23088b0(this)));
        yw.mo65704at().mo4819k(this, new C23104g1(new C23091c0(this)));
        yw.mo65694Em().mo4819k(this, new C23104g1(new C23094d0(this)));
        yw.mo65707cd().mo4819k(this, new C23104g1(new C23097e0(this)));
        yw.mo65717sh().mo4819k(this, new C23104g1(new C23100f0(m74869z3())));
        C37224b.m109963b(yw.mo65706bk(), this, new C23103g0(this));
        C37224b.m109963b(yw.mo65695Hb(), this, new C23090c(this));
        C37224b.m109963b(yw.mo65708dv(), this, new C23093d(this));
        C37224b.m109963b(yw.mo65696Id(), this, new C23096e(this));
        yw.mo65698S6().mo4819k(this, new C23104g1(new C23099f(this)));
        C37224b.m109963b(yw.mo65712id(), this, new C23102g(this));
        yw.mo65711i().mo4819k(this, new C23104g1(new C23105h(this)));
        yw.mo65727Oi().mo4819k(this, new C23104g1(new C23109i(this)));
        yw.mo65735pp().mo4819k(this, new C23104g1(new C23114j(this)));
        yw.mo65709gq().mo4819k(this, new C23104g1(new C23118k(this)));
        yw.mo65719u1().mo4819k(this, new C23104g1(new C23121l(this)));
        C37224b.m109963b(yw.mo65720ye(), this, new C23127n(this));
        C37224b.m109963b(yw.mo65715ot(), this, new C23129o(this));
        C37224b.m109963b(yw.mo65705b5(), this, new C23131p(this));
        C37224b.m109963b(yw.mo65697Jf(), this, new C23134q(this));
        C37224b.m109963b(yw.mo65703Xu(), this, new C23136r(this));
        C37224b.m109963b(yw.mo65693A2(), this, new C23138s(this));
        C37224b.m109963b(yw.mo65699Ta(), this, new C23140t(this));
        C37224b.m109963b(yw.mo65716ou(), this, new C23142u(this));
        yw.mo65718sn().mo4819k(this, new C23104g1(new C23144v(this)));
        C37224b.m109963b(yw.mo65702Xj(), this, new C23146w(this));
        C37224b.m109963b(yw.mo65701Wa(), this, new C23150y(this));
        C37224b.m109963b(yw.mo65714oj(), this, new C23152z(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public final void m74845l4(C20211c cVar) {
        boolean z;
        int i;
        m74775A3().f75060l.mo6614p(m74776B3());
        m74783G3().mo47899i(cVar.mo48627c());
        int size = cVar.mo48627c().size();
        int b = cVar.mo48626b();
        if (b < 0 || b >= size) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = cVar.mo48626b();
        } else {
            i = 0;
        }
        m74775A3().f75060l.mo6606l(i, cVar.mo48625a());
        m74775A3().f75060l.mo6603h(m74776B3());
        FrameLayout frameLayout = m74775A3().f75071w;
        C41536l.m120488h(frameLayout, "binding.scrollingIndicator");
        C32343x.m95483r1(frameLayout, !cVar.mo48627c().isEmpty(), false, 2, (Object) null);
        C18338b0.C18341c cVar2 = new C18338b0.C18341c(0, true, 1, (DefaultConstructorMarker) null);
        ViewPager2 viewPager2 = m74775A3().f75060l;
        C41536l.m120488h(viewPager2, "binding.headerPager");
        FrameLayout frameLayout2 = m74775A3().f75071w;
        C41536l.m120488h(frameLayout2, "binding.scrollingIndicator");
        cVar2.mo46116a(viewPager2, frameLayout2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public final void m74847m4(boolean z) {
        FrameLayout frameLayout = m74775A3().f75066r;
        C41536l.m120488h(frameLayout, "binding.regularLoaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: n4 */
    private final void m74849n4() {
        m74775A3().f75070v.setTitle(C32343x.m95388F("deposit.saving.goal.dep.goal", new Object[0]));
    }

    /* renamed from: o4 */
    private final void m74851o4(C29738z zVar, StringSource stringSource, C19702h hVar, C20213e eVar, boolean z) {
        zVar.f75164g.setTitle(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null));
        zVar.f75165h.setAdapter(hVar);
        zVar.f75165h.setItemAnimator((RecyclerView.C1742m) null);
        if (z) {
            zVar.f75165h.mo5351j(m74780E3());
        }
        zVar.f75162e.setOnClickListener(new C23166m(this, eVar));
    }

    /* renamed from: p4 */
    static /* synthetic */ void m74853p4(DepositDetailsActivity depositDetailsActivity, C29738z zVar, StringSource stringSource, C19702h hVar, C20213e eVar, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        depositDetailsActivity.m74851o4(zVar, stringSource, hVar, eVar, z);
    }

    /* renamed from: q3 */
    private final void m74854q3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_NAME_SAVED", this, new C23172s(this));
        supportFragmentManager.mo4367F1("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.REQUEST_TAG", this, new C23173t(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m74855q4(DepositDetailsActivity depositDetailsActivity, C20213e eVar, View view) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        C41536l.m120489i(eVar, "$sectionType");
        depositDetailsActivity.m74790K3().mo65723Bw(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m74856r3(DepositDetailsActivity depositDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        C26424l xw = depositDetailsActivity.m74790K3().mo65739xw();
        String string = bundle.getString("RESULT_KEY_SAVED_NAME");
        if (string != null) {
            xw.mo65675Qg(string);
        }
    }

    /* renamed from: r4 */
    private final void m74857r4() {
        C29738z zVar = m74775A3().f75061m;
        C41536l.m120488h(zVar, "binding.interestSection");
        m74853p4(this, zVar, C34646b.m101748b("deposits.interest.calc", new Object[0]), m74786I3(), C20213e.INTEREST, false, 16, (Object) null);
        C29738z zVar2 = m74775A3().f75054f;
        C41536l.m120488h(zVar2, "binding.additionalFunctionsSection");
        m74853p4(this, zVar2, C34646b.m101748b("deposit.additional.functions", new Object[0]), m74868y3(), C20213e.ADDITIONAL_FUNCTIONS, false, 16, (Object) null);
        C29738z zVar3 = m74775A3().f75057i;
        C41536l.m120488h(zVar3, "binding.depositDetailsSection");
        m74853p4(this, zVar3, C34646b.m101748b("deposit.details", new Object[0]), m74777C3(), C20213e.DEPOSIT_DETAILS, false, 16, (Object) null);
        C29738z zVar4 = m74775A3().f75058j;
        C41536l.m120488h(zVar4, "binding.depositOperationsSection");
        m74851o4(zVar4, C34646b.m101748b("deposits.transactions", new Object[0]), m74778D3(), C20213e.OPERATIONS, false);
        m74775A3().f75056h.setAdapter(m74869z3());
        m74775A3().f75056h.setItemAnimator((RecyclerView.C1742m) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m74858s3(DepositDetailsActivity depositDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        DepositProlongationTypeResultModel depositProlongationTypeResultModel = (DepositProlongationTypeResultModel) bundle.getParcelable("ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeActionSheet.REQUEST_TAG");
        if (depositProlongationTypeResultModel != null) {
            depositDetailsActivity.m74790K3().mo65739xw().mo65673B7(depositProlongationTypeResultModel.mo58180a());
        }
    }

    /* renamed from: s4 */
    private final void m74859s4() {
        C29720h A3 = m74775A3();
        A3.f75060l.setAdapter(m74783G3());
        A3.f75065q.setButtonVisible(true);
        m74849n4();
        m74857r4();
        m74860t3();
    }

    /* renamed from: t3 */
    private final void m74860t3() {
        C29720h A3 = m74775A3();
        A3.f75064p.getViewTreeObserver().addOnScrollChangedListener(new C23168o(this));
        A3.f75067s.setOnClickListener(new C23169p(this));
        A3.f75065q.setOnButtonClicked(new C37617t(1000, new C23087b(this)));
        m74854q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public final void m74861t4(C20214f fVar) {
        C41238w wVar;
        InlineFeedback2 inlineFeedback2 = m74775A3().f75065q;
        if (fVar != null) {
            C41536l.m120488h(inlineFeedback2, "updateDepositProlongationInfo$lambda$13$lambda$12");
            C32343x.m95407O0(inlineFeedback2);
            inlineFeedback2.setDescription(fVar.mo48638c());
            inlineFeedback2.setButtonText(fVar.mo48637b());
            inlineFeedback2.setStatus(fVar.mo48640e());
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            C41536l.m120488h(inlineFeedback2, "updateDepositProlongationInfo$lambda$13");
            C32343x.m95401L0(inlineFeedback2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m74862u3(DepositDetailsActivity depositDetailsActivity) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        depositDetailsActivity.m74790K3().mo65739xw().mo65680j2();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public final void m74863u4(boolean z) {
        boolean z2;
        boolean canScrollVertically = m74775A3().f75064p.canScrollVertically(-1);
        ToolbarView toolbarView = m74775A3().f75049C;
        boolean z3 = false;
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
    /* renamed from: v3 */
    public static final void m74864v3(DepositDetailsActivity depositDetailsActivity, View view) {
        C41536l.m120489i(depositDetailsActivity, "this$0");
        depositDetailsActivity.m74790K3().onRefresh(1);
    }

    /* renamed from: v4 */
    static /* synthetic */ void m74865v4(DepositDetailsActivity depositDetailsActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        depositDetailsActivity.m74863u4(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m74866w3(C20215g gVar) {
        C32303f.m95195f(gVar.mo48646b(), this, gVar.mo48645a(), "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m74867x3(C29738z zVar, List list) {
        C19702h hVar;
        RecyclerView.C1736h adapter = zVar.f75165h.getAdapter();
        if (adapter instanceof C19702h) {
            hVar = (C19702h) adapter;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.mo6029i(list);
        }
        LayerView c = zVar.mo3946b();
        C41536l.m120488h(c, "section.root");
        C32343x.m95483r1(c, !list.isEmpty(), false, 2, (Object) null);
    }

    /* renamed from: y3 */
    private final C19702h m74868y3() {
        return (C19702h) this.f60617M.getValue();
    }

    /* renamed from: z3 */
    private final C19695c m74869z3() {
        return (C19695c) this.f60620P.getValue();
    }

    /* renamed from: F3 */
    public final C26423k mo57765F3() {
        C26423k kVar = this.f60611G;
        if (kVar != null) {
            return kVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: H3 */
    public Void mo57766H3() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        m74792L3();
        setContentView((View) m74775A3().mo3946b());
        super.mo37451O1(bundle);
        m74859s4();
        m74843l1();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10019) {
            m74790K3().onRefresh(6);
        }
    }

    /* renamed from: z1 */
    public /* bridge */ /* synthetic */ String mo38120z1() {
        return (String) mo57766H3();
    }
}

package p341ge.bog.mobilebank.cleanarch.presentation.p766zk;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h60.C24883a;
import he1.C41217g;
import he1.C41238w;
import i60.C25123a;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p341ge.bog.mobilebank.cleanarch.presentation.p766zk.iframe.ZkIFrameActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p794ix.C25265a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity */
public final class ZkUmtsCardsListActivity extends C30772sa {

    /* renamed from: L */
    public static final C22466a f59447L = new C22466a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59448F = C41219i.m119470b(new C22468c(this));

    /* renamed from: G */
    private final C41217g f59449G = C41219i.m119470b(new C22472g(this));

    /* renamed from: H */
    private final C41217g f59450H = C41219i.m119470b(new C22467b(this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C25123a f59451I = new C25123a();

    /* renamed from: J */
    private MoneyTransferTypeUiModel f59452J;

    /* renamed from: K */
    private final C41217g f59453K = new C1617p0(C41520a0.m120436b(ZkUmtsCardsListViewModel.class), new C22475j(this), new C22474i(this), new C22476k((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$a */
    public static final class C22466a {
        private C22466a() {
        }

        public /* synthetic */ C22466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55468a(Context context, MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(moneyTransferTypeUiModel, "transferModel");
            Intent intent = new Intent(context, ZkUmtsCardsListActivity.class);
            intent.putExtra("MONEY_TRANSFER_TYPE", moneyTransferTypeUiModel);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$b */
    static final class C22467b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22467b(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(0);
            this.f59454d = zkUmtsCardsListActivity;
        }

        /* renamed from: b */
        public final StateView invoke() {
            return (StateView) this.f59454d.findViewById(C10322k.f28746Hv);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$c */
    static final class C22468c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22468c(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(0);
            this.f59455d = zkUmtsCardsListActivity;
        }

        /* renamed from: b */
        public final InfoMessageView invoke() {
            return (InfoMessageView) this.f59455d.findViewById(C10322k.error_message_view);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$d */
    static final class C22469d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22469d(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(1);
            this.f59456d = zkUmtsCardsListActivity;
        }

        /* renamed from: a */
        public final void mo55471a(List list) {
            C41536l.m120489i(list, "it");
            if (list.isEmpty()) {
                this.f59456d.m72855I2().mo53598f();
            } else {
                this.f59456d.m72855I2().mo53595c();
            }
            this.f59456d.f59451I.mo63673i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55471a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$e */
    static final class C22470e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22470e(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(1);
            this.f59457d = zkUmtsCardsListActivity;
        }

        /* renamed from: a */
        public final void mo55472a(boolean z) {
            if (z) {
                this.f59457d.f59451I.mo63673i((List) null);
                this.f59457d.m72855I2().mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55472a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$f */
    static final class C22471f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22471f(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(1);
            this.f59458d = zkUmtsCardsListActivity;
        }

        /* renamed from: a */
        public final void mo55473a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59458d.m72855I2().mo53596d();
            this.f59458d.f59451I.mo63673i((List) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55473a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$g */
    static final class C22472g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22472g(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(0);
            this.f59459d = zkUmtsCardsListActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f59459d.findViewById(C10322k.content_recycler_view);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$h */
    static final class C22473h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ZkUmtsCardsListActivity f59460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22473h(ZkUmtsCardsListActivity zkUmtsCardsListActivity) {
            super(1);
            this.f59460d = zkUmtsCardsListActivity;
        }

        /* renamed from: a */
        public final void mo55475a(C25265a aVar) {
            C41536l.m120489i(aVar, "it");
            ZkIFrameActivity.f59471K.mo55487a(this.f59460d, aVar);
            this.f59460d.m72858L2().mo55478mw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55475a((C25265a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$i */
    public static final class C22474i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22474i(ComponentActivity componentActivity) {
            super(0);
            this.f59461d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59461d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$j */
    public static final class C22475j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22475j(ComponentActivity componentActivity) {
            super(0);
            this.f59462d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59462d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListActivity$k */
    public static final class C22476k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59463d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59464e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22476k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59463d = aVar;
            this.f59464e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59463d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59464e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final StateView m72855I2() {
        Object value = this.f59450H.getValue();
        C41536l.m120488h(value, "<get-contentView>(...)");
        return (StateView) value;
    }

    /* renamed from: J2 */
    private final InfoMessageView m72856J2() {
        Object value = this.f59448F.getValue();
        C41536l.m120488h(value, "<get-errorMessageView>(...)");
        return (InfoMessageView) value;
    }

    /* renamed from: K2 */
    private final RecyclerView m72857K2() {
        Object value = this.f59449G.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final ZkUmtsCardsListViewModel m72858L2() {
        return (ZkUmtsCardsListViewModel) this.f59453K.getValue();
    }

    /* renamed from: M2 */
    private final void m72859M2() {
        C21484c.m69411c(m72858L2().mo55477lw(), this, new C22469d(this), new C22470e(this), new C22471f(this));
    }

    /* renamed from: N2 */
    private final void m72860N2() {
        this.f59451I.mo63672h(new C22473h(this));
    }

    /* renamed from: O2 */
    private final void m72861O2() {
        m72856J2().setOnClickListener(new C24883a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m72862P2(ZkUmtsCardsListActivity zkUmtsCardsListActivity, View view) {
        C41536l.m120489i(zkUmtsCardsListActivity, "this$0");
        ZkUmtsCardsListViewModel L2 = zkUmtsCardsListActivity.m72858L2();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = zkUmtsCardsListActivity.f59452J;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        L2.mo55476hw(moneyTransferTypeUiModel.mo53145d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_zk_umts_cards;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m72857K2().setLayoutManager(new LinearLayoutManager(this));
        m72857K2().setAdapter(this.f59451I);
        m72859M2();
        m72860N2();
        m72861O2();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("MONEY_TRANSFER_TYPE");
        C41536l.m120486f(parcelableExtra);
        this.f59452J = (MoneyTransferTypeUiModel) parcelableExtra;
        ZkUmtsCardsListViewModel L2 = m72858L2();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f59452J;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        L2.mo55476hw(moneyTransferTypeUiModel.mo53145d());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.main_activity_burger_menu_receive_transfers);
        C41536l.m120488h(string, "getString(R.string.main_…r_menu_receive_transfers)");
        return string;
    }
}

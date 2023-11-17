package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.utils.Utils;
import g91.C32286a1;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import j21.C36699b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37224b;
import o00.C26656a;
import o00.C26657b;
import o31.C37613p;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.mobilebank.cardapplications.data.model.OrderCardParamsObject;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegisterResultUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p363bh.C10282f;
import p383cn.C10516d;
import p392dh.C12129b;
import p411em.C12484a;
import p411em.C12488e;
import p412en.C12550j3;
import p412en.C12613q2;
import p412en.C12651r2;
import p412en.C12657s2;
import p420fh.C12902d;
import p420fh.C12910e;
import p481jm.C16233l;
import p593rm.C17646a0;
import p593rm.C17648b0;
import p593rm.C17650c0;
import p593rm.C17671v;
import p593rm.C17672w;
import p593rm.C17673x;
import p593rm.C17674y;
import p593rm.C17675z;
import p634um.C18188b0;
import p634um.C18220m;
import p634um.C18240p;
import p674xm.C18795c;
import p674xm.C18796d;
import p674xm.C18813o;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity */
public final class OrderDebitCardActivity extends C14088d implements C26656a, C41185v.C41186a, C26657b {

    /* renamed from: K */
    public static final C14046a f41454K = new C14046a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C12613q2 f41455G;

    /* renamed from: H */
    private final C41217g f41456H = C41219i.m119470b(new C14070r(this));

    /* renamed from: I */
    private final C41217g f41457I = C41219i.m119470b(new C14049b0(this));

    /* renamed from: J */
    private final C41217g f41458J = new C1617p0(C41520a0.m120436b(C12550j3.class), new C14053d0(this), new C14057f0(this), new C14055e0((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$a */
    public static final class C14046a {
        private C14046a() {
        }

        public /* synthetic */ C14046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39139a(Context context, OrderDebitCardData orderDebitCardData, C0173b bVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(orderDebitCardData, "data");
            C41536l.m120489i(bVar, "launcher");
            bVar.mo404a(C37613p.m110614a(new Intent(context, OrderDebitCardActivity.class), C41233s.m119492a("ARG_ORDER_DATA", orderDebitCardData)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$a0 */
    public static final class C14047a0 implements C12129b {
        C14047a0() {
        }

        /* renamed from: c */
        public String mo26885a(RegionUiModel regionUiModel) {
            C41536l.m120489i(regionUiModel, "item");
            return C32343x.m95388F(regionUiModel.mo39836d(), new Object[0]);
        }

        /* renamed from: d */
        public String mo26886b(RegionUiModel regionUiModel) {
            C41536l.m120489i(regionUiModel, "item");
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$b */
    public /* synthetic */ class C14048b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41459a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41460b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                xm.p[] r0 = p674xm.C18814p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                xm.p r2 = p674xm.C18814p.DISABLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                xm.p r3 = p674xm.C18814p.ENABLED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xm.p r3 = p674xm.C18814p.LOADING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41459a = r0
                cn.c[] r0 = p383cn.C10515c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.c r3 = p383cn.C10515c.PICKUP_DETAILS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                cn.c r1 = p383cn.C10515c.SUMMARY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f41460b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity.C14048b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$b0 */
    static final class C14049b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14049b0(OrderDebitCardActivity orderDebitCardActivity) {
            super(0);
            this.f41461d = orderDebitCardActivity;
        }

        /* renamed from: b */
        public final OrderDebitCardData invoke() {
            Intent intent = this.f41461d.getIntent();
            if (intent != null) {
                return (OrderDebitCardData) intent.getParcelableExtra("ARG_ORDER_DATA");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$c */
    /* synthetic */ class C14050c extends C41535k implements C43075l {
        C14050c(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "openPreContract", "openPreContract(Lge/bog/mobilebank/domain/precontract/model/PreContract;)V", 0);
        }

        /* renamed from: b */
        public final void mo39143b(C25950a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52139D3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39143b((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$c0 */
    static final class C14051c0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41462a;

        C14051c0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41462a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41462a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41462a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$d */
    /* synthetic */ class C14052d extends C41535k implements C43075l {
        C14052d(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "showScaDialog", "showScaDialog(Lge/bog/mobilebank/cardapplications/data/model/OrderCardParamsObject;)V", 0);
        }

        /* renamed from: b */
        public final void mo39146b(OrderCardParamsObject orderCardParamsObject) {
            C41536l.m120489i(orderCardParamsObject, "p0");
            ((OrderDebitCardActivity) this.receiver).m52151J3(orderCardParamsObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39146b((OrderCardParamsObject) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$d0 */
    public static final class C14053d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14053d0(ComponentActivity componentActivity) {
            super(0);
            this.f41463d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41463d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$e */
    /* synthetic */ class C14054e extends C41535k implements C43075l {
        C14054e(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "onRegisterCardResult", "onRegisterCardResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39147b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52190w3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39147b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$e0 */
    public static final class C14055e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41464d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41465e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14055e0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41464d = aVar;
            this.f41465e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41464d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41465e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$f */
    static final class C14056f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14056f(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41466d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39148a(OrderCardResult orderCardResult) {
            C41536l.m120489i(orderCardResult, "it");
            OrderCardResultActivity.f41431N.mo39121a(this.f41466d, orderCardResult);
            this.f41466d.setResult(3);
            this.f41466d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39148a((OrderCardResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$f0 */
    static final class C14057f0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41467d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$f0$a */
        static final class C14058a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ OrderDebitCardActivity f41468d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14058a(OrderDebitCardActivity orderDebitCardActivity) {
                super(0);
                this.f41468d = orderDebitCardActivity;
            }

            /* renamed from: b */
            public final C12550j3 invoke() {
                OrderDebitCardData N2 = this.f41468d.m52185r3();
                boolean z = false;
                String str = null;
                if (N2 != null) {
                    OrderDebitCardActivity orderDebitCardActivity = this.f41468d;
                    ProgressBarView progressBarView = orderDebitCardActivity.m52181m3().f45907l;
                    C41536l.m120488h(progressBarView, "binding.orderProgressStep3");
                    C32343x.m95483r1(progressBarView, !N2.mo39786f(), false, 2, (Object) null);
                    C12550j3 a = orderDebitCardActivity.mo39138o3().mo32565a(N2);
                    if (a != null) {
                        return a;
                    }
                }
                C12613q2 o3 = this.f41468d.mo39138o3();
                OrderDebitCardData N22 = this.f41468d.m52185r3();
                if (N22 != null) {
                    z = N22.mo39787g();
                }
                boolean z2 = z;
                CardApplicationTypeData.StandardCardData standardCardData = new CardApplicationTypeData.StandardCardData((String) null, (StringSource) null, 3, (DefaultConstructorMarker) null);
                OrderDebitCardData N23 = this.f41468d.m52185r3();
                if (N23 != null) {
                    str = N23.mo39784e();
                }
                C12550j3 a2 = o3.mo32565a(new OrderDebitCardData("", false, z2, standardCardData, str, ""));
                this.f41468d.finish();
                return a2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14057f0(OrderDebitCardActivity orderDebitCardActivity) {
            super(0);
            this.f41467d = orderDebitCardActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C14058a(this.f41467d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$g */
    /* synthetic */ class C14059g extends C41535k implements C43075l {
        C14059g(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "openRegionChooserActionSheet", "openRegionChooserActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39150b(List list) {
            C41536l.m120489i(list, "p0");
            ((OrderDebitCardActivity) this.receiver).m52141E3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39150b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$h */
    /* synthetic */ class C14060h extends C41535k implements C43075l {
        C14060h(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "openCardLimitChooserActionSheet", "openCardLimitChooserActionSheet(Lge/bog/mobilebank/cardapplications/presentation/model/CardDailyLimitData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39151b(C18795c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52137B3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39151b((C18795c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$i */
    /* synthetic */ class C14061i extends C41535k implements C43075l {
        C14061i(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "onResourcesResult", "onResourcesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39152b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52192y3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39152b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$j */
    static final class C14062j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14062j(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41469d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39153a(C10516d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f41469d.m52193z3(dVar, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39153a((C10516d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$k */
    static final class C14063k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14063k(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41470d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39154a(C10516d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f41470d.m52193z3(dVar, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39154a((C10516d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$l */
    static final class C14064l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14064l(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41471d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39155a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f41471d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39155a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$m */
    /* synthetic */ class C14065m extends C41535k implements C43075l {
        C14065m(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "setNextButtonData", "setNextButtonData(Lge/bog/mobilebank/cardapplications/presentation/model/NextButtonData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39156b(C18813o oVar) {
            C41536l.m120489i(oVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52143F3(oVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39156b((C18813o) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$n */
    /* synthetic */ class C14066n extends C41535k implements C43075l {
        C14066n(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "setStepData", "setStepData(Lge/bog/mobilebank/cardapplications/presentation/model/ordersteps/OrderDebitCardStepData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39157b(C10516d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52147H3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39157b((C10516d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$o */
    /* synthetic */ class C14067o extends C41535k implements C43075l {
        C14067o(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "openPhoneNumberSelector", "openPhoneNumberSelector(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39158b(List list) {
            C41536l.m120489i(list, "p0");
            ((OrderDebitCardActivity) this.receiver).m52138C3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39158b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$p */
    /* synthetic */ class C14068p extends C41535k implements C43075l {
        C14068p(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "openCardInsuranceActionSheet", "openCardInsuranceActionSheet(Lge/bog/mobilebank/cardapplications/presentation/model/CardOrderInsuranceData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39159b(C18796d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52136A3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39159b((C18796d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$q */
    /* synthetic */ class C14069q extends C41535k implements C43075l {
        C14069q(Object obj) {
            super(1, obj, OrderDebitCardActivity.class, "onDeliveryFeesResult", "onDeliveryFeesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39160b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderDebitCardActivity) this.receiver).m52188u3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39160b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$r */
    static final class C14070r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14070r(OrderDebitCardActivity orderDebitCardActivity) {
            super(0);
            this.f41472d = orderDebitCardActivity;
        }

        /* renamed from: b */
        public final C16233l invoke() {
            return C16233l.m57865d(this.f41472d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$s */
    static final class C14071s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41473d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$s$a */
        static final class C14072a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderDebitCardActivity f41474d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14072a(OrderDebitCardActivity orderDebitCardActivity) {
                super(1);
                this.f41474d = orderDebitCardActivity;
            }

            /* renamed from: a */
            public final void mo39163a(Object obj) {
                FrameLayout frameLayout = this.f41474d.m52181m3().f45903h;
                C41536l.m120488h(frameLayout, "binding.loader");
                C32343x.m95455i0(frameLayout);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39163a(obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$s$b */
        static final class C14073b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderDebitCardActivity f41475d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14073b(OrderDebitCardActivity orderDebitCardActivity) {
                super(1);
                this.f41475d = orderDebitCardActivity;
            }

            /* renamed from: a */
            public final void mo39164a(Object obj) {
                FrameLayout frameLayout = this.f41475d.m52181m3().f45903h;
                C41536l.m120488h(frameLayout, "binding.loader");
                C32343x.m95447f1(frameLayout);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39164a(obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$s$c */
        static final class C14074c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderDebitCardActivity f41476d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14074c(OrderDebitCardActivity orderDebitCardActivity) {
                super(1);
                this.f41476d = orderDebitCardActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                FrameLayout frameLayout = this.f41476d.m52181m3().f45903h;
                C41536l.m120488h(frameLayout, "binding.loader");
                C32343x.m95455i0(frameLayout);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14071s(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41473d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39162a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14072a(this.f41473d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14073b(this.f41473d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14074c(this.f41473d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39162a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$t */
    static final class C14075t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14075t(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41477d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39166a(String str) {
            this.f41477d.m52189v3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39166a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$u */
    static final class C14076u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14076u(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41478d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39167a(String str) {
            C41536l.m120489i(str, "it");
            this.f41478d.m52189v3(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39167a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$v */
    static final class C14077v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14077v(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41479d = orderDebitCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41479d.m52189v3(false);
            this.f41479d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$w */
    static final class C14078w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14078w(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41480d = orderDebitCardActivity;
        }

        /* renamed from: a */
        public final void mo39169a(DebitCardRegisterResultUiModel debitCardRegisterResultUiModel) {
            OrderDebitCardActivity.m52191x3(this.f41480d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39169a((DebitCardRegisterResultUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$x */
    static final class C14079x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14079x(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41481d = orderDebitCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41481d.mo74709H1(th);
            OrderDebitCardActivity.m52191x3(this.f41481d, false);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$y */
    static final class C14080y extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14080y f41482d = new C14080y();

        C14080y() {
            super(1);
        }

        /* renamed from: a */
        public final void mo39171a(DebitCardRegisterResultUiModel debitCardRegisterResultUiModel) {
            C41536l.m120489i(debitCardRegisterResultUiModel, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39171a((DebitCardRegisterResultUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity$z */
    static final class C14081z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderDebitCardActivity f41483d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14081z(OrderDebitCardActivity orderDebitCardActivity) {
            super(1);
            this.f41483d = orderDebitCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            ConstraintLayout constraintLayout = this.f41483d.m52181m3().f45900e;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
            this.f41483d.m52181m3().f45901f.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m52136A3(C18796d dVar) {
        C38125h.m112238c(this).mo91612k((Long) null, dVar.mo46614a(), dVar.mo46615b()).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m52137B3(C18795c cVar) {
        C36699b.C36700a.m108859b(C36699b.f88582P, cVar.mo46609a(), cVar.mo46610b(), false, (Long) null, (String) null, (String) null, 60, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m52138C3(List list) {
        C10282f e = C10282f.C10283a.m37495e(C10282f.f28515F, new SelectorConfig(C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_DELIVERY_PHONE", false, false, 446, (DefaultConstructorMarker) null), (C12129b) null, 2, (Object) null);
        e.mo26881q2(list);
        e.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m52139D3(C25950a aVar) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, aVar.mo64864a(), false, C32343x.m95388F("text.card.applications.button.pre.contract.agree", new Object[0]), (ArrayList) null, (Summary) null, mo38120z1(), 26, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m52141E3(List list) {
        C10282f c = C10282f.f28515F.mo26883c(new SelectorConfig(C32343x.m95388F("applications.student.card.details.region.label", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_STUDENT_REGION", false, false, 446, (DefaultConstructorMarker) null), new C14047a0());
        c.mo26881q2(list);
        c.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public final void m52143F3(C18813o oVar) {
        FixedButtonCheckboxView fixedButtonCheckboxView = m52181m3().f45904i;
        C32343x.m95483r1(fixedButtonCheckboxView.getCheckbox(), oVar.mo46663a(), false, 2, (Object) null);
        fixedButtonCheckboxView.getButton().setButtonText(oVar.mo46665c());
        fixedButtonCheckboxView.getButton().setLoading(false);
        int i = C14048b.f41459a[oVar.mo46664b().ordinal()];
        if (i == 1) {
            m52145G3(fixedButtonCheckboxView, false);
        } else if (i == 2) {
            m52145G3(fixedButtonCheckboxView, true);
        } else if (i == 3) {
            fixedButtonCheckboxView.getButton().setLoading(true);
        }
    }

    /* renamed from: G3 */
    private static final void m52145G3(FixedButtonCheckboxView fixedButtonCheckboxView, boolean z) {
        fixedButtonCheckboxView.setEnabled(z);
        fixedButtonCheckboxView.getButton().setEnabled(z);
        fixedButtonCheckboxView.setClickable(z);
        fixedButtonCheckboxView.setFocusable(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public final void m52147H3(C10516d dVar) {
        ProgressBarView progressBarView;
        int d = dVar.mo27240d();
        if (d == 1) {
            progressBarView = m52181m3().f45905j;
        } else if (d != 2) {
            progressBarView = m52181m3().f45907l;
        } else {
            progressBarView = m52181m3().f45906k;
        }
        progressBarView.setProgress(dVar.mo27241e());
    }

    /* renamed from: I3 */
    private final void m52149I3() {
        for (ProgressBarView progress : C41341q.m119910m(m52181m3().f45905j, m52181m3().f45906k, m52181m3().f45907l)) {
            progress.setProgress(Utils.FLOAT_EPSILON);
        }
        FixedButtonCheckboxView fixedButtonCheckboxView = m52181m3().f45904i;
        fixedButtonCheckboxView.getButton().setButtonText(C32343x.m95388F("text.card.applications.button.next", new Object[0]));
        fixedButtonCheckboxView.getCheckbox().mo35145g(C32343x.m95388F("text.card.applications.agree", new Object[0]), C32343x.m95388F("text.card.applications.agree.with.terms", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m52151J3(OrderCardParamsObject orderCardParamsObject) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, orderCardParamsObject.getServiceId(), m52186s3().mo33228rx(orderCardParamsObject), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: c3 */
    private final void m52170c3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_DELIVERY_PHONE", this, new C17675z(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_INSURANCE", this, new C17646a0(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_STUDENT_REGION", this, new C17648b0(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CARD_LIMIT", this, new C17650c0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m52171d3(OrderDebitCardActivity orderDebitCardActivity, String str, Bundle bundle) {
        List list;
        Object Y;
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("SELECTOR_RESULT_KEY");
        if (serializable instanceof List) {
            list = (List) serializable;
        } else {
            list = null;
        }
        if (list != null && (Y = C41358y.m120009Y(list)) != null) {
            orderDebitCardActivity.m52186s3().mo33224px().mo33180C2(Y.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m52172e3(OrderDebitCardActivity orderDebitCardActivity, String str, Bundle bundle) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        orderDebitCardActivity.m52186s3().mo33224px().mo33214jc(bundle.getString("RESULT_KEY_INSURANCE_TYPE"), bundle.getBoolean("RESULT_KEY_SELECTED_NO_INSURANCE", false));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m52173f3(OrderDebitCardActivity orderDebitCardActivity, String str, Bundle bundle) {
        RegionUiModel regionUiModel;
        String b;
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SELECTOR_RESULT_KEY");
        if (parcelableArrayList != null && (regionUiModel = (RegionUiModel) C41358y.m120009Y(parcelableArrayList)) != null && (b = regionUiModel.mo39835b()) != null) {
            orderDebitCardActivity.m52186s3().mo33224px().mo33190Hh(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m52174g3(OrderDebitCardActivity orderDebitCardActivity, String str, Bundle bundle) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardDailyLimitUiModel cardDailyLimitUiModel = (CardDailyLimitUiModel) bundle.getParcelable("RESULT_KEY_CHOSEN_CARD_LIMIT");
        if (cardDailyLimitUiModel != null) {
            orderDebitCardActivity.m52186s3().mo33224px().mo33206e1(cardDailyLimitUiModel);
        }
    }

    /* renamed from: h3 */
    private final void m52175h3() {
        m52181m3().f45908m.setOnClickListener(new C17671v(this));
        FixedButtonCheckboxView fixedButtonCheckboxView = m52181m3().f45904i;
        fixedButtonCheckboxView.getButton().setOnClickListener(new C17672w(this));
        fixedButtonCheckboxView.getCheckbox().setOnCheckedStateChangeListener(new C17673x(this));
        fixedButtonCheckboxView.getCheckbox().setTextClickListener(new C17674y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m52176i3(OrderDebitCardActivity orderDebitCardActivity, View view) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        orderDebitCardActivity.m52186s3().mo33224px().mo33226r();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m52177j3(OrderDebitCardActivity orderDebitCardActivity, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        orderDebitCardActivity.m52186s3().mo33224px().mo33230t1(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m52178k3(OrderDebitCardActivity orderDebitCardActivity) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C32303f.m95184D(C32343x.m95388F("link.terms.and.conditions", new Object[0]), orderDebitCardActivity);
    }

    /* renamed from: l1 */
    private final void m52179l1() {
        C12657s2 sx = m52186s3().mo33229sx();
        sx.mo33201X9().mo4819k(this, new C14051c0(new C14061i(this)));
        C37224b.m109963b(sx.mo33240zj(), this, new C14062j(this));
        C37224b.m109963b(sx.mo33207e8(), this, new C14063k(this));
        C37224b.m109963b(sx.mo33187F(), this, new C14064l(this));
        sx.mo33192J1().mo4819k(this, new C14051c0(new C14065m(this)));
        sx.mo33194K9().mo4819k(this, new C14051c0(new C14066n(this)));
        C37224b.m109963b(sx.mo33233vu(), this, new C14067o(this));
        C37224b.m109963b(sx.mo33232va(), this, new C14068p(this));
        sx.mo33227rf().mo4819k(this, new C14051c0(new C14069q(this)));
        m52187t3(sx.mo33222pl());
        C37224b.m109963b(sx.mo33234w2(), this, new C14050c(this));
        C37224b.m109963b(sx.mo33205a0(), this, new C14052d(this));
        sx.mo33215ko().mo4819k(this, new C14051c0(new C14054e(this)));
        C37224b.m109963b(sx.mo33208ep(), this, new C14056f(this));
        C37224b.m109963b(sx.mo33198Sl(), this, new C14059g(this));
        m52187t3(sx.mo33204Zh());
        C37224b.m109963b(sx.mo33181C4(), this, new C14060h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m52180l3(OrderDebitCardActivity orderDebitCardActivity, View view) {
        C41536l.m120489i(orderDebitCardActivity, "this$0");
        C21481a.onRefresh$default(orderDebitCardActivity.m52186s3(), 0, 1, (Object) null);
        ConstraintLayout constraintLayout = orderDebitCardActivity.m52181m3().f45900e;
        C41536l.m120488h(constraintLayout, "binding.errorContainer");
        C32343x.m95455i0(constraintLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final C16233l m52181m3() {
        return (C16233l) this.f41456H.getValue();
    }

    /* renamed from: n3 */
    private final C18240p m52182n3() {
        C18240p pVar;
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DETAILS");
        if (k0 instanceof C18240p) {
            pVar = (C18240p) k0;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            return C18240p.f51558j.mo45894a();
        }
        return pVar;
    }

    /* renamed from: p3 */
    private final C18220m m52183p3() {
        C18220m mVar;
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DETAILS");
        if (k0 instanceof C18220m) {
            mVar = (C18220m) k0;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return C18220m.f51542j.mo45875a();
        }
        return mVar;
    }

    /* renamed from: q3 */
    private final C18188b0 m52184q3() {
        C18188b0 b0Var;
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DETAILS");
        if (k0 instanceof C18188b0) {
            b0Var = (C18188b0) k0;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            return C18188b0.f51511l.mo45850a();
        }
        return b0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final OrderDebitCardData m52185r3() {
        return (OrderDebitCardData) this.f41457I.getValue();
    }

    /* renamed from: s3 */
    private final C12550j3 m52186s3() {
        return (C12550j3) this.f41458J.getValue();
    }

    /* renamed from: t3 */
    private final void m52187t3(LiveData liveData) {
        liveData.mo4819k(this, new C14051c0(new C14071s(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m52188u3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14075t(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14076u(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14077v(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m52189v3(boolean z) {
        FrameLayout frameLayout = m52181m3().f45903h;
        C41536l.m120488h(frameLayout, "binding.loader");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m52190w3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14078w(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14079x(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, C14080y.f41482d, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m52191x3(OrderDebitCardActivity orderDebitCardActivity, boolean z) {
        orderDebitCardActivity.m52189v3(z);
        orderDebitCardActivity.m52181m3().f45904i.getButton().setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m52192y3(C31128a aVar) {
        C31132b.m92643e(aVar, (int[]) null, new C14081z(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final void m52193z3(C10516d dVar, boolean z) {
        Fragment fragment;
        int i;
        int i2 = C14048b.f41460b[dVar.mo27239c().ordinal()];
        if (i2 == 1) {
            fragment = m52184q3();
        } else if (i2 != 2) {
            fragment = m52183p3();
        } else {
            fragment = m52182n3();
        }
        if (z) {
            i = C12484a.f37155a;
        } else {
            i = C12484a.f37156b;
        }
        C1493e0 p = getSupportFragmentManager().mo4428p();
        p.mo4642u(i, 0, 0, 0);
        p.mo4640s(C12488e.f37173A0, fragment, "FRAGMENT_TAG_DETAILS");
        p.mo4515i();
    }

    /* renamed from: C */
    public void mo39136C() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m52186s3().mo33224px().mo33188G7(str, str2, str3);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C41185v g0 = C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m52181m3().mo3946b());
        super.mo37451O1(bundle);
        m52149I3();
        m52179l1();
        m52175h3();
        C1493e0 p = getSupportFragmentManager().mo4428p();
        p.mo4640s(C12488e.f37173A0, m52183p3(), "FRAGMENT_TAG_DETAILS");
        p.mo4515i();
        m52170c3();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C41238w wVar = null;
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo66413u2(str);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo66414v2(z);
        }
    }

    /* renamed from: m */
    public void mo39137m() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
        C12651r2.C12652a.m48081a(m52186s3().mo33224px(), (String) null, (String) null, (String) null, 7, (Object) null);
    }

    /* renamed from: o3 */
    public final C12613q2 mo39138o3() {
        C12613q2 q2Var = this.f41455G;
        if (q2Var != null) {
            return q2Var;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onBackPressed() {
        m52186s3().mo33224px().mo33216l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0 != null) goto L_0x0024;
     */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo38120z1() {
        /*
            r3 = this;
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r0 = r3.m52185r3()
            if (r0 == 0) goto L_0x0022
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r0 = r0.mo39780a()
            if (r0 == 0) goto L_0x0022
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r1 = r0.mo39286a()
            if (r1 == 0) goto L_0x0013
            r0 = r1
        L_0x0013:
            ge.bog.mobilebank.shared.helper.StringSource r0 = r0.mo39287b()
            if (r0 == 0) goto L_0x0022
            r1 = 1
            r2 = 0
            java.lang.String r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101752f(r0, r2, r1, r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            java.lang.String r0 = "text.card.applications.card.application.header"
        L_0x0024:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity.mo38120z1():java.lang.String");
    }
}

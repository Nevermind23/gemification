package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.C13962i;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p352ak.C9952k4;
import p369bn.C10337a;
import p369bn.C10338b;
import p369bn.C10339c;
import p380ck.C10464h;
import p398dn.C12326a;
import p411em.C12487d;
import p412en.C12602p;
import p412en.C12615r;
import p412en.C12687y;
import p481jm.C16229h;
import p537nm.C17105v;
import p593rm.C17657h;
import p593rm.C17658i;
import p593rm.C17659j;
import p593rm.C17660k;
import p593rm.C17661l;
import p593rm.C17662m;
import p621tm.C17994c;
import p621tm.C18000f;
import p629uh.C18167d;
import p642vh.C18338b0;
import p674xm.C18797e;
import p674xm.C18836t;
import p709au.C19277a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity */
public final class CardOrderListActivity extends C14084b {

    /* renamed from: O */
    public static final C13998a f41389O = new C13998a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C12602p f41390G;

    /* renamed from: H */
    private final C41217g f41391H = C41219i.m119470b(new C14013k(this));

    /* renamed from: I */
    private final C41217g f41392I = C41219i.m119470b(C14016n.f41412d);

    /* renamed from: J */
    private final C41217g f41393J = new C1617p0(C41520a0.m120436b(C12687y.class), new C14028z(this), new C14005d0(this), new C13999a0((C43064a) null, this));

    /* renamed from: K */
    private final C41217g f41394K = C41219i.m119470b(new C14015m(this));

    /* renamed from: L */
    private final C41217g f41395L = C41219i.m119470b(new C14026x(this));
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C0173b f41396M;

    /* renamed from: N */
    private final C41217g f41397N;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$a */
    public static final class C13998a {
        private C13998a() {
        }

        public /* synthetic */ C13998a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m52073b(C13998a aVar, Context context, CardApplicationTypeData cardApplicationTypeData, C0173b bVar, List list, boolean z, boolean z2, int i, Object obj) {
            aVar.mo39091a(context, cardApplicationTypeData, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
        }

        /* renamed from: a */
        public final void mo39091a(Context context, CardApplicationTypeData cardApplicationTypeData, C0173b bVar, List list, boolean z, boolean z2) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            C41536l.m120489i(cardApplicationTypeData, "typeData");
            Intent a = C37613p.m110614a(new Intent(context, CardOrderListActivity.class), C41233s.m119492a("APP_TYPE", cardApplicationTypeData), C41233s.m119492a("ARGS_CARD_ORDER", list), C41233s.m119492a("DEFAULT_IS_DIGITAL", Boolean.valueOf(z)), C41233s.m119492a("IS_JUNIOR_FLOW", Boolean.valueOf(z2)));
            if (bVar != null) {
                bVar.mo404a(a);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(a);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$a0 */
    public static final class C13999a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41398d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13999a0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41398d = aVar;
            this.f41399e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41398d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41399e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$b */
    public static final class C14000b extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ CardOrderListActivity f41400a;

        C14000b(CardOrderListActivity cardOrderListActivity) {
            this.f41400a = cardOrderListActivity;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f41400a.m52055l3().mo33354Nw().mo33286ym(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$b0 */
    static final class C14001b0 implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C18797e f41401d;

        /* renamed from: e */
        final /* synthetic */ CardOrderListActivity f41402e;

        C14001b0(C18797e eVar, CardOrderListActivity cardOrderListActivity) {
            this.f41401d = eVar;
            this.f41402e = cardOrderListActivity;
        }

        public final void run() {
            int size = this.f41401d.mo46619a().size();
            C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, size, 0, false, false, 14, (Object) null);
            ViewPager2 viewPager2 = this.f41402e.m52049f3().f45860v;
            C41536l.m120488h(viewPager2, "binding.sliderContainer");
            FrameLayout frameLayout = this.f41402e.m52049f3().f45859u;
            C41536l.m120488h(frameLayout, "binding.scrollingIndicator");
            this.f41402e.m52049f3().f45860v.mo6606l(b.mo46116a(viewPager2, frameLayout).mo46118c().mo46123a(size), false);
            this.f41402e.m52049f3().f45860v.mo6606l(this.f41401d.mo46620b(), false);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$c */
    /* synthetic */ class C14002c extends C41535k implements C43075l {
        C14002c(Object obj) {
            super(1, obj, CardOrderListActivity.class, "onDebitCardListResult", "onDebitCardListResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39093b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardOrderListActivity) this.receiver).m52060q3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39093b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$c0 */
    public static final class C14003c0 implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41403d;

        /* renamed from: e */
        final /* synthetic */ C18797e f41404e;

        public C14003c0(CardOrderListActivity cardOrderListActivity, C18797e eVar) {
            this.f41403d = cardOrderListActivity;
            this.f41404e = eVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f41403d.m52049f3().f45860v.setCurrentItem(this.f41404e.mo46620b());
            new Handler(Looper.getMainLooper()).postDelayed(new C14001b0(this.f41404e, this.f41403d), 20);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$d */
    /* synthetic */ class C14004d extends C41535k implements C43075l {
        C14004d(Object obj) {
            super(1, obj, CardOrderListActivity.class, "onCardSelected", "onCardSelected(Lge/bog/mobilebank/cardapplications/presentation/model/ordercard/OrderCardListItem;)V", 0);
        }

        /* renamed from: b */
        public final void mo39095b(C10339c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((CardOrderListActivity) this.receiver).m52057n3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39095b((C10339c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$d0 */
    static final class C14005d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41405d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$d0$a */
        static final class C14006a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardOrderListActivity f41406d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14006a(CardOrderListActivity cardOrderListActivity) {
                super(0);
                this.f41406d = cardOrderListActivity;
            }

            /* renamed from: b */
            public final C12687y invoke() {
                C12602p i3 = this.f41406d.mo39090i3();
                CardApplicationTypeData cardApplicationTypeData = (CardApplicationTypeData) this.f41406d.getIntent().getParcelableExtra("APP_TYPE");
                if (cardApplicationTypeData == null) {
                    cardApplicationTypeData = new CardApplicationTypeData.StandardCardData((String) null, (StringSource) null, 3, (DefaultConstructorMarker) null);
                }
                List stringArrayListExtra = this.f41406d.getIntent().getStringArrayListExtra("ARGS_CARD_ORDER");
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = C41341q.m119907j();
                }
                return i3.mo32561a(cardApplicationTypeData, stringArrayListExtra, this.f41406d.getIntent().getBooleanExtra("DEFAULT_IS_DIGITAL", false), this.f41406d.getIntent().getBooleanExtra("IS_JUNIOR_FLOW", false));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14005d0(CardOrderListActivity cardOrderListActivity) {
            super(0);
            this.f41405d = cardOrderListActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14006a(this.f41405d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$e */
    /* synthetic */ class C14007e extends C41535k implements C43075l {
        C14007e(Object obj) {
            super(1, obj, CardOrderListActivity.class, "onChipCardFees", "onChipCardFees(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39097b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardOrderListActivity) this.receiver).m52058o3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39097b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$f */
    static final class C14008f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14008f(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41407d = cardOrderListActivity;
        }

        /* renamed from: a */
        public final void mo39098a(OrderDebitCardData orderDebitCardData) {
            C41536l.m120489i(orderDebitCardData, "it");
            OrderDebitCardActivity.C14046a aVar = OrderDebitCardActivity.f41454K;
            CardOrderListActivity cardOrderListActivity = this.f41407d;
            aVar.mo39139a(cardOrderListActivity, orderDebitCardData, cardOrderListActivity.f41396M);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39098a((OrderDebitCardData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$g */
    /* synthetic */ class C14009g extends C41535k implements C43075l {
        C14009g(Object obj) {
            super(1, obj, CardOrderListActivity.class, "showInlineFeedback", "showInlineFeedback(Lge/bog/mobilebank/cardapplications/presentation/model/RegionFeedbackUiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo39099b(C18836t tVar) {
            C41536l.m120489i(tVar, "p0");
            ((CardOrderListActivity) this.receiver).m52068y3(tVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39099b((C18836t) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$h */
    static final class C14010h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14010h(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41408d = cardOrderListActivity;
        }

        /* renamed from: a */
        public final void mo39100a(List list) {
            this.f41408d.m52050g3().mo6029i(list);
            Group group = this.f41408d.m52049f3().f45845g;
            C41536l.m120488h(group, "binding.cardTermsGroup");
            C41536l.m120488h(list, "it");
            C32343x.m95483r1(group, !list.isEmpty(), false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39100a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$i */
    /* synthetic */ class C14011i extends C41535k implements C43075l {
        C14011i(Object obj) {
            super(1, obj, CardOrderListActivity.class, "onInstantCardDeliveryResult", "onInstantCardDeliveryResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39101b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardOrderListActivity) this.receiver).m52061r3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39101b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$j */
    /* synthetic */ class C14012j extends C41535k implements C43075l {
        C14012j(Object obj) {
            super(1, obj, CardOrderListActivity.class, "openInstantDeliveryActionSheet", "openInstantDeliveryActionSheet(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39102b(OrderDebitCardData orderDebitCardData) {
            C41536l.m120489i(orderDebitCardData, "p0");
            ((CardOrderListActivity) this.receiver).m52063t3(orderDebitCardData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39102b((OrderDebitCardData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$k */
    static final class C14013k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14013k(CardOrderListActivity cardOrderListActivity) {
            super(0);
            this.f41409d = cardOrderListActivity;
        }

        /* renamed from: b */
        public final C16229h invoke() {
            return C16229h.m57845d(this.f41409d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$l */
    /* synthetic */ class C14014l extends C41535k implements C43064a {

        /* renamed from: d */
        public static final C14014l f41410d = new C14014l();

        C14014l() {
            super(0, C18000f.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: b */
        public final C18000f invoke() {
            return new C18000f();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$m */
    static final class C14015m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14015m(CardOrderListActivity cardOrderListActivity) {
            super(0);
            this.f41411d = cardOrderListActivity;
        }

        /* renamed from: b */
        public final Chip invoke() {
            Chip chip = new Chip(this.f41411d, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(C10337a.DIGITAL.mo26932b(), new Object[0]));
            chip.setChipType(C18167d.CHOICE_CHIP);
            return chip;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$n */
    static final class C14016n extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14016n f41412d = new C14016n();

        C14016n() {
            super(0);
        }

        /* renamed from: b */
        public final C17994c invoke() {
            return new C17994c();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$o */
    static final class C14017o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41413d;

        /* renamed from: e */
        final /* synthetic */ String f41414e;

        /* renamed from: f */
        final /* synthetic */ String f41415f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14017o(CardOrderListActivity cardOrderListActivity, String str, String str2) {
            super(1);
            this.f41413d = cardOrderListActivity;
            this.f41414e = str;
            this.f41415f = str2;
        }

        /* renamed from: a */
        public final void mo39107a(C17105v vVar) {
            CardOrderListActivity.m52059p3(this.f41413d, this.f41414e, this.f41415f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39107a((C17105v) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$p */
    static final class C14018p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41416d;

        /* renamed from: e */
        final /* synthetic */ String f41417e;

        /* renamed from: f */
        final /* synthetic */ String f41418f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14018p(CardOrderListActivity cardOrderListActivity, String str, String str2) {
            super(1);
            this.f41416d = cardOrderListActivity;
            this.f41417e = str;
            this.f41418f = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
            if (r6 != null) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
            if (r1 != null) goto L_0x003f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39108a(p537nm.C17105v r6) {
            /*
                r5 = this;
                java.lang.String r0 = "fees"
                kotlin.jvm.internal.C41536l.m120489i(r6, r0)
                ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity r0 = r5.f41416d
                ge.bog.designsystem.components.chips.Chip r0 = r0.m52051h3()
                nm.t r1 = r6.mo44496a()
                java.lang.String r2 = " - "
                if (r1 == 0) goto L_0x003d
                nm.s r1 = r1.mo44487a()
                if (r1 == 0) goto L_0x003d
                java.lang.String r1 = r5.f41417e
                dn.b r3 = p398dn.C12327b.f36972a
                nm.t r4 = r6.mo44496a()
                kotlin.jvm.internal.C41536l.m120486f(r4)
                java.lang.String r3 = r3.mo32913d(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                if (r1 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                java.lang.String r1 = r5.f41417e
            L_0x003f:
                r0.setChipTitle(r1)
                ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity r0 = r5.f41416d
                ge.bog.designsystem.components.chips.Chip r0 = r0.m52053k3()
                nm.t r1 = r6.mo44497b()
                if (r1 == 0) goto L_0x0078
                nm.s r1 = r1.mo44487a()
                if (r1 == 0) goto L_0x0078
                java.lang.String r1 = r5.f41418f
                dn.b r3 = p398dn.C12327b.f36972a
                nm.t r6 = r6.mo44497b()
                kotlin.jvm.internal.C41536l.m120486f(r6)
                java.lang.String r6 = r3.mo32913d(r6)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r2)
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                if (r6 == 0) goto L_0x0078
                goto L_0x007a
            L_0x0078:
                java.lang.String r6 = r5.f41418f
            L_0x007a:
                r0.setChipTitle(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity.C14018p.mo39108a(nm.v):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39108a((C17105v) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$q */
    static final class C14019q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41419d;

        /* renamed from: e */
        final /* synthetic */ String f41420e;

        /* renamed from: f */
        final /* synthetic */ String f41421f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14019q(CardOrderListActivity cardOrderListActivity, String str, String str2) {
            super(1);
            this.f41419d = cardOrderListActivity;
            this.f41420e = str;
            this.f41421f = str2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            CardOrderListActivity.m52059p3(this.f41419d, this.f41420e, this.f41421f);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$r */
    static final class C14020r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14020r(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41422d = cardOrderListActivity;
        }

        /* renamed from: a */
        public final void mo39110a(C18797e eVar) {
            LinearLayoutCompat linearLayoutCompat = this.f41422d.m52049f3().f45857s;
            C41536l.m120488h(linearLayoutCompat, "binding.loaders");
            C32343x.m95447f1(linearLayoutCompat);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39110a((C18797e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$s */
    static final class C14021s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14021s(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41423d = cardOrderListActivity;
        }

        /* renamed from: a */
        public final void mo39111a(C18797e eVar) {
            C41536l.m120489i(eVar, "cards");
            LinearLayoutCompat linearLayoutCompat = this.f41423d.m52049f3().f45857s;
            C41536l.m120488h(linearLayoutCompat, "binding.loaders");
            C32343x.m95455i0(linearLayoutCompat);
            this.f41423d.m52069z3(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39111a((C18797e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$t */
    static final class C14022t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14022t(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41424d = cardOrderListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LinearLayoutCompat linearLayoutCompat = this.f41424d.m52049f3().f45857s;
            C41536l.m120488h(linearLayoutCompat, "binding.loaders");
            C32343x.m95455i0(linearLayoutCompat);
            ConstraintLayout constraintLayout = this.f41424d.m52049f3().f45850l;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
            this.f41424d.m52049f3().f45851m.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$u */
    static final class C14023u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14023u(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41425d = cardOrderListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            CardOrderListActivity.m52062s3(this.f41425d, true);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$v */
    static final class C14024v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14024v(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41426d = cardOrderListActivity;
        }

        /* renamed from: a */
        public final void mo39114a(boolean z) {
            CardOrderListActivity.m52062s3(this.f41426d, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39114a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$w */
    static final class C14025w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14025w(CardOrderListActivity cardOrderListActivity) {
            super(1);
            this.f41427d = cardOrderListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            CardOrderListActivity.m52062s3(this.f41427d, false);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$x */
    static final class C14026x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardOrderListActivity f41428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14026x(CardOrderListActivity cardOrderListActivity) {
            super(0);
            this.f41428d = cardOrderListActivity;
        }

        /* renamed from: b */
        public final Chip invoke() {
            Chip chip = new Chip(this.f41428d, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(C10337a.PLASTIC.mo26932b(), new Object[0]));
            chip.setChipType(C18167d.CHOICE_CHIP);
            return chip;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$y */
    static final class C14027y implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41429a;

        C14027y(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41429a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41429a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41429a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity$z */
    public static final class C14028z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14028z(ComponentActivity componentActivity) {
            super(0);
            this.f41430d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41430d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public CardOrderListActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C17657h(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f41396M = registerForActivityResult;
        this.f41397N = C41219i.m119470b(C14014l.f41410d);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m52021A3(CardOrderListActivity cardOrderListActivity, C18797e eVar) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        C41536l.m120489i(eVar, "$cards");
        ViewPager2 viewPager2 = cardOrderListActivity.m52049f3().f45860v;
        C41536l.m120488h(viewPager2, "binding.sliderContainer");
        if (!ViewCompat.m3579V(viewPager2) || viewPager2.isLayoutRequested()) {
            viewPager2.addOnLayoutChangeListener(new C14003c0(cardOrderListActivity, eVar));
            return;
        }
        cardOrderListActivity.m52049f3().f45860v.setCurrentItem(eVar.mo46620b());
        new Handler(Looper.getMainLooper()).postDelayed(new C14001b0(eVar, cardOrderListActivity), 20);
    }

    /* renamed from: Z2 */
    private final void m52043Z2() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_INSTANT_DELIVERY_OPTION", this, new C17658i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m52044a3(CardOrderListActivity cardOrderListActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        boolean z = bundle.getBoolean("RESULT_KEY_INSTANT_DELIVERY_IS_INSTANT", false);
        OrderDebitCardData orderDebitCardData = (OrderDebitCardData) bundle.getParcelable("RESULT_KEY_ORDER_DATA");
        if (orderDebitCardData != null) {
            cardOrderListActivity.m52056m3(z, orderDebitCardData);
        }
    }

    /* renamed from: b3 */
    private final void m52045b3() {
        m52049f3().f45858t.setOnClickListener(new C17659j(this));
        m52049f3().f45860v.mo6603h(new C14000b(this));
        m52049f3().f45847i.setOnChipActivatedChangedListener(new C17660k(this));
        m52049f3().f45855q.setOnClickListener(new C17661l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m52046c3(CardOrderListActivity cardOrderListActivity, View view) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        C21481a.onRefresh$default(cardOrderListActivity.m52055l3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m52047d3(CardOrderListActivity cardOrderListActivity, Chip chip, int i) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        C10337a aVar = (C10337a) C41333m.m119774A(C10337a.values(), i);
        if (aVar != null) {
            cardOrderListActivity.m52055l3().mo33354Nw().mo33285wu(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m52048e3(CardOrderListActivity cardOrderListActivity, View view) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        cardOrderListActivity.m52055l3().mo33354Nw().mo33284Fs();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final C16229h m52049f3() {
        return (C16229h) this.f41391H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final C18000f m52050g3() {
        return (C18000f) this.f41397N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final Chip m52051h3() {
        return (Chip) this.f41394K.getValue();
    }

    /* renamed from: j3 */
    private final C17994c m52052j3() {
        return (C17994c) this.f41392I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final Chip m52053k3() {
        return (Chip) this.f41395L.getValue();
    }

    /* renamed from: l1 */
    private final void m52054l1() {
        C12615r Qw = m52055l3().mo33357Qw();
        Qw.mo33292ig().mo4819k(this, new C14027y(new C14002c(this)));
        Qw.mo33289Ek().mo4819k(this, new C14027y(new C14004d(this)));
        Qw.mo33288D5().mo4819k(this, new C14027y(new C14007e(this)));
        C37224b.m109963b(Qw.mo33290ai(), this, new C14008f(this));
        Qw.mo33287Bv().mo4819k(this, new C14027y(new C14009g(this)));
        Qw.mo33291e7().mo4819k(this, new C14027y(new C14010h(this)));
        Qw.mo33294lo().mo4819k(this, new C14027y(new C14011i(this)));
        C37224b.m109963b(Qw.mo33293l8(), this, new C14012j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final C12687y m52055l3() {
        return (C12687y) this.f41393J.getValue();
    }

    /* renamed from: m3 */
    private final void m52056m3(boolean z, OrderDebitCardData orderDebitCardData) {
        if (z) {
            InstantDeliveryApplicationActivity.f41531M.mo39214a(this, orderDebitCardData, this.f41396M);
        } else {
            OrderDebitCardActivity.f41454K.mo39139a(this, orderDebitCardData, this.f41396M);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m52057n3(C10339c cVar) {
        DebitCardTextsUiModel debitCardTextsUiModel;
        String str;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        String a;
        String B;
        m52049f3().f45860v.setCurrentItem(cVar.mo26941d());
        DebitCardUiModel c = cVar.mo26940c();
        if (cVar.mo26944f()) {
            debitCardTextsUiModel = c.getTexts().mo39614a();
        } else {
            debitCardTextsUiModel = c.getTexts().mo39615b();
        }
        PageDescriptionView pageDescriptionView = m52049f3().f45843e;
        C41536l.m120488h(pageDescriptionView, "binding.advantagesDescription");
        if (debitCardTextsUiModel != null) {
            str = debitCardTextsUiModel.mo39625a();
        } else {
            str = null;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(pageDescriptionView, z, false, 2, (Object) null);
        PageDescriptionView pageDescriptionView2 = m52049f3().f45843e;
        if (debitCardTextsUiModel == null || (a = debitCardTextsUiModel.mo39625a()) == null || (B = C40439w.m117103B(a, "\\n", "\n", false, 4, (Object) null)) == null) {
            str2 = null;
        } else {
            str2 = C40439w.m117103B(B, "\\n", "\n", false, 4, (Object) null);
        }
        pageDescriptionView2.setText(str2);
        Chip k3 = m52053k3();
        RecoverCardUiModel e = cVar.mo26942e();
        if (e == null) {
            z2 = c.hasCardLimitCheck();
        } else if (!e.mo39827q()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(k3, z2, false, 2, (Object) null);
        Chip h3 = m52051h3();
        RecoverCardUiModel e2 = cVar.mo26942e();
        if (e2 != null) {
            z3 = e2.mo39827q();
        } else {
            z3 = c.hasDigitalCardFlag();
        }
        C32343x.m95483r1(h3, z3, false, 2, (Object) null);
        m52049f3().f45847i.mo35182m(cVar.mo26944f() ^ true ? 1 : 0, false);
        m52049f3().f45847i.mo35185q(cVar.mo26944f() ? 1 : 0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m52058o3(C31128a aVar) {
        String F = C32343x.m95388F(C10337a.DIGITAL.mo26932b(), new Object[0]);
        String F2 = C32343x.m95388F(C10337a.PLASTIC.mo26932b(), new Object[0]);
        C31132b.m92646h(aVar, (int[]) null, new C14017o(this, F, F2), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14018p(this, F, F2), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14019q(this, F, F2), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m52059p3(CardOrderListActivity cardOrderListActivity, String str, String str2) {
        cardOrderListActivity.m52051h3().setChipTitle(str);
        cardOrderListActivity.m52053k3().setChipTitle(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m52060q3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14020r(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14021s(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14022t(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m52061r3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14023u(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14024v(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14025w(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m52062s3(CardOrderListActivity cardOrderListActivity, boolean z) {
        cardOrderListActivity.m52049f3().f45855q.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m52063t3(OrderDebitCardData orderDebitCardData) {
        C13962i.f41351I.mo39058a(orderDebitCardData).mo4576A1(getSupportFragmentManager(), (String) null);
        C32343x.m95393H0(this, "Instant_Delivery", "", "Show_action_sheet", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: u3 */
    private final void m52064u3() {
        List<View> m = C41341q.m119910m(m52051h3(), m52053k3());
        ChipGroup chipGroup = m52049f3().f45847i;
        C41536l.m120488h(chipGroup, "binding.cardTypeChipGroup");
        for (View o : m) {
            chipGroup.mo35183o(o);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m52065v3(CardOrderListActivity cardOrderListActivity, ActivityResult activityResult) {
        C41536l.m120489i(cardOrderListActivity, "this$0");
        if (activityResult.mo371b() == 3) {
            cardOrderListActivity.setResult(3);
            cardOrderListActivity.finish();
        }
    }

    /* renamed from: w3 */
    private final void m52066w3() {
        C12326a aVar = C12326a.f36971a;
        m52049f3().f45848j.setTitle(C32343x.m95388F("text.card.applications.choose.card.label", new Object[0]));
        m52049f3().f45843e.setTitle(C32343x.m95388F("text.card.applications.card.advantages", new Object[0]));
        m52049f3().f45849k.setText(C32343x.m95388F("text.card.applications.choose.card.type", new Object[0]));
        m52049f3().f45846h.setTitle(C32343x.m95388F("text.card.applications.card.terms", new Object[0]));
        m52049f3().f45855q.setButtonText(C32343x.m95388F("text.card.applications.proceed.to.order", new Object[0]));
    }

    /* renamed from: x3 */
    private final void m52067x3() {
        m52066w3();
        m52064u3();
        C9952k4.m36500a(m52049f3().f45843e).f27206g.setGravity(8388611);
        m52049f3().f45860v.setAdapter(m52052j3());
        m52049f3().f45844f.setAdapter(m52050g3());
        m52049f3().f45844f.mo5351j(new C13364a(C0767a.m2895e(this, C12487d.f37172u)));
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m52068y3(C18836t tVar) {
        boolean z;
        String str;
        String str2;
        InlineFeedback inlineFeedback = m52049f3().f45856r;
        C41536l.m120488h(inlineFeedback, "binding.infoBox");
        if (tVar.mo46793a().mo46659c() || tVar.mo46794b()) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
        InlineFeedback inlineFeedback2 = m52049f3().f45856r;
        if (tVar.mo46794b()) {
            str = C32343x.m95388F("text.card.application.student.regional.title", new Object[0]);
        } else {
            str = tVar.mo46793a().mo46658b();
        }
        inlineFeedback2.setTitleText(str);
        InlineFeedback inlineFeedback3 = m52049f3().f45856r;
        if (tVar.mo46794b()) {
            str2 = C32343x.m95388F("text.card.application.student.regional.message", new Object[0]);
        } else {
            str2 = tVar.mo46793a().mo46657a();
        }
        inlineFeedback3.setCaptionText(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final void m52069z3(C18797e eVar) {
        String str;
        C17994c j3 = m52052j3();
        List<DebitCardUiModel> a = eVar.mo46619a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (DebitCardUiModel debitCardUiModel : a) {
            String cardNameKey = debitCardUiModel.getCardNameKey();
            if (cardNameKey != null) {
                str = C32343x.m95420V(cardNameKey, String.valueOf(debitCardUiModel.getCardNameValue()), new Object[0]);
            } else {
                str = null;
            }
            arrayList.add(new C10338b(String.valueOf(str), debitCardUiModel.getCardImageResource(), C19277a.m64731a(debitCardUiModel.getSubProductCode(), C12487d.f37160a)));
        }
        j3.mo6030j(arrayList, new C17662m(this, eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m52049f3().mo3946b());
        super.mo37451O1(bundle);
        m52067x3();
        m52054l1();
        m52045b3();
        m52043Z2();
    }

    /* renamed from: i3 */
    public final C12602p mo39090i3() {
        C12602p pVar = this.f41390G;
        if (pVar != null) {
            return pVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        CardApplicationTypeData.RecoverCardOrderData recoverCardOrderData = (CardApplicationTypeData) getIntent().getParcelableExtra("APP_TYPE");
        if (recoverCardOrderData == null) {
            recoverCardOrderData = new CardApplicationTypeData.StandardCardData((String) null, (StringSource) null, 3, (DefaultConstructorMarker) null);
        }
        CardApplicationTypeData.RecoverCardOrderData a = recoverCardOrderData.mo39286a();
        if (a != null) {
            recoverCardOrderData = a;
        }
        return C34646b.m101752f(recoverCardOrderData.mo39287b(), (Context) null, 1, (Object) null);
    }
}

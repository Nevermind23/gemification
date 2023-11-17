package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15101j;
import po0.C17463h;
import po0.C17466k;
import ue1.C43064a;
import ue1.C43075l;
import xn0.C18850h;
import xn0.C18854l;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity */
public final class OffersProgressDetailActivity extends C15084b {

    /* renamed from: K */
    public static final C15073a f43328K = new C15073a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C18850h f43329G;

    /* renamed from: H */
    private final C41217g f43330H = C41219i.m119470b(new C15076d(this));

    /* renamed from: I */
    public C15101j.C15102a f43331I;

    /* renamed from: J */
    private final C41217g f43332J = new C1617p0(C41520a0.m120436b(C15101j.class), new C15078f(this), new C15080h(this), new C15079g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$a */
    public static final class C15073a {
        private C15073a() {
        }

        public /* synthetic */ C15073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo42039a(Context context, int i) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, OffersProgressDetailActivity.class).putExtra("PROGRESS_DETAILS", i));
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$b */
    static final class C15074b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersProgressDetailActivity f43333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15074b(OffersProgressDetailActivity offersProgressDetailActivity) {
            super(1);
            this.f43333d = offersProgressDetailActivity;
        }

        /* renamed from: a */
        public final void mo42040a(C31128a aVar) {
            C18850h F2 = this.f43333d.f43329G;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            LinearLayout linearLayout = F2.f52743i;
            C41536l.m120488h(linearLayout, "binding.loader");
            C32343x.m95483r1(linearLayout, aVar instanceof C31128a.C31130b, false, 2, (Object) null);
            C18850h F22 = this.f43333d.f43329G;
            if (F22 == null) {
                C41536l.m120506z("binding");
                F22 = null;
            }
            CardView cardView = F22.f52747m;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95483r1(cardView, aVar instanceof C31128a.C31129a, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42040a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$c */
    static final class C15075c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersProgressDetailActivity f43334d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15075c(OffersProgressDetailActivity offersProgressDetailActivity) {
            super(1);
            this.f43334d = offersProgressDetailActivity;
        }

        /* renamed from: a */
        public final void mo42041a(List list) {
            OffersProgressDetailActivity offersProgressDetailActivity = this.f43334d;
            C41536l.m120488h(list, "it");
            offersProgressDetailActivity.m55210M2((OffersProgressListItemUiModel) C41358y.m120007W(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42041a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$d */
    static final class C15076d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersProgressDetailActivity f43335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15076d(OffersProgressDetailActivity offersProgressDetailActivity) {
            super(0);
            this.f43335d = offersProgressDetailActivity;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Intent intent = this.f43335d.getIntent();
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("PROGRESS_DETAILS", -1)) : null;
            C41536l.m120486f(valueOf);
            return valueOf;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$e */
    static final class C15077e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43336a;

        C15077e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43336a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43336a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43336a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$f */
    public static final class C15078f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15078f(ComponentActivity componentActivity) {
            super(0);
            this.f43337d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43337d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$g */
    public static final class C15079g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43338d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43339e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15079g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43338d = aVar;
            this.f43339e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43338d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43339e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$h */
    static final class C15080h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersProgressDetailActivity f43340d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity$h$a */
        static final class C15081a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ OffersProgressDetailActivity f43341d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15081a(OffersProgressDetailActivity offersProgressDetailActivity) {
                super(0);
                this.f43341d = offersProgressDetailActivity;
            }

            /* renamed from: b */
            public final C15101j invoke() {
                return this.f43341d.mo42038I2().mo32571a(this.f43341d.m55207J2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15080h(OffersProgressDetailActivity offersProgressDetailActivity) {
            super(0);
            this.f43340d = offersProgressDetailActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C15081a(this.f43340d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final int m55207J2() {
        return ((Number) this.f43330H.getValue()).intValue();
    }

    /* renamed from: K2 */
    private final C15101j m55208K2() {
        return (C15101j) this.f43332J.getValue();
    }

    /* renamed from: L2 */
    private final void m55209L2() {
        C17466k kw = m55208K2().mo42057kw();
        kw.mo42058t2().mo4819k(this, new C15077e(new C15074b(this)));
        kw.mo42056L0().mo4819k(this, new C15077e(new C15075c(this)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117  */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m55210M2(p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel r22) {
        /*
            r21 = this;
            r0 = r21
            xn0.h r1 = r0.f43329G
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x000d:
            ge.bog.designsystem.components.cardobjective.CardObjectiveView r1 = r1.f52742h
            ge.bog.designsystem.components.cardobjective.TimerViewData r5 = r22.mo41855l()
            java.lang.String r6 = r22.mo41854k()
            ko0.c$a r4 = ko0.C16521c.f46671j
            java.lang.String r7 = r22.mo41843b()
            ko0.c r7 = r4.mo43680a(r7)
            r15 = 2
            if (r7 == 0) goto L_0x0037
            java.lang.Integer r7 = r7.mo43675c()
            if (r7 == 0) goto L_0x0034
            int r7 = r7.intValue()
            ge.bog.designsystem.components.common.Image$Resource r8 = new ge.bog.designsystem.components.common.Image$Resource
            r8.<init>(r7, r3, r15, r3)
            goto L_0x0035
        L_0x0034:
            r8 = r3
        L_0x0035:
            r7 = r8
            goto L_0x0038
        L_0x0037:
            r7 = r3
        L_0x0038:
            r8 = 0
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress r9 = r22.mo41853j()
            java.lang.String r12 = r22.mo41844d()
            java.lang.String r13 = r22.mo41842a()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r13)
            java.lang.String r12 = r14.toString()
            java.lang.String r13 = r22.mo41843b()
            ko0.c r13 = r4.mo43680a(r13)
            r14 = 1
            r3 = 0
            if (r13 == 0) goto L_0x00ae
            java.lang.String r13 = r13.name()
            if (r13 == 0) goto L_0x00ae
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r15)
            java.lang.String r11 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.C41536l.m120488h(r13, r11)
            if (r13 == 0) goto L_0x00ae
            int r11 = r13.length()
            if (r11 <= 0) goto L_0x007b
            r11 = r14
            goto L_0x007c
        L_0x007b:
            r11 = r3
        L_0x007c:
            if (r11 == 0) goto L_0x00af
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            char r18 = r13.charAt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r18)
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.C41536l.m120487g(r3, r10)
            java.lang.String r3 = r3.toUpperCase(r15)
            java.lang.String r10 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r10)
            r11.append(r3)
            java.lang.String r3 = r13.substring(r14)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r10)
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            r13 = r3
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            java.lang.String r3 = r22.mo41843b()
            ko0.c r3 = r4.mo43680a(r3)
            if (r3 == 0) goto L_0x00be
            int r3 = r3.mo43678g()
            goto L_0x00c0
        L_0x00be:
            int r3 = sn0.C17898b.f50928e
        L_0x00c0:
            r15 = 104(0x68, float:1.46E-43)
            r19 = 0
            ge.bog.designsystem.components.cardobjective.CardObjectiveData r11 = new ge.bog.designsystem.components.cardobjective.CardObjectiveData
            r4 = r11
            r10 = 0
            r20 = r11
            r11 = 0
            r17 = r14
            r14 = r3
            r3 = 2
            r16 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r20
            r1.setData(r4)
            xn0.h r1 = r0.f43329G
            if (r1 != 0) goto L_0x00e1
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = 0
        L_0x00e1:
            android.widget.TextView r1 = r1.f52740f
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r4)
            java.lang.String r4 = r22.mo41850h()
            if (r4 == 0) goto L_0x00f5
            android.text.Spanned r4 = g91.C32343x.m95416T(r4)
            goto L_0x00f6
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            r1.setText(r4)
            xn0.h r1 = r0.f43329G
            if (r1 != 0) goto L_0x0101
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = 0
        L_0x0101:
            ge.bog.designsystem.components.emptywidget.EmptyWidget r1 = r1.f52745k
            java.lang.String r2 = "binding.merchantsTitle"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.util.List r2 = r22.mo41849g()
            if (r2 == 0) goto L_0x0117
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r14 = 0
            goto L_0x0119
        L_0x0117:
            r14 = r17
        L_0x0119:
            r2 = r14 ^ 1
            r4 = 0
            r5 = 0
            g91.C32343x.m95483r1(r1, r2, r4, r3, r5)
            java.util.List r1 = r22.mo41849g()
            r0.m55211N2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity.m55210M2(ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel):void");
    }

    /* renamed from: N2 */
    private final void m55211N2(List list) {
        int i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                LayoutInflater from = LayoutInflater.from(this);
                C18850h hVar = this.f43329G;
                if (hVar == null) {
                    C41536l.m120506z("binding");
                    hVar = null;
                }
                C18854l d = C18854l.m63787d(from, hVar.f52744j, true);
                d.f52761f.setText(str);
                View view = d.f52760e;
                C41536l.m120488h(view, "divider");
                if (!C41536l.m120484d(C41358y.m120019i0(list), str)) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: O2 */
    private final void m55212O2() {
        C18850h hVar = this.f43329G;
        C18850h hVar2 = null;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f52741g.setTitle(C32343x.m95388F("life.style.campaign.details.block.header", new Object[0]));
        C18850h hVar3 = this.f43329G;
        if (hVar3 == null) {
            C41536l.m120506z("binding");
            hVar3 = null;
        }
        hVar3.f52745k.setTitle(C32343x.m95388F("life.style.campaign.details.block.merchants.header", new Object[0]));
        C18850h hVar4 = this.f43329G;
        if (hVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            hVar2 = hVar4;
        }
        hVar2.f52746l.mo3946b().setOnClickListener(new C17463h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m55213P2(OffersProgressDetailActivity offersProgressDetailActivity, View view) {
        C41536l.m120489i(offersProgressDetailActivity, "this$0");
        offersProgressDetailActivity.m55208K2().onRefresh(6);
    }

    /* renamed from: I2 */
    public final C15101j.C15102a mo42038I2() {
        C15101j.C15102a aVar = this.f43331I;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18850h d = C18850h.m63770d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43329G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m55212O2();
        m55209L2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("life.style.campaign.list.main.header", new Object[0]);
    }
}

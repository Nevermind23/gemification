package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.C0829d;
import androidx.core.view.C1200m3;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import cf1.C40419j;
import com.google.android.material.appbar.AppBarLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import io0.C15711a;
import io0.C15712b;
import io0.C15715e;
import io0.C15716f;
import java.util.Arrays;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import mo0.C16839a;
import mo0.C16846h;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p366bk.C10328q;
import p380ck.C10464h;
import sn0.C17900d;
import ue1.C43064a;
import ue1.C43075l;
import uo0.C18273e;
import xn0.C18845c;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity */
public final class LifestyleOfferDetailedActivity extends C15055a {

    /* renamed from: J */
    public static final C15022a f43256J = new C15022a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private static final int f43257K = C17900d.icon_credit_card_offer;

    /* renamed from: L */
    private static final int f43258L = C17900d.f50939d;

    /* renamed from: G */
    public C16846h.C16852d f43259G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C18845c f43260H;

    /* renamed from: I */
    private final C41217g f43261I = new C1617p0(C41520a0.m120436b(C16846h.class), new C15029h(this), new C15031j(this), new C15030i((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$a */
    public static final class C15022a {
        private C15022a() {
        }

        public /* synthetic */ C15022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo41989a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, LifestyleOfferDetailedActivity.class);
            intent.putExtra("EXTRA_OFFER_ID", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$b */
    static final class C15023b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15023b(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(1);
            this.f43262d = lifestyleOfferDetailedActivity;
        }

        /* renamed from: a */
        public final void mo41990a(C31128a aVar) {
            C18845c cVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C18845c L2 = this.f43262d.f43260H;
                if (L2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = L2;
                }
                FrameLayout frameLayout = cVar.f52684o;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43262d.m55097V2((C18273e) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43262d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                C18845c L22 = this.f43262d.f43260H;
                if (L22 == null) {
                    C41536l.m120506z("binding");
                    L22 = null;
                }
                CardView cardView = L22.f52686q;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                C18845c L23 = this.f43262d.f43260H;
                if (L23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = L23;
                }
                FrameLayout frameLayout2 = cVar.f52684o;
                C41536l.m120488h(frameLayout2, "binding.progressBar");
                C32343x.m95455i0(frameLayout2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41990a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$c */
    static final class C15024c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15024c(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(1);
            this.f43263d = lifestyleOfferDetailedActivity;
        }

        /* renamed from: a */
        public final void mo41991a(C37223a aVar) {
            String str;
            if (aVar != null && (str = (String) aVar.mo90296a()) != null) {
                LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity = this.f43263d;
                try {
                    String g = new C40419j("\\s").mo94490g(str, "");
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + g));
                    lifestyleOfferDetailedActivity.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41991a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$d */
    static final class C15025d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15025d(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(1);
            this.f43264d = lifestyleOfferDetailedActivity;
        }

        /* renamed from: a */
        public final void mo41992a(C37223a aVar) {
            String str;
            if (aVar != null && (str = (String) aVar.mo90296a()) != null) {
                LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity = this.f43264d;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    lifestyleOfferDetailedActivity.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41992a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$e */
    static final class C15026e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15026e(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(1);
            this.f43265d = lifestyleOfferDetailedActivity;
        }

        /* renamed from: a */
        public final void mo41993a(OfferInfo offerInfo) {
            LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity = this.f43265d;
            C41536l.m120488h(offerInfo, "offer");
            lifestyleOfferDetailedActivity.m55090N2(offerInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41993a((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$f */
    static final class C15027f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15027f(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(1);
            this.f43266d = lifestyleOfferDetailedActivity;
        }

        /* renamed from: a */
        public final void mo41994a(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "offer");
            OfferNavigatorActivity.f58469H.mo54606a(this.f43266d, offerInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41994a((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$g */
    static final class C15028g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43267a;

        C15028g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43267a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43267a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43267a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$h */
    public static final class C15029h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15029h(ComponentActivity componentActivity) {
            super(0);
            this.f43268d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43268d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$i */
    public static final class C15030i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43269d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43270e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15030i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43269d = aVar;
            this.f43270e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43269d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43270e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$j */
    static final class C15031j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOfferDetailedActivity f43271d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity$j$a */
        static final class C15032a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LifestyleOfferDetailedActivity f43272d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15032a(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
                super(0);
                this.f43272d = lifestyleOfferDetailedActivity;
            }

            /* renamed from: b */
            public final C16846h invoke() {
                return this.f43272d.mo41988P2().mo32564a(this.f43272d.getIntent().getLongExtra("EXTRA_OFFER_ID", 0));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15031j(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            super(0);
            this.f43271d = lifestyleOfferDetailedActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C15032a(this.f43271d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m55090N2(OfferInfo offerInfo) {
        int i;
        C18845c cVar = this.f43260H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        LinearLayout linearLayout = cVar.f52682m;
        C41536l.m120488h(linearLayout, "binding.productContainer");
        C32343x.m95447f1(linearLayout);
        C18845c cVar2 = this.f43260H;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        cVar2.f52683n.setText(C32343x.m95388F("life.style.offer.condition.text", new Object[0]));
        C18845c cVar3 = this.f43260H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        TextImageCardView textImageCardView = cVar3.f52681l;
        if (C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21021PL.f56478f)) {
            i = f43258L;
        } else {
            i = f43257K;
        }
        textImageCardView.setImage(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null));
        textImageCardView.setText(offerInfo.getOfferText());
        C41524c0 c0Var = C41524c0.f97701a;
        String string = getString(C10328q.f28962mb);
        C41536l.m120488h(string, "getString(ge.bog.mobileb….product_offer_effective)");
        String format = String.format(string, Arrays.copyOf(new Object[]{offerInfo.getEffectiveInterestRate()}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        textImageCardView.setCaption(format);
        textImageCardView.setDescription(offerInfo.getProductName());
        textImageCardView.setOnClickListener(new C15715e(this, offerInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m55091O2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, OfferInfo offerInfo, View view) {
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C41536l.m120489i(offerInfo, "$offer");
        lifestyleOfferDetailedActivity.m55092Q2().mo43974yw(offerInfo);
    }

    /* renamed from: Q2 */
    private final C16846h m55092Q2() {
        return (C16846h) this.f43261I.getValue();
    }

    /* renamed from: R2 */
    private final void m55093R2() {
        m55092Q2().mo43972ww().mo43962I6().mo4819k(this, new C15028g(new C15023b(this)));
        m55092Q2().mo43972ww().mo43964Rl().mo4819k(this, new C15028g(new C15024c(this)));
        m55092Q2().mo43972ww().mo43963Jb().mo4819k(this, new C15028g(new C15025d(this)));
        m55092Q2().mo43972ww().mo43966x6().mo4819k(this, new C15028g(new C15026e(this)));
        C37224b.m109963b(m55092Q2().mo43972ww().mo43965Zo(), this, new C15027f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m55094S2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, View view) {
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C18845c cVar = lifestyleOfferDetailedActivity.f43260H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        CardView cardView = cVar.f52686q;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        lifestyleOfferDetailedActivity.m55092Q2().onRefresh(6);
    }

    /* renamed from: T2 */
    private final void m55095T2() {
        C18845c cVar = this.f43260H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f52687r.setOnScrollChangeListener(new C15716f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m55096U2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        boolean z;
        String str;
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        C18845c cVar = lifestyleOfferDetailedActivity.f43260H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ToolbarView toolbarView = cVar.f52689t.f68494e;
        C18845c cVar2 = lifestyleOfferDetailedActivity.f43260H;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        if (i2 > cVar2.f52677h.getMeasuredHeight() - toolbarView.getMeasuredHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = C32343x.m95388F("life.style.offers.main.page.header", new Object[0]);
        } else {
            str = "";
        }
        C41536l.m120488h(toolbarView, "setToolbarAnimation$lambda$11$lambda$10");
        ToolbarView.m50857i0(toolbarView, z, false, 2, (Object) null);
        toolbarView.setTitle(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: xn0.c} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m55097V2(uo0.C18273e r12) {
        /*
            r11 = this;
            xn0.c r0 = r11.f43260H
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r0 = r2
        L_0x000b:
            xn0.c r3 = r11.f43260H
            if (r3 != 0) goto L_0x0013
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r3 = r2
        L_0x0013:
            android.widget.FrameLayout r3 = r3.f52684o
            java.lang.String r4 = "binding.progressBar"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            g91.C32343x.m95455i0(r3)
            long r3 = r12.mo45962k()
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003c
            xn0.c r12 = r11.f43260H
            if (r12 != 0) goto L_0x002f
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x0030
        L_0x002f:
            r2 = r12
        L_0x0030:
            ge.bog.designsystem.components.pagestate.PageState r12 = r2.f52678i
            java.lang.String r0 = "binding.offerNotFoundState"
            kotlin.jvm.internal.C41536l.m120488h(r12, r0)
            g91.C32343x.m95447f1(r12)
            goto L_0x0123
        L_0x003c:
            com.bumptech.glide.k r3 = com.bumptech.glide.C2379b.m9213w(r11)
            java.lang.String r4 = r12.mo45956f()
            com.bumptech.glide.j r3 = r3.mo7757y(r4)
            int r4 = sn0.C17900d.f50945u
            c4.a r3 = r3.mo7220c0(r4)
            com.bumptech.glide.j r3 = (com.bumptech.glide.C2394j) r3
            androidx.appcompat.widget.AppCompatImageView r4 = r0.f52677h
            r3.mo7718L0(r4)
            ge.bog.designsystem.components.timer.TimerView r3 = r0.f52688s
            uj.a r4 = r12.mo45965n()
            r3.setTimerState(r4)
            java.lang.String r4 = r12.mo45966o()
            r3.setTimerText(r4)
            java.lang.String r4 = "setUpViews$lambda$9$lambda$3"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            g91.C32343x.m95447f1(r3)
            android.widget.TextView r3 = r0.f52679j
            java.lang.String r4 = r12.mo45963l()
            r3.setText(r4)
            ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a r3 = r12.mo45950a()
            if (r3 == 0) goto L_0x00a4
            xn0.c r4 = r11.f43260H
            if (r4 != 0) goto L_0x0084
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r4 = r2
        L_0x0084:
            android.widget.LinearLayout r4 = r4.f52674e
            r4.removeAllViews()
            xn0.c r4 = r11.f43260H
            if (r4 != 0) goto L_0x0091
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r4 = r2
        L_0x0091:
            android.widget.LinearLayout r1 = r4.f52674e
            ge.bog.designsystem.components.chipsbadge.ChipsBadgeView r10 = new ge.bog.designsystem.components.chipsbadge.ChipsBadgeView
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.setBadgeType(r3)
            r1.addView(r10)
        L_0x00a4:
            android.widget.TextView r1 = r0.f52676g
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r3)
            android.widget.TextView r1 = r0.f52676g
            java.lang.String r3 = r12.mo45961j()
            if (r3 == 0) goto L_0x00b9
            android.text.Spanned r2 = g91.C32343x.m95416T(r3)
        L_0x00b9:
            r1.setText(r2)
            java.lang.String r1 = r12.mo45964m()
            r2 = 0
            java.lang.String r3 = "buttonsContainer"
            if (r1 == 0) goto L_0x00ee
            ge.bog.designsystem.components.buttons.Button r4 = r0.f52680k
            java.lang.String r5 = "phoneButton"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            g91.C32343x.m95447f1(r4)
            android.widget.LinearLayout r4 = r0.f52675f
            kotlin.jvm.internal.C41536l.m120488h(r4, r3)
            g91.C32343x.m95447f1(r4)
            ge.bog.designsystem.components.buttons.Button r4 = r0.f52680k
            java.lang.String r5 = "life.style.offers.detailed.page.phone"
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = g91.C32343x.m95388F(r5, r6)
            r4.setButtonText(r5)
            ge.bog.designsystem.components.buttons.Button r4 = r0.f52680k
            io0.c r5 = new io0.c
            r5.<init>(r11, r1)
            r4.setOnClickListener(r5)
        L_0x00ee:
            java.lang.String r1 = r12.mo45967p()
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = r12.mo45957g()
            if (r1 == 0) goto L_0x0123
        L_0x00fa:
            ge.bog.designsystem.components.buttons.Button r1 = r0.f52690u
            java.lang.String r4 = "webButton"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            g91.C32343x.m95447f1(r1)
            android.widget.LinearLayout r1 = r0.f52675f
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            g91.C32343x.m95447f1(r1)
            ge.bog.designsystem.components.buttons.Button r1 = r0.f52690u
            java.lang.String r3 = "life.style.offers.detailed.page.web.page"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = g91.C32343x.m95388F(r3, r2)
            r1.setButtonText(r2)
            ge.bog.designsystem.components.buttons.Button r0 = r0.f52690u
            io0.d r1 = new io0.d
            r1.<init>(r11, r12)
            r0.setOnClickListener(r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity.m55097V2(uo0.e):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m55098W2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, String str, View view) {
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C41536l.m120489i(str, "$number");
        lifestyleOfferDetailedActivity.m55092Q2().mo43967rw().mo43961za(str);
        C32343x.m95393H0(lifestyleOfferDetailedActivity, "life_style_offers", str, "offer_details_click_phone", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m55099X2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, C18273e eVar, View view) {
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C41536l.m120489i(eVar, "$offer");
        C16839a rw = lifestyleOfferDetailedActivity.m55092Q2().mo43967rw();
        String p = eVar.mo45967p();
        if (p == null) {
            p = eVar.mo45957g();
            C41536l.m120486f(p);
        }
        rw.mo43960It(p);
        String p2 = eVar.mo45967p();
        if (p2 == null) {
            p2 = eVar.mo45957g();
            C41536l.m120486f(p2);
        }
        C32343x.m95393H0(lifestyleOfferDetailedActivity, "life_style_offers", p2, "offer_details_click_web", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: Y2 */
    private final void m55100Y2() {
        C18845c cVar = this.f43260H;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ViewCompat.m3550F0(cVar.mo3946b(), new C15712b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final WindowInsetsCompat m55101Z2(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(lifestyleOfferDetailedActivity, "this$0");
        C41536l.m120489i(view, "<anonymous parameter 0>");
        C41536l.m120489i(windowInsetsCompat, "windowInsets");
        C0829d f = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e());
        C41536l.m120488h(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        C18845c cVar = lifestyleOfferDetailedActivity.f43260H;
        C18845c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        NestedScrollView nestedScrollView = cVar.f52687r;
        C41536l.m120488h(nestedScrollView, "binding.scrollView");
        ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = f.f3468d;
            nestedScrollView.setLayoutParams(marginLayoutParams);
            C18845c cVar3 = lifestyleOfferDetailedActivity.f43260H;
            if (cVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                cVar2 = cVar3;
            }
            AppBarLayout c = cVar2.f52689t.mo3946b();
            C41536l.m120488h(c, "binding.toolbar.root");
            c.setPadding(c.getPaddingLeft(), f.f3466b, c.getPaddingRight(), c.getPaddingBottom());
            return windowInsetsCompat;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C1200m3.m4286b(getWindow(), false);
        getWindow().setStatusBarColor(0);
        C18845c d = C18845c.m63745d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43260H = d;
        C18845c cVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m55100Y2();
        m55095T2();
        m55093R2();
        C18845c cVar2 = this.f43260H;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        cVar2.f52678i.setTitleText(C32343x.m95388F("life.style.offers.push.offer.not.found", new Object[0]));
        C18845c cVar3 = this.f43260H;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar = cVar3;
        }
        cVar.f52685p.mo3946b().setOnClickListener(new C15711a(this));
    }

    /* renamed from: P2 */
    public final C16846h.C16852d mo41988P2() {
        C16846h.C16852d dVar = this.f43259G;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}

package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import ao0.C10119a;
import ao0.C10124e;
import b41.C31128a;
import co0.C10521a;
import com.google.android.flexbox.FlexboxLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import io0.C15725o;
import io0.C15727q;
import io0.C15728r;
import io0.C15729s;
import java.util.List;
import ko0.C16520b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lo0.C16641a;
import m41.C37223a;
import mo0.C16877v;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.bigchips.BigChips;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p380ck.C10464h;
import sn0.C17899c;
import ue1.C43064a;
import ue1.C43075l;
import uo0.C18271c;
import xn0.C18848f;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity */
public final class LifestyleOffersFilterActivity extends C15059c {

    /* renamed from: J */
    public static final C15045a f43290J = new C15045a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C16877v.C16881c f43291G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C18848f f43292H;

    /* renamed from: I */
    private final C41217g f43293I = new C1617p0(C41520a0.m120436b(C16877v.class), new C15051g(this), new C15053i(this), new C15052h((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$a */
    public static final class C15045a {
        private C15045a() {
        }

        public /* synthetic */ C15045a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo42010a(Context context, LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(lifestyleOffersFilterResultData, "filterData");
            Intent intent = new Intent(context, LifestyleOffersFilterActivity.class);
            intent.putExtra("EXTRA_FILTER_DATA", lifestyleOffersFilterResultData);
            return intent;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$b */
    static final class C15046b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersFilterActivity f43294d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15046b(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            super(1);
            this.f43294d = lifestyleOffersFilterActivity;
        }

        /* renamed from: a */
        public final void mo42011a(C31128a aVar) {
            C18848f fVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C18848f J2 = this.f43294d.f43292H;
                if (J2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    fVar = J2;
                }
                CardView cardView = fVar.f52722m;
                C41536l.m120488h(cardView, "binding.progressBar");
                C32343x.m95447f1(cardView);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43294d.m55157T2((C10124e) ((C31128a.C31131c) aVar).mo71340a());
                C18848f J22 = this.f43294d.f43292H;
                if (J22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    fVar = J22;
                }
                CardView cardView2 = fVar.f52722m;
                C41536l.m120488h(cardView2, "binding.progressBar");
                C32343x.m95455i0(cardView2);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43294d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                C18848f J23 = this.f43294d.f43292H;
                if (J23 == null) {
                    C41536l.m120506z("binding");
                    J23 = null;
                }
                CardView cardView3 = J23.f52725p;
                C41536l.m120488h(cardView3, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView3);
                C18848f J24 = this.f43294d.f43292H;
                if (J24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    fVar = J24;
                }
                CardView cardView4 = fVar.f52722m;
                C41536l.m120488h(cardView4, "binding.progressBar");
                C32343x.m95455i0(cardView4);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42011a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$c */
    static final class C15047c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersFilterActivity f43295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15047c(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            super(1);
            this.f43295d = lifestyleOffersFilterActivity;
        }

        /* renamed from: a */
        public final void mo42012a(C16520b bVar) {
            C18848f J2 = this.f43295d.f43292H;
            C18848f fVar = null;
            if (J2 == null) {
                C41536l.m120506z("binding");
                J2 = null;
            }
            FlexboxLayout flexboxLayout = J2.f52718i;
            C41536l.m120488h(flexboxLayout, "binding.categoryContainer");
            int childCount = flexboxLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = flexboxLayout.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.designsystem.components.bigchips.BigChips");
                BigChips bigChips = (BigChips) childAt;
                bigChips.setActive(C41358y.m119999O(bVar.mo43669c(), bigChips.getTag()));
            }
            C18848f J22 = this.f43295d.f43292H;
            if (J22 == null) {
                C41536l.m120506z("binding");
            } else {
                fVar = J22;
            }
            FlexboxLayout flexboxLayout2 = fVar.f52714e;
            C41536l.m120488h(flexboxLayout2, "binding.badgeContainer");
            int childCount2 = flexboxLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = flexboxLayout2.getChildAt(i2);
                C41536l.m120488h(childAt2, "getChildAt(index)");
                C41536l.m120487g(childAt2, "null cannot be cast to non-null type ge.bog.designsystem.components.bigchips.BigChips");
                BigChips bigChips2 = (BigChips) childAt2;
                bigChips2.setActive(C41358y.m119999O(bVar.mo43668b(), bigChips2.getTag()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42012a((C16520b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$d */
    static final class C15048d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersFilterActivity f43296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15048d(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            super(1);
            this.f43296d = lifestyleOffersFilterActivity;
        }

        /* renamed from: a */
        public final void mo42013a(C37223a aVar) {
            LifestyleOffersFilterResultData lifestyleOffersFilterResultData;
            if (aVar != null) {
                lifestyleOffersFilterResultData = (LifestyleOffersFilterResultData) aVar.mo90296a();
            } else {
                lifestyleOffersFilterResultData = null;
            }
            LifestyleOffersFilterActivity lifestyleOffersFilterActivity = this.f43296d;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FILTER_DATA", lifestyleOffersFilterResultData);
            lifestyleOffersFilterActivity.setResult(-1, intent);
            lifestyleOffersFilterActivity.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42013a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$e */
    static final class C15049e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersFilterActivity f43297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15049e(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            super(1);
            this.f43297d = lifestyleOffersFilterActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C18848f J2 = this.f43297d.f43292H;
            C18848f fVar = null;
            if (J2 == null) {
                C41536l.m120506z("binding");
                J2 = null;
            }
            Button button = J2.f52721l;
            C41536l.m120488h(bool, "hasSelected");
            button.setEnabled(bool.booleanValue());
            C18848f J22 = this.f43297d.f43292H;
            if (J22 == null) {
                C41536l.m120506z("binding");
            } else {
                fVar = J22;
            }
            fVar.f52723n.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$f */
    static final class C15050f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43298a;

        C15050f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43298a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43298a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43298a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$g */
    public static final class C15051g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15051g(ComponentActivity componentActivity) {
            super(0);
            this.f43299d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43299d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$h */
    public static final class C15052h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43300d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15052h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43300d = aVar;
            this.f43301e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43300d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43301e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$i */
    static final class C15053i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersFilterActivity f43302d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity$i$a */
        static final class C15054a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LifestyleOffersFilterActivity f43303d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15054a(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
                super(0);
                this.f43303d = lifestyleOffersFilterActivity;
            }

            /* renamed from: b */
            public final C16877v invoke() {
                C16877v.C16881c P2 = this.f43303d.mo42009P2();
                LifestyleOffersFilterResultData lifestyleOffersFilterResultData = (LifestyleOffersFilterResultData) this.f43303d.getIntent().getParcelableExtra("EXTRA_FILTER_DATA");
                if (lifestyleOffersFilterResultData == null) {
                    lifestyleOffersFilterResultData = new LifestyleOffersFilterResultData((List) null, (List) null, 3, (DefaultConstructorMarker) null);
                }
                return P2.mo32568a(lifestyleOffersFilterResultData);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15053i(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            super(0);
            this.f43302d = lifestyleOffersFilterActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C15054a(this.f43302d));
        }
    }

    /* renamed from: L2 */
    private final View m55150L2(C10119a aVar) {
        BigChips bigChips = new BigChips(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int dimensionPixelSize = bigChips.getResources().getDimensionPixelSize(C17899c.f50937b);
        bigChips.setTitle(C32343x.m95388F(C16641a.m58964b(aVar), new Object[0]));
        bigChips.setIconType(BigChips.C13169a.LOGO);
        bigChips.setActive(bigChips.isSelected());
        Integer a = C16641a.m58963a(aVar);
        if (a != null) {
            bigChips.setIconImage(new Image.Resource(a.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        bigChips.setTag(aVar);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, dimensionPixelSize, 0);
        bigChips.setLayoutParams(marginLayoutParams);
        bigChips.setOnClickListener(new C15727q(this, aVar));
        return bigChips;
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m55151M2(LifestyleOffersFilterActivity lifestyleOffersFilterActivity, C10119a aVar, View view) {
        C41536l.m120489i(lifestyleOffersFilterActivity, "this$0");
        C41536l.m120489i(aVar, "$benefName");
        lifestyleOffersFilterActivity.m55154Q2().mo44013kw().mo44002Mm(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View m55152N2(uo0.C18271c r18) {
        /*
            r17 = this;
            ge.bog.designsystem.components.bigchips.BigChips r6 = new ge.bog.designsystem.components.bigchips.BigChips
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = sn0.C17899c.f50937b
            int r0 = r0.getDimensionPixelSize(r1)
            java.lang.String r1 = r18.mo45934a()
            r6.setTitle(r1)
            java.lang.String r1 = r18.mo45935b()
            if (r1 == 0) goto L_0x0038
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r8 = r18.mo45935b()
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 126(0x7e, float:1.77E-43)
            r16 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0041
        L_0x0038:
            ge.bog.designsystem.components.common.Image$Resource r1 = new ge.bog.designsystem.components.common.Image$Resource
            int r2 = sn0.C17900d.f50941g
            r3 = 2
            r4 = 0
            r1.<init>(r2, r4, r3, r4)
        L_0x0041:
            r6.setIconImage(r1)
            long r1 = r18.mo45936c()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.setTag(r1)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 0
            r1.setMargins(r2, r2, r0, r2)
            r6.setLayoutParams(r1)
            io0.p r0 = new io0.p
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2)
            r6.setOnClickListener(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity.m55152N2(uo0.c):android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m55153O2(LifestyleOffersFilterActivity lifestyleOffersFilterActivity, C18271c cVar, View view) {
        C41536l.m120489i(lifestyleOffersFilterActivity, "this$0");
        C41536l.m120489i(cVar, "$category");
        lifestyleOffersFilterActivity.m55154Q2().mo44013kw().mo44003Wf(cVar.mo45936c());
    }

    /* renamed from: Q2 */
    private final C16877v m55154Q2() {
        return (C16877v) this.f43293I.getValue();
    }

    /* renamed from: R2 */
    private final void m55155R2() {
        m55154Q2().mo44014lw().mo44008Ge().mo4819k(this, new C15050f(new C15046b(this)));
        m55154Q2().mo44014lw().mo44007Dm().mo4819k(this, new C15050f(new C15047c(this)));
        m55154Q2().mo44014lw().mo44010x7().mo4819k(this, new C15050f(new C15048d(this)));
        m55154Q2().mo44014lw().mo44009eq().mo4819k(this, new C15050f(new C15049e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m55156S2(LifestyleOffersFilterActivity lifestyleOffersFilterActivity, View view) {
        C41536l.m120489i(lifestyleOffersFilterActivity, "this$0");
        lifestyleOffersFilterActivity.m55154Q2().onRefresh(6);
        C18848f fVar = lifestyleOffersFilterActivity.f43292H;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        CardView cardView = fVar.f52725p;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m55157T2(C10124e eVar) {
        C18848f fVar = this.f43292H;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        List<C18271c> a = eVar.mo26622a();
        List<C10119a> b = eVar.mo26623b();
        if (!a.isEmpty()) {
            LayerView layerView = fVar.f52719j;
            C41536l.m120488h(layerView, "categoryFilter");
            C32343x.m95447f1(layerView);
            fVar.f52720k.setTitle(C32343x.m95388F(C10521a.m38136l(), new Object[0]));
            fVar.f52720k.setText(C32343x.m95388F(C10521a.m38135k(), new Object[0]));
            FlexboxLayout flexboxLayout = fVar.f52718i;
            flexboxLayout.removeAllViews();
            for (C18271c N2 : a) {
                flexboxLayout.addView(m55152N2(N2));
            }
        }
        if (!b.isEmpty()) {
            LayerView layerView2 = fVar.f52715f;
            C41536l.m120488h(layerView2, "badgeFilter");
            C32343x.m95447f1(layerView2);
            fVar.f52716g.setTitle(C32343x.m95388F(C10521a.m38127c(), new Object[0]));
            fVar.f52716g.setText(C32343x.m95388F(C10521a.m38126b(), new Object[0]));
            FlexboxLayout flexboxLayout2 = fVar.f52714e;
            flexboxLayout2.removeAllViews();
            for (C10119a aVar : b) {
                if (aVar != null) {
                    flexboxLayout2.addView(m55150L2(aVar));
                }
            }
        }
    }

    /* renamed from: U2 */
    private final Button m55158U2() {
        C18848f fVar = this.f43292H;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        Button button = fVar.f52721l;
        button.setButtonText(C32343x.m95388F(C10521a.m38125a(), new Object[0]));
        button.setOnClickListener(new C15728r(this));
        Button button2 = fVar.f52723n;
        button2.setButtonText(C32343x.m95388F(C10521a.m38138n(), new Object[0]));
        button2.setOnClickListener(new C15729s(this));
        C41536l.m120488h(button2, "with(binding) {\n        …        }\n        }\n    }");
        return button2;
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m55159V2(LifestyleOffersFilterActivity lifestyleOffersFilterActivity, View view) {
        C41536l.m120489i(lifestyleOffersFilterActivity, "this$0");
        lifestyleOffersFilterActivity.m55154Q2().mo44013kw().mo44006wc();
        C32343x.m95393H0(lifestyleOffersFilterActivity, "life_style_offers", "FILTER", "CLICK_FILTER_BUTTON", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m55160W2(LifestyleOffersFilterActivity lifestyleOffersFilterActivity, View view) {
        C41536l.m120489i(lifestyleOffersFilterActivity, "this$0");
        lifestyleOffersFilterActivity.m55154Q2().mo44013kw().mo44005n5();
        C32343x.m95393H0(lifestyleOffersFilterActivity, "life_style_offers", "RESET_FILTER", "CLICK_RESET_BUTTON", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18848f d = C18848f.m63760d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43292H = d;
        C18848f fVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m55158U2();
        m55155R2();
        C18848f fVar2 = this.f43292H;
        if (fVar2 == null) {
            C41536l.m120506z("binding");
        } else {
            fVar = fVar2;
        }
        fVar.f52724o.mo3946b().setOnClickListener(new C15725o(this));
    }

    /* renamed from: P2 */
    public final C16877v.C16881c mo42009P2() {
        C16877v.C16881c cVar = this.f43291G;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onBackPressed() {
        m55154Q2().mo44013kw().mo44004l();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F(C10521a.m38137m(), new Object[0]);
    }
}

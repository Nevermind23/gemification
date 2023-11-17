package p341ge.bog.mobilebank.cleanarch.presentation.pfm.faq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32335t0;
import g91.C32355x0;
import he1.C41217g;
import he1.C41238w;
import java.io.Serializable;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.faq.viewmodel.FAQViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import r40.C27915a;
import r40.C27916b;
import r40.C27917c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity */
public final class FAQActivity extends C35388f2 {

    /* renamed from: N */
    public static final C22147a f58888N = new C22147a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58889F = new C1617p0(C41520a0.m120436b(FAQViewModel.class), new C22157k(this), new C22156j(this), new C22158l((C43064a) null, this));

    /* renamed from: G */
    private final C41217g f58890G = C41219i.m119470b(new C22155i(this));

    /* renamed from: H */
    private final C41217g f58891H = C41219i.m119470b(new C22149c(this));

    /* renamed from: I */
    private final C41217g f58892I = C41219i.m119470b(new C22159m(this));

    /* renamed from: J */
    private final C41217g f58893J = C41219i.m119470b(new C22160n(this));

    /* renamed from: K */
    private final C41217g f58894K = C41219i.m119470b(new C22150d(this));

    /* renamed from: L */
    private final C41217g f58895L = C41219i.m119470b(new C22148b(this));

    /* renamed from: M */
    public C27917c f58896M;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$a */
    public static final class C22147a {
        private C22147a() {
        }

        public /* synthetic */ C22147a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54978a(Activity activity, C27917c cVar, String str, String str2, String str3) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(cVar, "faqType");
            C41536l.m120489i(str, "analyticsCategory");
            C41536l.m120489i(str2, "analyticsAction");
            C41536l.m120489i(str3, "analyticsLabel");
            Intent intent = new Intent(activity, FAQActivity.class);
            intent.putExtra("FAQ_TYPE", cVar);
            intent.putExtra("FAQ_CATEGORY", str);
            intent.putExtra("FAQ_ACTION", str2);
            intent.putExtra("FAQ_LABEL", str3);
            activity.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$b */
    static final class C22148b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22148b(FAQActivity fAQActivity) {
            super(0);
            this.f58897d = fAQActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f58897d.findViewById(C10322k.faqDesc);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$c */
    static final class C22149c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22149c(FAQActivity fAQActivity) {
            super(0);
            this.f58898d = fAQActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f58898d.findViewById(C10322k.faqHeader);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$d */
    static final class C22150d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22150d(FAQActivity fAQActivity) {
            super(0);
            this.f58899d = fAQActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f58899d.findViewById(C10322k.faqTitle);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$e */
    static final class C22151e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58900d;

        /* renamed from: e */
        final /* synthetic */ int f58901e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22151e(FAQActivity fAQActivity, int i) {
            super(1);
            this.f58900d = fAQActivity;
            this.f58901e = i;
        }

        /* renamed from: a */
        public final void mo54982a(View view) {
            C41536l.m120489i(view, "header");
            ((BogTextView) view.findViewById(C10322k.faq_item_title)).setText(this.f58900d.getString(this.f58901e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54982a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$f */
    public static final class C22152f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58902d;

        /* renamed from: e */
        final /* synthetic */ View f58903e;

        C22152f(FAQActivity fAQActivity, View view) {
            this.f58902d = fAQActivity;
            this.f58903e = view;
        }

        public void onGlobalLayout() {
            C32355x0.m95523n(this.f58902d.m71786F2(), this);
            ((ExpandableItemView) this.f58903e).setScrollOffset(this.f58902d.m71786F2().getHeight());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$g */
    static final class C22153g extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C27915a f58904d;

        /* renamed from: e */
        final /* synthetic */ int f58905e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22153g(C27915a aVar, int i) {
            super(2);
            this.f58904d = aVar;
            this.f58905e = i;
        }

        /* renamed from: a */
        public final void mo54984a(View view, int i) {
            C41536l.m120489i(view, "item");
            ((BogImageView) view.findViewById(C10322k.f28773Nd)).setImageResource(((Number) this.f58904d.mo67494b().get(this.f58905e)).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo54984a((View) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$h */
    static final class C22154h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ View f58906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22154h(View view) {
            super(1);
            this.f58906d = view;
        }

        /* renamed from: a */
        public final void mo54985a(boolean z) {
            if (z) {
                ((BogImageView) this.f58906d.findViewById(C10322k.f28773Nd)).setAdjustViewBounds(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54985a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$i */
    static final class C22155i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22155i(FAQActivity fAQActivity) {
            super(0);
            this.f58907d = fAQActivity;
        }

        /* renamed from: b */
        public final NestedScrollView invoke() {
            return (NestedScrollView) this.f58907d.findViewById(C10322k.f28745Ht);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$j */
    public static final class C22156j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22156j(ComponentActivity componentActivity) {
            super(0);
            this.f58908d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58908d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$k */
    public static final class C22157k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22157k(ComponentActivity componentActivity) {
            super(0);
            this.f58909d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58909d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$l */
    public static final class C22158l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58910d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58911e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22158l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58910d = aVar;
            this.f58911e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58910d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58911e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$m */
    static final class C22159m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22159m(FAQActivity fAQActivity) {
            super(0);
            this.f58912d = fAQActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f58912d.findViewById(C10322k.toolbarTitleTV);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQActivity$n */
    static final class C22160n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FAQActivity f58913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22160n(FAQActivity fAQActivity) {
            super(0);
            this.f58913d = fAQActivity;
        }

        /* renamed from: b */
        public final ViewGroup invoke() {
            return (ViewGroup) this.f58913d.findViewById(C10322k.viewContainer);
        }
    }

    /* renamed from: E2 */
    private final BogTextView m71785E2() {
        Object value = this.f58895L.getValue();
        C41536l.m120488h(value, "<get-faqDesc>(...)");
        return (BogTextView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public final View m71786F2() {
        Object value = this.f58891H.getValue();
        C41536l.m120488h(value, "<get-faqHeader>(...)");
        return (View) value;
    }

    /* renamed from: G2 */
    private final BogTextView m71787G2() {
        Object value = this.f58894K.getValue();
        C41536l.m120488h(value, "<get-faqTitle>(...)");
        return (BogTextView) value;
    }

    /* renamed from: H2 */
    private final NestedScrollView m71788H2() {
        Object value = this.f58890G.getValue();
        C41536l.m120488h(value, "<get-scrollView>(...)");
        return (NestedScrollView) value;
    }

    /* renamed from: I2 */
    private final BogTextView m71789I2() {
        Object value = this.f58892I.getValue();
        C41536l.m120488h(value, "<get-toolbarTitleTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: J2 */
    private final ViewGroup m71790J2() {
        Object value = this.f58893J.getValue();
        C41536l.m120488h(value, "<get-viewContainer>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: K2 */
    private final FAQViewModel m71791K2() {
        return (FAQViewModel) this.f58889F.getValue();
    }

    /* renamed from: L2 */
    private final void m71792L2() {
        m71791K2().mo54992gw().mo4819k(this, new C27916b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m71793M2(FAQActivity fAQActivity, C27915a aVar) {
        C41536l.m120489i(fAQActivity, "this$0");
        fAQActivity.m71787G2().setText(fAQActivity.getString(aVar.mo67496d()));
        fAQActivity.m71785E2().setText(fAQActivity.getString(aVar.mo67493a()));
        int i = 0;
        for (Number intValue : aVar.mo67495c()) {
            int i2 = i + 1;
            int intValue2 = intValue.intValue();
            View inflate = fAQActivity.getLayoutInflater().inflate(C10324m.faq_expandable_item, (ViewGroup) null);
            C41536l.m120487g(inflate, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView");
            ExpandableItemView expandableItemView = (ExpandableItemView) inflate;
            expandableItemView.setOnBindHeader(new C22151e(fAQActivity, intValue2));
            expandableItemView.setScrollToTopWhenExpanded(true);
            expandableItemView.setScrollableParent(fAQActivity.m71788H2());
            fAQActivity.m71786F2().getViewTreeObserver().addOnGlobalLayoutListener(new C22152f(fAQActivity, inflate));
            expandableItemView.setOnBindItem(new C22153g(aVar, i));
            expandableItemView.setOnStateChanged(new C22154h(inflate));
            ExpandableItemView.m69446y(expandableItemView, 1, false, 2, (Object) null);
            if (aVar.mo67495c().size() == 1) {
                expandableItemView.setExpandable(false);
                expandableItemView.mo53635i(false);
                ((BogImageView) inflate.findViewById(C10322k.f28773Nd)).setAdjustViewBounds(true);
            }
            fAQActivity.m71790J2().addView(inflate);
            i = i2;
        }
    }

    /* renamed from: D2 */
    public final C27917c mo54975D2() {
        C27917c cVar = this.f58896M;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("currType");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_faq;
    }

    /* renamed from: N2 */
    public final void mo54976N2(C27917c cVar) {
        C41536l.m120489i(cVar, "<set-?>");
        this.f58896M = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("FAQ_TYPE");
        C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.faq.FAQType");
        mo54976N2((C27917c) serializableExtra);
        m71791K2().mo54994iw(mo54975D2());
        FAQViewModel K2 = m71791K2();
        String stringExtra = getIntent().getStringExtra("FAQ_CATEGORY");
        C41536l.m120486f(stringExtra);
        K2.mo54996kw(stringExtra);
        FAQViewModel K22 = m71791K2();
        String stringExtra2 = getIntent().getStringExtra("FAQ_ACTION");
        C41536l.m120486f(stringExtra2);
        K22.mo54995jw(stringExtra2);
        FAQViewModel K23 = m71791K2();
        String stringExtra3 = getIntent().getStringExtra("FAQ_LABEL");
        C41536l.m120486f(stringExtra3);
        K23.mo54997lw(stringExtra3);
        m71789I2().setText(getString(C10328q.common_text_help));
        m71792L2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        if (C32335t0.m95361f() == 0) {
            return C10329r.TransparentStatusBarStyle;
        }
        if (C32335t0.m95361f() == 2) {
            return C10329r.TransparentStatusBarWealthStyle;
        }
        return C10329r.TransparentStatusBarSoloStyle;
    }

    public void onBackPressed() {
        m71791K2().mo54993hw();
        super.onBackPressed();
    }

    public final void onDismissClick(View view) {
        C41536l.m120489i(view, "v");
        m71791K2().mo54993hw();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }
}

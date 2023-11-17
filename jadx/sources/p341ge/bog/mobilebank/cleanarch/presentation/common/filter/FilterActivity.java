package p341ge.bog.mobilebank.cleanarch.presentation.common.filter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import b10.C19308a;
import com.github.mikephil.charting.utils.Utils;
import e10.C20126f;
import g91.C32335t0;
import he1.C41217g;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10313b;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity */
public final class FilterActivity extends C35388f2 {

    /* renamed from: O */
    public static final C21508a f57491O = new C21508a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57492F = C41219i.m119470b(new C21514g(this));

    /* renamed from: G */
    private final C41217g f57493G = C41219i.m119470b(new C21513f(this));

    /* renamed from: H */
    private final C41217g f57494H = C41219i.m119470b(new C21511d(this));

    /* renamed from: I */
    private final C41217g f57495I = C41219i.m119470b(new C21516i(this));

    /* renamed from: J */
    private final C41217g f57496J = C41219i.m119470b(new C21515h(this));

    /* renamed from: K */
    private final C41217g f57497K = C41219i.m119470b(new C21512e(this));

    /* renamed from: L */
    private final C41217g f57498L = C41219i.m119470b(new C21510c(this));

    /* renamed from: M */
    private ArrayList f57499M = new ArrayList();

    /* renamed from: N */
    private String f57500N;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$a */
    public static final class C21508a {
        private C21508a() {
        }

        public /* synthetic */ C21508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53714a(Fragment fragment, Activity activity, ArrayList arrayList, String str) {
            C41536l.m120489i(fragment, "fragment");
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(arrayList, "filterItems");
            C41536l.m120489i(str, "analyticsCategory");
            Intent intent = new Intent(activity, FilterActivity.class);
            intent.putExtra("FILTER_ITEMS", arrayList);
            intent.putExtra("ANALYTICS_CATEGORY", str);
            fragment.startActivityForResult(intent, 10025);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$b */
    public static final class C21509b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57501d;

        C21509b(FilterActivity filterActivity) {
            this.f57501d = filterActivity;
        }

        public void onGlobalLayout() {
            this.f57501d.m69531O2().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = this.f57501d.m69531O2().getWidth();
            int height = this.f57501d.m69531O2().getHeight() - this.f57501d.m69528L2().getHeight();
            int b = C32335t0.m95357b();
            int c = C0767a.m2893c(this.f57501d, C10318g.f28616A);
            C20126f fVar = C20126f.f54788a;
            fVar.mo48555f(width, height, b, c, this.f57501d.m69531O2(), this.f57501d.m69530N2());
            fVar.mo48556g(this.f57501d.m69534R2(), this.f57501d.m69532P2(), this.f57501d.m69527K2());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$c */
    static final class C21510c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21510c(FilterActivity filterActivity) {
            super(0);
            this.f57502d = filterActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f57502d.findViewById(C10322k.buttonsContainer);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$d */
    static final class C21511d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21511d(FilterActivity filterActivity) {
            super(0);
            this.f57503d = filterActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f57503d.findViewById(C10322k.customToolbar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$e */
    static final class C21512e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21512e(FilterActivity filterActivity) {
            super(0);
            this.f57504d = filterActivity;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f57504d.findViewById(C10322k.filterContainer);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$f */
    static final class C21513f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21513f(FilterActivity filterActivity) {
            super(0);
            this.f57505d = filterActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f57505d.findViewById(C10322k.filterFab);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$g */
    static final class C21514g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21514g(FilterActivity filterActivity) {
            super(0);
            this.f57506d = filterActivity;
        }

        /* renamed from: b */
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.f57506d.findViewById(C10322k.f28864lt);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$h */
    static final class C21515h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21515h(FilterActivity filterActivity) {
            super(0);
            this.f57507d = filterActivity;
        }

        /* renamed from: b */
        public final NestedScrollView invoke() {
            return (NestedScrollView) this.f57507d.findViewById(C10322k.f28745Ht);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity$i */
    static final class C21516i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FilterActivity f57508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21516i(FilterActivity filterActivity) {
            super(0);
            this.f57508d = filterActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f57508d.findViewById(C10322k.toolbarTitleTV);
        }
    }

    /* renamed from: H2 */
    private final void m69524H2() {
        m69531O2().getViewTreeObserver().addOnGlobalLayoutListener(new C21509b(this));
    }

    /* renamed from: I2 */
    private final void m69525I2() {
        setResult(0, new Intent());
        finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m69526J2(p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter.MultiSelectModel
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001f
            ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView r0 = new ge.bog.mobilebank.cleanarch.presentation.common.filter.items.MultiSelectFilterView
            r0.<init>(r10, r3, r2, r3)
            r2 = r11
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$MultiSelectModel r2 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter.MultiSelectModel) r2
            java.util.ArrayList r2 = r2.mo53793g()
            r0.setItems(r2)
            java.lang.String r2 = r10.f57500N
            r0.setAnalyticsCategory(r2)
            r0.setScrollToTopWhenExpanded(r1)
            goto L_0x0050
        L_0x001f:
            boolean r0 = r11 instanceof p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter.CalendarFilterModel
            if (r0 == 0) goto L_0x0035
            ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView r0 = new ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView
            r6 = 0
            ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView$a r7 = p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView.C21522a.MONTH_PICKER
            r8 = 2
            r9 = 0
            r4 = r0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = r10.f57500N
            r0.setAnalyticsCategory(r1)
            goto L_0x0050
        L_0x0035:
            boolean r0 = r11 instanceof p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter.AccountsSelectModel
            if (r0 == 0) goto L_0x006d
            ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView r0 = new ge.bog.mobilebank.cleanarch.presentation.common.filter.items.AccountFilterView
            r0.<init>(r10, r3, r2, r3)
            r2 = r11
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter$AccountsSelectModel r2 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter.AccountsSelectModel) r2
            java.util.ArrayList r2 = r2.mo53770g()
            r0.setItems(r2)
            java.lang.String r2 = r10.f57500N
            r0.setAnalyticsCategory(r2)
            r0.setScrollToTopWhenExpanded(r1)
        L_0x0050:
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue r1 = r11.mo53766e()
            r0.setValue(r1)
            java.lang.String r1 = r11.mo53765d()
            r0.setTitle(r1)
            java.lang.String r11 = r11.mo53763a()
            r0.setTag(r11)
            android.widget.LinearLayout r11 = r10.m69529M2()
            r11.addView(r0)
            return
        L_0x006d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity.m69526J2(ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final View m69527K2() {
        Object value = this.f57498L.getValue();
        C41536l.m120488h(value, "<get-buttonsContainer>(...)");
        return (View) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final View m69528L2() {
        Object value = this.f57494H.getValue();
        C41536l.m120488h(value, "<get-customToolbar>(...)");
        return (View) value;
    }

    /* renamed from: M2 */
    private final LinearLayout m69529M2() {
        Object value = this.f57497K.getValue();
        C41536l.m120488h(value, "<get-filterContainer>(...)");
        return (LinearLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final View m69530N2() {
        Object value = this.f57493G.getValue();
        C41536l.m120488h(value, "<get-filterFab>(...)");
        return (View) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final ConstraintLayout m69531O2() {
        Object value = this.f57492F.getValue();
        C41536l.m120488h(value, "<get-root>(...)");
        return (ConstraintLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final NestedScrollView m69532P2() {
        Object value = this.f57496J.getValue();
        C41536l.m120488h(value, "<get-scrollView>(...)");
        return (NestedScrollView) value;
    }

    /* renamed from: Q2 */
    private final HashMap m69533Q2() {
        HashMap hashMap = new HashMap();
        LinearLayout M2 = m69529M2();
        int childCount = M2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = M2.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.filter.contract.FilterItem<*>");
            C19308a aVar = (C19308a) childAt;
            hashMap.put(childAt.getTag().toString(), ((C19308a) childAt).getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final BogTextView m69534R2() {
        Object value = this.f57495I.getValue();
        C41536l.m120488h(value, "<get-toolbarTitleTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: S2 */
    private final void m69535S2() {
        m69534R2().setAlpha(Utils.FLOAT_EPSILON);
        m69534R2().setText(getString(C10328q.f28925F4));
        Drawable background = m69530N2().getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(C32335t0.m95357b());
        m69536T2();
    }

    /* renamed from: T2 */
    private final void m69536T2() {
        for (Filter J2 : this.f57499M) {
            m69526J2(J2);
        }
    }

    /* renamed from: U2 */
    private final void m69537U2() {
        C36546y.m108282F().mo27152s(this.f57500N, "", "submit_filter");
        Intent intent = new Intent();
        intent.putExtra("FILTER_COLLECTED_VALUES", m69533Q2());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_filter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        overridePendingTransition(0, 0);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("FILTER_ITEMS");
        C41536l.m120486f(parcelableArrayListExtra);
        this.f57499M = parcelableArrayListExtra;
        this.f57500N = getIntent().getStringExtra("ANALYTICS_CATEGORY");
        m69535S2();
        m69524H2();
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

    public void finish() {
        super.finish();
        overridePendingTransition(C10313b.no_change, C10313b.slide_out_bottom);
    }

    public final void onClearFilterClicked(View view) {
        C41536l.m120489i(view, "v");
        C36546y.m108282F().mo27152s(this.f57500N, "", "reset_filter");
        LinearLayout M2 = m69529M2();
        int childCount = M2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = M2.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.filter.contract.FilterItem<ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue>");
            ((C19308a) childAt).setValue(((Filter) this.f57499M.get(i)).mo53764b());
        }
        m69537U2();
    }

    public final void onDismissClick(View view) {
        C41536l.m120489i(view, "v");
        C36546y.m108282F().mo27152s(this.f57500N, "", "cancel_filter");
        m69525I2();
    }

    public final void onSubmitFilterClicked(View view) {
        C41536l.m120489i(view, "v");
        m69537U2();
    }
}

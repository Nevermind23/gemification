package p341ge.bog.designsystem.components.depositheader;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1152f3;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9887c3;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18338b0;
import p642vh.C18355e0;
import p642vh.C18368l;
import p697zh.C19023a;
import p697zh.C19028d;
import p697zh.C19030e;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView */
public final class DepositHeaderView extends LayerView {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39334n;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9887c3 f39335d;

    /* renamed from: e */
    private C13293b f39336e;

    /* renamed from: f */
    private final C18355e0 f39337f;

    /* renamed from: g */
    private final C18355e0 f39338g;

    /* renamed from: h */
    private final C18355e0 f39339h;

    /* renamed from: i */
    private final C18355e0 f39340i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C19028d f39341j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C13292a f39342k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List f39343l;

    /* renamed from: m */
    private final C41555e f39344m;

    /* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView$a */
    public interface C13292a {
        /* renamed from: M0 */
        void mo35569M0(String str);
    }

    /* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView$b */
    public enum C13293b {
        CLEAR(false, false),
        SLIDER(true, false),
        SLIDER_WITH_INTEREST_RATE(true, true);
        

        /* renamed from: f */
        public static final C13294a f39345f = null;

        /* renamed from: d */
        private final boolean f39350d;

        /* renamed from: e */
        private final boolean f39351e;

        /* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView$b$a */
        public static final class C13294a {
            private C13294a() {
            }

            public /* synthetic */ C13294a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13293b mo35572a(int i) {
                for (C13293b bVar : C13293b.values()) {
                    if (bVar.ordinal() == i) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            f39345f = new C13294a((DefaultConstructorMarker) null);
        }

        private C13293b(boolean z, boolean z2) {
            this.f39350d = z;
            this.f39351e = z2;
        }

        /* renamed from: b */
        public final boolean mo35570b() {
            return this.f39350d;
        }

        /* renamed from: c */
        public final boolean mo35571c() {
            return this.f39351e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView$c */
    public static final class C13295c extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ DepositHeaderView f39352a;

        C13295c(DepositHeaderView depositHeaderView) {
            this.f39352a = depositHeaderView;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m50031b(View view, DepositHeaderView depositHeaderView, int i) {
            C41536l.m120489i(depositHeaderView, "this$0");
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (depositHeaderView.f39335d.f26855n.getLayoutParams().height != view.getMeasuredHeight()) {
                ViewPager2 viewPager2 = depositHeaderView.f39335d.f26855n;
                C41536l.m120488h(viewPager2, "binding.viewPager");
                ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = view.getMeasuredHeight();
                    viewPager2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            depositHeaderView.m50024k(i);
        }

        public void onPageSelected(int i) {
            RecyclerView.C1747p pVar;
            super.onPageSelected(i);
            int a = this.f39352a.getSlider().mo46117b().mo46119a(this.f39352a.f39343l.size(), i);
            DepositHeaderView depositHeaderView = this.f39352a;
            ViewPager2 viewPager2 = depositHeaderView.f39335d.f26855n;
            C41536l.m120488h(viewPager2, "binding.viewPager");
            RecyclerView e = depositHeaderView.m50023j(viewPager2);
            View view = null;
            if (e != null) {
                pVar = e.getLayoutManager();
            } else {
                pVar = null;
            }
            if (pVar != null) {
                view = pVar.mo5199O(i);
            }
            if (view != null) {
                view.post(new C19030e(view, this.f39352a, a));
            }
            C13292a c = this.f39352a.f39342k;
            if (c != null) {
                c.mo35569M0(((C19023a) this.f39352a.f39343l.get(a)).mo47197e());
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.depositheader.DepositHeaderView$d */
    public static final class C13296d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ DepositHeaderView f39353a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13296d(Object obj, DepositHeaderView depositHeaderView) {
            super(obj);
            this.f39353a = depositHeaderView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18338b0 b0Var = (C18338b0) obj2;
            C18338b0 b0Var2 = (C18338b0) obj;
            this.f39353a.f39341j.mo47217i(b0Var);
            ViewPager2 viewPager2 = this.f39353a.f39335d.f26855n;
            viewPager2.setAdapter((RecyclerView.C1736h) null);
            viewPager2.setAdapter(this.f39353a.f39341j);
            viewPager2.mo6606l(b0Var.mo46118c().mo46123a(this.f39353a.f39343l.size()), false);
        }
    }

    static {
        Class<DepositHeaderView> cls = DepositHeaderView.class;
        f39334n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "annualInterestRateTitle", "getAnnualInterestRateTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "effectiveInterestRateTitle", "getEffectiveInterestRateTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "annualInterestRate", "getAnnualInterestRate()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "effectiveInterestRate", "getEffectiveInterestRate()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "slider", "getSlider()Lge/bog/designsystem/components/common/Slider;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DepositHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final CharSequence getAnnualInterestRate() {
        return this.f39339h.getValue(this, f39334n[2]);
    }

    private final CharSequence getEffectiveInterestRate() {
        return this.f39340i.getValue(this, f39334n[3]);
    }

    /* access modifiers changed from: private */
    public final C18338b0 getSlider() {
        return (C18338b0) this.f39344m.getValue(this, f39334n[4]);
    }

    /* renamed from: h */
    private final void m50021h() {
        this.f39335d.f26855n.mo6603h(new C13295c(this));
    }

    /* renamed from: i */
    private final void m50022i(C13293b bVar) {
        int i;
        int i2 = 0;
        if (bVar.mo35570b()) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
            setLayerStyle(C17786k.LayerRadiusBottom12Shadow20);
        } else {
            setBackgroundColor(0);
            ViewPager2 viewPager2 = this.f39335d.f26855n;
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            viewPager2.setLayoutParams(marginLayoutParams);
        }
        ConstraintLayout constraintLayout = this.f39335d.f26852k;
        if (bVar.mo35571c()) {
            i = 0;
        } else {
            i = 8;
        }
        constraintLayout.setVisibility(i);
        Button button = this.f39335d.f26853l;
        if (bVar == C13293b.CLEAR) {
            i2 = 8;
        }
        button.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final RecyclerView m50023j(ViewPager2 viewPager2) {
        for (View view : C1152f3.m4215b(viewPager2)) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m50024k(int i) {
        if (this.f39336e != C13293b.CLEAR) {
            C19023a aVar = (C19023a) this.f39343l.get(i);
            setAnnualInterestRate(aVar.mo47193a());
            setEffectiveInterestRate(aVar.mo47196d());
        }
    }

    private final void setAnnualInterestRate(CharSequence charSequence) {
        this.f39339h.setValue(this, f39334n[2], charSequence);
    }

    private final void setEffectiveInterestRate(CharSequence charSequence) {
        this.f39340i.setValue(this, f39334n[3], charSequence);
    }

    private final void setSlider(C18338b0 b0Var) {
        this.f39344m.setValue(this, f39334n[4], b0Var);
    }

    public final CharSequence getAnnualInterestRateTitle() {
        return this.f39337f.getValue(this, f39334n[0]);
    }

    public final CharSequence getEffectiveInterestRateTitle() {
        return this.f39338g.getValue(this, f39334n[1]);
    }

    public final Button getMainButton() {
        Button button = this.f39335d.f26853l;
        C41536l.m120488h(button, "binding.mainButton");
        return button;
    }

    public final C13293b getType() {
        return this.f39336e;
    }

    public final void setAnnualInterestRateTitle(CharSequence charSequence) {
        this.f39337f.setValue(this, f39334n[0], charSequence);
    }

    public final void setDepositSelectionListener(C13292a aVar) {
        this.f39342k = aVar;
    }

    public final void setEffectiveInterestRateTitle(CharSequence charSequence) {
        this.f39338g.setValue(this, f39334n[1], charSequence);
    }

    public final void setMultipleDeposit(List<C19023a> list) {
        List<C19023a> list2;
        int i;
        C41536l.m120489i(list, "depositDetails");
        if (this.f39336e == C13293b.CLEAR) {
            list2 = C41339p.m119900e(C41358y.m120007W(list));
        } else {
            list2 = list;
        }
        this.f39343l = list2;
        C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, list.size(), C17786k.f49830h, false, false, 12, (Object) null);
        ViewPager2 viewPager2 = this.f39335d.f26855n;
        C41536l.m120488h(viewPager2, "binding.viewPager");
        FrameLayout frameLayout = this.f39335d.f26854m;
        C41536l.m120488h(frameLayout, "binding.pagerIndicatorContainer");
        setSlider(b.mo46116a(viewPager2, frameLayout));
        this.f39341j.mo47219k(list);
        FrameLayout frameLayout2 = this.f39335d.f26854m;
        if (list.size() > 1) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout2.setVisibility(i);
    }

    public final void setSingleDeposit(C19023a aVar) {
        C41536l.m120489i(aVar, "depositDetails");
        setMultipleDeposit(C41339p.m119900e(aVar));
    }

    public final void setType(C13293b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f39336e = bVar;
        m50022i(bVar);
        this.f39341j.mo47218j(this.f39336e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9887c3 c = C9887c3.m36266c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39335d = c;
        C13293b bVar = C13293b.CLEAR;
        this.f39336e = bVar;
        TextView textView = c.f26846e;
        C41536l.m120488h(textView, "binding.annualInterestRateText");
        this.f39337f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = c.f26849h;
        C41536l.m120488h(textView2, "binding.effectiveInterestRateText");
        this.f39338g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = c.f26847f;
        C41536l.m120488h(textView3, "binding.annualInterestRateValueText");
        this.f39339h = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView4 = c.f26850i;
        C41536l.m120488h(textView4, "binding.effectiveInterestRateValueText");
        this.f39340i = new C18355e0(textView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C19028d dVar = new C19028d();
        this.f39341j = dVar;
        this.f39343l = C41341q.m119907j();
        C41551a aVar = C41551a.f97718a;
        this.f39344m = new C13296d(C18338b0.C18346e.f51796d, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        c.f26855n.setAdapter(dVar);
        m50021h();
        int[] iArr = C17787l.f50331g4;
        C41536l.m120488h(iArr, "DepositHeaderView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C13293b a = C13293b.f39345f.mo35572a(obtainStyledAttributes.getInt(C17787l.f50347h4, 0));
        setType(a != null ? a : bVar);
        obtainStyledAttributes.recycle();
    }
}

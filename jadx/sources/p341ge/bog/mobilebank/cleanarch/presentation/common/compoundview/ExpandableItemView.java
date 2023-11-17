package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import z00.C30125a;
import z00.C30126b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView */
public class ExpandableItemView extends LinearLayout {

    /* renamed from: t */
    public static final C21487a f57408t = new C21487a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private int f57409d;

    /* renamed from: e */
    private int f57410e;

    /* renamed from: f */
    public View f57411f;

    /* renamed from: g */
    private int f57412g;

    /* renamed from: h */
    private boolean f57413h;

    /* renamed from: i */
    private View f57414i;

    /* renamed from: j */
    private int f57415j;

    /* renamed from: k */
    private boolean f57416k;

    /* renamed from: l */
    private boolean f57417l;

    /* renamed from: m */
    private boolean f57418m;

    /* renamed from: n */
    private C21488b f57419n;

    /* renamed from: o */
    private final C41217g f57420o;

    /* renamed from: p */
    private C43075l f57421p;

    /* renamed from: q */
    private C43079p f57422q;

    /* renamed from: r */
    private C43075l f57423r;

    /* renamed from: s */
    private C43064a f57424s;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$a */
    public static final class C21487a {
        private C21487a() {
        }

        public /* synthetic */ C21487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$b */
    public enum C21488b {
        LOADING,
        ERROR,
        NORMAL
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$c */
    public /* synthetic */ class C21489c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57429a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$b[] r0 = p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.C21488b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$b r1 = p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.C21488b.LOADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$b r1 = p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.C21488b.ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$b r1 = p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.C21488b.NORMAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f57429a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.C21489c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$d */
    static final class C21490d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExpandableItemView f57430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21490d(ExpandableItemView expandableItemView) {
            super(0);
            this.f57430d = expandableItemView;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return this.f57430d.m69435h();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView$e */
    static final class C21491e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExpandableItemView f57431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21491e(ExpandableItemView expandableItemView) {
            super(0);
            this.f57431d = expandableItemView;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m69457b(ExpandableItemView expandableItemView) {
            C41536l.m120489i(expandableItemView, "this$0");
            expandableItemView.m69439p();
        }

        public final void invoke() {
            this.f57431d.getContainer().post(new C21500a(this.f57431d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.f57416k = true;
        this.f57418m = true;
        this.f57419n = C21488b.NORMAL;
        this.f57420o = C41219i.m119470b(new C21490d(this));
        this.f57409d = i;
        this.f57410e = i2;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (attributeSet != null) {
            m69438l(attributeSet);
        }
        m69445v();
    }

    /* renamed from: g */
    public static /* synthetic */ void m69434g(ExpandableItemView expandableItemView, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = expandableItemView.f57416k;
            }
            expandableItemView.mo53625f(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
    }

    /* access modifiers changed from: private */
    public final LinearLayout getContainer() {
        return (LinearLayout) this.f57420o.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final LinearLayout m69435h() {
        int i;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        if (!this.f57418m) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        return linearLayout;
    }

    /* renamed from: j */
    public static /* synthetic */ void m69436j(ExpandableItemView expandableItemView, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = expandableItemView.f57416k;
            }
            expandableItemView.mo53635i(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
    }

    /* renamed from: k */
    private final void m69437k(View view, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "scrollY", new int[]{i});
        ofInt.setDuration(300);
        ofInt.start();
    }

    /* renamed from: l */
    private final void m69438l(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29253b3);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableItemView)");
        this.f57409d = obtainStyledAttributes.getResourceId(C10330s.f29264c3, this.f57409d);
        this.f57410e = obtainStyledAttributes.getResourceId(C10330s.f29286e3, this.f57410e);
        setExpandable(obtainStyledAttributes.getBoolean(C10330s.f29275d3, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m69439p() {
        Object obj = this.f57414i;
        if (obj == null) {
            ViewParent parent = getParent();
            if (parent != null) {
                obj = parent.getParent();
            } else {
                obj = null;
            }
        }
        if (obj == null) {
            return;
        }
        if (obj instanceof NestedScrollView) {
            m69437k((View) obj, getTop() + this.f57415j);
        } else if (obj instanceof RecyclerView) {
            View view = this;
            while (!(view.getParent() instanceof RecyclerView)) {
                ViewParent parent2 = view.getParent();
                C41536l.m120487g(parent2, "null cannot be cast to non-null type android.view.View");
                view = (View) parent2;
            }
            ((RecyclerView) obj).mo5258E1(0, view.getTop() + this.f57415j, (Interpolator) null, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
        }
    }

    /* renamed from: q */
    private final void m69440q() {
        getContainer().getLayoutParams().height = 1;
        getContainer().invalidate();
    }

    /* renamed from: r */
    private final void m69441r() {
        View inflate = LayoutInflater.from(getContext()).inflate(this.f57409d, this, false);
        C41536l.m120488h(inflate, "from(context).inflate(headerLayoutId, this, false)");
        setHeaderView(inflate);
        getHeaderView().setOnClickListener(new C30125a(this));
        C43075l lVar = this.f57421p;
        if (lVar != null) {
            lVar.invoke(getHeaderView());
        }
        addView(getHeaderView());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m69442s(ExpandableItemView expandableItemView, View view) {
        C41536l.m120489i(expandableItemView, "this$0");
        expandableItemView.mo53648w();
    }

    private final void setState(C21488b bVar) {
        boolean z;
        this.f57419n = bVar;
        int i = this.f57412g;
        if (bVar == C21488b.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        mo53649x(i, z);
    }

    /* renamed from: t */
    private final void m69443t() {
        getContainer().removeAllViews();
        int i = C21489c.f57429a[this.f57419n.ordinal()];
        if (i == 1) {
            View inflate = LayoutInflater.from(getContext()).inflate(C10324m.operaion_loading_item, getContainer(), false);
            inflate.startAnimation(AnimationUtils.loadAnimation(getContext(), C10313b.infinite_alpha));
            getContainer().addView(inflate);
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C10324m.operation_error_item, getContainer(), false);
            inflate2.findViewById(C10322k.f28793Ts).setOnClickListener(new C30126b(this));
            getContainer().addView(inflate2);
        } else if (i == 3) {
            int i2 = this.f57412g;
            for (int i3 = 0; i3 < i2; i3++) {
                View inflate3 = LayoutInflater.from(getContext()).inflate(this.f57410e, getContainer(), false);
                C43079p pVar = this.f57422q;
                if (pVar != null) {
                    C41536l.m120488h(inflate3, "expandedItemView");
                    pVar.invoke(inflate3, Integer.valueOf(i3));
                }
                getContainer().addView(inflate3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m69444u(ExpandableItemView expandableItemView, View view) {
        C41536l.m120489i(expandableItemView, "this$0");
        C43064a aVar = expandableItemView.f57424s;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: v */
    private final void m69445v() {
        removeAllViews();
        m69441r();
        m69440q();
        addView(getContainer());
    }

    /* renamed from: y */
    public static /* synthetic */ void m69446y(ExpandableItemView expandableItemView, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            expandableItemView.mo53649x(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItems");
    }

    /* renamed from: f */
    public final void mo53625f(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        if (this.f57418m) {
            ImageView imageView = (ImageView) getHeaderView().findViewById(C10322k.arrowIV);
            if (z) {
                Animation c = C32290b1.m95113c(getContainer());
                if (!(imageView == null || (animate2 = imageView.animate()) == null || (duration2 = animate2.setDuration(c.getDuration())) == null)) {
                    duration2.rotation(Utils.FLOAT_EPSILON);
                }
                C43075l lVar = this.f57423r;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
            } else {
                if (!(imageView == null || (animate = imageView.animate()) == null || (duration = animate.setDuration(0)) == null)) {
                    duration.rotation(Utils.FLOAT_EPSILON);
                }
                getContainer().setVisibility(8);
                C43075l lVar2 = this.f57423r;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.FALSE);
                }
            }
            this.f57417l = false;
        }
    }

    public final boolean getAnimateChanges() {
        return this.f57416k;
    }

    public final View getHeaderView() {
        View view = this.f57411f;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("headerView");
        return null;
    }

    public final C43075l getOnBindHeader() {
        return this.f57421p;
    }

    public final C43079p getOnBindItem() {
        return this.f57422q;
    }

    public final C43064a getOnRetryButtonClicked() {
        return this.f57424s;
    }

    public final C43075l getOnStateChanged() {
        return this.f57423r;
    }

    public final int getScrollOffset() {
        return this.f57415j;
    }

    public final boolean getScrollToTopWhenExpanded() {
        return this.f57413h;
    }

    public final View getScrollableParent() {
        return this.f57414i;
    }

    /* renamed from: i */
    public final void mo53635i(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        m69443t();
        ImageView imageView = (ImageView) getHeaderView().findViewById(C10322k.arrowIV);
        if (z) {
            Animation d = C32290b1.m95114d(getContainer());
            if (this.f57413h) {
                C41536l.m120488h(d, "expandAnim");
                C32343x.m95435b1(d, (C43064a) null, new C21491e(this), (C43064a) null, 5, (Object) null);
            }
            if (!(imageView == null || (animate2 = imageView.animate()) == null || (duration2 = animate2.setDuration(d.getDuration())) == null)) {
                duration2.rotation(-180.0f);
            }
            C43075l lVar = this.f57423r;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else {
            if (!(imageView == null || (animate = imageView.animate()) == null || (duration = animate.setDuration(0)) == null)) {
                duration.rotation(-180.0f);
            }
            getContainer().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            getContainer().setVisibility(0);
            C43075l lVar2 = this.f57423r;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.TRUE);
            }
        }
        this.f57417l = true;
    }

    /* renamed from: m */
    public final boolean mo53636m() {
        if (!this.f57418m) {
            return true;
        }
        return this.f57417l;
    }

    /* renamed from: n */
    public void mo48121n() {
        C43075l lVar = this.f57421p;
        if (lVar != null) {
            lVar.invoke(getHeaderView());
        }
    }

    /* renamed from: o */
    public final void mo53637o() {
        if (this.f57419n == C21488b.NORMAL) {
            LinearLayout container = getContainer();
            int childCount = container.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = container.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                C43079p pVar = this.f57422q;
                if (pVar != null) {
                    pVar.invoke(childAt, Integer.valueOf(i));
                }
            }
        }
    }

    public final void setAnimateChanges(boolean z) {
        this.f57416k = z;
    }

    public final void setExpandable(boolean z) {
        ImageView imageView;
        int i;
        this.f57418m = z;
        if (this.f57411f != null && (imageView = (ImageView) getHeaderView().findViewById(C10322k.arrowIV)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void setHeaderView(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f57411f = view;
    }

    public final void setOnBindHeader(C43075l lVar) {
        this.f57421p = lVar;
    }

    public final void setOnBindItem(C43079p pVar) {
        this.f57422q = pVar;
    }

    public final void setOnRetryButtonClicked(C43064a aVar) {
        this.f57424s = aVar;
    }

    public final void setOnStateChanged(C43075l lVar) {
        this.f57423r = lVar;
    }

    public final void setScrollOffset(int i) {
        this.f57415j = i;
    }

    public final void setScrollToTopWhenExpanded(boolean z) {
        this.f57413h = z;
    }

    public final void setScrollableParent(View view) {
        this.f57414i = view;
    }

    /* renamed from: w */
    public final void mo53648w() {
        if (this.f57418m) {
            if (mo53636m()) {
                m69434g(this, false, 1, (Object) null);
            } else {
                m69436j(this, false, 1, (Object) null);
            }
        }
    }

    /* renamed from: x */
    public final void mo53649x(int i, boolean z) {
        this.f57412g = i;
        mo48121n();
        boolean z2 = this.f57418m;
        int i2 = 0;
        if (!z2) {
            mo53635i(false);
        } else if (!z || !z2) {
            m69443t();
        } else {
            mo53625f(false);
        }
        ImageView imageView = (ImageView) getHeaderView().findViewById(C10322k.arrowIV);
        if (imageView != null) {
            if (i == 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpandableItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
    }
}

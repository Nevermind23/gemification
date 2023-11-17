package p341ge.bog.designsystem.components.accordion;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p060e1.C5936i0;
import p060e1.C5946j0;
import p060e1.C5958l0;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9951k3;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p601sg.C17788m;
import p628ug.C18160c;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18367k0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.accordion.IconAccordionView */
public final class IconAccordionView extends LayerView {

    /* renamed from: n */
    public static final C13132a f38650n = new C13132a((DefaultConstructorMarker) null);

    /* renamed from: o */
    static final /* synthetic */ C40303i[] f38651o;

    /* renamed from: d */
    private final C9951k3 f38652d;

    /* renamed from: e */
    private final C18367k0 f38653e;

    /* renamed from: f */
    private int f38654f;

    /* renamed from: g */
    private final C41555e f38655g;

    /* renamed from: h */
    private Integer f38656h;

    /* renamed from: i */
    private final C18355e0 f38657i;

    /* renamed from: j */
    private final C18365j0 f38658j;

    /* renamed from: k */
    private final C18365j0 f38659k;

    /* renamed from: l */
    private C5936i0 f38660l;

    /* renamed from: m */
    private C13133b f38661m;

    /* renamed from: ge.bog.designsystem.components.accordion.IconAccordionView$a */
    public static final class C13132a {
        private C13132a() {
        }

        public /* synthetic */ C13132a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.IconAccordionView$b */
    public interface C13133b {
        /* renamed from: a */
        View mo34641a(int i);
    }

    /* renamed from: ge.bog.designsystem.components.accordion.IconAccordionView$c */
    public interface C13134c {
    }

    /* renamed from: ge.bog.designsystem.components.accordion.IconAccordionView$d */
    public static final class C13135d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ IconAccordionView f38662a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13135d(Object obj, IconAccordionView iconAccordionView) {
            super(obj);
            this.f38662a = iconAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f38662a.m49437e(booleanValue);
                this.f38662a.m49439h(booleanValue);
            }
        }
    }

    static {
        Class<IconAccordionView> cls = IconAccordionView.class;
        f38651o = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "transitionView", "getTransitionView()Landroid/view/ViewGroup;", 0)), C41520a0.m120439e(new C41539o(cls, "isExpanded", "isExpanded()Z", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isIconVisible", "isIconVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isExpandableContainerVisible", "isExpandableContainerVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IconAccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m49434b(IconAccordionView iconAccordionView, View view) {
        C41536l.m120489i(iconAccordionView, "this$0");
        iconAccordionView.setExpanded(!iconAccordionView.mo34627f());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m49437e(boolean z) {
        ViewGroup transitionView = getTransitionView();
        if (transitionView == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                transitionView = (ViewGroup) parent;
            } else {
                transitionView = null;
            }
        }
        if (transitionView != null && ViewCompat.m3579V(transitionView)) {
            C5958l0.m23912c(transitionView);
            C5958l0.m23911b(transitionView, this.f38660l);
        }
    }

    /* renamed from: g */
    private final void m49438g() {
        View view;
        this.f38652d.f27199g.removeAllViews();
        int i = this.f38654f;
        for (int i2 = 0; i2 < i; i2++) {
            C13133b bVar = this.f38661m;
            if (bVar != null) {
                view = bVar.mo34641a(i2);
            } else {
                view = null;
            }
            if (view != null) {
                this.f38652d.f27199g.addView(view);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m49439h(boolean z) {
        float f;
        setExpandableContainerVisible(z);
        ViewPropertyAnimator animate = this.f38652d.f27197e.animate();
        if (mo34627f()) {
            f = -180.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        animate.rotation(f).setDuration(150).start();
    }

    /* renamed from: f */
    public final boolean mo34627f() {
        return ((Boolean) this.f38655g.getValue(this, f38651o[1])).booleanValue();
    }

    public final int getItemCount() {
        return this.f38654f;
    }

    public final CharSequence getTitle() {
        return this.f38657i.getValue(this, f38651o[2]);
    }

    public final ViewGroup getTransitionView() {
        return (ViewGroup) this.f38653e.mo46152a(this, f38651o[0]);
    }

    /* renamed from: i */
    public final void mo34631i(int i) {
        this.f38654f = i;
        m49438g();
    }

    public final void setExpandableContainerVisible(boolean z) {
        this.f38659k.mo46151c(this, f38651o[4], z);
    }

    public final void setExpanded(boolean z) {
        this.f38655g.setValue(this, f38651o[1], Boolean.valueOf(z));
    }

    public final void setIcon(Integer num) {
        boolean z;
        Drawable drawable = null;
        if (num != null) {
            try {
                drawable = C5769a.m23210b(getContext(), num.intValue());
            } catch (Exception unused) {
            }
        }
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        setIconVisible(z);
        this.f38652d.f27201i.setImageDrawable(drawable);
        this.f38656h = num;
    }

    public final void setIconVisible(boolean z) {
        this.f38658j.mo46151c(this, f38651o[3], z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final void setOnCreateViewListener(C13133b bVar) {
        this.f38661m = bVar;
    }

    public final void setOnToggleListener(C13134c cVar) {
    }

    public final void setTitle(CharSequence charSequence) {
        this.f38657i.setValue(this, f38651o[2], charSequence);
    }

    public final void setTransitionView(ViewGroup viewGroup) {
        this.f38653e.mo46153b(this, f38651o[0], viewGroup);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconAccordionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconAccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9951k3 c = C9951k3.m36498c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38652d = c;
        this.f38653e = new C18367k0();
        C41551a aVar = C41551a.f97718a;
        this.f38655g = new C13135d(Boolean.FALSE, this);
        AppCompatTextView appCompatTextView = c.f27202j;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f38657i = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27201i;
        C41536l.m120488h(appCompatImageView, "binding.iconImage");
        this.f38658j = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        LinearLayout linearLayout = c.f27200h;
        C41536l.m120488h(linearLayout, "binding.expandableContainer");
        this.f38659k = new C18365j0(linearLayout, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setLayerStyle(C17786k.f49834t);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        C5936i0 e = C5946j0.m23875c(context).mo19369e(C17788m.f50640a);
        C41536l.m120488h(e, "from(context).inflateTra…ition.accordion_dropdown)");
        this.f38660l = e;
        super.setOnClickListener(new C18160c(this));
        m49439h(false);
        int[] iArr = C17787l.f50230a;
        C41536l.m120488h(iArr, "AccordionView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIcon(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50246b, 0)));
        setTitle(obtainStyledAttributes.getString(C17787l.f50262c));
        obtainStyledAttributes.recycle();
    }
}

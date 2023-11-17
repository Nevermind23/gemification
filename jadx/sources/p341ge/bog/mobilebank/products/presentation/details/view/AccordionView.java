package p341ge.bog.mobilebank.products.presentation.details.view;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41224m;
import hy0.C36268b;
import hy0.C36275i;
import hy0.C36276j;
import iy0.C36646w1;
import iy0.C36652y1;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p060e1.C5936i0;
import p060e1.C5946j0;
import p060e1.C5955k0;
import p060e1.C5958l0;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p642vh.C18354e;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18367k0;
import ue1.C43064a;
import ue1.C43075l;
import vz0.C39498a;

/* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView */
public final class AccordionView extends LayerView {

    /* renamed from: n */
    public static final C34264a f83146n = new C34264a((DefaultConstructorMarker) null);

    /* renamed from: o */
    static final /* synthetic */ C40303i[] f83147o;

    /* renamed from: d */
    private final C36652y1 f83148d;

    /* renamed from: e */
    private final C18367k0 f83149e;

    /* renamed from: f */
    private final C41555e f83150f;

    /* renamed from: g */
    private final C18355e0 f83151g;

    /* renamed from: h */
    private final C18355e0 f83152h;

    /* renamed from: i */
    private final C18365j0 f83153i;

    /* renamed from: j */
    private final C18365j0 f83154j;

    /* renamed from: k */
    private final C18354e f83155k;

    /* renamed from: l */
    private C5936i0 f83156l;

    /* renamed from: m */
    private C34266c f83157m;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView$a */
    public static final class C34264a {
        private C34264a() {
        }

        public /* synthetic */ C34264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView$b */
    public interface C34265b {
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView$c */
    public interface C34266c {
        /* renamed from: a */
        void mo82659a(boolean z);
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView$d */
    private static final class C34267d extends C5955k0 {

        /* renamed from: d */
        private final C34266c f83158d;

        /* renamed from: e */
        private final boolean f83159e;

        public C34267d(C34266c cVar, boolean z) {
            C41536l.m120489i(cVar, "listener");
            this.f83158d = cVar;
            this.f83159e = z;
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            C41536l.m120489i(i0Var, "transition");
            i0Var.mo19343k0(this);
            this.f83158d.mo82659a(this.f83159e);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.view.AccordionView$e */
    public static final class C34268e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ AccordionView f83160a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34268e(Object obj, AccordionView accordionView) {
            super(obj);
            this.f83160a = accordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f83160a.m100773e(booleanValue);
                this.f83160a.m100774g(booleanValue);
            }
        }
    }

    static {
        Class<AccordionView> cls = AccordionView.class;
        f83147o = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "transitionView", "getTransitionView()Landroid/view/ViewGroup;", 0)), C41520a0.m120439e(new C41539o(cls, "isExpanded", "isExpanded()Z", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleValue", "getTitleValue()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isExpandableContainerVisible", "isExpandableContainerVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isButtonVisible", "isButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m100770b(AccordionView accordionView, View view) {
        C41536l.m120489i(accordionView, "this$0");
        accordionView.setExpanded(!accordionView.mo82641f());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m100773e(boolean z) {
        ViewGroup transitionView = getTransitionView();
        if (transitionView == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                transitionView = (ViewGroup) parent;
            } else {
                transitionView = null;
            }
        }
        if (transitionView == null || !ViewCompat.m3579V(transitionView)) {
            C34266c cVar = this.f83157m;
            if (cVar != null && cVar != null) {
                cVar.mo82659a(z);
                return;
            }
            return;
        }
        C5958l0.m23912c(transitionView);
        C34266c cVar2 = this.f83157m;
        if (cVar2 != null) {
            this.f83156l.mo19333a(new C34267d(cVar2, z));
        }
        C5958l0.m23911b(transitionView, this.f83156l);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m100774g(boolean z) {
        float f;
        setExpandableContainerVisible(z);
        ViewPropertyAnimator animate = this.f83148d.f88466e.animate();
        if (mo82641f()) {
            f = -180.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        animate.rotation(f).setDuration(150).start();
    }

    /* renamed from: f */
    public final boolean mo82641f() {
        return ((Boolean) this.f83150f.getValue(this, f83147o[1])).booleanValue();
    }

    public final CharSequence getButtonText() {
        return this.f83155k.getValue(this, f83147o[6]);
    }

    public final CharSequence getTitle() {
        return this.f83151g.getValue(this, f83147o[2]);
    }

    public final CharSequence getTitleValue() {
        return this.f83152h.getValue(this, f83147o[3]);
    }

    public final ViewGroup getTransitionView() {
        return (ViewGroup) this.f83149e.mo46152a(this, f83147o[0]);
    }

    /* renamed from: h */
    public final void mo82646h(boolean z) {
        FrameLayout frameLayout = this.f83148d.f88470i;
        C41536l.m120488h(frameLayout, "binding.itemBelowContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "onClickListener");
        this.f83148d.f88467f.setOnClickListener(onClickListener);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f83155k.setValue(this, f83147o[6], charSequence);
    }

    public final void setButtonVisible(boolean z) {
        this.f83154j.mo46151c(this, f83147o[5], z);
    }

    public final void setExpandableContainerVisible(boolean z) {
        this.f83153i.mo46151c(this, f83147o[4], z);
    }

    public final void setExpanded(boolean z) {
        this.f83150f.setValue(this, f83147o[1], Boolean.valueOf(z));
    }

    public final void setItemBelowContainer(View view) {
        C41536l.m120489i(view, "view");
        FrameLayout frameLayout = this.f83148d.f88470i;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    public final void setItems(List<C41224m> list) {
        C41536l.m120489i(list, "items");
        this.f83148d.f88468g.removeAllViews();
        for (C41224m mVar : list) {
            C36646w1 d = C36646w1.m108720d(LayoutInflater.from(getContext()), this, false);
            C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, false)");
            d.f88451e.setText((CharSequence) mVar.mo95678e());
            d.f88452f.setText((CharSequence) mVar.mo95680f());
            this.f83148d.f88468g.addView(d.mo3946b());
        }
    }

    public final void setOnCreateViewListener(C34265b bVar) {
    }

    public final void setOnToggleListener(C34266c cVar) {
        this.f83157m = cVar;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f83151g.setValue(this, f83147o[2], charSequence);
    }

    public final void setTitleValue(CharSequence charSequence) {
        this.f83152h.setValue(this, f83147o[3], charSequence);
    }

    public final void setTransitionView(ViewGroup viewGroup) {
        this.f83149e.mo46153b(this, f83147o[0], viewGroup);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccordionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C36652y1 c = C36652y1.m108744c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f83148d = c;
        this.f83149e = new C18367k0();
        C41551a aVar = C41551a.f97718a;
        this.f83150f = new C34268e(Boolean.FALSE, this);
        AppCompatTextView appCompatTextView = c.f88471j;
        C41536l.m120488h(appCompatTextView, "binding.titleLabelText");
        this.f83151g = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f88472k;
        C41536l.m120488h(appCompatTextView2, "binding.titleValueText");
        this.f83152h = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        LinearLayout linearLayout = c.f88469h;
        C41536l.m120488h(linearLayout, "binding.expandableContainer");
        this.f83153i = new C18365j0(linearLayout, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        Button button = c.f88467f;
        C41536l.m120488h(button, "binding.button");
        this.f83154j = new C18365j0(button, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        Button button2 = c.f88467f;
        C41536l.m120488h(button2, "binding.button");
        this.f83155k = new C18354e(button2);
        setLayerStyle(C36275i.f87585c);
        setBackgroundColor(C0767a.m2893c(context2, C36268b.f87450b));
        C5936i0 e = C5946j0.m23875c(context).mo19369e(C36276j.f87587a);
        C41536l.m120488h(e, "from(context).inflateTra…ition.accordion_dropdown)");
        this.f83156l = e;
        super.setOnClickListener(new C39498a(this));
    }
}

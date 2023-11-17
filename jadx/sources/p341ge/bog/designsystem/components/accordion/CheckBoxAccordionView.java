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
import android.widget.CompoundButton;
import android.widget.LinearLayout;
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
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9934i2;
import p601sg.C17777b;
import p601sg.C17787l;
import p601sg.C17788m;
import p628ug.C18158a;
import p628ug.C18159b;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18367k0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView */
public final class CheckBoxAccordionView extends LinearLayout {

    /* renamed from: t */
    public static final C13123b f38626t = new C13123b((DefaultConstructorMarker) null);

    /* renamed from: u */
    static final /* synthetic */ C40303i[] f38627u;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9934i2 f38628d;

    /* renamed from: e */
    private final C18367k0 f38629e;

    /* renamed from: f */
    private int f38630f;

    /* renamed from: g */
    private final C41555e f38631g;

    /* renamed from: h */
    private final C18355e0 f38632h;

    /* renamed from: i */
    private final C41555e f38633i;

    /* renamed from: j */
    private final C41555e f38634j;

    /* renamed from: k */
    private final C18365j0 f38635k;

    /* renamed from: l */
    private final C18365j0 f38636l;

    /* renamed from: m */
    private final C18365j0 f38637m;

    /* renamed from: n */
    private final C18365j0 f38638n;

    /* renamed from: o */
    private final C41555e f38639o;

    /* renamed from: p */
    private final C41555e f38640p;

    /* renamed from: q */
    private final C41555e f38641q;

    /* renamed from: r */
    private C5936i0 f38642r;

    /* renamed from: s */
    private C13124c f38643s;

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$a */
    public interface C13122a {
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$b */
    public static final class C13123b {
        private C13123b() {
        }

        public /* synthetic */ C13123b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$c */
    public interface C13124c {
        /* renamed from: a */
        View mo34626a(int i);
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$d */
    public interface C13125d {
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$e */
    public static final class C13126e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38644a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13126e(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38644a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f38644a.m49425g(booleanValue);
                this.f38644a.m49429l(booleanValue);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$f */
    public static final class C13127f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38645a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13127f(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38645a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            CharSequence charSequence = (CharSequence) obj2;
            if (!C41536l.m120484d((CharSequence) obj, charSequence)) {
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f38645a.f38628d.f27101l.setVisibility(8);
                } else {
                    this.f38645a.f38628d.f27101l.setVisibility(0);
                }
                this.f38645a.f38628d.f27101l.setText(charSequence);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$g */
    public static final class C13128g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38646a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13128g(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38646a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f38646a.f38628d.f27095f.setChecked(booleanValue);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$h */
    public static final class C13129h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38647a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13129h(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38647a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                this.f38647a.f38628d.f27099j.setColorFilter(this.f38647a.getIconTint());
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$i */
    public static final class C13130i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38648a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13130i(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38648a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            int intValue = ((Number) obj2).intValue();
            if (((Number) obj).intValue() != intValue) {
                this.f38648a.f38628d.f27101l.setTextColor(intValue);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.accordion.CheckBoxAccordionView$j */
    public static final class C13131j extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CheckBoxAccordionView f38649a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13131j(Object obj, CheckBoxAccordionView checkBoxAccordionView) {
            super(obj);
            this.f38649a = checkBoxAccordionView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            int intValue = ((Number) obj2).intValue();
            if (((Number) obj).intValue() != intValue) {
                this.f38649a.f38628d.f27098i.setBackgroundColor(intValue);
            }
        }
    }

    static {
        Class<CheckBoxAccordionView> cls = CheckBoxAccordionView.class;
        f38627u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "transitionView", "getTransitionView()Landroid/view/ViewGroup;", 0)), C41520a0.m120439e(new C41539o(cls, "isExpanded", "isExpanded()Z", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "subTitle", "getSubTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isChecked", "isChecked()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isCheckBoxVisible", "isCheckBoxVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isIconVisible", "isIconVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isDividerVisible", "isDividerVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isExpandableContainerVisible", "isExpandableContainerVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()I", 0)), C41520a0.m120439e(new C41539o(cls, "subtitleColor", "getSubtitleColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "dividerColor", "getDividerColor()I", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckBoxAccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m49421c(CheckBoxAccordionView checkBoxAccordionView, View view) {
        C41536l.m120489i(checkBoxAccordionView, "this$0");
        checkBoxAccordionView.setExpanded(!checkBoxAccordionView.mo34608j());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m49425g(boolean z) {
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
            C5958l0.m23911b(transitionView, this.f38642r);
        }
    }

    /* renamed from: h */
    private final void m49426h() {
        this.f38628d.f27095f.setOnCheckedStateChangeListener(new C18159b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m49427i(CheckBoxAccordionView checkBoxAccordionView, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(checkBoxAccordionView, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        checkBoxAccordionView.getClass();
    }

    /* renamed from: k */
    private final void m49428k() {
        View view;
        this.f38628d.f27097h.removeAllViews();
        int i = this.f38630f;
        for (int i2 = 0; i2 < i; i2++) {
            C13124c cVar = this.f38643s;
            if (cVar != null) {
                view = cVar.mo34626a(i2);
            } else {
                view = null;
            }
            if (view != null) {
                this.f38628d.f27097h.addView(view);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m49429l(boolean z) {
        float f;
        setExpandableContainerVisible(z);
        ViewPropertyAnimator animate = this.f38628d.f27094e.animate();
        if (mo34608j()) {
            f = -180.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        animate.rotation(f).setDuration(150).start();
    }

    private final void setExpandableContainerVisible(boolean z) {
        this.f38638n.mo46151c(this, f38627u[8], z);
    }

    public final int getDividerColor() {
        return ((Number) this.f38641q.getValue(this, f38627u[11])).intValue();
    }

    public final int getIconTint() {
        return ((Number) this.f38639o.getValue(this, f38627u[9])).intValue();
    }

    public final int getItemCount() {
        return this.f38630f;
    }

    public final CharSequence getSubTitle() {
        return (CharSequence) this.f38633i.getValue(this, f38627u[3]);
    }

    public final int getSubtitleColor() {
        return ((Number) this.f38640p.getValue(this, f38627u[10])).intValue();
    }

    public final CharSequence getTitle() {
        return this.f38632h.getValue(this, f38627u[2]);
    }

    public final ViewGroup getTransitionView() {
        return (ViewGroup) this.f38629e.mo46152a(this, f38627u[0]);
    }

    /* renamed from: j */
    public final boolean mo34608j() {
        return ((Boolean) this.f38631g.getValue(this, f38627u[1])).booleanValue();
    }

    /* renamed from: m */
    public final void mo34609m(int i) {
        this.f38630f = i;
        m49428k();
    }

    public final void setCheckBoxVisible(boolean z) {
        this.f38635k.mo46151c(this, f38627u[5], z);
    }

    public final void setChecked(boolean z) {
        this.f38634j.setValue(this, f38627u[4], Boolean.valueOf(z));
    }

    public final void setDividerColor(int i) {
        this.f38641q.setValue(this, f38627u[11], Integer.valueOf(i));
    }

    public final void setDividerVisible(boolean z) {
        this.f38637m.mo46151c(this, f38627u[7], z);
    }

    public final void setExpanded(boolean z) {
        this.f38631g.setValue(this, f38627u[1], Boolean.valueOf(z));
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
        this.f38628d.f27099j.setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        this.f38639o.setValue(this, f38627u[9], Integer.valueOf(i));
    }

    public final void setIconVisible(boolean z) {
        this.f38636l.mo46151c(this, f38627u[6], z);
    }

    public final void setOnCheckBoxListener(C13122a aVar) {
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final void setOnCreateViewListener(C13124c cVar) {
        this.f38643s = cVar;
    }

    public final void setOnToggleListener(C13125d dVar) {
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.f38633i.setValue(this, f38627u[3], charSequence);
    }

    public final void setSubtitleColor(int i) {
        this.f38640p.setValue(this, f38627u[10], Integer.valueOf(i));
    }

    public final void setTitle(CharSequence charSequence) {
        this.f38632h.setValue(this, f38627u[2], charSequence);
    }

    public final void setTransitionView(ViewGroup viewGroup) {
        this.f38629e.mo46153b(this, f38627u[0], viewGroup);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckBoxAccordionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckBoxAccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9934i2 c = C9934i2.m36439c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38628d = c;
        this.f38629e = new C18367k0();
        C41551a aVar = C41551a.f97718a;
        Boolean bool = Boolean.FALSE;
        this.f38631g = new C13126e(bool, this);
        AppCompatTextView appCompatTextView = c.f27102m;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f38632h = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f38633i = new C13127f((Object) null, this);
        this.f38634j = new C13128g(bool, this);
        CheckboxView checkboxView = c.f27095f;
        C41536l.m120488h(checkboxView, "binding.checkbox");
        this.f38635k = new C18365j0(checkboxView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = c.f27100k;
        C41536l.m120488h(layerView, "binding.iconImageFrame");
        this.f38636l = new C18365j0(layerView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        View view = c.f27098i;
        C41536l.m120488h(view, "binding.divider");
        this.f38637m = new C18365j0(view, 4, (C43075l) null, 4, (DefaultConstructorMarker) null);
        LinearLayout linearLayout = c.f27097h;
        C41536l.m120488h(linearLayout, "binding.container");
        this.f38638n = new C18365j0(linearLayout, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        int i2 = C17777b.f49594d;
        this.f38639o = new C13129h(Integer.valueOf(C18368l.m62755d(context2, i2)), this);
        int i3 = C17777b.f49603w;
        this.f38640p = new C13130i(Integer.valueOf(C18368l.m62755d(context2, i3)), this);
        int i4 = C17777b.color_invert_component_tr_5;
        this.f38641q = new C13131j(Integer.valueOf(C18368l.m62755d(context2, i4)), this);
        C5936i0 e = C5946j0.m23875c(context).mo19369e(C17788m.f50640a);
        C41536l.m120488h(e, "from(context).inflateTra…ition.accordion_dropdown)");
        this.f38642r = e;
        setOrientation(1);
        super.setOnClickListener(new C18158a(this));
        m49429l(false);
        int[] iArr = C17787l.f50613y2;
        C41536l.m120488h(iArr, "CheckBoxAccordionView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIcon(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f49888D2, 0)));
        setTitle(obtainStyledAttributes.getString(C17787l.f49933G2));
        String string = obtainStyledAttributes.getString(C17787l.f49918F2);
        setSubTitle(string == null ? "" : string);
        setChecked(obtainStyledAttributes.getBoolean(C17787l.f49843A2, false));
        setCheckBoxVisible(obtainStyledAttributes.getBoolean(C17787l.f50628z2, true));
        setDividerVisible(obtainStyledAttributes.getBoolean(C17787l.f49873C2, true));
        int i5 = C17787l.f49903E2;
        setIconTint(obtainStyledAttributes.getColor(i5, C18368l.m62755d(context2, i2)));
        setSubtitleColor(obtainStyledAttributes.getColor(i5, C18368l.m62755d(context2, i3)));
        setDividerColor(obtainStyledAttributes.getColor(C17787l.f49858B2, C18368l.m62755d(context2, i4)));
        obtainStyledAttributes.recycle();
        m49426h();
    }
}

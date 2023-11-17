package p341ge.bog.designsystem.components.normalsteps;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9912f4;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18379r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.normalsteps.NormalStepsView */
public final class NormalStepsView extends LayerView {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39847n;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9912f4 f39848d;

    /* renamed from: e */
    private final C18355e0 f39849e;

    /* renamed from: f */
    private final C18355e0 f39850f;

    /* renamed from: g */
    private final C18365j0 f39851g;

    /* renamed from: h */
    private final C18365j0 f39852h;

    /* renamed from: i */
    private final C41555e f39853i;

    /* renamed from: j */
    private final C41555e f39854j;

    /* renamed from: k */
    private final C41555e f39855k;

    /* renamed from: l */
    private final C18379r f39856l;

    /* renamed from: m */
    private final C18379r f39857m;

    /* renamed from: ge.bog.designsystem.components.normalsteps.NormalStepsView$a */
    public static final class C13393a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NormalStepsView f39858a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13393a(Object obj, NormalStepsView normalStepsView) {
            super(obj);
            this.f39858a = normalStepsView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            Boolean bool = (Boolean) obj2;
            if (!C41536l.m120484d((Boolean) obj, bool) && bool != null) {
                CurrencyBadgeView currencyBadgeView = this.f39858a.f39848d.f26991e;
                C41536l.m120488h(currencyBadgeView, "binding.newBadge");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                currencyBadgeView.setVisibility(i);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.normalsteps.NormalStepsView$b */
    public static final class C13394b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NormalStepsView f39859a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13394b(Object obj, NormalStepsView normalStepsView) {
            super(obj);
            this.f39859a = normalStepsView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Image image = (Image) obj2;
            if (!C41536l.m120484d((Image) obj, image)) {
                NormalStepsView normalStepsView = this.f39859a;
                AppCompatImageView appCompatImageView = normalStepsView.f39848d.f26994h;
                C41536l.m120488h(appCompatImageView, "binding.normalStepsStartIcon");
                normalStepsView.m50347d(appCompatImageView, image);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.normalsteps.NormalStepsView$c */
    public static final class C13395c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NormalStepsView f39860a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13395c(Object obj, NormalStepsView normalStepsView) {
            super(obj);
            this.f39860a = normalStepsView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Image image = (Image) obj2;
            if (!C41536l.m120484d((Image) obj, image)) {
                NormalStepsView normalStepsView = this.f39860a;
                AppCompatImageView appCompatImageView = normalStepsView.f39848d.f26993g;
                C41536l.m120488h(appCompatImageView, "binding.normalStepsEndIcon");
                normalStepsView.m50347d(appCompatImageView, image);
            }
        }
    }

    static {
        Class<NormalStepsView> cls = NormalStepsView.class;
        f39847n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isStartIconVisible", "isStartIconVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isEndIconVisible", "isEndIconVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isStatusBadgeVisible", "isStatusBadgeVisible()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "startIcon", "getStartIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "endIcon", "getEndIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "startIconColor", "getStartIconColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "endIconColor", "getEndIconColor()Lge/bog/designsystem/components/common/Color;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NormalStepsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: c */
    private final Color.Resource m50346c(int i, int i2, TypedArray typedArray) {
        return new Color.Resource(typedArray.getResourceId(i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m50347d(AppCompatImageView appCompatImageView, Image image) {
        if (image != null) {
            appCompatImageView.setVisibility(0);
            C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
            return;
        }
        appCompatImageView.setVisibility(8);
    }

    public final Image getEndIcon() {
        return (Image) this.f39855k.getValue(this, f39847n[6]);
    }

    public final Color getEndIconColor() {
        return this.f39857m.getValue(this, f39847n[8]);
    }

    public final Image getStartIcon() {
        return (Image) this.f39854j.getValue(this, f39847n[5]);
    }

    public final Color getStartIconColor() {
        return this.f39856l.getValue(this, f39847n[7]);
    }

    public final CharSequence getText() {
        return this.f39850f.getValue(this, f39847n[1]);
    }

    public final CharSequence getTitle() {
        return this.f39849e.getValue(this, f39847n[0]);
    }

    public final void setEndIcon(Image image) {
        this.f39855k.setValue(this, f39847n[6], image);
    }

    public final void setEndIconColor(Color color) {
        this.f39857m.setValue(this, f39847n[8], color);
    }

    public final void setEndIconVisible(boolean z) {
        this.f39852h.mo46151c(this, f39847n[3], z);
    }

    public final void setStartIcon(Image image) {
        this.f39854j.setValue(this, f39847n[5], image);
    }

    public final void setStartIconColor(Color color) {
        this.f39856l.setValue(this, f39847n[7], color);
    }

    public final void setStartIconVisible(boolean z) {
        this.f39851g.mo46151c(this, f39847n[2], z);
    }

    public final void setStatusBadgeVisible(Boolean bool) {
        this.f39853i.setValue(this, f39847n[4], bool);
    }

    public final void setText(CharSequence charSequence) {
        this.f39850f.setValue(this, f39847n[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39849e.setValue(this, f39847n[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NormalStepsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NormalStepsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9912f4 d = C9912f4.m36359d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39848d = d;
        AppCompatTextView appCompatTextView = d.f26996j;
        C41536l.m120488h(appCompatTextView, "binding.normalStepsTitle");
        this.f39849e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f26995i;
        C41536l.m120488h(appCompatTextView2, "binding.normalStepsText");
        this.f39850f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = d.f26994h;
        C41536l.m120488h(appCompatImageView, "binding.normalStepsStartIcon");
        this.f39851g = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView2 = d.f26993g;
        C41536l.m120488h(appCompatImageView2, "binding.normalStepsEndIcon");
        this.f39852h = new C18365j0(appCompatImageView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f39853i = new C13393a((Object) null, this);
        this.f39854j = new C13394b((Object) null, this);
        this.f39855k = new C13395c((Object) null, this);
        AppCompatImageView appCompatImageView3 = d.f26994h;
        C41536l.m120488h(appCompatImageView3, "binding.normalStepsStartIcon");
        this.f39856l = new C18379r(appCompatImageView3);
        AppCompatImageView appCompatImageView4 = d.f26993g;
        C41536l.m120488h(appCompatImageView4, "binding.normalStepsEndIcon");
        this.f39857m = new C18379r(appCompatImageView4);
        setLayerStyle(C17786k.f49833r);
        setBackgroundResource(C17780e.selector_normal_step_view);
        int[] iArr = C17787l.f49954H8;
        C41536l.m120488h(iArr, "NormalStepsView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50044N8));
        setText(obtainStyledAttributes.getString(C17787l.f50029M8));
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f49999K8, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f49969I8, 0);
        setStartIconColor(m50346c(C17787l.f50014L8, C17778c.f49619W, obtainStyledAttributes));
        setEndIconColor(m50346c(C17787l.f49984J8, C17778c.f49635t, obtainStyledAttributes));
        setStatusBadgeVisible(Boolean.valueOf(obtainStyledAttributes.getBoolean(C17787l.f50059O8, false)));
        if (resourceId != 0) {
            setStartIcon(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        if (resourceId2 != 0) {
            setEndIcon(new Image.Resource(resourceId2, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        obtainStyledAttributes.recycle();
    }
}

package p341ge.bog.designsystem.components.inlinefeedback2;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.text.C0969e;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9983o3;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18375n;
import p642vh.C18379r;
import p642vh.C18387x;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2 */
public final class InlineFeedback2 extends FrameLayout {

    /* renamed from: r */
    static final /* synthetic */ C40303i[] f39625r;

    /* renamed from: d */
    private final C9983o3 f39626d;

    /* renamed from: e */
    private CharSequence f39627e;

    /* renamed from: f */
    private CharSequence f39628f;

    /* renamed from: g */
    private CharSequence f39629g;

    /* renamed from: h */
    private final C18375n f39630h;

    /* renamed from: i */
    private final C18365j0 f39631i;

    /* renamed from: j */
    private final C18387x f39632j;

    /* renamed from: k */
    private final C18365j0 f39633k;

    /* renamed from: l */
    private final C18355e0 f39634l;

    /* renamed from: m */
    private final C18387x f39635m;

    /* renamed from: n */
    private final C18365j0 f39636n;

    /* renamed from: o */
    private final C18387x f39637o;

    /* renamed from: p */
    private C13350a f39638p;

    /* renamed from: q */
    private final C18379r f39639q;

    /* renamed from: ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2$a */
    public enum C13350a {
        INFO(C17780e.shape_inline_feedback_info, C17780e.f49652J, C17778c.color_information_solid_200),
        PENDING(C17780e.shape_inline_feedback_pending, C17780e.f49656O, C17778c.color_pending_solid_200),
        POSITIVE(C17780e.shape_inline_feedback_positive, C17780e.f49670w, C17778c.f49613O),
        NEGATIVE(C17780e.shape_inline_feedback_negative, C17780e.icons_24_system_error_fill, C17778c.f49639y);
        

        /* renamed from: g */
        public static final C13351a f39640g = null;

        /* renamed from: d */
        private final int f39646d;

        /* renamed from: e */
        private final int f39647e;

        /* renamed from: f */
        private final int f39648f;

        /* renamed from: ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2$a$a */
        public static final class C13351a {
            private C13351a() {
            }

            public /* synthetic */ C13351a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13350a mo35906a(Integer num) {
                C13350a aVar;
                boolean z;
                C13350a[] values = C13350a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    int ordinal = aVar.ordinal();
                    if (num != null && ordinal == num.intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    return C13350a.INFO;
                }
                return aVar;
            }
        }

        static {
            f39640g = new C13351a((DefaultConstructorMarker) null);
        }

        private C13350a(int i, int i2, int i3) {
            this.f39646d = i;
            this.f39647e = i2;
            this.f39648f = i3;
        }

        /* renamed from: b */
        public final int mo35903b() {
            return this.f39646d;
        }

        /* renamed from: c */
        public final int mo35904c() {
            return this.f39647e;
        }

        /* renamed from: e */
        public final int mo35905e() {
            return this.f39648f;
        }
    }

    static {
        Class<InlineFeedback2> cls = InlineFeedback2.class;
        f39625r = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "iconVisible", "getIconVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "onCloseClicked", "getOnCloseClicked()Landroid/view/View$OnClickListener;", 0)), C41520a0.m120439e(new C41539o(cls, "closeVisible", "getCloseVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "onButtonClicked", "getOnButtonClicked()Landroid/view/View$OnClickListener;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonVisible", "getButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "onDescriptionButtonClicked", "getOnDescriptionButtonClicked()Landroid/view/View$OnClickListener;", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Lge/bog/designsystem/components/common/Color;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineFeedback2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final Spanned m50251a(String str) {
        Spanned a = C0969e.m3470a(str, 0);
        C41536l.m120488h(a, "fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY)");
        return a;
    }

    private final Color getIconTint() {
        return this.f39639q.getValue(this, f39625r[8]);
    }

    private final void setIconTint(Color color) {
        this.f39639q.setValue(this, f39625r[8], color);
    }

    public final CharSequence getButtonText() {
        return this.f39634l.getValue(this, f39625r[4]);
    }

    public final boolean getButtonVisible() {
        return this.f39636n.getValue(this, f39625r[6]).booleanValue();
    }

    public final boolean getCloseVisible() {
        return this.f39633k.getValue(this, f39625r[3]).booleanValue();
    }

    public final CharSequence getDescription() {
        return this.f39628f;
    }

    public final CharSequence getDescriptionButtonText() {
        return this.f39629g;
    }

    public final Image getIcon() {
        return this.f39630h.getValue(this, f39625r[0]);
    }

    public final boolean getIconVisible() {
        return this.f39631i.getValue(this, f39625r[1]).booleanValue();
    }

    public final View.OnClickListener getOnButtonClicked() {
        return this.f39635m.getValue(this, f39625r[5]);
    }

    public final View.OnClickListener getOnCloseClicked() {
        return this.f39632j.getValue(this, f39625r[2]);
    }

    public final View.OnClickListener getOnDescriptionButtonClicked() {
        return this.f39637o.getValue(this, f39625r[7]);
    }

    public final C13350a getStatus() {
        return this.f39638p;
    }

    public final CharSequence getTitle() {
        return this.f39627e;
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f39634l.setValue(this, f39625r[4], charSequence);
    }

    public final void setButtonVisible(boolean z) {
        this.f39636n.mo46151c(this, f39625r[6], z);
    }

    public final void setCloseVisible(boolean z) {
        this.f39633k.mo46151c(this, f39625r[3], z);
    }

    public final void setDescription(CharSequence charSequence) {
        boolean z;
        this.f39628f = charSequence;
        this.f39626d.f27363i.setText(charSequence);
        TextView textView = this.f39626d.f27363i;
        C41536l.m120488h(textView, "binding.description");
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(textView, !z, false, 2, (Object) null);
    }

    public final void setDescriptionButtonText(CharSequence charSequence) {
        boolean z;
        this.f39629g = charSequence;
        this.f39626d.f27364j.setButtonText(charSequence);
        Button button = this.f39626d.f27364j;
        C41536l.m120488h(button, "binding.descriptionButton");
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(button, !z, false, 2, (Object) null);
    }

    public final void setHtmlDescription(String str) {
        C41536l.m120489i(str, "text");
        this.f39626d.f27363i.setText(m50251a(str));
        TextView textView = this.f39626d.f27363i;
        C41536l.m120488h(textView, "binding.description");
        C18368l.m62751F(textView, true, false, 2, (Object) null);
    }

    public final void setHtmlTitle(String str) {
        C41536l.m120489i(str, "text");
        this.f39626d.f27366l.setText(m50251a(str));
        TextView textView = this.f39626d.f27366l;
        C41536l.m120488h(textView, "binding.title");
        C18368l.m62751F(textView, true, false, 2, (Object) null);
    }

    public final void setIcon(Image image) {
        this.f39630h.setValue(this, f39625r[0], image);
    }

    public final void setIconVisible(boolean z) {
        this.f39631i.mo46151c(this, f39625r[1], z);
    }

    public final void setOnButtonClicked(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "<set-?>");
        this.f39635m.setValue(this, f39625r[5], onClickListener);
    }

    public final void setOnCloseClicked(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "<set-?>");
        this.f39632j.setValue(this, f39625r[2], onClickListener);
    }

    public final void setOnDescriptionButtonClicked(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "<set-?>");
        this.f39637o.setValue(this, f39625r[7], onClickListener);
    }

    public final void setSpannableDescription(Spanned spanned) {
        C41536l.m120489i(spanned, "text");
        this.f39626d.f27363i.setText(spanned);
        TextView textView = this.f39626d.f27363i;
        C41536l.m120488h(textView, "binding.description");
        C18368l.m62751F(textView, true, false, 2, (Object) null);
    }

    public final void setSpannableTitle(Spanned spanned) {
        C41536l.m120489i(spanned, "text");
        this.f39626d.f27366l.setText(spanned);
        TextView textView = this.f39626d.f27366l;
        C41536l.m120488h(textView, "binding.title");
        C18368l.m62751F(textView, true, false, 2, (Object) null);
    }

    public final void setStatus(C13350a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f39638p = aVar;
        setIcon(new Image.Resource(aVar.mo35904c(), (Boolean) null, 2, (DefaultConstructorMarker) null));
        setIconTint(new Color.Resource(aVar.mo35905e()));
        this.f39626d.mo3946b().setBackground(C0767a.m2895e(getContext(), aVar.mo35903b()));
    }

    public final void setTitle(CharSequence charSequence) {
        boolean z;
        this.f39627e = charSequence;
        this.f39626d.f27366l.setText(charSequence);
        TextView textView = this.f39626d.f27366l;
        C41536l.m120488h(textView, "binding.title");
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(textView, !z, false, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InlineFeedback2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineFeedback2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9983o3 d = C9983o3.m36615d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39626d = d;
        ImageView imageView = d.f27365k;
        C41536l.m120488h(imageView, "binding.icon");
        this.f39630h = new C18375n(imageView);
        ImageView imageView2 = d.f27365k;
        C41536l.m120488h(imageView2, "binding.icon");
        this.f39631i = new C18365j0(imageView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = d.f27362h;
        C41536l.m120488h(layerView, "binding.close");
        this.f39632j = new C18387x(layerView);
        LayerView layerView2 = d.f27362h;
        C41536l.m120488h(layerView2, "binding.close");
        this.f39633k = new C18365j0(layerView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        TextView textView = d.f27361g;
        C41536l.m120488h(textView, "binding.buttonText");
        this.f39634l = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView3 = d.f27360f;
        C41536l.m120488h(layerView3, "binding.button");
        this.f39635m = new C18387x(layerView3);
        LayerView layerView4 = d.f27360f;
        C41536l.m120488h(layerView4, "binding.button");
        this.f39636n = new C18365j0(layerView4, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        Button button = d.f27364j;
        C41536l.m120488h(button, "binding.descriptionButton");
        this.f39637o = new C18387x(button);
        this.f39638p = C13350a.INFO;
        ImageView imageView3 = d.f27365k;
        C41536l.m120488h(imageView3, "binding.icon");
        this.f39639q = new C18379r(imageView3);
        int[] iArr = C17787l.f50477p6;
        C41536l.m120488h(iArr, "InlineFeedback2");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50557u6);
        String str = "";
        setTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50493q6);
        setDescription(string2 == null ? str : string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f50509r6);
        setDescriptionButtonText(string3 != null ? string3 : str);
        setStatus(C13350a.f39640g.mo35906a(Integer.valueOf(obtainStyledAttributes.getInt(C17787l.f50541t6, 0))));
        setIconVisible(obtainStyledAttributes.getBoolean(C17787l.f50525s6, true));
        obtainStyledAttributes.recycle();
    }
}

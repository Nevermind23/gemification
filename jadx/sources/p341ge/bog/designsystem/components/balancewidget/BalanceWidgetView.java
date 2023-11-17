package p341ge.bog.designsystem.components.balancewidget;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10030v0;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.balancewidget.BalanceWidgetView */
public final class BalanceWidgetView extends FrameLayout {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f38781m;

    /* renamed from: d */
    private final C10030v0 f38782d;

    /* renamed from: e */
    private final C18355e0 f38783e;

    /* renamed from: f */
    private final C18355e0 f38784f;

    /* renamed from: g */
    private final C18355e0 f38785g;

    /* renamed from: h */
    private final C18355e0 f38786h;

    /* renamed from: i */
    private C13160a f38787i;

    /* renamed from: j */
    private final C18355e0 f38788j;

    /* renamed from: k */
    private final C18355e0 f38789k;

    /* renamed from: l */
    private C13160a f38790l;

    /* renamed from: ge.bog.designsystem.components.balancewidget.BalanceWidgetView$a */
    public enum C13160a {
        NEUTRAL(new Color.Attribute(C17777b.f49600q), new Color.Attribute(C17777b.f49597m)),
        POSITIVE(new Color.Resource(C17778c.f49618U), new Color.Resource(C17778c.f49617S)),
        NEGATIVE(new Color.Resource(C17778c.f49607E), new Color.Resource(C17778c.f49605C));
        

        /* renamed from: f */
        public static final C13161a f38791f = null;

        /* renamed from: d */
        private final Color f38796d;

        /* renamed from: e */
        private final Color f38797e;

        /* renamed from: ge.bog.designsystem.components.balancewidget.BalanceWidgetView$a$a */
        public static final class C13161a {
            private C13161a() {
            }

            public /* synthetic */ C13161a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13160a mo34832a(int i) {
                C13160a aVar;
                boolean z;
                C13160a[] values = C13160a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (aVar == null) {
                    return C13160a.NEUTRAL;
                }
                return aVar;
            }
        }

        static {
            f38791f = new C13161a((DefaultConstructorMarker) null);
        }

        private C13160a(Color color, Color color2) {
            this.f38796d = color;
            this.f38797e = color2;
        }

        /* renamed from: b */
        public final Color mo34830b() {
            return this.f38796d;
        }

        /* renamed from: c */
        public final Color mo34831c() {
            return this.f38797e;
        }
    }

    static {
        Class<BalanceWidgetView> cls = BalanceWidgetView.class;
        f38781m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "leftTitle", "getLeftTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "leftText", "getLeftText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "rightTitle", "getRightTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "rightText", "getRightText()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BalanceWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final C13160a getLeftBlockColor() {
        return this.f38787i;
    }

    public final CharSequence getLeftText() {
        return this.f38786h.getValue(this, f38781m[3]);
    }

    public final CharSequence getLeftTitle() {
        return this.f38785g.getValue(this, f38781m[2]);
    }

    public final C13160a getRightBlockColor() {
        return this.f38790l;
    }

    public final CharSequence getRightText() {
        return this.f38789k.getValue(this, f38781m[5]);
    }

    public final CharSequence getRightTitle() {
        return this.f38788j.getValue(this, f38781m[4]);
    }

    public final CharSequence getText() {
        return this.f38784f.getValue(this, f38781m[1]);
    }

    public final CharSequence getTitle() {
        return this.f38783e.getValue(this, f38781m[0]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.balance_widget_height), 1073741824));
    }

    public final void setLeftBlockColor(C13160a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f38787i = aVar;
        LayerView layerView = this.f38782d.f27635e;
        Color b = aVar.mo34830b();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        layerView.setBackgroundColor(b.mo35260a(context));
        TextView textView = this.f38782d.f27636f;
        Color c = aVar.mo34831c();
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        textView.setTextColor(c.mo35260a(context2));
    }

    public final void setLeftText(CharSequence charSequence) {
        this.f38786h.setValue(this, f38781m[3], charSequence);
    }

    public final void setLeftTitle(CharSequence charSequence) {
        this.f38785g.setValue(this, f38781m[2], charSequence);
    }

    public final void setRightBlockColor(C13160a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f38790l = aVar;
        LayerView layerView = this.f38782d.f27638h;
        Color b = aVar.mo34830b();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        layerView.setBackgroundColor(b.mo35260a(context));
        TextView textView = this.f38782d.f27639i;
        Color c = aVar.mo34831c();
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        textView.setTextColor(c.mo35260a(context2));
    }

    public final void setRightText(CharSequence charSequence) {
        this.f38789k.setValue(this, f38781m[5], charSequence);
    }

    public final void setRightTitle(CharSequence charSequence) {
        this.f38788j.setValue(this, f38781m[4], charSequence);
    }

    public final void setText(CharSequence charSequence) {
        this.f38784f.setValue(this, f38781m[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f38783e.setValue(this, f38781m[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceWidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BalanceWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10030v0 d = C10030v0.m36789d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f38782d = d;
        TextView textView = d.f27642l;
        C41536l.m120488h(textView, "binding.title");
        this.f38783e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27641k;
        C41536l.m120488h(textView2, "binding.text");
        this.f38784f = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = d.f27637g;
        C41536l.m120488h(textView3, "binding.leftTitle");
        this.f38785g = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView4 = d.f27636f;
        C41536l.m120488h(textView4, "binding.leftText");
        this.f38786h = new C18355e0(textView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C13160a aVar = C13160a.NEUTRAL;
        this.f38787i = aVar;
        TextView textView5 = d.f27640j;
        C41536l.m120488h(textView5, "binding.rightTitle");
        this.f38788j = new C18355e0(textView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView6 = d.f27639i;
        C41536l.m120488h(textView6, "binding.rightText");
        this.f38789k = new C18355e0(textView6, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f38790l = aVar;
        int[] iArr = C17787l.f49931G0;
        C41536l.m120488h(iArr, "BalanceWidgetView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50051O0);
        String str = "";
        setTitle(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50036N0);
        setText(string2 == null ? str : string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f49976J0);
        setLeftTitle(string3 == null ? str : string3);
        String string4 = obtainStyledAttributes.getString(C17787l.f49961I0);
        setLeftText(string4 == null ? str : string4);
        C13160a.C13161a aVar2 = C13160a.f38791f;
        setLeftBlockColor(aVar2.mo34832a(obtainStyledAttributes.getInt(C17787l.f49946H0, aVar.ordinal())));
        String string5 = obtainStyledAttributes.getString(C17787l.f50021M0);
        setRightTitle(string5 == null ? str : string5);
        String string6 = obtainStyledAttributes.getString(C17787l.f50006L0);
        setRightText(string6 != null ? string6 : str);
        setRightBlockColor(aVar2.mo34832a(obtainStyledAttributes.getInt(C17787l.f49991K0, aVar.ordinal())));
        obtainStyledAttributes.recycle();
    }
}

package p341ge.bog.designsystem.components.depositcard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9871a3;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18377p;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.depositcard.DepositCardView */
public final class DepositCardView extends LayerView {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39318n;

    /* renamed from: d */
    private final C9871a3 f39319d;

    /* renamed from: e */
    private final C18377p f39320e;

    /* renamed from: f */
    private final C18355e0 f39321f;

    /* renamed from: g */
    private final C18355e0 f39322g;

    /* renamed from: h */
    private final C18355e0 f39323h;

    /* renamed from: i */
    private final C18355e0 f39324i;

    /* renamed from: j */
    private final C18355e0 f39325j;

    /* renamed from: k */
    private final C18355e0 f39326k;

    /* renamed from: l */
    private final C18365j0 f39327l;

    /* renamed from: m */
    private C13290a f39328m;

    /* renamed from: ge.bog.designsystem.components.depositcard.DepositCardView$a */
    public enum C13290a {
        STANDARD(C17780e.selector_deposit_card),
        CLEAR(C17780e.shape_deposit_card_clear);
        

        /* renamed from: e */
        public static final C13291a f39329e = null;

        /* renamed from: d */
        private final int f39333d;

        /* renamed from: ge.bog.designsystem.components.depositcard.DepositCardView$a$a */
        public static final class C13291a {
            private C13291a() {
            }

            public /* synthetic */ C13291a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13290a mo35558a(int i) {
                for (C13290a aVar : C13290a.values()) {
                    if (aVar.ordinal() == i) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f39329e = new C13291a((DefaultConstructorMarker) null);
        }

        private C13290a(int i) {
            this.f39333d = i;
        }

        /* renamed from: b */
        public final int mo35557b() {
            return this.f39333d;
        }
    }

    static {
        Class<DepositCardView> cls = DepositCardView.class;
        f39318n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()I", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "subtitleText", "getSubtitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "subtitleValueText", "getSubtitleValueText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "minAmountTitle", "getMinAmountTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "minAmountValue", "getMinAmountValue()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interestRateMessage", "getInterestRateMessage()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "isInterestRateVisible", "isInterestRateVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DepositCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50010a() {
        Drawable e = C0767a.m2895e(getContext(), this.f39328m.mo35557b());
        if (e != null) {
            e.mutate();
        }
        setBackground(e);
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getMinAmountTitle$annotations() {
    }

    public static /* synthetic */ void getMinAmountValue$annotations() {
    }

    public final int getIcon() {
        return this.f39320e.getValue(this, f39318n[0]).intValue();
    }

    public final CharSequence getInterestRateMessage() {
        return this.f39326k.getValue(this, f39318n[6]);
    }

    public final CharSequence getMinAmountTitle() {
        return this.f39324i.getValue(this, f39318n[4]);
    }

    public final CharSequence getMinAmountValue() {
        return this.f39325j.getValue(this, f39318n[5]);
    }

    public final CharSequence getSubtitleText() {
        return this.f39322g.getValue(this, f39318n[2]);
    }

    public final CharSequence getSubtitleValueText() {
        return this.f39323h.getValue(this, f39318n[3]);
    }

    public final CharSequence getTitle() {
        return this.f39321f.getValue(this, f39318n[1]);
    }

    public final C13290a getType() {
        return this.f39328m;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.deposit_card_height), 1073741824));
    }

    public final void setIcon(int i) {
        this.f39320e.setValue(this, f39318n[0], Integer.valueOf(i));
    }

    public final void setIconImage(Image image) {
        ImageView imageView = this.f39319d.f26755e;
        C41536l.m120488h(imageView, "binding.iconImage");
        C18368l.m62746A(imageView, image, (C43075l) null, 2, (Object) null);
    }

    public final void setInterestRateMessage(CharSequence charSequence) {
        this.f39326k.setValue(this, f39318n[6], charSequence);
    }

    public final void setInterestRateVisible(boolean z) {
        this.f39327l.mo46151c(this, f39318n[7], z);
    }

    public final void setMinAmountTitle(CharSequence charSequence) {
        this.f39324i.setValue(this, f39318n[4], charSequence);
    }

    public final void setMinAmountValue(CharSequence charSequence) {
        this.f39325j.setValue(this, f39318n[5], charSequence);
    }

    public final void setSubtitleText(CharSequence charSequence) {
        this.f39322g.setValue(this, f39318n[2], charSequence);
    }

    public final void setSubtitleValueText(CharSequence charSequence) {
        this.f39323h.setValue(this, f39318n[3], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39321f.setValue(this, f39318n[1], charSequence);
    }

    public final void setType(C13290a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f39328m = aVar;
        m50010a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9871a3 c = C9871a3.m36208c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39319d = c;
        ImageView imageView = c.f26755e;
        C41536l.m120488h(imageView, "binding.iconImage");
        this.f39320e = new C18377p(imageView);
        TextView textView = c.f26760j;
        C41536l.m120488h(textView, "binding.titleText");
        this.f39321f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = c.f26758h;
        C41536l.m120488h(textView2, "binding.subtitleText");
        this.f39322g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = c.f26759i;
        C41536l.m120488h(textView3, "binding.subtitleValueText");
        this.f39323h = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView4 = c.f26758h;
        C41536l.m120488h(textView4, "binding.subtitleText");
        this.f39324i = new C18355e0(textView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView5 = c.f26759i;
        C41536l.m120488h(textView5, "binding.subtitleValueText");
        this.f39325j = new C18355e0(textView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView6 = c.f26757g;
        C41536l.m120488h(textView6, "binding.interestRateMessageText");
        this.f39326k = new C18355e0(textView6, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = c.f26756f;
        C41536l.m120488h(layerView, "binding.interestRateLayer");
        this.f39327l = new C18365j0(layerView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        C13290a aVar = C13290a.STANDARD;
        this.f39328m = aVar;
        setLayerStyle(C17786k.f49834t);
        int[] iArr = C17787l.f50219Z3;
        C41536l.m120488h(iArr, "DepositCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C13290a a = C13290a.f39329e.mo35558a(obtainStyledAttributes.getInt(C17787l.f50235a4, 0));
        setType(a != null ? a : aVar);
        obtainStyledAttributes.recycle();
    }
}

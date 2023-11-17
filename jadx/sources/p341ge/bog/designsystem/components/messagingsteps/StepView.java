package p341ge.bog.designsystem.components.messagingsteps;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p352ak.C9921g5;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18377p;
import p656wi.C18596a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.messagingsteps.StepView */
public final class StepView extends LayerView {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39824i;

    /* renamed from: d */
    private final C9921g5 f39825d;

    /* renamed from: e */
    private final C18365j0 f39826e;

    /* renamed from: f */
    private final C18355e0 f39827f;

    /* renamed from: g */
    private final C18377p f39828g;

    /* renamed from: h */
    private C18596a f39829h;

    /* renamed from: ge.bog.designsystem.components.messagingsteps.StepView$a */
    public /* synthetic */ class C13388a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39830a;

        static {
            int[] iArr = new int[C18596a.values().length];
            try {
                iArr[C18596a.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f39830a = iArr;
        }
    }

    static {
        Class<StepView> cls = StepView.class;
        f39824i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isStatusBadgeVisible", "isStatusBadgeVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "iconResId", "getIconResId()I", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50339a(C18596a aVar) {
        if (C13388a.f39830a[aVar.ordinal()] == 1) {
            setStatusBadgeVisible(false);
        } else {
            setStatusBadgeVisible(true);
            StatusBadgeView statusBadgeView = this.f39825d.f27033e;
            StatusBadgeType e = aVar.mo46442e();
            C41536l.m120486f(e);
            statusBadgeView.setType(e);
        }
        this.f39825d.f27034f.setBackground(C0767a.m2895e(getContext(), aVar.mo46441c()));
    }

    private final void setStatusBadgeVisible(boolean z) {
        this.f39826e.mo46151c(this, f39824i[0], z);
    }

    public final int getIconResId() {
        return this.f39828g.getValue(this, f39824i[2]).intValue();
    }

    public final CharSequence getText() {
        return this.f39827f.getValue(this, f39824i[1]);
    }

    public final C18596a getType() {
        return this.f39829h;
    }

    public final void setIconResId(int i) {
        this.f39828g.setValue(this, f39824i[2], Integer.valueOf(i));
    }

    public final void setText(CharSequence charSequence) {
        this.f39827f.setValue(this, f39824i[1], charSequence);
    }

    public final void setType(C18596a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        m50339a(aVar);
        this.f39829h = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18596a aVar;
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9921g5 c = C9921g5.m36392c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39825d = c;
        StatusBadgeView statusBadgeView = c.f27033e;
        C41536l.m120488h(statusBadgeView, "binding.statusBadgeIcon");
        this.f39826e = new C18365j0(statusBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView = c.f27036h;
        C41536l.m120488h(appCompatTextView, "binding.stepsText");
        this.f39827f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27035g;
        C41536l.m120488h(appCompatImageView, "binding.stepsIcon");
        this.f39828g = new C18377p(appCompatImageView);
        this.f39829h = C18596a.CLEAR;
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        setLayerStyle(C17786k.LayerRadius16Shadow30);
        int[] iArr = C17787l.f49912Eb;
        C41536l.m120488h(iArr, "StepsView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIconResId(obtainStyledAttributes.getResourceId(C17787l.f49927Fb, 0));
        setText(obtainStyledAttributes.getText(C17787l.f49942Gb));
        int i2 = obtainStyledAttributes.getInt(C17787l.f49957Hb, 1);
        C18596a[] values = C18596a.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i3];
            if (aVar.mo46440b() == i2) {
                break;
            }
            i3++;
        }
        if (aVar != null) {
            setType(aVar);
        }
        obtainStyledAttributes.recycle();
    }
}

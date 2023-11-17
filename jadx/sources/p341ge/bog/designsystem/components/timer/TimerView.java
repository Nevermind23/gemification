package p341ge.bog.designsystem.components.timer;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9954k6;
import p601sg.C17787l;
import p631uj.C18174a;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.timer.TimerView */
public final class TimerView extends LinearLayout {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f40506g = {C41520a0.m120439e(new C41539o(TimerView.class, "timerText", "getTimerText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private final C9954k6 f40507d;

    /* renamed from: e */
    private final C18355e0 f40508e;

    /* renamed from: f */
    private C18174a f40509f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void setState(C18174a aVar) {
        C9954k6 k6Var = this.f40507d;
        TextView textView = k6Var.f27218f;
        Color b = aVar.mo45837b();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        textView.setTextColor(b.mo35260a(context));
        AppCompatImageView appCompatImageView = k6Var.f27217e;
        Color b2 = aVar.mo45837b();
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        appCompatImageView.setColorFilter(b2.mo35260a(context2), PorterDuff.Mode.SRC_IN);
    }

    public final C18174a getTimerState() {
        return this.f40509f;
    }

    public final CharSequence getTimerText() {
        return this.f40508e.getValue(this, f40506g[0]);
    }

    public final void setTimerState(C18174a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40509f = aVar;
        setState(aVar);
    }

    public final void setTimerText(CharSequence charSequence) {
        this.f40508e.setValue(this, f40506g[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9954k6 c = C9954k6.m36508c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40507d = c;
        TextView textView = c.f27218f;
        C41536l.m120488h(textView, "binding.timerTextView");
        this.f40508e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C18174a aVar = C18174a.INVERT;
        this.f40509f = aVar;
        setOrientation(0);
        int[] iArr = C17787l.f50516rd;
        C41536l.m120488h(iArr, "TimerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50532sd, 1);
        if (i2 != 1) {
            if (i2 == 2) {
                aVar = C18174a.PENDING;
            } else if (i2 == 3) {
                aVar = C18174a.NEGATIVE;
            } else if (i2 == 4) {
                aVar = C18174a.DISABLED;
            } else if (i2 == 5) {
                aVar = C18174a.INVISIBLE;
            } else {
                throw new IllegalStateException("Unknown timer state");
            }
        }
        setTimerState(aVar);
        setTimerText(obtainStyledAttributes.getString(C17787l.f50548td));
        obtainStyledAttributes.recycle();
    }
}

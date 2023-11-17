package oa0;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import da0.C19948b;
import da0.C19950d;
import ha0.C24924a0;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: oa0.a */
public final class C26916a extends FrameLayout {

    /* renamed from: f */
    static final /* synthetic */ C40303i[] f67672f = {C41520a0.m120439e(new C41539o(C26916a.class, "text", "getText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private final C24924a0 f67673d;

    /* renamed from: e */
    private final C18355e0 f67674e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26916a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final CharSequence getText() {
        return this.f67674e.getValue(this, f67672f[0]);
    }

    public final void setText(CharSequence charSequence) {
        this.f67674e.setValue(this, f67672f[0], charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26916a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C24924a0 c = C24924a0.m79675c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f67673d = c;
        TextView textView = c.f64092e;
        C41536l.m120488h(textView, "binding.textView");
        this.f67674e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        setLayoutParams(new FrameLayout.LayoutParams(C18368l.m62762k(38), C18368l.m62762k(32)));
        setBackgroundResource(C19950d.shape_deposit_currency_view);
        c.f64092e.setTextColor(C0767a.m2894d(context, C19948b.selector_deposit_currency_view));
    }
}

package p341ge.bog.designsystem.components.changebadge;

import af1.C40303i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.github.mikephil.charting.utils.Utils;
import java.math.RoundingMode;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9902e2;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18362i;

/* renamed from: ge.bog.designsystem.components.changebadge.ChangeBadgeView */
public final class ChangeBadgeView extends LinearLayout {

    /* renamed from: g */
    public static final C13220b f39010g = new C13220b((DefaultConstructorMarker) null);

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f39011h = {C41520a0.m120439e(new C41539o(ChangeBadgeView.class, "rateChangeInternal", "getRateChangeInternal()F", 0))};

    /* renamed from: d */
    private C13219a f39012d;

    /* renamed from: e */
    private final C9902e2 f39013e;

    /* renamed from: f */
    private final C18362i f39014f;

    /* renamed from: ge.bog.designsystem.components.changebadge.ChangeBadgeView$a */
    private enum C13219a {
        POSITIVE(C17780e.icons_24_system_arrow_down, C17786k.TextBody2Positive500Left, C17778c.f49617S),
        NEGATIVE(C17780e.icons_24_system_arrow_up, C17786k.TextBody2Negative500Left, C17778c.f49605C),
        INFO(C17780e.f49652J, C17786k.TextBody2Information150Left, C17778c.color_information_solid_150);
        

        /* renamed from: d */
        private final int f39019d;

        /* renamed from: e */
        private final int f39020e;

        /* renamed from: f */
        private final int f39021f;

        private C13219a(int i, int i2, int i3) {
            this.f39019d = i;
            this.f39020e = i2;
            this.f39021f = i3;
        }

        /* renamed from: b */
        public final int mo35131b() {
            return this.f39021f;
        }

        /* renamed from: c */
        public final int mo35132c() {
            return this.f39019d;
        }

        /* renamed from: e */
        public final int mo35133e() {
            return this.f39020e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.changebadge.ChangeBadgeView$b */
    public static final class C13220b {
        private C13220b() {
        }

        public /* synthetic */ C13220b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChangeBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m49721a() {
        setTextAppearance(this.f39012d.mo35133e());
        m49722b(this.f39012d.mo35132c(), this.f39012d.mo35131b());
    }

    /* renamed from: b */
    private final void m49722b(int i, int i2) {
        this.f39013e.f26930e.setImageResource(i);
        this.f39013e.f26930e.setColorFilter(C0767a.m2893c(getContext(), i2));
    }

    private final float getRateChangeInternal() {
        return this.f39014f.getValue(this, f39011h[0]).floatValue();
    }

    private final void setRateChangeInternal(float f) {
        this.f39014f.mo46146b(this, f39011h[0], f);
    }

    private final void setTextAppearance(int i) {
        C1314o.m4575q(this.f39013e.f26931f, i);
    }

    @SuppressLint({"SetTextI18n"})
    public final void setRateChange(float f) {
        C13219a aVar;
        setRateChangeInternal(Math.abs(f));
        if (f < Utils.FLOAT_EPSILON) {
            aVar = C13219a.NEGATIVE;
        } else if (f > Utils.FLOAT_EPSILON) {
            aVar = C13219a.POSITIVE;
        } else {
            aVar = C13219a.INFO;
        }
        this.f39012d = aVar;
        m49721a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39012d = C13219a.INFO;
        C9902e2 c = C9902e2.m36322c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39013e = c;
        TextView textView = c.f26931f;
        C41536l.m120488h(textView, "binding.changeText");
        this.f39014f = new C18362i(textView, "0.0000", (RoundingMode) null, 4, (DefaultConstructorMarker) null);
        setOrientation(0);
        setGravity(8388627);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50583w2);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.ChangeBadgeView)");
            setRateChange(obtainStyledAttributes.getFloat(C17787l.f50598x2, Utils.FLOAT_EPSILON));
            obtainStyledAttributes.recycle();
        }
    }
}

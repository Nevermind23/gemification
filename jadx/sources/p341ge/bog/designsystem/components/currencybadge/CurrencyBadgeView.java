package p341ge.bog.designsystem.components.currencybadge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.C1314o;
import com.github.mikephil.charting.utils.Utils;
import he1.C41233s;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10039w2;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.currencybadge.CurrencyBadgeView */
public final class CurrencyBadgeView extends LayerView {

    /* renamed from: f */
    public static final C13286c f39283f = new C13286c((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final Map f39284g = C41344r0.m119931m(C41233s.m119492a("GEL", "₾"), C41233s.m119492a("USD", "$"), C41233s.m119492a("EUR", "€"), C41233s.m119492a("GBP", "£"), C41233s.m119492a("TRY", "₺"), C41233s.m119492a("RUR", "₽"), C41233s.m119492a("AZN", "₼"), C41233s.m119492a("CHF", "₣"));

    /* renamed from: d */
    private C13285b f39285d;

    /* renamed from: e */
    private final C10039w2 f39286e;

    /* renamed from: ge.bog.designsystem.components.currencybadge.CurrencyBadgeView$a */
    public static final class C13284a {

        /* renamed from: a */
        private final float f39287a;

        /* renamed from: b */
        private final C13285b f39288b;

        /* renamed from: c */
        private final String f39289c;

        public C13284a(float f, C13285b bVar, String str) {
            C41536l.m120489i(bVar, "badgeSize");
            C41536l.m120489i(str, "title");
            this.f39287a = f;
            this.f39288b = bVar;
            this.f39289c = str;
        }

        /* renamed from: a */
        public final C13285b mo35497a() {
            return this.f39288b;
        }

        /* renamed from: b */
        public final float mo35498b() {
            return this.f39287a;
        }

        /* renamed from: c */
        public final String mo35499c() {
            return this.f39289c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13284a)) {
                return false;
            }
            C13284a aVar = (C13284a) obj;
            return Float.compare(this.f39287a, aVar.f39287a) == 0 && this.f39288b == aVar.f39288b && C41536l.m120484d(this.f39289c, aVar.f39289c);
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.f39287a) * 31) + this.f39288b.hashCode()) * 31) + this.f39289c.hashCode();
        }

        public String toString() {
            float f = this.f39287a;
            C13285b bVar = this.f39288b;
            String str = this.f39289c;
            return "BadgeModel(rateChange=" + f + ", badgeSize=" + bVar + ", title=" + str + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.currencybadge.CurrencyBadgeView$b */
    public enum C13285b {
        REGULAR(1, C17779d.width_currency_badge_regular, C17779d.height_currency_badge_regular, C17786k.TextBody1White500Left),
        SMALL(2, C17779d.width_currency_badge_small, C17779d.height_currency_badge_small, C17786k.TextCaption2White500Left);
        

        /* renamed from: d */
        private final int f39293d;

        /* renamed from: e */
        private final int f39294e;

        /* renamed from: f */
        private final int f39295f;

        /* renamed from: g */
        private final int f39296g;

        private C13285b(int i, int i2, int i3, int i4) {
            this.f39293d = i;
            this.f39294e = i2;
            this.f39295f = i3;
            this.f39296g = i4;
        }

        /* renamed from: b */
        public final int mo35503b() {
            return this.f39295f;
        }

        /* renamed from: c */
        public final int mo35504c() {
            return this.f39293d;
        }

        /* renamed from: e */
        public final int mo35505e() {
            return this.f39296g;
        }

        /* renamed from: f */
        public final int mo35506f() {
            return this.f39294e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.currencybadge.CurrencyBadgeView$c */
    public static final class C13286c {
        private C13286c() {
        }

        public /* synthetic */ C13286c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CurrencyBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(this.f39285d.mo35506f()), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(this.f39285d.mo35503b()), 1073741824));
    }

    public final void setBadge(C13284a aVar) {
        C41536l.m120489i(aVar, "badgeModel");
        setBadgeTitle(aVar.mo35499c());
        setBadgeColor(aVar.mo35498b());
        setBadgeSize(aVar.mo35497a());
    }

    public final void setBadgeColor(float f) {
        if (f > Utils.FLOAT_EPSILON) {
            setBackgroundResource(C17778c.f49617S);
        } else if (f < Utils.FLOAT_EPSILON) {
            setBackgroundResource(C17778c.f49605C);
        } else {
            setBackgroundResource(C17778c.color_information_solid_150);
        }
    }

    public final void setBadgeSize(C13285b bVar) {
        C41536l.m120489i(bVar, "badgeSize");
        this.f39285d = bVar;
        C1314o.m4575q(this.f39286e.f27691e, bVar.mo35505e());
        requestLayout();
    }

    public final void setBadgeTitle(String str) {
        C41536l.m120489i(str, "title");
        TextView textView = this.f39286e.f27691e;
        String str2 = (String) f39284g.get(str);
        if (str2 != null) {
            str = str2;
        }
        textView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39285d = C13285b.REGULAR;
        C10039w2 c = C10039w2.m36822c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39286e = c;
        setLayerStyle(C17786k.LayerRadius4Shadow0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50009L3);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…leable.CurrencyBadgeView)");
            float f = obtainStyledAttributes.getFloat(C17787l.f50054O3, Utils.FLOAT_EPSILON);
            String string = obtainStyledAttributes.getString(C17787l.f50039N3);
            for (C13285b bVar : C13285b.values()) {
                if (bVar.mo35504c() != obtainStyledAttributes.getInt(C17787l.f50024M3, 1) ? false : true) {
                    this.f39285d = bVar;
                    setBadge(new C13284a(f, bVar, string == null ? "" : string));
                    obtainStyledAttributes.recycle();
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}

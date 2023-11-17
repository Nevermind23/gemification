package p642vh;

import af1.C40303i;
import android.widget.TextView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;

/* renamed from: vh.i */
public final class C18362i implements C41555e {

    /* renamed from: a */
    private final TextView f51813a;

    /* renamed from: b */
    private float f51814b;

    /* renamed from: c */
    private final DecimalFormat f51815c;

    public C18362i(TextView textView, String str, RoundingMode roundingMode) {
        C41536l.m120489i(textView, "textView");
        C41536l.m120489i(str, "pattern");
        this.f51813a = textView;
        DecimalFormat decimalFormat = new DecimalFormat(str, DecimalFormatSymbols.getInstance(Locale.ROOT));
        if (roundingMode != null) {
            decimalFormat.setRoundingMode(roundingMode);
        }
        this.f51815c = decimalFormat;
    }

    /* renamed from: a */
    public Float getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return Float.valueOf(this.f51814b);
    }

    /* renamed from: b */
    public void mo46146b(Object obj, C40303i iVar, float f) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51814b = f;
        this.f51813a.setText(this.f51815c.format(Float.valueOf(f)));
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
        mo46146b(obj, iVar, ((Number) obj2).floatValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18362i(TextView textView, String str, RoundingMode roundingMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textView, str, (i & 4) != 0 ? null : roundingMode);
    }
}

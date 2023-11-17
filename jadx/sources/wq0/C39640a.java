package wq0;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: wq0.a */
public abstract class C39640a {
    /* renamed from: a */
    public static final boolean m115205a(Double d) {
        return (d == null || Double.compare(d.doubleValue(), Utils.DOUBLE_EPSILON) == 0) ? false : true;
    }

    /* renamed from: b */
    public static final void m115206b(Input input, boolean z) {
        C41536l.m120489i(input, "<this>");
        if (z) {
            input.mo35919b();
        } else {
            input.mo35920c();
        }
    }
}

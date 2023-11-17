package p642vh;

import android.animation.ArgbEvaluator;
import androidx.core.graphics.C0825b;
import kotlin.jvm.internal.C41536l;

/* renamed from: vh.a */
public abstract class C18333a extends ArgbEvaluator {
    public Object evaluate(float f, Object obj, Object obj2) {
        C41536l.m120489i(obj, "startValue");
        C41536l.m120489i(obj2, "endValue");
        int i = 0;
        if (!C41536l.m120484d(obj, 0) && !C41536l.m120484d(obj2, 0)) {
            Object evaluate = super.evaluate(f, obj, obj2);
            C41536l.m120487g(evaluate, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) evaluate).intValue();
        } else if (C41536l.m120484d(obj, 0) && !C41536l.m120484d(obj2, 0)) {
            i = C0825b.m3101j(((Integer) obj2).intValue(), (int) (((float) C11051p3.f31759c) * f));
        } else if (!C41536l.m120484d(obj, 0) && C41536l.m120484d(obj2, 0)) {
            i = C0825b.m3101j(((Integer) obj).intValue(), (int) (((float) C11051p3.f31759c) * (1.0f - f)));
        }
        return Integer.valueOf(i);
    }
}

package p417fe;

import android.graphics.RectF;
import kotlin.jvm.internal.C41536l;

/* renamed from: fe.a */
public abstract class C12864a extends C12865b {

    /* renamed from: f */
    private final int f38010f = 2;

    /* renamed from: b */
    public final int mo33543b() {
        return this.f38010f;
    }

    /* renamed from: h */
    public final void mo33544h(RectF rectF) {
        C41536l.m120489i(rectF, "rect");
        float f = -3.4028235E38f;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        while (mo33547d().hasRemaining()) {
            float f5 = mo33547d().get();
            if (i % 2 == 0) {
                f4 = Math.min(f4, f5);
                f3 = Math.max(f3, f5);
            } else {
                f = Math.max(f, f5);
                f2 = Math.min(f2, f5);
            }
            i++;
        }
        mo33547d().rewind();
        rectF.set(f4, f, f3, f2);
    }
}

package p223q8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: q8.i */
public final class C7927i implements C7918c {

    /* renamed from: a */
    private final float f22923a;

    public C7927i(float f) {
        this.f22923a = f;
    }

    /* renamed from: a */
    public float mo22917a(RectF rectF) {
        return this.f22923a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7927i)) {
            return false;
        }
        if (this.f22923a == ((C7927i) obj).f22923a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f22923a)});
    }
}

package p223q8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: q8.a */
public final class C7916a implements C7918c {

    /* renamed from: a */
    private final float f22869a;

    public C7916a(float f) {
        this.f22869a = f;
    }

    /* renamed from: a */
    public float mo22917a(RectF rectF) {
        return this.f22869a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7916a)) {
            return false;
        }
        if (this.f22869a == ((C7916a) obj).f22869a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f22869a)});
    }
}

package p223q8;

import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: q8.b */
public final class C7917b implements C7918c {

    /* renamed from: a */
    private final C7918c f22870a;

    /* renamed from: b */
    private final float f22871b;

    public C7917b(float f, C7918c cVar) {
        while (cVar instanceof C7917b) {
            cVar = ((C7917b) cVar).f22870a;
            f += ((C7917b) cVar).f22871b;
        }
        this.f22870a = cVar;
        this.f22871b = f;
    }

    /* renamed from: a */
    public float mo22917a(RectF rectF) {
        return Math.max(Utils.FLOAT_EPSILON, this.f22870a.mo22917a(rectF) + this.f22871b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7917b)) {
            return false;
        }
        C7917b bVar = (C7917b) obj;
        if (!this.f22870a.equals(bVar.f22870a) || this.f22871b != bVar.f22871b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22870a, Float.valueOf(this.f22871b)});
    }
}

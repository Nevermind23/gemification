package p268u1;

import com.github.mikephil.charting.utils.Utils;
import java.util.Collections;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.q */
public class C8549q extends C8525a {

    /* renamed from: i */
    private final Object f24289i;

    public C8549q(C6015c cVar) {
        this(cVar, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo23852c() {
        return 1.0f;
    }

    /* renamed from: h */
    public Object mo23856h() {
        C6015c cVar = this.f24231e;
        Object obj = this.f24289i;
        return cVar.mo19504b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, obj, obj, mo23855f(), mo23855f(), mo23855f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Object mo23857i(C6013a aVar, float f) {
        return mo23856h();
    }

    /* renamed from: k */
    public void mo23859k() {
        if (this.f24231e != null) {
            super.mo23859k();
        }
    }

    /* renamed from: m */
    public void mo23861m(float f) {
        this.f24230d = f;
    }

    public C8549q(C6015c cVar, Object obj) {
        super(Collections.emptyList());
        mo23862n(cVar);
        this.f24289i = obj;
    }
}

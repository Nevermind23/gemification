package p268u1;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2325h;
import p048d2.C5808j;
import p061e2.C6013a;

/* renamed from: u1.i */
public class C8540i extends C6013a {

    /* renamed from: q */
    private Path f24254q;

    /* renamed from: r */
    private final C6013a f24255r;

    public C8540i(C2325h hVar, C6013a aVar) {
        super(hVar, (PointF) aVar.f18759b, (PointF) aVar.f18760c, aVar.f18761d, aVar.f18762e, aVar.f18763f, aVar.f18764g, aVar.f18765h);
        this.f24255r = aVar;
        mo23889j();
    }

    /* renamed from: j */
    public void mo23889j() {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3 = this.f18760c;
        if (obj3 == null || (obj2 = this.f18759b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) {
            z = false;
        } else {
            z = true;
        }
        Object obj4 = this.f18759b;
        if (obj4 != null && (obj = this.f18760c) != null && !z) {
            C6013a aVar = this.f24255r;
            this.f24254q = C5808j.m23376d((PointF) obj4, (PointF) obj, aVar.f18772o, aVar.f18773p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Path mo23890k() {
        return this.f24254q;
    }
}

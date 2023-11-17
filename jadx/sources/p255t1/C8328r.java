package p255t1;

import android.graphics.Path;
import com.airbnb.lottie.C2315d0;
import java.util.ArrayList;
import java.util.List;
import p268u1.C8525a;
import p268u1.C8544m;
import p319y1.C9028q;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.r */
public class C8328r implements C8322m, C8525a.C8527b {

    /* renamed from: a */
    private final Path f23684a = new Path();

    /* renamed from: b */
    private final String f23685b;

    /* renamed from: c */
    private final boolean f23686c;

    /* renamed from: d */
    private final C2315d0 f23687d;

    /* renamed from: e */
    private final C8544m f23688e;

    /* renamed from: f */
    private boolean f23689f;

    /* renamed from: g */
    private final C8310b f23690g = new C8310b();

    public C8328r(C2315d0 d0Var, C9169b bVar, C9028q qVar) {
        this.f23685b = qVar.mo24496b();
        this.f23686c = qVar.mo24498d();
        this.f23687d = d0Var;
        C8544m d = qVar.mo24497c().mo24353a();
        this.f23688e = d;
        bVar.mo24753i(d);
        d.mo23850a(this);
    }

    /* renamed from: c */
    private void m31273c() {
        this.f23689f = false;
        this.f23687d.invalidateSelf();
    }

    /* renamed from: a */
    public void mo23468a() {
        m31273c();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            C8311c cVar = (C8311c) list.get(i);
            if (cVar instanceof C8331u) {
                C8331u uVar = (C8331u) cVar;
                if (uVar.mo23488j() == C9033s.C9034a.SIMULTANEOUSLY) {
                    this.f23690g.mo23474a(uVar);
                    uVar.mo23484c(this);
                }
            }
            if (cVar instanceof C8329s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C8329s) cVar);
            }
        }
        this.f23688e.mo23896q(arrayList);
    }

    /* renamed from: z */
    public Path mo23480z() {
        if (this.f23689f) {
            return this.f23684a;
        }
        this.f23684a.reset();
        if (this.f23686c) {
            this.f23689f = true;
            return this.f23684a;
        }
        Path path = (Path) this.f23688e.mo23856h();
        if (path == null) {
            return this.f23684a;
        }
        this.f23684a.set(path);
        this.f23684a.setFillType(Path.FillType.EVEN_ODD);
        this.f23690g.mo23475b(this.f23684a);
        this.f23689f = true;
        return this.f23684a;
    }
}

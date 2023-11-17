package p268u1;

import android.view.animation.Interpolator;
import com.airbnb.lottie.C2311c;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.a */
public abstract class C8525a {

    /* renamed from: a */
    final List f24227a = new ArrayList(1);

    /* renamed from: b */
    private boolean f24228b = false;

    /* renamed from: c */
    private final C8529d f24229c;

    /* renamed from: d */
    protected float f24230d = Utils.FLOAT_EPSILON;

    /* renamed from: e */
    protected C6015c f24231e;

    /* renamed from: f */
    private Object f24232f = null;

    /* renamed from: g */
    private float f24233g = -1.0f;

    /* renamed from: h */
    private float f24234h = -1.0f;

    /* renamed from: u1.a$b */
    public interface C8527b {
        /* renamed from: a */
        void mo23468a();
    }

    /* renamed from: u1.a$c */
    private static final class C8528c implements C8529d {
        private C8528c() {
        }

        /* renamed from: a */
        public boolean mo23863a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public C6013a mo23864b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public boolean mo23865c(float f) {
            return false;
        }

        /* renamed from: d */
        public float mo23866d() {
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: e */
        public float mo23867e() {
            return 1.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: u1.a$d */
    private interface C8529d {
        /* renamed from: a */
        boolean mo23863a(float f);

        /* renamed from: b */
        C6013a mo23864b();

        /* renamed from: c */
        boolean mo23865c(float f);

        /* renamed from: d */
        float mo23866d();

        /* renamed from: e */
        float mo23867e();

        boolean isEmpty();
    }

    /* renamed from: u1.a$e */
    private static final class C8530e implements C8529d {

        /* renamed from: a */
        private final List f24235a;

        /* renamed from: b */
        private C6013a f24236b;

        /* renamed from: c */
        private C6013a f24237c = null;

        /* renamed from: d */
        private float f24238d = -1.0f;

        C8530e(List list) {
            this.f24235a = list;
            this.f24236b = m31944f(Utils.FLOAT_EPSILON);
        }

        /* renamed from: f */
        private C6013a m31944f(float f) {
            List list = this.f24235a;
            C6013a aVar = (C6013a) list.get(list.size() - 1);
            if (f >= aVar.mo19490f()) {
                return aVar;
            }
            for (int size = this.f24235a.size() - 2; size >= 1; size--) {
                C6013a aVar2 = (C6013a) this.f24235a.get(size);
                if (this.f24236b != aVar2 && aVar2.mo19485a(f)) {
                    return aVar2;
                }
            }
            return (C6013a) this.f24235a.get(0);
        }

        /* renamed from: a */
        public boolean mo23863a(float f) {
            C6013a aVar = this.f24237c;
            C6013a aVar2 = this.f24236b;
            if (aVar == aVar2 && this.f24238d == f) {
                return true;
            }
            this.f24237c = aVar2;
            this.f24238d = f;
            return false;
        }

        /* renamed from: b */
        public C6013a mo23864b() {
            return this.f24236b;
        }

        /* renamed from: c */
        public boolean mo23865c(float f) {
            if (this.f24236b.mo19485a(f)) {
                return !this.f24236b.mo19493i();
            }
            this.f24236b = m31944f(f);
            return true;
        }

        /* renamed from: d */
        public float mo23866d() {
            return ((C6013a) this.f24235a.get(0)).mo19490f();
        }

        /* renamed from: e */
        public float mo23867e() {
            List list = this.f24235a;
            return ((C6013a) list.get(list.size() - 1)).mo19487c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: u1.a$f */
    private static final class C8531f implements C8529d {

        /* renamed from: a */
        private final C6013a f24239a;

        /* renamed from: b */
        private float f24240b = -1.0f;

        C8531f(List list) {
            this.f24239a = (C6013a) list.get(0);
        }

        /* renamed from: a */
        public boolean mo23863a(float f) {
            if (this.f24240b == f) {
                return true;
            }
            this.f24240b = f;
            return false;
        }

        /* renamed from: b */
        public C6013a mo23864b() {
            return this.f24239a;
        }

        /* renamed from: c */
        public boolean mo23865c(float f) {
            return !this.f24239a.mo19493i();
        }

        /* renamed from: d */
        public float mo23866d() {
            return this.f24239a.mo19490f();
        }

        /* renamed from: e */
        public float mo23867e() {
            return this.f24239a.mo19487c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C8525a(List list) {
        this.f24229c = m31919o(list);
    }

    /* renamed from: g */
    private float m31918g() {
        if (this.f24233g == -1.0f) {
            this.f24233g = this.f24229c.mo23866d();
        }
        return this.f24233g;
    }

    /* renamed from: o */
    private static C8529d m31919o(List list) {
        if (list.isEmpty()) {
            return new C8528c();
        }
        if (list.size() == 1) {
            return new C8531f(list);
        }
        return new C8530e(list);
    }

    /* renamed from: a */
    public void mo23850a(C8527b bVar) {
        this.f24227a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6013a mo23851b() {
        C2311c.m8884a("BaseKeyframeAnimation#getCurrentKeyframe");
        C6013a b = this.f24229c.mo23864b();
        C2311c.m8885b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo23852c() {
        if (this.f24234h == -1.0f) {
            this.f24234h = this.f24229c.mo23867e();
        }
        return this.f24234h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo23853d() {
        C6013a b = mo23851b();
        if (b == null || b.mo19493i()) {
            return Utils.FLOAT_EPSILON;
        }
        return b.f18761d.getInterpolation(mo23854e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo23854e() {
        if (this.f24228b) {
            return Utils.FLOAT_EPSILON;
        }
        C6013a b = mo23851b();
        if (b.mo19493i()) {
            return Utils.FLOAT_EPSILON;
        }
        return (this.f24230d - b.mo19490f()) / (b.mo19487c() - b.mo19490f());
    }

    /* renamed from: f */
    public float mo23855f() {
        return this.f24230d;
    }

    /* renamed from: h */
    public Object mo23856h() {
        Object obj;
        float e = mo23854e();
        if (this.f24231e == null && this.f24229c.mo23863a(e)) {
            return this.f24232f;
        }
        C6013a b = mo23851b();
        Interpolator interpolator = b.f18762e;
        if (interpolator == null || b.f18763f == null) {
            obj = mo23857i(b, mo23853d());
        } else {
            obj = mo23858j(b, e, interpolator.getInterpolation(e), b.f18763f.getInterpolation(e));
        }
        this.f24232f = obj;
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Object mo23857i(C6013a aVar, float f);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Object mo23858j(C6013a aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo23859k() {
        for (int i = 0; i < this.f24227a.size(); i++) {
            ((C8527b) this.f24227a.get(i)).mo23468a();
        }
    }

    /* renamed from: l */
    public void mo23860l() {
        this.f24228b = true;
    }

    /* renamed from: m */
    public void mo23861m(float f) {
        if (!this.f24229c.isEmpty()) {
            if (f < m31918g()) {
                f = m31918g();
            } else if (f > mo23852c()) {
                f = mo23852c();
            }
            if (f != this.f24230d) {
                this.f24230d = f;
                if (this.f24229c.mo23865c(f)) {
                    mo23859k();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo23862n(C6015c cVar) {
        C6015c cVar2 = this.f24231e;
        if (cVar2 != null) {
            cVar2.mo19505c((C8525a) null);
        }
        this.f24231e = cVar;
        if (cVar != null) {
            cVar.mo19505c(this);
        }
    }
}

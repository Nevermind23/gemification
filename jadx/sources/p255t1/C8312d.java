package p255t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5808j;
import p061e2.C6015c;
import p242s1.C8100a;
import p268u1.C8525a;
import p268u1.C8548p;
import p294w1.C8738e;
import p294w1.C8739f;
import p307x1.C8946l;
import p319y1.C9011c;
import p319y1.C9027p;
import p331z1.C9169b;

/* renamed from: t1.d */
public class C8312d implements C8313e, C8322m, C8525a.C8527b, C8739f {

    /* renamed from: a */
    private final Paint f23572a;

    /* renamed from: b */
    private final RectF f23573b;

    /* renamed from: c */
    private final Matrix f23574c;

    /* renamed from: d */
    private final Path f23575d;

    /* renamed from: e */
    private final RectF f23576e;

    /* renamed from: f */
    private final String f23577f;

    /* renamed from: g */
    private final boolean f23578g;

    /* renamed from: h */
    private final List f23579h;

    /* renamed from: i */
    private final C2315d0 f23580i;

    /* renamed from: j */
    private List f23581j;

    /* renamed from: k */
    private C8548p f23582k;

    public C8312d(C2315d0 d0Var, C9169b bVar, C9027p pVar, C2325h hVar) {
        this(d0Var, bVar, pVar.mo24493c(), pVar.mo24494d(), m31194g(d0Var, hVar, bVar, pVar.mo24492b()), m31195i(pVar.mo24492b()));
    }

    /* renamed from: g */
    private static List m31194g(C2315d0 d0Var, C2325h hVar, C9169b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C8311c a = ((C9011c) list.get(i)).mo24359a(d0Var, hVar, bVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    static C8946l m31195i(List list) {
        for (int i = 0; i < list.size(); i++) {
            C9011c cVar = (C9011c) list.get(i);
            if (cVar instanceof C8946l) {
                return (C8946l) cVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    private boolean m31196m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f23579h.size(); i2++) {
            if ((this.f23579h.get(i2) instanceof C8313e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23580i.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f23579h.size());
        arrayList.addAll(list);
        for (int size = this.f23579h.size() - 1; size >= 0; size--) {
            C8311c cVar = (C8311c) this.f23579h.get(size);
            cVar.mo23469b(arrayList, this.f23579h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        C8548p pVar = this.f23582k;
        if (pVar != null) {
            pVar.mo23906c(obj, cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        this.f23574c.set(matrix);
        C8548p pVar = this.f23582k;
        if (pVar != null) {
            this.f23574c.preConcat(pVar.mo23908f());
        }
        this.f23576e.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        for (int size = this.f23579h.size() - 1; size >= 0; size--) {
            C8311c cVar = (C8311c) this.f23579h.get(size);
            if (cVar instanceof C8313e) {
                ((C8313e) cVar).mo23471e(this.f23576e, this.f23574c, z);
                rectF.union(this.f23576e);
            }
        }
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        if (eVar.mo24140g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo24135a(getName());
                if (eVar.mo24136c(getName(), i)) {
                    list.add(eVar2.mo24143i(this));
                }
            }
            if (eVar.mo24141h(getName(), i)) {
                int e = i + eVar.mo24138e(getName(), i);
                for (int i2 = 0; i2 < this.f23579h.size(); i2++) {
                    C8311c cVar = (C8311c) this.f23579h.get(i2);
                    if (cVar instanceof C8739f) {
                        ((C8739f) cVar).mo23472f(eVar, e, list, eVar2);
                    }
                }
            }
        }
    }

    public String getName() {
        return this.f23577f;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.f23578g) {
            this.f23574c.set(matrix);
            C8548p pVar = this.f23582k;
            if (pVar != null) {
                this.f23574c.preConcat(pVar.mo23908f());
                if (this.f23582k.mo23910h() == null) {
                    i2 = 100;
                } else {
                    i2 = ((Integer) this.f23582k.mo23910h().mo23856h()).intValue();
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (!this.f23580i.mo7499b0() || !m31196m() || i == 255) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f23573b.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                mo23471e(this.f23573b, this.f23574c, true);
                this.f23572a.setAlpha(i);
                C5808j.m23385m(canvas, this.f23573b, this.f23572a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f23579h.size() - 1; size >= 0; size--) {
                Object obj = this.f23579h.get(size);
                if (obj instanceof C8313e) {
                    ((C8313e) obj).mo23473h(canvas, this.f23574c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    /* renamed from: j */
    public List mo23477j() {
        return this.f23579h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List mo23478k() {
        if (this.f23581j == null) {
            this.f23581j = new ArrayList();
            for (int i = 0; i < this.f23579h.size(); i++) {
                C8311c cVar = (C8311c) this.f23579h.get(i);
                if (cVar instanceof C8322m) {
                    this.f23581j.add((C8322m) cVar);
                }
            }
        }
        return this.f23581j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Matrix mo23479l() {
        C8548p pVar = this.f23582k;
        if (pVar != null) {
            return pVar.mo23908f();
        }
        this.f23574c.reset();
        return this.f23574c;
    }

    /* renamed from: z */
    public Path mo23480z() {
        this.f23574c.reset();
        C8548p pVar = this.f23582k;
        if (pVar != null) {
            this.f23574c.set(pVar.mo23908f());
        }
        this.f23575d.reset();
        if (this.f23578g) {
            return this.f23575d;
        }
        for (int size = this.f23579h.size() - 1; size >= 0; size--) {
            C8311c cVar = (C8311c) this.f23579h.get(size);
            if (cVar instanceof C8322m) {
                this.f23575d.addPath(((C8322m) cVar).mo23480z(), this.f23574c);
            }
        }
        return this.f23575d;
    }

    C8312d(C2315d0 d0Var, C9169b bVar, String str, boolean z, List list, C8946l lVar) {
        this.f23572a = new C8100a();
        this.f23573b = new RectF();
        this.f23574c = new Matrix();
        this.f23575d = new Path();
        this.f23576e = new RectF();
        this.f23577f = str;
        this.f23580i = d0Var;
        this.f23578g = z;
        this.f23579h = list;
        if (lVar != null) {
            C8548p b = lVar.mo24360b();
            this.f23582k = b;
            b.mo23904a(bVar);
            this.f23582k.mo23905b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C8311c cVar = (C8311c) list.get(size);
            if (cVar instanceof C8318j) {
                arrayList.add((C8318j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C8318j) arrayList.get(size2)).mo23481g(list.listIterator(list.size()));
        }
    }
}

package p029bb;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p012ab.C0097a;
import p012ab.C0098b;
import p070eb.C6125a;
import p070eb.C6126b;
import p083fb.C6196b;
import p096gb.C6404a;

/* renamed from: bb.c */
public class C2202c extends C2200a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C6196b f6413e = new C6196b(1.0d);

    /* renamed from: b */
    private int f6414b = 100;

    /* renamed from: c */
    private final Collection f6415c = new LinkedHashSet();

    /* renamed from: d */
    private final C6404a f6416d = new C6404a(Utils.DOUBLE_EPSILON, 1.0d, Utils.DOUBLE_EPSILON, 1.0d);

    /* renamed from: bb.c$b */
    protected static class C2204b implements C6404a.C6405a, C0097a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C0098b f6417a;

        /* renamed from: b */
        private final C6126b f6418b;

        /* renamed from: c */
        private final LatLng f6419c;

        /* renamed from: d */
        private Set f6420d;

        /* renamed from: a */
        public int mo164a() {
            return 1;
        }

        /* renamed from: b */
        public C6126b mo7134b() {
            return this.f6418b;
        }

        /* renamed from: d */
        public Set mo166n3() {
            return this.f6420d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2204b)) {
                return false;
            }
            return ((C2204b) obj).f6417a.equals(this.f6417a);
        }

        public LatLng getPosition() {
            return this.f6419c;
        }

        public int hashCode() {
            return this.f6417a.hashCode();
        }

        private C2204b(C0098b bVar) {
            this.f6417a = bVar;
            LatLng position = bVar.getPosition();
            this.f6419c = position;
            this.f6418b = C2202c.f6413e.mo19783b(position);
            this.f6420d = Collections.singleton(bVar);
        }
    }

    /* renamed from: h */
    private C6125a m8432h(C6126b bVar, double d) {
        double d2 = d / 2.0d;
        double d3 = bVar.f19065a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = bVar.f19066b;
        return new C6125a(d4, d5, d6 - d2, d6 + d2);
    }

    /* renamed from: i */
    private double m8433i(C6126b bVar, C6126b bVar2) {
        double d = bVar.f19065a;
        double d2 = bVar2.f19065a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f19066b;
        double d5 = bVar2.f19066b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* renamed from: b */
    public boolean mo7129b(C0098b bVar) {
        boolean remove;
        C2204b bVar2 = new C2204b(bVar);
        synchronized (this.f6416d) {
            remove = this.f6415c.remove(bVar2);
            if (remove) {
                this.f6416d.mo20288d(bVar2);
            }
        }
        return remove;
    }

    /* renamed from: d */
    public boolean mo7130d(C0098b bVar) {
        boolean add;
        C2204b bVar2 = new C2204b(bVar);
        synchronized (this.f6416d) {
            add = this.f6415c.add(bVar2);
            if (add) {
                this.f6416d.mo20287a(bVar2);
            }
        }
        return add;
    }

    /* renamed from: e */
    public Set mo7131e(float f) {
        float f2 = f;
        double pow = (((double) this.f6414b) / Math.pow(2.0d, (double) ((int) f2))) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f6416d) {
            Iterator it = mo7133j(this.f6416d, f2).iterator();
            while (it.hasNext()) {
                C2204b bVar = (C2204b) it.next();
                if (!hashSet.contains(bVar)) {
                    Collection<C2204b> e = this.f6416d.mo20289e(m8432h(bVar.mo7134b(), pow));
                    if (e.size() == 1) {
                        hashSet2.add(bVar);
                        hashSet.add(bVar);
                        hashMap.put(bVar, Double.valueOf(Utils.DOUBLE_EPSILON));
                    } else {
                        C2209g gVar = new C2209g(bVar.f6417a.getPosition());
                        hashSet2.add(gVar);
                        for (C2204b bVar2 : e) {
                            Double d = (Double) hashMap.get(bVar2);
                            Iterator it2 = it;
                            double i = m8433i(bVar2.mo7134b(), bVar.mo7134b());
                            if (d != null) {
                                if (d.doubleValue() < i) {
                                    it = it2;
                                } else {
                                    ((C2209g) hashMap2.get(bVar2)).mo7142c(bVar2.f6417a);
                                }
                            }
                            hashMap.put(bVar2, Double.valueOf(i));
                            gVar.mo7141b(bVar2.f6417a);
                            hashMap2.put(bVar2, gVar);
                            it = it2;
                        }
                        hashSet.addAll(e);
                        it = it;
                    }
                }
            }
        }
        return hashSet2;
    }

    /* renamed from: f */
    public int mo7132f() {
        return this.f6414b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Collection mo7133j(C6404a aVar, float f) {
        return this.f6415c;
    }
}

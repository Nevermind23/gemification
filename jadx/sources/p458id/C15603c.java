package p458id;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p472jd.C15744a;
import p472jd.C15745b;
import p472jd.C15746c;
import p472jd.C15748e;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15751h;
import p472jd.C15752i;
import p472jd.C15753j;
import p472jd.C15754k;
import p472jd.C15755l;
import p472jd.C15756m;
import p472jd.C15757n;

/* renamed from: id.c */
public abstract class C15603c {

    /* renamed from: a */
    protected Set f44307a = new HashSet(5);

    /* renamed from: b */
    protected Set f44308b = new HashSet(2);

    /* renamed from: c */
    protected Set f44309c = new HashSet(4);

    /* renamed from: d */
    protected Set f44310d = new HashSet(2);

    /* renamed from: e */
    protected Set f44311e = new HashSet(15);

    /* renamed from: f */
    protected Set f44312f = new HashSet(5);

    /* renamed from: g */
    protected Set f44313g = new HashSet(4);

    /* renamed from: h */
    protected Set f44314h = new HashSet(3);

    /* renamed from: i */
    protected Set f44315i = new HashSet(2);

    /* renamed from: j */
    protected Set f44316j = new HashSet(2);

    /* renamed from: k */
    protected boolean f44317k;

    /* renamed from: l */
    protected boolean f44318l;

    /* renamed from: m */
    protected float f44319m;

    /* renamed from: n */
    protected float f44320n;

    /* renamed from: o */
    protected boolean f44321o;

    /* renamed from: p */
    protected float f44322p;

    /* renamed from: q */
    protected float f44323q;

    protected C15603c() {
    }

    /* renamed from: a */
    public final float mo42882a() {
        return this.f44320n;
    }

    /* renamed from: b */
    public final float mo42883b() {
        return this.f44319m;
    }

    /* renamed from: c */
    public final float mo42884c() {
        return this.f44323q;
    }

    /* renamed from: d */
    public final float mo42885d() {
        return this.f44322p;
    }

    /* renamed from: e */
    public final Collection mo42886e(Class cls) {
        if (cls.equals(C15744a.class)) {
            return Arrays.asList(C15744a.values());
        }
        if (cls.equals(C15749f.class)) {
            return mo42887f();
        }
        if (cls.equals(C15750g.class)) {
            return mo42888g();
        }
        if (cls.equals(C15751h.class)) {
            return Arrays.asList(C15751h.values());
        }
        if (cls.equals(C15752i.class)) {
            return mo42889h();
        }
        if (cls.equals(C15753j.class)) {
            return Arrays.asList(C15753j.values());
        }
        if (cls.equals(C15756m.class)) {
            return Arrays.asList(C15756m.values());
        }
        if (cls.equals(C15745b.class)) {
            return Arrays.asList(C15745b.values());
        }
        if (cls.equals(C15757n.class)) {
            return mo42893l();
        }
        if (cls.equals(C15748e.class)) {
            return Arrays.asList(C15748e.values());
        }
        if (cls.equals(C15755l.class)) {
            return Arrays.asList(C15755l.values());
        }
        if (cls.equals(C15754k.class)) {
            return mo42890i();
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final Collection mo42887f() {
        return Collections.unmodifiableSet(this.f44308b);
    }

    /* renamed from: g */
    public final Collection mo42888g() {
        return Collections.unmodifiableSet(this.f44309c);
    }

    /* renamed from: h */
    public final Collection mo42889h() {
        return Collections.unmodifiableSet(this.f44310d);
    }

    /* renamed from: i */
    public final Collection mo42890i() {
        return Collections.unmodifiableSet(this.f44315i);
    }

    /* renamed from: j */
    public final Collection mo42891j() {
        return Collections.unmodifiableSet(this.f44311e);
    }

    /* renamed from: k */
    public final Collection mo42892k() {
        return Collections.unmodifiableSet(this.f44312f);
    }

    /* renamed from: l */
    public final Collection mo42893l() {
        return Collections.unmodifiableSet(this.f44307a);
    }

    /* renamed from: m */
    public final boolean mo42894m() {
        return this.f44321o;
    }

    /* renamed from: n */
    public final boolean mo42895n() {
        return this.f44318l;
    }

    /* renamed from: o */
    public final boolean mo42896o() {
        return this.f44317k;
    }

    /* renamed from: p */
    public final boolean mo42897p(C15746c cVar) {
        return mo42886e(cVar.getClass()).contains(cVar);
    }
}

package p049d3;

import android.support.p013v4.media.session.C0125b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41536l;
import p217q2.C7823b;
import p217q2.C7836g;
import p217q2.C7846k;
import p217q2.C7851m;
import p243s2.C8104d;
import p243s2.C8119l;
import p243s2.C8124o;
import ue1.C43075l;

/* renamed from: d3.a */
public final class C5813a implements C8124o {

    /* renamed from: a */
    private final Map f18298a;

    /* renamed from: b */
    private final C7836g.C7839c f18299b;

    /* renamed from: c */
    private final Object f18300c;

    /* renamed from: d */
    private final C8104d f18301d;

    /* renamed from: e */
    private final C7851m f18302e;

    /* renamed from: f */
    private final C8119l f18303f;

    /* renamed from: d3.a$a */
    private final class C5814a implements C8124o.C8129b {

        /* renamed from: a */
        private final C7846k f18304a;

        /* renamed from: b */
        private final Object f18305b;

        /* renamed from: c */
        final /* synthetic */ C5813a f18306c;

        public C5814a(C5813a aVar, C7846k kVar, Object obj) {
            C41536l.m120490j(kVar, "field");
            C41536l.m120490j(obj, C11755a.C11756a.f34100b);
            this.f18306c = aVar;
            this.f18304a = kVar;
            this.f18305b = obj;
        }

        /* renamed from: a */
        public Object mo19032a(C8124o.C8134d dVar) {
            C41536l.m120490j(dVar, "objectReader");
            Object obj = this.f18305b;
            this.f18306c.mo19030o().mo23306d(this.f18304a, obj);
            Object a = dVar.mo23314a(new C5813a(this.f18306c.mo19029n(), obj, this.f18306c.mo19028m(), this.f18306c.mo19031p(), this.f18306c.mo19030o()));
            this.f18306c.mo19030o().mo23311i(this.f18304a, obj);
            return a;
        }

        /* renamed from: b */
        public Object mo19033b(C43075l lVar) {
            C41536l.m120490j(lVar, "block");
            return C8124o.C8129b.C8130a.m30715b(this, lVar);
        }

        /* renamed from: c */
        public List mo19034c(C43075l lVar) {
            C41536l.m120490j(lVar, "block");
            return C8124o.C8129b.C8130a.m30714a(this, lVar);
        }

        /* renamed from: d */
        public List mo19035d(C8124o.C8133c cVar) {
            Object obj;
            C41536l.m120490j(cVar, "listReader");
            Object obj2 = this.f18305b;
            if (obj2 != null) {
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C41341q.m119917t();
                    }
                    this.f18306c.mo19030o().mo23308f(i);
                    if (next == null) {
                        this.f18306c.mo19030o().mo23310h();
                        obj = null;
                    } else {
                        obj = cVar.mo23315a(new C5814a(this.f18306c, this.f18304a, next));
                    }
                    this.f18306c.mo19030o().mo23307e(i);
                    arrayList.add(obj);
                    i = i2;
                }
                this.f18306c.mo19030o().mo23304b(list);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                C41536l.m120485e(unmodifiableList, "Collections.unmodifiableList(result)");
                return unmodifiableList;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
        }

        /* renamed from: e */
        public String mo19036e() {
            this.f18306c.mo19030o().mo23305c(this.f18305b);
            Object obj = this.f18305b;
            if (obj != null) {
                return (String) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public C5813a(C7836g.C7839c cVar, Object obj, C8104d dVar, C7851m mVar, C8119l lVar) {
        C41536l.m120490j(cVar, "operationVariables");
        C41536l.m120490j(dVar, "fieldValueResolver");
        C41536l.m120490j(mVar, "scalarTypeAdapters");
        C41536l.m120490j(lVar, "resolveDelegate");
        this.f18299b = cVar;
        this.f18300c = obj;
        this.f18301d = dVar;
        this.f18302e = mVar;
        this.f18303f = lVar;
        this.f18298a = cVar.valueMap();
    }

    /* renamed from: k */
    private final void m23391k(C7846k kVar, Object obj) {
        boolean z;
        if (kVar.mo22805c() || obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(("corrupted response reader, expected non null value for " + kVar.mo22804b()).toString());
        }
    }

    /* renamed from: l */
    private final void m23392l(C7846k kVar) {
        this.f18303f.mo23303a(kVar, this.f18299b);
    }

    /* renamed from: q */
    private final boolean m23393q(C7846k kVar) {
        for (Object a : kVar.mo22803a()) {
            C0125b.m366a(a);
        }
        return false;
    }

    /* renamed from: r */
    private final void m23394r(C7846k kVar, Object obj) {
        this.f18303f.mo23309g(kVar, this.f18299b, obj);
    }

    /* renamed from: a */
    public Integer mo19018a(C7846k kVar) {
        C41536l.m120490j(kVar, "field");
        if (m23393q(kVar)) {
            return null;
        }
        BigDecimal bigDecimal = (BigDecimal) this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, bigDecimal);
        m23394r(kVar, bigDecimal);
        if (bigDecimal == null) {
            this.f18303f.mo23310h();
        } else {
            this.f18303f.mo23305c(bigDecimal);
        }
        m23392l(kVar);
        if (bigDecimal != null) {
            return Integer.valueOf(bigDecimal.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public Object mo19019b(C7846k.C7848b bVar) {
        C41536l.m120490j(bVar, "field");
        Object obj = null;
        if (m23393q(bVar)) {
            return null;
        }
        Object a = this.f18301d.mo7025a(this.f18300c, bVar);
        m23391k(bVar, a);
        m23394r(bVar, a);
        if (a == null) {
            this.f18303f.mo23310h();
        } else {
            obj = this.f18302e.mo22821a(bVar.mo22818f()).mo22743b(C7823b.f22745b.mo22744a(a));
            m23391k(bVar, obj);
            this.f18303f.mo23305c(a);
        }
        m23392l(bVar);
        return obj;
    }

    /* renamed from: c */
    public List mo19020c(C7846k kVar, C8124o.C8133c cVar) {
        ArrayList arrayList;
        Object obj;
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(cVar, "listReader");
        if (m23393q(kVar)) {
            return null;
        }
        List list = (List) this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, list);
        m23394r(kVar, list);
        if (list == null) {
            this.f18303f.mo23310h();
            arrayList = null;
        } else {
            arrayList = new ArrayList(C41343r.m119925u(list, 10));
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                this.f18303f.mo23308f(i);
                if (next == null) {
                    this.f18303f.mo23310h();
                    obj = null;
                } else {
                    obj = cVar.mo23315a(new C5814a(this, kVar, next));
                }
                this.f18303f.mo23307e(i);
                arrayList.add(obj);
                i = i2;
            }
            this.f18303f.mo23304b(list);
        }
        m23392l(kVar);
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    /* renamed from: d */
    public Object mo19021d(C7846k kVar, C43075l lVar) {
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(lVar, "block");
        return C8124o.C8125a.m30703a(this, kVar, lVar);
    }

    /* renamed from: e */
    public Object mo19022e(C7846k kVar, C8124o.C8134d dVar) {
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(dVar, "objectReader");
        if (m23393q(kVar)) {
            return null;
        }
        String str = (String) this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, str);
        m23394r(kVar, str);
        if (str == null) {
            this.f18303f.mo23310h();
            m23392l(kVar);
            return null;
        }
        this.f18303f.mo23305c(str);
        m23392l(kVar);
        if (kVar.mo22807e() != C7846k.C7849c.FRAGMENT) {
            return null;
        }
        for (Object a : kVar.mo22803a()) {
            C0125b.m366a(a);
        }
        return dVar.mo23314a(this);
    }

    /* renamed from: f */
    public Object mo19023f(C7846k kVar, C43075l lVar) {
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(lVar, "block");
        return C8124o.C8125a.m30705c(this, kVar, lVar);
    }

    /* renamed from: g */
    public Object mo19024g(C7846k kVar, C8124o.C8134d dVar) {
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(dVar, "objectReader");
        Object obj = null;
        if (m23393q(kVar)) {
            return null;
        }
        Object a = this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, a);
        m23394r(kVar, a);
        this.f18303f.mo23306d(kVar, a);
        if (a == null) {
            this.f18303f.mo23310h();
        } else {
            obj = dVar.mo23314a(new C5813a(this.f18299b, a, this.f18301d, this.f18302e, this.f18303f));
        }
        this.f18303f.mo23311i(kVar, a);
        m23392l(kVar);
        return obj;
    }

    /* renamed from: h */
    public String mo19025h(C7846k kVar) {
        C41536l.m120490j(kVar, "field");
        if (m23393q(kVar)) {
            return null;
        }
        String str = (String) this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, str);
        m23394r(kVar, str);
        if (str == null) {
            this.f18303f.mo23310h();
        } else {
            this.f18303f.mo23305c(str);
        }
        m23392l(kVar);
        return str;
    }

    /* renamed from: i */
    public List mo19026i(C7846k kVar, C43075l lVar) {
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(lVar, "block");
        return C8124o.C8125a.m30704b(this, kVar, lVar);
    }

    /* renamed from: j */
    public Boolean mo19027j(C7846k kVar) {
        C41536l.m120490j(kVar, "field");
        if (m23393q(kVar)) {
            return null;
        }
        Boolean bool = (Boolean) this.f18301d.mo7025a(this.f18300c, kVar);
        m23391k(kVar, bool);
        m23394r(kVar, bool);
        if (bool == null) {
            this.f18303f.mo23310h();
        } else {
            this.f18303f.mo23305c(bool);
        }
        m23392l(kVar);
        return bool;
    }

    /* renamed from: m */
    public final C8104d mo19028m() {
        return this.f18301d;
    }

    /* renamed from: n */
    public final C7836g.C7839c mo19029n() {
        return this.f18299b;
    }

    /* renamed from: o */
    public final C8119l mo19030o() {
        return this.f18303f;
    }

    /* renamed from: p */
    public final C7851m mo19031p() {
        return this.f18302e;
    }
}

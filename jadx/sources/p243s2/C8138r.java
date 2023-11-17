package p243s2;

import android.support.p013v4.media.session.C0125b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7823b;
import p217q2.C7836g;
import p217q2.C7846k;
import p217q2.C7851m;
import p243s2.C8124o;
import ue1.C43075l;

/* renamed from: s2.r */
public final class C8138r implements C8124o {

    /* renamed from: a */
    private final Map f23282a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f23283b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7851m f23284c;

    /* renamed from: s2.r$a */
    private final class C8139a implements C8124o.C8129b {

        /* renamed from: a */
        private final C7846k f23285a;

        /* renamed from: b */
        private final Object f23286b;

        /* renamed from: c */
        final /* synthetic */ C8138r f23287c;

        public C8139a(C8138r rVar, C7846k kVar, Object obj) {
            C41536l.m120490j(kVar, "field");
            C41536l.m120490j(obj, C11755a.C11756a.f34100b);
            this.f23287c = rVar;
            this.f23285a = kVar;
            this.f23286b = obj;
        }

        /* renamed from: a */
        public Object mo19032a(C8124o.C8134d dVar) {
            C41536l.m120490j(dVar, "objectReader");
            Object obj = this.f23286b;
            if (obj != null) {
                return dVar.mo23314a(new C8138r((Map) obj, this.f23287c.f23283b, this.f23287c.f23284c, (DefaultConstructorMarker) null));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
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
            Object obj2 = this.f23286b;
            if (obj2 != null) {
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                for (Object next : list) {
                    if (next != null) {
                        obj = cVar.mo23315a(new C8139a(this.f23287c, this.f23285a, next));
                    } else {
                        obj = null;
                    }
                    arrayList.add(obj);
                }
                return arrayList;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
        }

        /* renamed from: e */
        public String mo19036e() {
            Object obj = this.f23286b;
            if (obj != null) {
                return (String) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    private C8138r(Map map, Map map2, C7851m mVar) {
        this.f23282a = map;
        this.f23283b = map2;
        this.f23284c = mVar;
    }

    /* renamed from: m */
    private final Object m30736m(C7846k kVar, Object obj) {
        if (kVar.mo22805c() || obj != null) {
            return obj;
        }
        throw new NullPointerException("corrupted response reader, expected non null value for " + kVar.mo22804b());
    }

    /* renamed from: n */
    private final boolean m30737n(C7846k kVar) {
        for (Object a : kVar.mo22803a()) {
            C0125b.m366a(a);
        }
        return false;
    }

    /* renamed from: a */
    public Integer mo19018a(C7846k kVar) {
        C41536l.m120490j(kVar, "field");
        if (m30737n(kVar)) {
            return null;
        }
        Object obj = this.f23282a.get(kVar.mo22806d());
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof BigDecimal)) {
            throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(BigDecimal.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj.getClass()).mo94325c() + '\"');
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        m30736m(kVar, bigDecimal);
        if (bigDecimal != null) {
            return Integer.valueOf(bigDecimal.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public Object mo19019b(C7846k.C7848b bVar) {
        C41536l.m120490j(bVar, "field");
        if (m30737n(bVar)) {
            return null;
        }
        Object obj = this.f23282a.get(bVar.mo22806d());
        if (obj == null) {
            obj = null;
        }
        m30736m(bVar, obj);
        if (obj != null) {
            return this.f23284c.mo22821a(bVar.mo22818f()).mo22743b(C7823b.f22745b.mo22744a(obj));
        }
        return null;
    }

    /* renamed from: c */
    public List mo19020c(C7846k kVar, C8124o.C8133c cVar) {
        Object obj;
        C41536l.m120490j(kVar, "field");
        C41536l.m120490j(cVar, "listReader");
        if (m30737n(kVar)) {
            return null;
        }
        Object obj2 = this.f23282a.get(kVar.mo22806d());
        if (obj2 == null) {
            obj2 = null;
        } else if (!(obj2 instanceof List)) {
            throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(List.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj2.getClass()).mo94325c() + '\"');
        }
        List list = (List) obj2;
        m30736m(kVar, list);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object next : list) {
            if (next != null) {
                obj = cVar.mo23315a(new C8139a(this, kVar, next));
            } else {
                obj = null;
            }
            arrayList.add(obj);
        }
        return arrayList;
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
        if (m30737n(kVar)) {
            return null;
        }
        Object obj = this.f23282a.get(kVar.mo22806d());
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof String)) {
            throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(String.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj.getClass()).mo94325c() + '\"');
        }
        String str = (String) obj;
        m30736m(kVar, str);
        if (str == null) {
            return null;
        }
        List<Object> a = kVar.mo22803a();
        ArrayList arrayList = new ArrayList();
        for (Object a2 : a) {
            C0125b.m366a(a2);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
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
        if (m30737n(kVar)) {
            return null;
        }
        Object obj = this.f23282a.get(kVar.mo22806d());
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof Map)) {
            throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(Map.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj.getClass()).mo94325c() + '\"');
        }
        Map map = (Map) obj;
        m30736m(kVar, map);
        if (map != null) {
            return dVar.mo23314a(new C8138r(map, this.f23283b, this.f23284c));
        }
        return null;
    }

    /* renamed from: h */
    public String mo19025h(C7846k kVar) {
        C41536l.m120490j(kVar, "field");
        String str = null;
        if (m30737n(kVar)) {
            return null;
        }
        Object obj = this.f23282a.get(kVar.mo22806d());
        if (obj != null) {
            if (obj instanceof String) {
                str = obj;
            } else {
                throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(String.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj.getClass()).mo94325c() + '\"');
            }
        }
        return (String) m30736m(kVar, str);
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
        Boolean bool = null;
        if (m30737n(kVar)) {
            return null;
        }
        Object obj = this.f23282a.get(kVar.mo22806d());
        if (obj != null) {
            if (obj instanceof Boolean) {
                bool = obj;
            } else {
                throw new ClassCastException("The value for \"" + kVar.mo22806d() + "\" expected to be of type \"" + C41520a0.m120436b(Boolean.class).mo94325c() + "\" but was \"" + C41520a0.m120436b(obj.getClass()).mo94325c() + '\"');
            }
        }
        return (Boolean) m30736m(kVar, bool);
    }

    public /* synthetic */ C8138r(Map map, Map map2, C7851m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, map2, mVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8138r(Map map, C7836g.C7839c cVar, C7851m mVar) {
        this(map, cVar.valueMap(), mVar);
        C41536l.m120490j(map, "recordSet");
        C41536l.m120490j(cVar, "variables");
        C41536l.m120490j(mVar, "scalarTypeAdapters");
    }
}

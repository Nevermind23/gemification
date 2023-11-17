package x00;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ze1.C43420e;

/* renamed from: x00.f */
public abstract class C29615f extends RecyclerView.C1736h {

    /* renamed from: d */
    private final LinkedHashMap f74777d = new LinkedHashMap();

    /* renamed from: e */
    private ArrayList f74778e = new ArrayList();

    /* renamed from: x00.f$a */
    private static final class C29616a {

        /* renamed from: a */
        private final int f74779a;

        /* renamed from: b */
        private int f74780b;

        /* renamed from: c */
        private int f74781c;

        public C29616a(int i, int i2, int i3) {
            this.f74779a = i;
            this.f74780b = i2;
            this.f74781c = i3;
        }

        /* renamed from: b */
        public static /* synthetic */ C29616a m89922b(C29616a aVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = aVar.f74779a;
            }
            if ((i4 & 2) != 0) {
                i2 = aVar.f74780b;
            }
            if ((i4 & 4) != 0) {
                i3 = aVar.f74781c;
            }
            return aVar.mo69524a(i, i2, i3);
        }

        /* renamed from: a */
        public final C29616a mo69524a(int i, int i2, int i3) {
            return new C29616a(i, i2, i3);
        }

        /* renamed from: c */
        public final int mo69525c() {
            return this.f74780b;
        }

        /* renamed from: d */
        public final int mo69526d() {
            return this.f74781c;
        }

        /* renamed from: e */
        public final int mo69527e() {
            return this.f74779a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29616a)) {
                return false;
            }
            C29616a aVar = (C29616a) obj;
            return this.f74779a == aVar.f74779a && this.f74780b == aVar.f74780b && this.f74781c == aVar.f74781c;
        }

        /* renamed from: f */
        public final void mo69529f(int i) {
            this.f74780b = i;
        }

        public int hashCode() {
            return (((this.f74779a * 31) + this.f74780b) * 31) + this.f74781c;
        }

        public String toString() {
            int i = this.f74779a;
            int i2 = this.f74780b;
            int i3 = this.f74781c;
            return "ModifiedViewType(type=" + i + ", count=" + i2 + ", startPosition=" + i3 + ")";
        }
    }

    /* renamed from: x00.f$b */
    public static final class C29617b {

        /* renamed from: a */
        private final int f74782a;

        /* renamed from: b */
        private int f74783b;

        public C29617b(int i, int i2) {
            this.f74782a = i;
            this.f74783b = i2;
        }

        /* renamed from: a */
        public final int mo69532a() {
            return this.f74783b;
        }

        /* renamed from: b */
        public final int mo69533b() {
            return this.f74782a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29617b)) {
                return false;
            }
            C29617b bVar = (C29617b) obj;
            return this.f74782a == bVar.f74782a && this.f74783b == bVar.f74783b;
        }

        public int hashCode() {
            return (this.f74782a * 31) + this.f74783b;
        }

        public String toString() {
            int i = this.f74782a;
            int i2 = this.f74783b;
            return "ViewType(type=" + i + ", count=" + i2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29617b(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m89897A(C29615f fVar, int i, int i2, boolean z, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                z = true;
            }
            fVar.mo69523z(i, i2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItems");
    }

    /* renamed from: B */
    private final int m89898B(C29617b bVar) {
        return ((C43420e) C41344r0.m119929k(this.f74777d, Integer.valueOf(bVar.mo69533b()))).mo102109j();
    }

    /* renamed from: C */
    private final C29616a m89899C(C29617b bVar, int i) {
        return new C29616a(bVar.mo69533b(), bVar.mo69532a(), i);
    }

    /* renamed from: D */
    private final C29617b m89900D(C29616a aVar) {
        return new C29617b(aVar.mo69527e(), aVar.mo69525c());
    }

    /* renamed from: g */
    private final void m89901g(C29617b bVar) {
        m89902h(this.f74777d.isEmpty() ? 0 : this.f74777d.size(), bVar);
    }

    /* renamed from: h */
    private final void m89902h(int i, C29617b bVar) {
        if (!this.f74777d.containsKey(Integer.valueOf(bVar.mo69533b()))) {
            int n = m89905n(i);
            int a = bVar.mo69532a() + n;
            if (n < a) {
                this.f74777d.put(Integer.valueOf(bVar.mo69533b()), C43429k.m124596o(n, a));
            }
            this.f74778e.add(m89899C(bVar, n));
        }
    }

    /* renamed from: j */
    private final void m89903j(List list) {
        ArrayList<C29617b> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        this.f74777d.clear();
        this.f74778e.clear();
        for (C29617b g : arrayList) {
            m89901g(g);
        }
    }

    /* renamed from: k */
    private final int m89904k(C29617b bVar) {
        return ((C43420e) C41344r0.m119929k(this.f74777d, Integer.valueOf(bVar.mo69533b()))).mo102110l();
    }

    /* renamed from: n */
    private final int m89905n(int i) {
        C29617b o;
        if (i == 0 || (o = m89906o(i - 1)) == null) {
            return 0;
        }
        return Math.max(m89904k(o), m89898B(o)) + 1;
    }

    /* renamed from: o */
    private final C29617b m89906o(int i) {
        if (this.f74777d.isEmpty()) {
            return null;
        }
        Set entrySet = this.f74777d.entrySet();
        C41536l.m120488h(entrySet, "indexMap.entries");
        Map.Entry entry = ((Map.Entry[]) entrySet.toArray(new Map.Entry[0]))[i];
        C41536l.m120488h(entry, "indexMap.entries.toTypedArray()[position]");
        Object key = entry.getKey();
        C41536l.m120488h(key, "entry.key");
        return new C29617b(((Number) key).intValue(), ((C43420e) entry.getValue()).mo102110l() - ((C43420e) entry.getValue()).mo102109j());
    }

    /* renamed from: q */
    private final void m89907q() {
        ArrayList<C29616a> arrayList = this.f74778e;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C29616a D : arrayList) {
            arrayList2.add(m89900D(D));
        }
        m89903j(arrayList2);
    }

    /* renamed from: y */
    private final void m89908y(int i, int i2) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar != null) {
            C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
            aVar.mo69529f(i2);
            m89907q();
            notifyItemRangeRemoved(b.mo69526d(), b.mo69525c());
            notifyItemRangeInserted(b.mo69526d(), i2);
        }
    }

    /* renamed from: f */
    public final void mo69513f(int i, int i2) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar != null) {
            C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
            aVar.mo69529f(aVar.mo69525c() + i2);
            m89907q();
            notifyItemRangeInserted(b.mo69526d() + b.mo69525c(), i2);
        }
    }

    public final int getItemCount() {
        if (this.f74777d.values().isEmpty()) {
            return 0;
        }
        Collection<C43420e> values = this.f74777d.values();
        C41536l.m120488h(values, "indexMap.values");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(values, 10));
        for (C43420e eVar : values) {
            C41536l.m120488h(eVar, "it");
            arrayList.add(Integer.valueOf(C41358y.m120000P(eVar)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final int getItemViewType(int i) {
        Object obj;
        Integer num;
        Set entrySet = this.f74777d.entrySet();
        C41536l.m120488h(entrySet, "indexMap.entries");
        Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object value = ((Map.Entry) obj).getValue();
            C41536l.m120488h(value, "it.value");
            C43420e eVar = (C43420e) value;
            int j = eVar.mo102109j();
            boolean z = false;
            if (i <= eVar.mo102110l() && j <= i) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (num = (Integer) entry.getKey()) == null) {
            num = -1;
        }
        return num.intValue();
    }

    /* renamed from: i */
    public final boolean mo69514i(int i) {
        return this.f74777d.get(Integer.valueOf(i)) != null;
    }

    /* renamed from: l */
    public abstract List mo48134l();

    /* renamed from: m */
    public final int mo69515m(int i) {
        return i == -1 ? i : i - ((C43420e) C41344r0.m119929k(this.f74777d, Integer.valueOf(getItemViewType(i)))).mo102109j();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f74777d.isEmpty()) {
            m89903j(mo48134l());
        }
    }

    public final void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        mo48135p(f0Var, i, mo69515m(i));
    }

    /* renamed from: p */
    public abstract void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2);

    /* renamed from: r */
    public final void mo69516r(int i) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar == null) {
            return;
        }
        if (aVar.mo69525c() == 1) {
            notifyItemChanged(aVar.mo69526d());
        } else {
            notifyItemRangeChanged(aVar.mo69526d(), aVar.mo69525c());
        }
    }

    /* renamed from: s */
    public final void mo69517s(int i) {
        Object obj;
        boolean z;
        if (mo69514i(i)) {
            Iterator it = this.f74778e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C29616a) obj).mo69527e() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C29616a aVar = (C29616a) obj;
            if (aVar != null) {
                C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
                aVar.mo69529f(0);
                m89907q();
                notifyItemRangeRemoved(b.mo69526d(), b.mo69525c());
            }
        }
    }

    /* renamed from: t */
    public final void mo69518t(int i, int i2) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar != null) {
            C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
            aVar.mo69529f(aVar.mo69525c() - 1);
            m89907q();
            notifyItemRemoved(b.mo69526d() + i2);
        }
    }

    /* renamed from: u */
    public final void mo69519u(List list) {
        C41536l.m120489i(list, "types");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo69517s(((Number) it.next()).intValue());
        }
    }

    /* renamed from: v */
    public final void mo69520v(int... iArr) {
        C41536l.m120489i(iArr, "type");
        for (int s : iArr) {
            mo69517s(s);
        }
    }

    /* renamed from: w */
    public final void mo69521w(int i, int i2, int i3) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar != null) {
            C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
            int min = Math.min(i3, b.mo69525c() - i2);
            aVar.mo69529f(aVar.mo69525c() - min);
            m89907q();
            notifyItemRangeRemoved(b.mo69526d() + i2, min);
        }
    }

    /* renamed from: x */
    public final void mo69522x(int i, int i2) {
        Object obj;
        boolean z;
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar != null) {
            C29616a b = C29616a.m89922b(aVar, 0, 0, 0, 7, (Object) null);
            int min = Math.min(i2, b.mo69525c());
            aVar.mo69529f(aVar.mo69525c() - min);
            m89907q();
            notifyItemRangeRemoved((b.mo69526d() + b.mo69525c()) - i2, min);
        }
    }

    /* renamed from: z */
    public final void mo69523z(int i, int i2, boolean z) {
        Object obj;
        boolean z2;
        if (z) {
            m89908y(i, i2);
            return;
        }
        Iterator it = this.f74778e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29616a) obj).mo69527e() == i) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C29616a aVar = (C29616a) obj;
        if (aVar == null) {
            return;
        }
        if (aVar.mo69525c() > i2) {
            mo69522x(i, i2);
            mo69516r(i);
            return;
        }
        mo69516r(i);
        if (i2 != aVar.mo69525c()) {
            m89908y(i, i2 - aVar.mo69525c());
        }
    }
}

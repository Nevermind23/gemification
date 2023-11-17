package p202p0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7589q;
import p215q0.C7816a;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: p0.s */
public class C7594s extends C7589q implements Iterable, C43151a {

    /* renamed from: s */
    public static final C7595a f22154s = new C7595a((DefaultConstructorMarker) null);

    /* renamed from: o */
    private final SparseArrayCompat f22155o = new SparseArrayCompat();

    /* renamed from: p */
    private int f22156p;

    /* renamed from: q */
    private String f22157q;

    /* renamed from: r */
    private String f22158r;

    /* renamed from: p0.s$a */
    public static final class C7595a {

        /* renamed from: p0.s$a$a */
        static final class C7596a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C7596a f22159d = new C7596a();

            C7596a() {
                super(1);
            }

            /* renamed from: a */
            public final C7589q invoke(C7589q qVar) {
                C41536l.m120489i(qVar, "it");
                if (!(qVar instanceof C7594s)) {
                    return null;
                }
                C7594s sVar = (C7594s) qVar;
                return sVar.mo22226K(sVar.mo22232R());
            }
        }

        private C7595a() {
        }

        public /* synthetic */ C7595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7589q mo22236a(C7594s sVar) {
            C41536l.m120489i(sVar, "<this>");
            return (C7589q) C40355o.m116862t(C40349m.m116845f(sVar.mo22226K(sVar.mo22232R()), C7596a.f22159d));
        }
    }

    /* renamed from: p0.s$b */
    public static final class C7597b implements Iterator, C43151a {

        /* renamed from: d */
        private int f22160d = -1;

        /* renamed from: e */
        private boolean f22161e;

        /* renamed from: f */
        final /* synthetic */ C7594s f22162f;

        C7597b(C7594s sVar) {
            this.f22162f = sVar;
        }

        /* renamed from: b */
        public C7589q next() {
            if (hasNext()) {
                this.f22161e = true;
                SparseArrayCompat O = this.f22162f.mo22230O();
                int i = this.f22160d + 1;
                this.f22160d = i;
                Object valueAt = O.valueAt(i);
                C41536l.m120488h(valueAt, "nodes.valueAt(++index)");
                return (C7589q) valueAt;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f22160d + 1 < this.f22162f.mo22230O().size();
        }

        public void remove() {
            if (this.f22161e) {
                SparseArrayCompat O = this.f22162f.mo22230O();
                ((C7589q) O.valueAt(this.f22160d)).mo22204G((C7594s) null);
                O.removeAt(this.f22160d);
                this.f22160d--;
                this.f22161e = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7594s(C7530c0 c0Var) {
        super(c0Var);
        C41536l.m120489i(c0Var, "navGraphNavigator");
    }

    /* renamed from: U */
    private final void m28870U(int i) {
        boolean z;
        if (i != mo22214w()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f22158r != null) {
                m28871V((String) null);
            }
            this.f22156p = i;
            this.f22157q = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: V */
    private final void m28871V(String str) {
        int i;
        if (str == null) {
            i = 0;
        } else if (!(!C41536l.m120484d(str, mo22200B()))) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!C40439w.m117118v(str)) {
            i = C7589q.f22137m.mo22217a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        }
        this.f22156p = i;
        this.f22158r = str;
    }

    /* renamed from: C */
    public C7589q.C7592b mo22201C(C7588p pVar) {
        C41536l.m120489i(pVar, "navDeepLinkRequest");
        C7589q.C7592b C = super.mo22201C(pVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C7589q.C7592b C2 = ((C7589q) it.next()).mo22201C(pVar);
            if (C2 != null) {
                arrayList.add(C2);
            }
        }
        return (C7589q.C7592b) C41358y.m120021k0(C41341q.m119912o(C, (C7589q.C7592b) C41358y.m120021k0(arrayList)));
    }

    /* renamed from: D */
    public void mo22025D(Context context, AttributeSet attributeSet) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        super.mo22025D(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7816a.f22736v);
        C41536l.m120488h(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        m28870U(obtainAttributes.getResourceId(C7816a.f22737w, 0));
        this.f22157q = C7589q.f22137m.mo22218b(context, this.f22156p);
        C41238w wVar = C41238w.f97225a;
        obtainAttributes.recycle();
    }

    /* renamed from: J */
    public final void mo22225J(C7589q qVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(qVar, "node");
        int w = qVar.mo22214w();
        String B = qVar.mo22200B();
        boolean z3 = false;
        if (w == 0 && B == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        } else if (mo22200B() == null || (!C41536l.m120484d(B, mo22200B()))) {
            if (w != mo22214w()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C7589q qVar2 = (C7589q) this.f22155o.get(w);
                if (qVar2 != qVar) {
                    if (qVar.mo22199A() == null) {
                        z3 = true;
                    }
                    if (z3) {
                        if (qVar2 != null) {
                            qVar2.mo22204G((C7594s) null);
                        }
                        qVar.mo22204G(this);
                        this.f22155o.put(qVar.mo22214w(), qVar);
                        return;
                    }
                    throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same id as graph " + this).toString());
        } else {
            throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same route as graph " + this).toString());
        }
    }

    /* renamed from: K */
    public final C7589q mo22226K(int i) {
        return mo22227L(i, true);
    }

    /* renamed from: L */
    public final C7589q mo22227L(int i, boolean z) {
        C7589q qVar = (C7589q) this.f22155o.get(i);
        if (qVar != null) {
            return qVar;
        }
        if (!z || mo22199A() == null) {
            return null;
        }
        C7594s A = mo22199A();
        C41536l.m120486f(A);
        return A.mo22226K(i);
    }

    /* renamed from: M */
    public final C7589q mo22228M(String str) {
        if (!(str == null || C40439w.m117118v(str))) {
            return mo22229N(str, true);
        }
        return null;
    }

    /* renamed from: N */
    public final C7589q mo22229N(String str, boolean z) {
        C41536l.m120489i(str, "route");
        C7589q qVar = (C7589q) this.f22155o.get(C7589q.f22137m.mo22217a(str).hashCode());
        if (qVar != null) {
            return qVar;
        }
        if (!z || mo22199A() == null) {
            return null;
        }
        C7594s A = mo22199A();
        C41536l.m120486f(A);
        return A.mo22228M(str);
    }

    /* renamed from: O */
    public final SparseArrayCompat mo22230O() {
        return this.f22155o;
    }

    /* renamed from: P */
    public final String mo22231P() {
        if (this.f22157q == null) {
            String str = this.f22158r;
            if (str == null) {
                str = String.valueOf(this.f22156p);
            }
            this.f22157q = str;
        }
        String str2 = this.f22157q;
        C41536l.m120486f(str2);
        return str2;
    }

    /* renamed from: R */
    public final int mo22232R() {
        return this.f22156p;
    }

    /* renamed from: S */
    public final String mo22233S() {
        return this.f22158r;
    }

    /* renamed from: T */
    public final void mo22234T(int i) {
        m28870U(i);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7594s)) {
            return false;
        }
        List B = C40355o.m116851B(C40349m.m116842c(SparseArrayKt.valueIterator(this.f22155o)));
        C7594s sVar = (C7594s) obj;
        Iterator valueIterator = SparseArrayKt.valueIterator(sVar.f22155o);
        while (valueIterator.hasNext()) {
            B.remove((C7589q) valueIterator.next());
        }
        if (!super.equals(obj) || this.f22155o.size() != sVar.f22155o.size() || mo22232R() != sVar.mo22232R() || !B.isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int R = mo22232R();
        SparseArrayCompat sparseArrayCompat = this.f22155o;
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            R = (((R * 31) + sparseArrayCompat.keyAt(i)) * 31) + ((C7589q) sparseArrayCompat.valueAt(i)).hashCode();
        }
        return R;
    }

    public final Iterator iterator() {
        return new C7597b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C7589q M = mo22228M(this.f22158r);
        if (M == null) {
            M = mo22226K(mo22232R());
        }
        sb.append(" startDestination=");
        if (M == null) {
            String str = this.f22158r;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f22157q;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f22156p));
                }
            }
        } else {
            sb.append("{");
            sb.append(M.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: v */
    public String mo22213v() {
        return mo22214w() != 0 ? super.mo22213v() : "the root navigation";
    }
}

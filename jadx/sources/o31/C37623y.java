package o31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p603si.C17799b;

/* renamed from: o31.y */
public final class C37623y extends ArrayList implements C17799b {

    /* renamed from: f */
    public static final C37624a f90388f = new C37624a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C37625b f90389d;

    /* renamed from: e */
    private C17799b f90390e;

    /* renamed from: o31.y$a */
    public static final class C37624a {
        private C37624a() {
        }

        public /* synthetic */ C37624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C37623y m110637b(C37624a aVar, C17799b bVar, C37625b bVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar2 = C37625b.ALL;
            }
            return aVar.mo90805a(bVar, bVar2);
        }

        /* renamed from: a */
        public final C37623y mo90805a(C17799b bVar, C37625b bVar2) {
            C41536l.m120489i(bVar, "<this>");
            C41536l.m120489i(bVar2, "requirementType");
            return new C37623y(new C17799b[]{bVar}, bVar2);
        }
    }

    /* renamed from: o31.y$b */
    public enum C37625b {
        ALL,
        ANY
    }

    public C37623y(C17799b[] bVarArr, C37625b bVar) {
        C41536l.m120489i(bVarArr, "validators");
        C41536l.m120489i(bVar, "requirementType");
        this.f90389d = bVar;
        boolean unused = C41352v.m119956A(this, bVarArr);
    }

    /* renamed from: o */
    private static final boolean m110628o(String[] strArr, C17799b bVar) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String P0 : strArr) {
            arrayList.add(C40440x.m117146P0(P0).toString());
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        return bVar.mo45386g((String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* renamed from: A */
    public /* bridge */ boolean mo90795A(C17799b bVar) {
        return super.remove(bVar);
    }

    /* renamed from: b */
    public String mo45383b() {
        C17799b bVar = this.f90390e;
        if (bVar != null) {
            return bVar.mo45383b();
        }
        return null;
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        C17799b bVar = this.f90390e;
        if (bVar != null) {
            return bVar.mo45384c();
        }
        return null;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C17799b)) {
            return false;
        }
        return mo90798k((C17799b) obj);
    }

    /* renamed from: g */
    public boolean mo45386g(String... strArr) {
        Object obj;
        boolean z;
        C41536l.m120489i(strArr, "inputs");
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!m110628o(strArr, (C17799b) obj)) {
                break;
            }
        }
        this.f90390e = (C17799b) obj;
        if (this.f90389d == C37625b.ANY) {
            if (!isEmpty()) {
                Iterator it2 = iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (m110628o(strArr, (C17799b) it2.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                this.f90390e = null;
            }
        }
        if (this.f90390e == null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C17799b)) {
            return -1;
        }
        return mo90801n((C17799b) obj);
    }

    /* renamed from: k */
    public /* bridge */ boolean mo90798k(C17799b bVar) {
        return super.contains(bVar);
    }

    /* renamed from: l */
    public /* bridge */ int mo90799l() {
        return super.size();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C17799b)) {
            return -1;
        }
        return mo90802r((C17799b) obj);
    }

    /* renamed from: n */
    public /* bridge */ int mo90801n(C17799b bVar) {
        return super.indexOf(bVar);
    }

    /* renamed from: r */
    public /* bridge */ int mo90802r(C17799b bVar) {
        return super.lastIndexOf(bVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C17799b)) {
            return false;
        }
        return mo90795A((C17799b) obj);
    }

    public final /* bridge */ int size() {
        return mo90799l();
    }
}

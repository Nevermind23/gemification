package p202p0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import bf1.C40342g;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41238w;
import ie1.C41322h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7578n;
import p215q0.C7816a;
import ue1.C43075l;

/* renamed from: p0.q */
public abstract class C7589q {

    /* renamed from: m */
    public static final C7590a f22137m = new C7590a((DefaultConstructorMarker) null);

    /* renamed from: n */
    private static final Map f22138n = new LinkedHashMap();

    /* renamed from: d */
    private final String f22139d;

    /* renamed from: e */
    private C7594s f22140e;

    /* renamed from: f */
    private String f22141f;

    /* renamed from: g */
    private CharSequence f22142g;

    /* renamed from: h */
    private final List f22143h;

    /* renamed from: i */
    private final SparseArrayCompat f22144i;

    /* renamed from: j */
    private Map f22145j;

    /* renamed from: k */
    private int f22146k;

    /* renamed from: l */
    private String f22147l;

    /* renamed from: p0.q$a */
    public static final class C7590a {

        /* renamed from: p0.q$a$a */
        static final class C7591a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C7591a f22148d = new C7591a();

            C7591a() {
                super(1);
            }

            /* renamed from: a */
            public final C7589q invoke(C7589q qVar) {
                C41536l.m120489i(qVar, "it");
                return qVar.mo22199A();
            }
        }

        private C7590a() {
        }

        public /* synthetic */ C7590a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo22217a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        /* renamed from: b */
        public final String mo22218b(Context context, int i) {
            String str;
            C41536l.m120489i(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                str = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i);
            }
            C41536l.m120488h(str, "try {\n                co….toString()\n            }");
            return str;
        }

        /* renamed from: c */
        public final C40342g mo22219c(C7589q qVar) {
            C41536l.m120489i(qVar, "<this>");
            return C40349m.m116845f(qVar, C7591a.f22148d);
        }
    }

    /* renamed from: p0.q$b */
    public static final class C7592b implements Comparable {

        /* renamed from: d */
        private final C7589q f22149d;

        /* renamed from: e */
        private final Bundle f22150e;

        /* renamed from: f */
        private final boolean f22151f;

        /* renamed from: g */
        private final boolean f22152g;

        /* renamed from: h */
        private final int f22153h;

        public C7592b(C7589q qVar, Bundle bundle, boolean z, boolean z2, int i) {
            C41536l.m120489i(qVar, "destination");
            this.f22149d = qVar;
            this.f22150e = bundle;
            this.f22151f = z;
            this.f22152g = z2;
            this.f22153h = i;
        }

        /* renamed from: a */
        public int compareTo(C7592b bVar) {
            C41536l.m120489i(bVar, "other");
            boolean z = this.f22151f;
            if (z && !bVar.f22151f) {
                return 1;
            }
            if (!z && bVar.f22151f) {
                return -1;
            }
            Bundle bundle = this.f22150e;
            if (bundle != null && bVar.f22150e == null) {
                return 1;
            }
            if (bundle == null && bVar.f22150e != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f22150e;
                C41536l.m120486f(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f22152g;
            if (z2 && !bVar.f22152g) {
                return 1;
            }
            if (z2 || !bVar.f22152g) {
                return this.f22153h - bVar.f22153h;
            }
            return -1;
        }

        /* renamed from: b */
        public final C7589q mo22222b() {
            return this.f22149d;
        }

        /* renamed from: c */
        public final Bundle mo22223c() {
            return this.f22150e;
        }
    }

    public C7589q(String str) {
        C41536l.m120489i(str, "navigatorName");
        this.f22139d = str;
        this.f22143h = new ArrayList();
        this.f22144i = new SparseArrayCompat();
        this.f22145j = new LinkedHashMap();
    }

    /* renamed from: n */
    public static /* synthetic */ int[] m28840n(C7589q qVar, C7589q qVar2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                qVar2 = null;
            }
            return qVar.mo22210l(qVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    /* renamed from: A */
    public final C7594s mo22199A() {
        return this.f22140e;
    }

    /* renamed from: B */
    public final String mo22200B() {
        return this.f22147l;
    }

    /* renamed from: C */
    public C7592b mo22201C(C7588p pVar) {
        Bundle bundle;
        boolean z;
        int i;
        C41536l.m120489i(pVar, "navDeepLinkRequest");
        if (this.f22143h.isEmpty()) {
            return null;
        }
        C7592b bVar = null;
        for (C7578n nVar : this.f22143h) {
            Uri c = pVar.mo22197c();
            if (c != null) {
                bundle = nVar.mo22167f(c, mo22212r());
            } else {
                bundle = null;
            }
            String a = pVar.mo22195a();
            if (a == null || !C41536l.m120484d(a, nVar.mo22164d())) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = z;
            String b = pVar.mo22196b();
            if (b != null) {
                i = nVar.mo22169h(b);
            } else {
                i = -1;
            }
            if (bundle != null || z2 || i > -1) {
                C7592b bVar2 = new C7592b(this, bundle, nVar.mo22172l(), z2, i);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    /* renamed from: D */
    public void mo22025D(Context context, AttributeSet attributeSet) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C7816a.f22738x);
        C41536l.m120488h(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        mo22205H(obtainAttributes.getString(C7816a.f22714A));
        int i = C7816a.f22740z;
        if (obtainAttributes.hasValue(i)) {
            mo22203F(obtainAttributes.getResourceId(i, 0));
            this.f22141f = f22137m.mo22218b(context, this.f22146k);
        }
        this.f22142g = obtainAttributes.getText(C7816a.f22739y);
        C41238w wVar = C41238w.f97225a;
        obtainAttributes.recycle();
    }

    /* renamed from: E */
    public final void mo22202E(int i, C7538e eVar) {
        boolean z;
        C41536l.m120489i(eVar, UrlHandler.ACTION);
        if (mo22026I()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f22144i.put(i, eVar);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* renamed from: F */
    public final void mo22203F(int i) {
        this.f22146k = i;
        this.f22141f = null;
    }

    /* renamed from: G */
    public final void mo22204G(C7594s sVar) {
        this.f22140e = sVar;
    }

    /* renamed from: H */
    public final void mo22205H(String str) {
        Object obj;
        if (str == null) {
            mo22203F(0);
        } else if (!C40439w.m117118v(str)) {
            String a = f22137m.mo22217a(str);
            mo22203F(a.hashCode());
            mo22207c(a);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List list = this.f22143h;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C7578n) obj).mo22171k(), f22137m.mo22217a(this.f22147l))) {
                break;
            }
        }
        C41527d0.m120454a(list).remove(obj);
        this.f22147l = str;
    }

    /* renamed from: I */
    public boolean mo22026I() {
        return true;
    }

    /* renamed from: b */
    public final void mo22206b(String str, C7546i iVar) {
        C41536l.m120489i(str, "argumentName");
        C41536l.m120489i(iVar, "argument");
        this.f22145j.put(str, iVar);
    }

    /* renamed from: c */
    public final void mo22207c(String str) {
        C41536l.m120489i(str, "uriPattern");
        mo22208i(new C7578n.C7579a().mo22176d(str).mo22173a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x013a
            boolean r1 = r9 instanceof p202p0.C7589q
            if (r1 != 0) goto L_0x0009
            goto L_0x013a
        L_0x0009:
            java.util.List r1 = r8.f22143h
            p0.q r9 = (p202p0.C7589q) r9
            java.util.List r2 = r9.f22143h
            java.util.Set r1 = ie1.C41358y.m120013c0(r1, r2)
            int r1 = r1.size()
            java.util.List r2 = r8.f22143h
            int r2 = r2.size()
            r3 = 1
            if (r1 != r2) goto L_0x0022
            r1 = r3
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            androidx.collection.SparseArrayCompat r2 = r8.f22144i
            int r2 = r2.size()
            androidx.collection.SparseArrayCompat r4 = r9.f22144i
            int r4 = r4.size()
            if (r2 != r4) goto L_0x0081
            androidx.collection.SparseArrayCompat r2 = r8.f22144i
            java.util.Iterator r2 = androidx.collection.SparseArrayKt.valueIterator(r2)
            bf1.g r2 = bf1.C40349m.m116842c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = r2.next()
            p0.e r4 = (p202p0.C7538e) r4
            androidx.collection.SparseArrayCompat r5 = r9.f22144i
            boolean r4 = r5.containsValue(r4)
            if (r4 != 0) goto L_0x003f
            r2 = r0
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            if (r2 == 0) goto L_0x0081
            androidx.collection.SparseArrayCompat r2 = r9.f22144i
            java.util.Iterator r2 = androidx.collection.SparseArrayKt.valueIterator(r2)
            bf1.g r2 = bf1.C40349m.m116842c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0066:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()
            p0.e r4 = (p202p0.C7538e) r4
            androidx.collection.SparseArrayCompat r5 = r8.f22144i
            boolean r4 = r5.containsValue(r4)
            if (r4 != 0) goto L_0x0066
            r2 = r0
            goto L_0x007d
        L_0x007c:
            r2 = r3
        L_0x007d:
            if (r2 == 0) goto L_0x0081
            r2 = r3
            goto L_0x0082
        L_0x0081:
            r2 = r0
        L_0x0082:
            java.util.Map r4 = r8.mo22212r()
            int r4 = r4.size()
            java.util.Map r5 = r9.mo22212r()
            int r5 = r5.size()
            if (r4 != r5) goto L_0x0122
            java.util.Map r4 = r8.mo22212r()
            bf1.g r4 = ie1.C41348t0.m119944z(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.mo22212r()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00d2
            java.util.Map r6 = r9.mo22212r()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r6, r5)
            if (r5 == 0) goto L_0x00d2
            r5 = r3
            goto L_0x00d3
        L_0x00d2:
            r5 = r0
        L_0x00d3:
            if (r5 != 0) goto L_0x00a0
            r4 = r0
            goto L_0x00d8
        L_0x00d7:
            r4 = r3
        L_0x00d8:
            if (r4 == 0) goto L_0x0122
            java.util.Map r4 = r9.mo22212r()
            bf1.g r4 = ie1.C41348t0.m119944z(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011d
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r8.mo22212r()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x0118
            java.util.Map r6 = r8.mo22212r()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r6, r5)
            if (r5 == 0) goto L_0x0118
            r5 = r3
            goto L_0x0119
        L_0x0118:
            r5 = r0
        L_0x0119:
            if (r5 != 0) goto L_0x00e6
            r4 = r0
            goto L_0x011e
        L_0x011d:
            r4 = r3
        L_0x011e:
            if (r4 == 0) goto L_0x0122
            r4 = r3
            goto L_0x0123
        L_0x0122:
            r4 = r0
        L_0x0123:
            int r5 = r8.f22146k
            int r6 = r9.f22146k
            if (r5 != r6) goto L_0x013a
            java.lang.String r5 = r8.f22147l
            java.lang.String r9 = r9.f22147l
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)
            if (r9 == 0) goto L_0x013a
            if (r1 == 0) goto L_0x013a
            if (r2 == 0) goto L_0x013a
            if (r4 == 0) goto L_0x013a
            r0 = r3
        L_0x013a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7589q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Set<String> keySet;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f22146k * 31;
        String str = this.f22147l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i12 = i9 + i;
        for (C7578n nVar : this.f22143h) {
            int i13 = i2 * 31;
            String k = nVar.mo22171k();
            if (k != null) {
                i6 = k.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            String d = nVar.mo22164d();
            if (d != null) {
                i7 = d.hashCode();
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            String g = nVar.mo22168g();
            if (g != null) {
                i8 = g.hashCode();
            } else {
                i8 = 0;
            }
            i12 = i15 + i8;
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.f22144i);
        while (valueIterator.hasNext()) {
            C7538e eVar = (C7538e) valueIterator.next();
            int b = ((i2 * 31) + eVar.mo22066b()) * 31;
            C7602w c = eVar.mo22067c();
            if (c != null) {
                i4 = c.hashCode();
            } else {
                i4 = 0;
            }
            i2 = b + i4;
            Bundle a = eVar.mo22065a();
            if (!(a == null || (keySet = a.keySet()) == null)) {
                C41536l.m120488h(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i16 = i2 * 31;
                    Bundle a2 = eVar.mo22065a();
                    C41536l.m120486f(a2);
                    Object obj = a2.get(str2);
                    if (obj != null) {
                        i5 = obj.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i2 = i16 + i5;
                }
            }
        }
        for (String str3 : mo22212r().keySet()) {
            int hashCode = ((i2 * 31) + str3.hashCode()) * 31;
            Object obj2 = mo22212r().get(str3);
            if (obj2 != null) {
                i3 = obj2.hashCode();
            } else {
                i3 = 0;
            }
            i2 = hashCode + i3;
        }
        return i2;
    }

    /* renamed from: i */
    public final void mo22208i(C7578n nVar) {
        C41536l.m120489i(nVar, "navDeepLink");
        Map r = mo22212r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = r.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C7546i iVar = (C7546i) entry.getValue();
            if (iVar.mo22085c() || iVar.mo22084b()) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next : keySet) {
            if (!nVar.mo22165e().contains((String) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            this.f22143h.add(nVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + nVar.mo22171k() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* renamed from: j */
    public final Bundle mo22209j(Bundle bundle) {
        boolean z;
        if (bundle == null) {
            Map map = this.f22145j;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f22145j.entrySet()) {
            ((C7546i) entry.getValue()).mo22086d((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f22145j.entrySet()) {
                String str = (String) entry2.getKey();
                C7546i iVar = (C7546i) entry2.getValue();
                if (!iVar.mo22087e(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + iVar.mo22083a().mo22271b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* renamed from: l */
    public final int[] mo22210l(C7589q qVar) {
        C7594s sVar;
        C41322h hVar = new C41322h();
        C7594s sVar2 = this;
        while (true) {
            C41536l.m120486f(sVar2);
            C7594s sVar3 = sVar2.f22140e;
            if (qVar != null) {
                sVar = qVar.f22140e;
            } else {
                sVar = null;
            }
            if (sVar != null) {
                C7594s sVar4 = qVar.f22140e;
                C41536l.m120486f(sVar4);
                if (sVar4.mo22226K(sVar2.f22146k) == sVar2) {
                    hVar.mo95929i(sVar2);
                    break;
                }
            }
            if (sVar3 == null || sVar3.mo22232R() != sVar2.f22146k) {
                hVar.mo95929i(sVar2);
            }
            if (C41536l.m120484d(sVar3, qVar) || sVar3 == null) {
                break;
            }
            sVar2 = sVar3;
        }
        List<C7589q> z0 = C41358y.m120036z0(hVar);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(z0, 10));
        for (C7589q qVar2 : z0) {
            arrayList.add(Integer.valueOf(qVar2.f22146k));
        }
        return C41358y.m120035y0(arrayList);
    }

    /* renamed from: o */
    public final C7538e mo22211o(int i) {
        C7538e eVar;
        if (this.f22144i.isEmpty()) {
            eVar = null;
        } else {
            eVar = (C7538e) this.f22144i.get(i);
        }
        if (eVar != null) {
            return eVar;
        }
        C7594s sVar = this.f22140e;
        if (sVar != null) {
            return sVar.mo22211o(i);
        }
        return null;
    }

    /* renamed from: r */
    public final Map mo22212r() {
        return C41344r0.m119941w(this.f22145j);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f22141f;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f22146k));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f22147l;
        if (str2 == null || C40439w.m117118v(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append(" route=");
            sb.append(this.f22147l);
        }
        if (this.f22142g != null) {
            sb.append(" label=");
            sb.append(this.f22142g);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: v */
    public String mo22213v() {
        String str = this.f22141f;
        return str == null ? String.valueOf(this.f22146k) : str;
    }

    /* renamed from: w */
    public final int mo22214w() {
        return this.f22146k;
    }

    /* renamed from: x */
    public final CharSequence mo22215x() {
        return this.f22142g;
    }

    /* renamed from: z */
    public final String mo22216z() {
        return this.f22139d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7589q(C7530c0 c0Var) {
        this(C7536d0.f21980b.mo22063a(c0Var.getClass()));
        C41536l.m120489i(c0Var, "navigator");
    }
}

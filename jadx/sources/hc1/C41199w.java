package hc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import sso.type.AuthElementType;

/* renamed from: hc1.w */
public final class C41199w {

    /* renamed from: a */
    private final Set f97185a;

    /* renamed from: b */
    private final Set f97186b;

    /* renamed from: c */
    private C41171i0 f97187c;

    /* renamed from: d */
    private final LinkedList f97188d = new LinkedList();

    /* renamed from: e */
    private final List f97189e = C41341q.m119910m(AuthElementType.PASSWORD, AuthElementType.PASSCODE);

    /* renamed from: hc1.w$a */
    public /* synthetic */ class C41200a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97190a;

        static {
            int[] iArr = new int[C41143c.values().length];
            iArr[C41143c.STRICT_AUTH.ordinal()] = 1;
            iArr[C41143c.OTP.ordinal()] = 2;
            f97190a = iArr;
        }
    }

    public C41199w(Set set, Set set2, C41143c cVar) {
        C41536l.m120489i(cVar, "authConfig");
        this.f97185a = set;
        this.f97186b = set2;
        int i = C41200a.f97190a[cVar.ordinal()];
        if (i == 1) {
            m119439f();
        } else if (i != 2) {
            m119437d();
        } else {
            m119438e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m119434a(java.util.LinkedList r6, hc1.C41171i0 r7) {
        /*
            r5 = this;
            java.util.Set r0 = r5.f97186b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            hc1.a r3 = r7.mo95621d()
            if (r3 == 0) goto L_0x0011
            sso.type.AuthElementType r3 = r3.mo95555a()
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            boolean r0 = ie1.C41358y.m119999O(r0, r3)
            if (r0 != r2) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            java.util.List r0 = r7.mo95622e()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002e
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x002e
        L_0x002c:
            r1 = r2
            goto L_0x004a
        L_0x002e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r0.next()
            hc1.a r3 = (hc1.C41127a) r3
            java.util.Set r4 = r5.f97186b
            sso.type.AuthElementType r3 = r3.mo95555a()
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0032
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r6.add(r7)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc1.C41199w.m119434a(java.util.LinkedList, hc1.i0):void");
    }

    /* renamed from: b */
    private final boolean m119435b(Set set, Object... objArr) {
        return set.containsAll(C41331l.m119759c(objArr));
    }

    /* renamed from: c */
    private final boolean m119436c(Set set, List list) {
        for (Object contains : list) {
            if (set.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m119437d() {
        boolean z;
        boolean z2;
        Set set = this.f97185a;
        if (set == null || set.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Set set2 = this.f97186b;
            if (set2 == null || set2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (this.f97185a.contains(AuthElementType.TRUSTED_DEVICE) && m119442l() && m119440g()) {
                    this.f97188d.add(m119441h(C41173j0.TRUSTED_AND_KNOWLEDGE));
                }
                if (m119442l() && this.f97186b.contains(AuthElementType.BIOMETRY)) {
                    this.f97188d.add(m119441h(C41173j0.TRUSTED_AND_BIOMETRY));
                }
                Set set3 = this.f97185a;
                AuthElementType authElementType = AuthElementType.OTP;
                if (set3.contains(authElementType) && m119440g()) {
                    this.f97188d.add(m119441h(C41173j0.OTP_AND_KNOWLEDGE));
                }
                if (!m119442l() && this.f97186b.contains(AuthElementType.BIOMETRY)) {
                    this.f97188d.add(m119441h(C41173j0.NOT_TRUSTED_AND_BIOMETRY));
                }
                if (m119435b(this.f97186b, AuthElementType.PASSCODE, authElementType)) {
                    this.f97188d.add(m119441h(C41173j0.PASSCODE));
                }
                if (m119435b(this.f97186b, AuthElementType.PASSWORD, authElementType)) {
                    this.f97188d.add(m119441h(C41173j0.PASSWORD));
                }
            }
        }
    }

    /* renamed from: e */
    private final void m119438e() {
        boolean z;
        Set set = this.f97185a;
        boolean z2 = false;
        if (set == null || set.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Set set2 = this.f97186b;
            if (set2 == null || set2.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                Set set3 = this.f97185a;
                AuthElementType authElementType = AuthElementType.BIOMETRY;
                boolean contains = set3.contains(authElementType);
                boolean contains2 = this.f97185a.contains(AuthElementType.TRUSTED_DEVICE);
                boolean contains3 = this.f97185a.contains(AuthElementType.OTP);
                if (!m119440g() || this.f97185a.contains(authElementType) || (!contains2 && !contains3)) {
                    if (contains && (m119440g() || contains2 || contains3)) {
                        m119434a(this.f97188d, m119441h(C41173j0.BIOMETRY_OTP));
                    }
                    if (this.f97186b.contains(AuthElementType.PASSCODE)) {
                        m119434a(this.f97188d, m119441h(C41173j0.PASSCODE));
                    }
                    m119434a(this.f97188d, m119441h(C41173j0.PASSWORD));
                    return;
                }
                m119434a(this.f97188d, m119441h(C41173j0.OTP));
            }
        }
    }

    /* renamed from: f */
    private final void m119439f() {
        boolean z;
        Set set = this.f97186b;
        if (set == null || set.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (m119442l()) {
                m119434a(this.f97188d, m119441h(C41173j0.STRICT_TRUSTED));
                return;
            }
            if (this.f97186b.contains(AuthElementType.BIOMETRY)) {
                m119434a(this.f97188d, m119441h(C41173j0.STRICT_BIOMETRY));
            }
            if (this.f97186b.contains(AuthElementType.PASSCODE)) {
                m119434a(this.f97188d, m119441h(C41173j0.PASSCODE));
            }
            m119434a(this.f97188d, m119441h(C41173j0.PASSWORD));
        }
    }

    /* renamed from: g */
    private final boolean m119440g() {
        Set set = this.f97185a;
        if (set != null) {
            return m119436c(set, this.f97189e);
        }
        return false;
    }

    /* renamed from: h */
    private final C41171i0 m119441h(C41173j0 j0Var) {
        boolean z;
        C41171i0 b = j0Var.mo95626b();
        List e = j0Var.mo95626b().mo95622e();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            C41127a aVar = (C41127a) next;
            Set set = this.f97186b;
            if (set != null) {
                z = set.contains(aVar.mo95555a());
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return C41171i0.m119342c(b, (C41127a) null, arrayList, 1, (Object) null);
    }

    /* renamed from: l */
    private final boolean m119442l() {
        Set set = this.f97186b;
        if (set != null) {
            return set.contains(AuthElementType.TRUSTED_DEVICE);
        }
        return false;
    }

    /* renamed from: i */
    public final C41171i0 mo95655i() {
        C41171i0 i0Var = (C41171i0) this.f97188d.poll();
        this.f97187c = i0Var;
        return i0Var;
    }

    /* renamed from: j */
    public final C41171i0 mo95656j() {
        return this.f97187c;
    }

    /* renamed from: k */
    public final boolean mo95657k(AuthElementType authElementType) {
        List a;
        Object obj;
        boolean z;
        C41536l.m120489i(authElementType, "authElementType");
        C41171i0 i0Var = this.f97187c;
        if (i0Var == null || (a = i0Var.mo95619a()) == null) {
            return false;
        }
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C41127a) obj).mo95555a() == authElementType) {
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
        C41127a aVar = (C41127a) obj;
        if (aVar != null) {
            return aVar.mo95556b();
        }
        return false;
    }

    /* renamed from: m */
    public final C41171i0 mo95658m(AuthElementType authElementType) {
        C41127a aVar;
        C41171i0 i0Var;
        List a;
        Object obj;
        boolean z;
        C41536l.m120489i(authElementType, "authElementType");
        if (!mo95657k(authElementType)) {
            return this.f97187c;
        }
        C41171i0 i0Var2 = this.f97187c;
        C41171i0 i0Var3 = null;
        if (i0Var2 == null || (a = i0Var2.mo95619a()) == null) {
            aVar = null;
        } else {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C41127a) obj).mo95555a() == authElementType) {
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
            aVar = (C41127a) obj;
        }
        C41171i0 i0Var4 = this.f97187c;
        if (i0Var4 != null) {
            if (C41536l.m120484d(i0Var4.mo95621d(), aVar) || i0Var4.mo95622e().size() == 1) {
                i0Var = mo95655i();
            } else {
                List e = i0Var4.mo95622e();
                ArrayList arrayList = new ArrayList();
                for (Object next : e) {
                    if (!C41536l.m120484d((C41127a) next, aVar)) {
                        arrayList.add(next);
                    }
                }
                i0Var = C41171i0.m119342c(i0Var4, (C41127a) null, arrayList, 1, (Object) null);
            }
            i0Var3 = i0Var;
        }
        this.f97187c = i0Var3;
        return i0Var3;
    }
}

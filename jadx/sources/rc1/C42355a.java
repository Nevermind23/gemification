package rc1;

import ba1.C10146d0;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qa1.C27700a1;
import sso.type.AuthElementType;
import ue1.C43075l;

/* renamed from: rc1.a */
public final class C42355a {

    /* renamed from: a */
    private final C27700a1 f99574a;

    /* renamed from: b */
    private LinkedList f99575b = new LinkedList();

    /* renamed from: c */
    private int f99576c = -1;

    /* renamed from: d */
    private HashSet f99577d = new HashSet();

    /* renamed from: rc1.a$a */
    static final class C42356a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Integer f99578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42356a(Integer num) {
            super(1);
            this.f99578d = num;
        }

        /* renamed from: a */
        public final Boolean invoke(C42357b bVar) {
            C41536l.m120489i(bVar, "it");
            return Boolean.valueOf(C41536l.m120484d(bVar.mo97803b(), this.f99578d));
        }
    }

    public C42355a(C27700a1 a1Var) {
        C41536l.m120489i(a1Var, "storage");
        this.f99574a = a1Var;
    }

    /* renamed from: a */
    private final C42357b m122848a() {
        int i;
        if (this.f99576c >= this.f99575b.size() || (i = this.f99576c) < 0) {
            return null;
        }
        return (C42357b) this.f99575b.get(i);
    }

    /* renamed from: c */
    private final Set m122849c() {
        return C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
    }

    /* renamed from: e */
    public static /* synthetic */ C42357b m122850e(C42355a aVar, AuthElementType authElementType, int i, Object obj) {
        if ((i & 1) != 0) {
            authElementType = null;
        }
        return aVar.mo97796d(authElementType);
    }

    /* renamed from: g */
    private final LinkedHashSet m122851g(int i) {
        LinkedHashSet<C42357b> linkedHashSet;
        switch (i) {
            case 1:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.PASSCODE, true, (Integer) null, false, false, 4, 28, (DefaultConstructorMarker) null));
                break;
            case 2:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.BIOMETRY, false, (Integer) null, false, false, 4, 30, (DefaultConstructorMarker) null));
                break;
            case 3:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.PASSCODE, false, (Integer) null, false, false, 4, 30, (DefaultConstructorMarker) null));
                break;
            case 4:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.PASSWORD, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null));
                break;
            case 5:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.BIOMETRY, false, (Integer) null, false, false, 8, 30, (DefaultConstructorMarker) null), new C42357b(AuthElementType.PASSCODE, false, (Integer) null, false, false, 9, 30, (DefaultConstructorMarker) null));
                break;
            case 6:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.BIOMETRY, false, (Integer) null, false, false, 9, 30, (DefaultConstructorMarker) null), new C42357b(AuthElementType.PASSWORD, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null));
                break;
            case 7:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.BIOMETRY, false, (Integer) null, false, false, 9, 30, (DefaultConstructorMarker) null), new C42357b(AuthElementType.OTP, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null));
                break;
            case 8:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.PASSCODE, false, (Integer) null, false, false, 9, 30, (DefaultConstructorMarker) null), new C42357b(AuthElementType.OTP, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null));
                break;
            case 9:
                linkedHashSet = C41357x0.m119986f(new C42357b(AuthElementType.PASSWORD, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null), new C42357b(AuthElementType.OTP, false, (Integer) null, false, false, (Integer) null, 62, (DefaultConstructorMarker) null));
                break;
            default:
                linkedHashSet = new LinkedHashSet<>();
                break;
        }
        for (C42357b g : linkedHashSet) {
            g.mo97809g(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    /* renamed from: h */
    private final boolean m122852h() {
        return m122849c().contains(AuthElementType.TRUSTED_DEVICE);
    }

    /* renamed from: b */
    public final void mo97795b() {
        if (m122852h()) {
            this.f99577d.add(AuthElementType.TRUSTED_DEVICE);
        }
        C10146d0.C10159c.m37143b().setLoginAuthTypes$sso_client_release(C41358y.m119993D0(this.f99577d));
    }

    /* renamed from: d */
    public final C42357b mo97796d(AuthElementType authElementType) {
        this.f99576c++;
        C42357b a = m122848a();
        if (a != null) {
            a.mo97810h(true);
        }
        if (authElementType != null) {
            this.f99577d.add(authElementType);
        }
        if (this.f99576c == this.f99575b.size()) {
            this.f99576c--;
        }
        return a;
    }

    /* renamed from: f */
    public final C42357b mo97797f() {
        boolean z;
        boolean z2;
        int i = this.f99576c;
        if (i == -1) {
            return null;
        }
        AuthElementType a = ((C42357b) this.f99575b.get(i)).mo97802a();
        Integer b = ((C42357b) this.f99575b.get(this.f99576c)).mo97803b();
        this.f99576c--;
        C42357b a2 = m122848a();
        this.f99577d.remove(a);
        if (a2 == null || !a2.mo97806e()) {
            z = false;
        } else {
            z = true;
        }
        if (z && !C41536l.m120484d(a2.mo97803b(), b)) {
            boolean unused = C41352v.m119961F(this.f99575b, new C42356a(b));
        }
        if (a2 == null || a2.mo97805d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            a2.mo97812i(false);
            a2.mo97810h(true);
            return mo97797f();
        } else if (a2 == null) {
            return a2;
        } else {
            a2.mo97812i(false);
            return a2;
        }
    }

    /* renamed from: i */
    public final boolean mo97798i() {
        String f = this.f99574a.mo67245f();
        return !(f == null || f.length() == 0);
    }

    /* renamed from: j */
    public final void mo97799j() {
        LinkedHashSet linkedHashSet;
        this.f99575b.clear();
        this.f99576c = -1;
        if (!m122852h() || !m122849c().contains(AuthElementType.BIOMETRY)) {
            if (m122852h() && m122849c().contains(AuthElementType.PASSCODE)) {
                linkedHashSet = m122851g(3);
            } else if (m122852h()) {
                linkedHashSet = m122851g(4);
            } else {
                Set c = m122849c();
                AuthElementType authElementType = AuthElementType.BIOMETRY;
                if (c.contains(authElementType) && m122849c().contains(AuthElementType.PASSCODE)) {
                    linkedHashSet = m122851g(5);
                } else if (m122849c().contains(authElementType)) {
                    linkedHashSet = m122851g(6);
                } else if (m122849c().contains(AuthElementType.PASSCODE)) {
                    linkedHashSet = m122851g(8);
                } else {
                    linkedHashSet = m122851g(9);
                }
            }
        } else if (m122849c().contains(AuthElementType.PASSCODE)) {
            linkedHashSet = m122851g(1);
        } else {
            linkedHashSet = m122851g(2);
        }
        this.f99575b.addAll(linkedHashSet);
    }

    /* renamed from: k */
    public final C42357b mo97800k() {
        Integer num;
        C42357b a = m122848a();
        if (a != null) {
            num = a.mo97804c();
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        LinkedHashSet g = m122851g(a.mo97804c().intValue());
        a.mo97812i(true);
        this.f99576c++;
        C42357b a2 = m122848a();
        while (a2 != null) {
            a2.mo97812i(true);
            a2.mo97810h(false);
            this.f99576c++;
            a2 = m122848a();
        }
        this.f99576c--;
        this.f99575b.addAll(g);
        return m122850e(this, (AuthElementType) null, 1, (Object) null);
    }
}

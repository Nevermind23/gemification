package q30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import n20.C26359a;
import p366bk.C10320i;
import p812kv.C25779b;
import p832mv.C26305b;
import p891su.C28261a;
import p891su.C28269e;
import r30.C27899f;
import w10.C29190a;

/* renamed from: q30.b */
public final class C27678b {

    /* renamed from: q30.b$a */
    public /* synthetic */ class C27679a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70770a;

        static {
            int[] iArr = new int[C28269e.values().length];
            try {
                iArr[C28269e.JURIDICAL_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f70770a = iArr;
        }
    }

    /* renamed from: a */
    private final int m85684a(C28261a aVar) {
        if (C27679a.f70770a[aVar.mo67850g().ordinal()] == 1) {
            return C10320i.ic_moneyrequest_group_contact_compay;
        }
        if (aVar.mo67861q()) {
            return C10320i.ic_moneyrequest_group_contact_bog;
        }
        return C10320i.ic_moneyrequest_group_contac;
    }

    /* renamed from: b */
    private final int m85685b(C28261a aVar) {
        if (C27679a.f70770a[aVar.mo67850g().ordinal()] == 1) {
            return C10320i.ic_moneyrequest_contact_company;
        }
        if (aVar.mo67861q()) {
            return C10320i.ic_moneyrequest_contact_bog;
        }
        return C10320i.ic_moneyrequest_contact;
    }

    /* renamed from: c */
    private final C27899f m85686c(C25779b bVar) {
        long e = bVar.mo64385e();
        boolean l = bVar.mo64394l();
        String c = bVar.mo64383c();
        boolean d = bVar.mo64384d();
        double b = bVar.mo64382b();
        double g = bVar.mo64388g();
        List<C26305b> h = bVar.mo64389h();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(h, 10));
        for (C26305b bVar2 : h) {
            boolean z = true;
            if (bVar.mo64389h().size() <= 1) {
                z = false;
            }
            arrayList.add(m85689f(bVar2, z));
        }
        return new C27899f(e, l, c, d, b, g, arrayList, bVar.mo64393k());
    }

    /* renamed from: d */
    private final C27899f.C27901b m85687d(double d, C26305b.C26307b bVar, boolean z) {
        int i;
        if (z) {
            i = C10320i.ic_moneyrequest_group_contact_phone;
        } else {
            i = C10320i.ic_moneyrequest_contact_phone;
        }
        return new C27899f.C27901b((String) null, i, bVar.mo65482h(), d);
    }

    /* renamed from: e */
    private final C27899f.C27901b m85688e(double d, C28261a aVar, boolean z) {
        int i;
        String b = C29190a.m89130b(aVar);
        if (z) {
            i = m85684a(aVar);
        } else {
            i = m85685b(aVar);
        }
        int i2 = i;
        String a = C26359a.m82388a(aVar);
        if (a == null) {
            a = "";
        }
        return new C27899f.C27901b(b, i2, a, d);
    }

    /* renamed from: f */
    private final C27899f.C27901b m85689f(C26305b bVar, boolean z) {
        if (bVar instanceof C26305b.C26306a) {
            return m85688e(bVar.mo65471b(), ((C26305b.C26306a) bVar).mo65477h(), z);
        }
        if (bVar instanceof C26305b.C26307b) {
            return m85687d(bVar.mo65471b(), (C26305b.C26307b) bVar, z);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: g */
    public final List mo67215g(List list) {
        C41536l.m120489i(list, "requests");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m85686c((C25779b) it.next()));
        }
        return arrayList;
    }
}

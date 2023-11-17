package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.C1962g;
import androidx.work.C2073m;
import androidx.work.C2079p;
import androidx.work.C2092v;
import androidx.work.C2096y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p203p1.C7635d;

/* renamed from: androidx.work.impl.x */
public class C2062x extends C2092v {

    /* renamed from: j */
    private static final String f6203j = C2073m.m8073i("WorkContinuationImpl");

    /* renamed from: a */
    private final C2007e0 f6204a;

    /* renamed from: b */
    private final String f6205b;

    /* renamed from: c */
    private final C1962g f6206c;

    /* renamed from: d */
    private final List f6207d;

    /* renamed from: e */
    private final List f6208e;

    /* renamed from: f */
    private final List f6209f;

    /* renamed from: g */
    private final List f6210g;

    /* renamed from: h */
    private boolean f6211h;

    /* renamed from: i */
    private C2079p f6212i;

    public C2062x(C2007e0 e0Var, List list) {
        this(e0Var, (String) null, C1962g.KEEP, list, (List) null);
    }

    /* renamed from: i */
    private static boolean m8045i(C2062x xVar, Set set) {
        set.addAll(xVar.mo6920c());
        Set l = m8046l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l.contains((String) it.next())) {
                return true;
            }
        }
        List<C2062x> e = xVar.mo6922e();
        if (e != null && !e.isEmpty()) {
            for (C2062x i : e) {
                if (m8045i(i, set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.mo6920c());
        return false;
    }

    /* renamed from: l */
    public static Set m8046l(C2062x xVar) {
        HashSet hashSet = new HashSet();
        List<C2062x> e = xVar.mo6922e();
        if (e != null && !e.isEmpty()) {
            for (C2062x c : e) {
                hashSet.addAll(c.mo6920c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public C2079p mo6918a() {
        if (!this.f6211h) {
            C7635d dVar = new C7635d(this);
            this.f6204a.mo6829t().mo22739c(dVar);
            this.f6212i = dVar.mo22343d();
        } else {
            C2073m e = C2073m.m8071e();
            String str = f6203j;
            e.mo6966k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f6208e) + ")");
        }
        return this.f6212i;
    }

    /* renamed from: b */
    public C1962g mo6919b() {
        return this.f6206c;
    }

    /* renamed from: c */
    public List mo6920c() {
        return this.f6208e;
    }

    /* renamed from: d */
    public String mo6921d() {
        return this.f6205b;
    }

    /* renamed from: e */
    public List mo6922e() {
        return this.f6210g;
    }

    /* renamed from: f */
    public List mo6923f() {
        return this.f6207d;
    }

    /* renamed from: g */
    public C2007e0 mo6924g() {
        return this.f6204a;
    }

    /* renamed from: h */
    public boolean mo6925h() {
        return m8045i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean mo6926j() {
        return this.f6211h;
    }

    /* renamed from: k */
    public void mo6927k() {
        this.f6211h = true;
    }

    public C2062x(C2007e0 e0Var, String str, C1962g gVar, List list) {
        this(e0Var, str, gVar, list, (List) null);
    }

    public C2062x(C2007e0 e0Var, String str, C1962g gVar, List list, List list2) {
        this.f6204a = e0Var;
        this.f6205b = str;
        this.f6206c = gVar;
        this.f6207d = list;
        this.f6210g = list2;
        this.f6208e = new ArrayList(list.size());
        this.f6209f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f6209f.addAll(((C2062x) it.next()).f6209f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String b = ((C2096y) list.get(i)).mo6983b();
            this.f6208e.add(b);
            this.f6209f.add(b);
        }
    }
}

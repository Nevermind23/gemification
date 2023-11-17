package p275u8;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p301w8.C8878a;
import p327y9.C9142b;

/* renamed from: u8.b */
public class C8648b {

    /* renamed from: a */
    private final C9142b f24438a;

    /* renamed from: b */
    private final String f24439b;

    /* renamed from: c */
    private Integer f24440c = null;

    public C8648b(Context context, C9142b bVar, String str) {
        this.f24438a = bVar;
        this.f24439b = str;
    }

    /* renamed from: a */
    private void m32257a(C8878a.C8881c cVar) {
        ((C8878a) this.f24438a.get()).mo24307f(cVar);
    }

    /* renamed from: b */
    private void m32258b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(m32261f());
        int i = m32264i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8647a aVar = (C8647a) it.next();
            while (arrayDeque.size() >= i) {
                m32265k(((C8878a.C8881c) arrayDeque.pollFirst()).f24873b);
            }
            C8878a.C8881c f = aVar.mo23981f(this.f24439b);
            m32257a(f);
            arrayDeque.offer(f);
        }
    }

    /* renamed from: c */
    private static List m32259c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C8647a.m32251b((Map) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m32260d(List list, C8647a aVar) {
        String c = aVar.mo23978c();
        String e = aVar.mo23980e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8647a aVar2 = (C8647a) it.next();
            if (aVar2.mo23978c().equals(c) && aVar2.mo23980e().equals(e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private List m32261f() {
        return ((C8878a) this.f24438a.get()).mo24306e(this.f24439b, "");
    }

    /* renamed from: g */
    private ArrayList m32262g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8647a aVar = (C8647a) it.next();
            if (!m32260d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private ArrayList m32263h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8647a aVar = (C8647a) it.next();
            if (!m32260d(list2, aVar)) {
                arrayList.add(aVar.mo23981f(this.f24439b));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private int m32264i() {
        if (this.f24440c == null) {
            this.f24440c = Integer.valueOf(((C8878a) this.f24438a.get()).mo24305d(this.f24439b));
        }
        return this.f24440c.intValue();
    }

    /* renamed from: k */
    private void m32265k(String str) {
        ((C8878a) this.f24438a.get()).clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: l */
    private void m32266l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m32265k(((C8878a.C8881c) it.next()).f24873b);
        }
    }

    /* renamed from: n */
    private void m32267n(List list) {
        if (list.isEmpty()) {
            mo23983j();
            return;
        }
        List e = mo23982e();
        m32266l(m32263h(e, list));
        m32258b(m32262g(list, e));
    }

    /* renamed from: o */
    private void m32268o() {
        if (this.f24438a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    /* renamed from: e */
    public List mo23982e() {
        m32268o();
        List<C8878a.C8881c> f = m32261f();
        ArrayList arrayList = new ArrayList();
        for (C8878a.C8881c a : f) {
            arrayList.add(C8647a.m32250a(a));
        }
        return arrayList;
    }

    /* renamed from: j */
    public void mo23983j() {
        m32268o();
        m32266l(m32261f());
    }

    /* renamed from: m */
    public void mo23984m(List list) {
        m32268o();
        if (list != null) {
            m32267n(m32259c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}

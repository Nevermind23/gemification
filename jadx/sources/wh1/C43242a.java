package wh1;

import java.util.Queue;
import org.slf4j.helpers.C42046e;
import vh1.C43168a;
import vh1.C43170c;

/* renamed from: wh1.a */
public class C43242a implements C43168a {

    /* renamed from: d */
    String f100975d;

    /* renamed from: e */
    C42046e f100976e;

    /* renamed from: f */
    Queue f100977f;

    public C43242a(C42046e eVar, Queue queue) {
        this.f100976e = eVar;
        this.f100975d = eVar.getName();
        this.f100977f = queue;
    }

    /* renamed from: h */
    private void m124173h(C43243b bVar, String str, Object[] objArr, Throwable th) {
        m124174i(bVar, (C43170c) null, str, objArr, th);
    }

    /* renamed from: i */
    private void m124174i(C43243b bVar, C43170c cVar, String str, Object[] objArr, Throwable th) {
        C43245d dVar = new C43245d();
        dVar.mo101936j(System.currentTimeMillis());
        dVar.mo101929c(bVar);
        dVar.mo101930d(this.f100976e);
        dVar.mo101931e(this.f100975d);
        dVar.mo101932f(cVar);
        dVar.mo101933g(str);
        dVar.mo101928b(objArr);
        dVar.mo101935i(th);
        dVar.mo101934h(Thread.currentThread().getName());
        this.f100977f.add(dVar);
    }

    /* renamed from: a */
    public void mo97512a(String str, Throwable th) {
        m124173h(C43243b.ERROR, str, (Object[]) null, th);
    }

    /* renamed from: b */
    public void mo97513b(String str) {
        m124173h(C43243b.ERROR, str, (Object[]) null, (Throwable) null);
    }

    /* renamed from: c */
    public void mo97514c(String str, Object obj, Object obj2) {
        m124173h(C43243b.TRACE, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    /* renamed from: d */
    public boolean mo97515d() {
        return true;
    }

    /* renamed from: e */
    public void mo97516e(String str, Throwable th) {
        m124173h(C43243b.TRACE, str, (Object[]) null, th);
    }

    /* renamed from: f */
    public void mo97517f(String str, Object obj) {
        m124173h(C43243b.TRACE, str, new Object[]{obj}, (Throwable) null);
    }

    /* renamed from: g */
    public void mo97518g(String str) {
        m124173h(C43243b.TRACE, str, (Object[]) null, (Throwable) null);
    }

    public String getName() {
        return this.f100975d;
    }
}

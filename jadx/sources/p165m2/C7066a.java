package p165m2;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p113i2.C6511a;
import p113i2.C6524e;
import p126j2.C6684b;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: m2.a */
public class C7066a {

    /* renamed from: c */
    private static C7066a f21002c;

    /* renamed from: a */
    private final Set f21003a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private AtomicInteger f21004b = new AtomicInteger();

    /* renamed from: c */
    public static C7066a m27323c() {
        if (f21002c == null) {
            synchronized (C7066a.class) {
                if (f21002c == null) {
                    f21002c = new C7066a();
                }
            }
        }
        return f21002c;
    }

    /* renamed from: a */
    public C6511a mo21290a(C6511a aVar) {
        try {
            this.f21003a.add(aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            aVar.mo20456N(mo21292d());
            if (aVar.mo20443A() == C6524e.IMMEDIATE) {
                aVar.mo20454L(C6684b.m26121b().mo20675a().mo20677b().submit(new C7071d(aVar)));
            } else {
                aVar.mo20454L(C6684b.m26121b().mo20675a().mo20678c().submit(new C7071d(aVar)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aVar;
    }

    /* renamed from: b */
    public void mo21291b(C6511a aVar) {
        try {
            this.f21003a.remove(aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public int mo21292d() {
        return this.f21004b.incrementAndGet();
    }
}

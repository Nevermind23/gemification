package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C2417e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p089g4.C6223k;

/* renamed from: com.bumptech.glide.load.data.f */
public class C2419f {

    /* renamed from: b */
    private static final C2417e.C2418a f7650b = new C2420a();

    /* renamed from: a */
    private final Map f7651a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    class C2420a implements C2417e.C2418a {
        C2420a() {
        }

        /* renamed from: a */
        public Class mo7778a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C2417e mo7779b(Object obj) {
            return new C2421b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    private static final class C2421b implements C2417e {

        /* renamed from: a */
        private final Object f7652a;

        C2421b(Object obj) {
            this.f7652a = obj;
        }

        /* renamed from: a */
        public Object mo7774a() {
            return this.f7652a;
        }

        /* renamed from: b */
        public void mo7775b() {
        }
    }

    /* renamed from: a */
    public synchronized C2417e mo7799a(Object obj) {
        C2417e.C2418a aVar;
        C6223k.m24730d(obj);
        aVar = (C2417e.C2418a) this.f7651a.get(obj.getClass());
        if (aVar == null) {
            Iterator it = this.f7651a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2417e.C2418a aVar2 = (C2417e.C2418a) it.next();
                if (aVar2.mo7778a().isAssignableFrom(obj.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f7650b;
        }
        return aVar.mo7779b(obj);
    }

    /* renamed from: b */
    public synchronized void mo7800b(C2417e.C2418a aVar) {
        this.f7651a.put(aVar.mo7778a(), aVar);
    }
}

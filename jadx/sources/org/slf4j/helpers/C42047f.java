package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import vh1.C43168a;
import vh1.ILoggerFactory;

/* renamed from: org.slf4j.helpers.f */
public class C42047f implements ILoggerFactory {

    /* renamed from: a */
    boolean f98800a = false;

    /* renamed from: b */
    final Map f98801b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue f98802c = new LinkedBlockingQueue();

    /* renamed from: a */
    public synchronized C43168a mo97519a(String str) {
        C42046e eVar;
        eVar = (C42046e) this.f98801b.get(str);
        if (eVar == null) {
            eVar = new C42046e(str, this.f98802c, this.f98800a);
            this.f98801b.put(str, eVar);
        }
        return eVar;
    }

    /* renamed from: b */
    public void mo97529b() {
        this.f98801b.clear();
        this.f98802c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue mo97530c() {
        return this.f98802c;
    }

    /* renamed from: d */
    public List mo97531d() {
        return new ArrayList(this.f98801b.values());
    }

    /* renamed from: e */
    public void mo97532e() {
        this.f98800a = true;
    }
}

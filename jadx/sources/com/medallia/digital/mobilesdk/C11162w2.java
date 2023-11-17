package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.medallia.digital.mobilesdk.w2 */
class C11162w2 {

    /* renamed from: a */
    protected Queue<C11013n2> f32074a = new LinkedList();

    /* renamed from: b */
    protected Queue<C11013n2> f32075b = new LinkedList();

    /* renamed from: c */
    protected C11074r2 f32076c;

    /* renamed from: com.medallia.digital.mobilesdk.w2$a */
    class C11163a implements C11074r2 {
        C11163a() {
        }

        /* renamed from: a */
        public void mo28955a(C11013n2 n2Var) {
            C11162w2.this.m40927b(n2Var != null ? n2Var.getFormId() : null);
            C11074r2 r2Var = C11162w2.this.f32076c;
            if (r2Var != null) {
                r2Var.mo28955a(n2Var);
            }
            C11162w2 w2Var = C11162w2.this;
            w2Var.mo29105a(w2Var.mo29104a());
        }
    }

    C11162w2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m40927b(String str) {
        if (this.f32075b.size() > 0 && ((this.f32075b.element().getFormId() != null && this.f32075b.element().getFormId().equals(str)) || this.f32074a.isEmpty())) {
            this.f32075b.remove();
        } else if (this.f32074a.size() > 0) {
            this.f32074a.remove();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11013n2 mo29104a() {
        Queue<C11013n2> queue;
        if (this.f32075b.size() > 0) {
            queue = this.f32075b;
        } else if (this.f32074a.size() <= 0) {
            return null;
        } else {
            queue = this.f32074a;
        }
        return queue.element();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29105a(C11013n2 n2Var) {
        if (n2Var == null) {
            C10735b4.m39109b("LoadForms - finished updating forms");
            AnalyticsBridge.getInstance().setFormResourcesReady(true);
            AnalyticsBridge.getInstance().reportResourcesSizeEvent();
            return;
        }
        new C11047p2(n2Var, new C11163a()).mo28882a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo29109b(C11013n2 n2Var) {
        if (n2Var == null || !this.f32074a.contains(n2Var)) {
            return false;
        }
        C11013n2 element = this.f32074a.element();
        if (element == null || element.getFormId().equals(n2Var.getFormId())) {
            return true;
        }
        this.f32074a.remove(n2Var);
        this.f32075b.add(n2Var);
        C10735b4.m39109b("Promoting form " + n2Var.getFormId());
        if (!this.f32074a.isEmpty()) {
            return true;
        }
        mo29105a(mo29104a());
        return true;
    }

    /* renamed from: a */
    private void m40925a(String str) {
        Boolean b = C10930k2.m39979b(str);
        if (b != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(str, b.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29106a(HashMap<String, C10797e7> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            for (C10797e7 next : hashMap.values()) {
                C10735b4.m39109b("Deleted unused Template: " + next.mo28263a());
                C10876i1.m39698a().mo28465a((C10785e0) next);
                m40925a(next.mo28263a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29107a(HashMap<String, C10797e7> hashMap, C11013n2 n2Var) {
        C10797e7 e7Var;
        if (hashMap != null && n2Var != null && n2Var.mo28817h() != null && (e7Var = hashMap.get(n2Var.mo28817h())) != null && e7Var.mo28265b() != null && e7Var.mo28265b().equals(n2Var.mo28817h())) {
            hashMap.remove(e7Var.mo28265b());
        }
    }

    /* renamed from: a */
    private void m40926a(LinkedHashMap<String, C11013n2> linkedHashMap) {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.FormData, new Object[0]);
        if (c != null) {
            Iterator<? extends C10785e0> it = c.iterator();
            while (it.hasNext()) {
                C11013n2 n2Var = (C11013n2) it.next();
                if (linkedHashMap.get(n2Var.getFormId()) == null) {
                    C10876i1.m39698a().mo28465a((C10785e0) n2Var);
                    C10735b4.m39109b("Cleaned unused forms");
                    List<ResourceContract> f = n2Var.mo28804f();
                    if (f != null) {
                        for (ResourceContract next : f) {
                            C10876i1.m39698a().mo28465a((C10785e0) next);
                            m40925a(next.getLocalUrl());
                            C10735b4.m39109b("Cleaned non global resources");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29108a(LinkedHashMap<String, C11013n2> linkedHashMap, C11074r2 r2Var) {
        if (linkedHashMap != null) {
            this.f32076c = r2Var;
            ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Template, new Object[0]);
            HashMap hashMap = new HashMap();
            Iterator<? extends C10785e0> it = c.iterator();
            while (it.hasNext()) {
                C10797e7 e7Var = (C10797e7) it.next();
                hashMap.put(e7Var.mo28265b(), e7Var);
            }
            m40926a(linkedHashMap);
            this.f32074a = new LinkedList();
            for (Map.Entry next : linkedHashMap.entrySet()) {
                mo29107a((HashMap<String, C10797e7>) hashMap, (C11013n2) next.getValue());
                this.f32074a.add(next.getValue());
            }
            mo29106a((HashMap<String, C10797e7>) hashMap);
            if (this.f32074a != null) {
                mo29105a(mo29104a());
            }
        }
    }
}

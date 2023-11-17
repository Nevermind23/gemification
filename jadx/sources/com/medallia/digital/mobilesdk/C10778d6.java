package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.medallia.digital.mobilesdk.d6 */
class C10778d6 {

    /* renamed from: d */
    private static final int f30867d = 5;

    /* renamed from: a */
    protected C10780b f30868a;

    /* renamed from: b */
    private int f30869b;

    /* renamed from: c */
    private Queue<List<ResourceContract>> f30870c;

    /* renamed from: com.medallia.digital.mobilesdk.d6$a */
    class C10779a implements C10796e6<File> {

        /* renamed from: a */
        final /* synthetic */ ResourceContract f30871a;

        /* renamed from: b */
        final /* synthetic */ List f30872b;

        C10779a(ResourceContract resourceContract, List list) {
            this.f30871a = resourceContract;
            this.f30872b = list;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10778d6.m39318a(C10778d6.this);
            C10735b4.m39109b(this.f30871a.getRemoteUrl() + " download failed");
            C10778d6.this.f30868a.mo28248b(this.f30871a);
            C10778d6.this.m39323a((List<ResourceContract>) this.f30872b);
        }

        /* renamed from: a */
        public void mo27797a(File file) {
            C10778d6.m39318a(C10778d6.this);
            if (file != null) {
                C10735b4.m39109b(this.f30871a.getRemoteUrl() + " download complete");
                C10778d6.this.f30868a.mo28247a(this.f30871a);
                C10876i1.m39698a().mo28472c((C10785e0) this.f30871a);
            } else {
                C10735b4.m39109b(this.f30871a.getRemoteUrl() + " download failed");
                C10778d6.this.f30868a.mo28248b(this.f30871a);
            }
            C10778d6.this.m39323a((List<ResourceContract>) this.f30872b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.d6$b */
    protected interface C10780b {
        /* renamed from: a */
        void mo28247a(ResourceContract resourceContract);

        /* renamed from: b */
        void mo28248b(ResourceContract resourceContract);
    }

    protected C10778d6(List<ResourceContract> list, C10780b bVar) {
        this(list, false, bVar);
    }

    /* renamed from: a */
    static /* synthetic */ int m39318a(C10778d6 d6Var) {
        int i = d6Var.f30869b;
        d6Var.f30869b = i - 1;
        return i;
    }

    /* renamed from: b */
    private Queue<List<ResourceContract>> m39324b(List<ResourceContract> list) {
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 5;
            linkedList.add(new ArrayList(list.subList(i, Math.min(size, i2))));
            i = i2;
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28245c(List<ResourceContract> list) {
        C10785e0 e0Var;
        if (list != null) {
            this.f30869b = list.size();
            for (ResourceContract next : list) {
                if (next.getFormId() != null) {
                    e0Var = C10876i1.m39698a().mo28467b(C10785e0.C10786a.Resource, next.getRemoteUrl(), next.getFormId());
                } else {
                    e0Var = C10876i1.m39698a().mo28467b(C10785e0.C10786a.Resource, next.getRemoteUrl());
                }
                ResourceContract resourceContract = (ResourceContract) e0Var;
                if (next.equals(resourceContract)) {
                    C10735b4.m39109b(resourceContract.getRemoteUrl() + " loaded from db");
                    this.f30868a.mo28247a(next);
                    this.f30869b = this.f30869b - 1;
                    m39323a(list);
                } else {
                    mo28244a(resourceContract, next);
                    m39321a(next, list);
                }
            }
        }
    }

    protected C10778d6(List<ResourceContract> list, boolean z, C10780b bVar) {
        this.f30868a = bVar;
        if (list != null) {
            this.f30870c = m39324b(m39319a(list, z));
            m39320a();
        }
    }

    /* renamed from: a */
    private List<ResourceContract> m39319a(List<ResourceContract> list, boolean z) {
        if (list == null) {
            return null;
        }
        if (!z) {
            return list;
        }
        for (ResourceContract global : list) {
            global.setGlobal(Boolean.TRUE);
        }
        return list;
    }

    /* renamed from: a */
    private void m39320a() {
        Queue<List<ResourceContract>> queue = this.f30870c;
        if (queue != null) {
            mo28245c(queue.poll());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28244a(ResourceContract resourceContract, ResourceContract resourceContract2) {
        Boolean b;
        if (resourceContract != null && resourceContract2 != null) {
            if ((!resourceContract.getRemoteUrl().equals(resourceContract2.getRemoteUrl()) || !resourceContract.getChecksum().equals(resourceContract2.getChecksum())) && (b = C10930k2.m39979b(resourceContract.getLocalUrl())) != null) {
                AnalyticsBridge.getInstance().reportDeleteStorageEvent(resourceContract.getLocalUrl(), b.booleanValue());
            }
        }
    }

    /* renamed from: a */
    private void m39321a(ResourceContract resourceContract, List<ResourceContract> list) {
        C10998m4.m40266h().mo28742a(resourceContract.getRemoteUrl(), resourceContract.getLocalUrl(), new C10779a(resourceContract, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39323a(List<ResourceContract> list) {
        if (list != null && !list.isEmpty() && this.f30869b == 0) {
            m39320a();
        }
    }
}

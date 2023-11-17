package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.Intent;
import androidx.work.C2068l;
import androidx.work.C2094x;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;

public class RetryMechanismWorker extends Worker {

    /* renamed from: d */
    private static final int f30593d = 90;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Queue<C11173w4> f30594a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CountDownLatch f30595b = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2068l.C2069a[] f30596c = {C2068l.C2069a.m8066b()};

    /* renamed from: com.medallia.digital.mobilesdk.RetryMechanismWorker$a */
    class C10709a implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ C11173w4 f30597a;

        C10709a(C11173w4 w4Var) {
            this.f30597a = w4Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("Stored Media feedback failed to submit. MediaFeedback UUID: " + this.f30597a.mo29135b());
            m38988a(this.f30597a);
        }

        /* renamed from: a */
        private void m38988a(C11173w4 w4Var) {
            RetryMechanismWorker.this.f30594a.remove(w4Var);
            if (RetryMechanismWorker.this.f30594a.isEmpty()) {
                C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(new Intent("com.medallia.digital.mobilesdk.sync_userjourney_action"));
                C2068l.C2069a unused = RetryMechanismWorker.this.m38983a((C11173w4) null);
                RetryMechanismWorker.this.f30596c[0] = C2068l.C2069a.m8067c();
                RetryMechanismWorker.this.f30595b.countDown();
                return;
            }
            RetryMechanismWorker retryMechanismWorker = RetryMechanismWorker.this;
            C2068l.C2069a unused2 = retryMechanismWorker.m38983a((C11173w4) retryMechanismWorker.f30594a.poll());
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            C10735b4.m39109b("Stored Media feedback was submitted successfully. MediaFeedback UUID: " + this.f30597a.mo29135b());
            m38988a(this.f30597a);
        }
    }

    public RetryMechanismWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2068l.C2069a mo28005a() {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.MediaFeedback, new Object[0]);
        ArrayList<? extends C10785e0> c2 = C10876i1.m39698a().mo28471c(C10785e0.C10786a.WorkerManager, new Object[0]);
        if (c != null && !c.isEmpty()) {
            if (c2 != null && !c2.isEmpty()) {
                Iterator<? extends C10785e0> it = c.iterator();
                while (it.hasNext()) {
                    C11173w4 w4Var = (C11173w4) it.next();
                    Iterator<? extends C10785e0> it2 = c2.iterator();
                    while (it2.hasNext()) {
                        if (w4Var.mo29138d().equals(((C11024n8) it2.next()).mo28842a())) {
                            C10735b4.m39109b("Removed Feedback: " + ((C11173w4) c.get(0)).mo29138d());
                            c.remove(w4Var);
                            C2094x.m8110g(C10884i4.m39721c().mo28483b()).mo6817c(getId());
                        }
                    }
                }
            }
            if (!c.isEmpty()) {
                C10735b4.m39109b("Loaded Feedback: " + ((C11173w4) c.get(0)).mo29138d());
                AnalyticsBridge.getInstance().reportMediaFeedbackRetryMechanismEvent(c.size());
                this.f30594a.addAll(c);
                C10876i1.m39698a().mo28464a(C10785e0.C10786a.MediaFeedback, Long.valueOf(System.currentTimeMillis() - 7776000000L));
                return m38983a(this.f30594a.poll());
            }
        }
        this.f30595b.countDown();
        try {
            this.f30595b.await();
        } catch (InterruptedException e) {
            C10735b4.m39111c(e.getMessage());
        }
        return C2068l.C2069a.m8067c();
    }

    public C2068l.C2069a doWork() {
        return mo28005a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2068l.C2069a m38983a(C11173w4 w4Var) {
        if (w4Var == null) {
            this.f30596c[0] = C2068l.C2069a.m8067c();
            return this.f30596c[0];
        }
        C10876i1.m39698a().mo28465a((C10785e0) w4Var);
        w4Var.mo29146i();
        C10998m4.m40266h().mo28740a(w4Var, (C11099t4) null, Boolean.FALSE, (C10796e6<String>) new C10709a(w4Var));
        try {
            this.f30595b.await();
        } catch (InterruptedException e) {
            C10735b4.m39111c(e.getMessage());
        }
        return this.f30596c[0];
    }
}

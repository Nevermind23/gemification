package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.medallia.digital.mobilesdk.d7 */
class C10781d7 {

    /* renamed from: a */
    private ArrayList<C10802f0> f30874a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C10802f0> f30875b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<C11204x5> f30876c = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public EvaluationResult mo28249a(C10727a7 a7Var) {
        C10870h8.m39667g().mo28436a(CollectorsInfrastructure.getInstance().timeInForegroundCollector.mo28917o());
        this.f30874a = C10870h8.m39667g().mo28448e();
        this.f30875b = C10870h8.m39667g().mo28449f();
        AnalyticsBridge instance = AnalyticsBridge.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("TRE logic uj size: ");
        ArrayList<C10802f0> arrayList = this.f30875b;
        Object obj = "null";
        sb.append(arrayList == null ? obj : Integer.valueOf(arrayList.size()));
        instance.reportExtraDataEvent((String) null, (String) null, (String) null, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TRE logic uj size: ");
        ArrayList<C10802f0> arrayList2 = this.f30875b;
        sb2.append(arrayList2 == null ? obj : Integer.valueOf(arrayList2.size()));
        C10735b4.m39109b(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("TRE logic uj: ");
        Object obj2 = this.f30875b;
        if (obj2 != null) {
            obj = obj2;
        }
        sb3.append(obj);
        C10735b4.m39109b(sb3.toString());
        this.f30876c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.QuarantineRule, new Object[0]);
        C10735b4.m39109b("Pre evaluation checks started");
        boolean d = mo28252d(a7Var);
        C10735b4.m39109b("Pre evaluation checks ended");
        if (!d) {
            C10735b4.m39109b("Pre evaluation returned false");
            return new EvaluationResult((String) null, (Long) null, (MDEngagementType) null);
        }
        C10735b4.m39109b("Trigger rules evaluation started");
        EvaluationResult b = mo28250b(a7Var);
        C10735b4.m39109b("Trigger rules evaluation ended");
        if (b != null) {
            return b;
        }
        C10735b4.m39109b("Next evaluation time started");
        EvaluationResult c = mo28251c(a7Var);
        C10735b4.m39109b("Next evaluation time ended");
        return c != null ? c : new EvaluationResult((String) null, (Long) null, (MDEngagementType) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public EvaluationResult mo28250b(C10727a7 a7Var) {
        ArrayList<C11236z1<Boolean>> c = a7Var.mo28090c();
        if (c == null || c.isEmpty()) {
            return new EvaluationResult((String) null, (Long) null, (MDEngagementType) null);
        }
        Iterator<C11236z1<Boolean>> it = c.iterator();
        while (it.hasNext()) {
            C11236z1 next = it.next();
            if (((Boolean) next.mo29243b().mo29048a(this.f30875b, this.f30874a, this.f30876c)).booleanValue()) {
                return new EvaluationResult(next.mo29242a(), (Long) null, next.mo29244c());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public EvaluationResult mo28251c(C10727a7 a7Var) {
        ArrayList<C11236z1<Long>> a = a7Var.mo28088a();
        if (a == null || a.isEmpty()) {
            return new EvaluationResult((String) null, (Long) null, (MDEngagementType) null);
        }
        Iterator<C11236z1<Long>> it = a.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next().mo29243b().mo29048a(this.f30875b, this.f30874a, this.f30876c);
            if (l != null) {
                return new EvaluationResult((String) null, l, (MDEngagementType) null);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28252d(C10727a7 a7Var) {
        C11155v7<Boolean> b = a7Var.mo28089b();
        if (b == null) {
            return true;
        }
        Boolean a = b.mo29048a(this.f30875b, this.f30874a, this.f30876c);
        if (a == null) {
            return false;
        }
        return a.booleanValue();
    }
}

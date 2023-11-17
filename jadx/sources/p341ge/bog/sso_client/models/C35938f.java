package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;
import sso.type.ProcessFlow;

/* renamed from: ge.bog.sso_client.models.f */
public final class C35938f {

    /* renamed from: a */
    private final ProcessFlow f86947a;

    /* renamed from: b */
    private final String f86948b;

    public C35938f(ProcessFlow processFlow, String str) {
        this.f86947a = processFlow;
        this.f86948b = str;
    }

    /* renamed from: a */
    public final ProcessFlow mo88492a() {
        return this.f86947a;
    }

    /* renamed from: b */
    public final String mo88493b() {
        return this.f86948b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35938f)) {
            return false;
        }
        C35938f fVar = (C35938f) obj;
        return this.f86947a == fVar.f86947a && C41536l.m120484d(this.f86948b, fVar.f86948b);
    }

    public int hashCode() {
        ProcessFlow processFlow = this.f86947a;
        int i = 0;
        int hashCode = (processFlow == null ? 0 : processFlow.hashCode()) * 31;
        String str = this.f86948b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "IdentifyProcessFlow(processFlow=" + this.f86947a + ", processReference=" + this.f86948b + ')';
    }
}

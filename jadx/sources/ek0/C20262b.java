package ek0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ek0.b */
public final class C20262b {

    /* renamed from: a */
    private final String f55157a;

    /* renamed from: b */
    private final int f55158b;

    /* renamed from: c */
    private final int f55159c;

    /* renamed from: d */
    private final String f55160d;

    public C20262b(String str, int i, int i2, String str2) {
        C41536l.m120489i(str, "tokenId");
        C41536l.m120489i(str2, "name");
        this.f55157a = str;
        this.f55158b = i;
        this.f55159c = i2;
        this.f55160d = str2;
    }

    /* renamed from: a */
    public final int mo48732a() {
        return this.f55159c;
    }

    /* renamed from: b */
    public final String mo48733b() {
        return this.f55160d;
    }

    /* renamed from: c */
    public final String mo48734c() {
        return this.f55157a;
    }

    /* renamed from: d */
    public final int mo48735d() {
        return this.f55158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20262b)) {
            return false;
        }
        C20262b bVar = (C20262b) obj;
        return C41536l.m120484d(this.f55157a, bVar.f55157a) && this.f55158b == bVar.f55158b && this.f55159c == bVar.f55159c && C41536l.m120484d(this.f55160d, bVar.f55160d);
    }

    public int hashCode() {
        return (((((this.f55157a.hashCode() * 31) + this.f55158b) * 31) + this.f55159c) * 31) + this.f55160d.hashCode();
    }

    public String toString() {
        String str = this.f55157a;
        int i = this.f55158b;
        int i2 = this.f55159c;
        String str2 = this.f55160d;
        return "ResumeTokenizeData(tokenId=" + str + ", tokenProvider=" + i + ", cardNetwork=" + i2 + ", name=" + str2 + ")";
    }
}

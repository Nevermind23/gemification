package p259t5;

import java.util.Map;
import p298w5.C8850a;

/* renamed from: t5.b */
final class C8370b extends C8376f {

    /* renamed from: a */
    private final C8850a f23778a;

    /* renamed from: b */
    private final Map f23779b;

    C8370b(C8850a aVar, Map map) {
        if (aVar != null) {
            this.f23778a = aVar;
            if (map != null) {
                this.f23779b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C8850a mo23561e() {
        return this.f23778a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8376f)) {
            return false;
        }
        C8376f fVar = (C8376f) obj;
        if (!this.f23778a.equals(fVar.mo23561e()) || !this.f23779b.equals(fVar.mo23563h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map mo23563h() {
        return this.f23779b;
    }

    public int hashCode() {
        return ((this.f23778a.hashCode() ^ 1000003) * 1000003) ^ this.f23779b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f23778a + ", values=" + this.f23779b + "}";
    }
}

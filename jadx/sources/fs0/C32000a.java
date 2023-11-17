package fs0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;

/* renamed from: fs0.a */
public final class C32000a {

    /* renamed from: a */
    private final InlineFeedback2.C13350a f78785a;

    /* renamed from: b */
    private final String f78786b;

    public C32000a(InlineFeedback2.C13350a aVar, String str) {
        C41536l.m120489i(aVar, "status");
        C41536l.m120489i(str, "amount");
        this.f78785a = aVar;
        this.f78786b = str;
    }

    /* renamed from: a */
    public final String mo72492a() {
        return this.f78786b;
    }

    /* renamed from: b */
    public final InlineFeedback2.C13350a mo72493b() {
        return this.f78785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32000a)) {
            return false;
        }
        C32000a aVar = (C32000a) obj;
        return this.f78785a == aVar.f78785a && C41536l.m120484d(this.f78786b, aVar.f78786b);
    }

    public int hashCode() {
        return (this.f78785a.hashCode() * 31) + this.f78786b.hashCode();
    }

    public String toString() {
        InlineFeedback2.C13350a aVar = this.f78785a;
        String str = this.f78786b;
        return "FeedbackModel(status=" + aVar + ", amount=" + str + ")";
    }
}

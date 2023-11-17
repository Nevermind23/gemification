package p345ad;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: ad.j */
public final class C9800j {

    /* renamed from: a */
    private final C9801k f26614a;

    /* renamed from: b */
    private final String f26615b;

    /* renamed from: c */
    private final JSONObject f26616c;

    public C9800j(C9801k kVar, String str, JSONObject jSONObject) {
        C41536l.m120489i(kVar, "state");
        C41536l.m120489i(str, "message");
        this.f26614a = kVar;
        this.f26615b = str;
        this.f26616c = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo26293a() {
        return this.f26616c;
    }

    /* renamed from: b */
    public final String mo26294b() {
        return this.f26615b;
    }

    /* renamed from: c */
    public final C9801k mo26295c() {
        return this.f26614a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9800j(C9801k kVar, String str, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : jSONObject);
    }
}

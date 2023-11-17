package ej0;

import he1.C41233s;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o41.C37637h;

/* renamed from: ej0.h */
public final class C20253h {

    /* renamed from: b */
    public static final C20254a f55143b = new C20254a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C37637h f55144a;

    /* renamed from: ej0.h$a */
    public static final class C20254a {
        private C20254a() {
        }

        public /* synthetic */ C20254a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20253h(C37637h hVar) {
        C41536l.m120489i(hVar, "networkConnectionInfo");
        this.f55144a = hVar;
    }

    /* renamed from: a */
    public final Map mo48723a(String str, String str2, String str3, String str4) {
        Map o = C41344r0.m119933o(C41233s.m119492a("Content-Type", "application/json"));
        o.put("x-forwarded", this.f55144a.mo90815a());
        if (str != null) {
            String str5 = (String) o.put("x-operation-id", str);
        }
        if (str2 != null) {
            String str6 = (String) o.put("x-sca-auth-code", str2);
        }
        if (str3 != null) {
            String str7 = (String) o.put("x-operation-reference", str3);
        }
        if (str4 != null) {
            String str8 = (String) o.put("x-service-id", str4);
        }
        return o;
    }

    /* renamed from: b */
    public final Map mo48724b() {
        return C41342q0.m119922g(C41233s.m119492a("x-forwarded", this.f55144a.mo90815a()));
    }
}

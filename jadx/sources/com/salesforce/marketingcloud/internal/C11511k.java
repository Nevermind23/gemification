package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.registration.Registration;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.internal.k */
public final class C11511k {

    /* renamed from: a */
    public static final C11512a f33427a = new C11512a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.k$a */
    public static final class C11512a {
        private C11512a() {
        }

        public /* synthetic */ C11512a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo30084a(Registration registration) {
            C41536l.m120489i(registration, C11772k.f34166e);
            return registration.m125018id();
        }

        /* renamed from: b */
        public final JSONObject mo30087b(Registration registration) {
            C41536l.m120489i(registration, C11772k.f34166e);
            return registration.toJson$sdk_release();
        }

        /* renamed from: a */
        public final Registration mo30085a(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "json");
            return new Registration(jSONObject);
        }

        /* renamed from: a */
        public final void mo30086a(Registration registration, int i) {
            C41536l.m120489i(registration, C11772k.f34166e);
            registration.setId$sdk_release(i);
        }
    }

    /* renamed from: a */
    public static final int m42069a(Registration registration) {
        return f33427a.mo30084a(registration);
    }

    /* renamed from: b */
    public static final JSONObject m42072b(Registration registration) {
        return f33427a.mo30087b(registration);
    }

    /* renamed from: a */
    public static final Registration m42070a(JSONObject jSONObject) {
        return f33427a.mo30085a(jSONObject);
    }

    /* renamed from: a */
    public static final void m42071a(Registration registration, int i) {
        f33427a.mo30086a(registration, i);
    }
}

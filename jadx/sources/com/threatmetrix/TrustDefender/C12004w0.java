package com.threatmetrix.TrustDefender;

/* renamed from: com.threatmetrix.TrustDefender.w0 */
public abstract class C12004w0 {

    /* renamed from: a */
    public static final String f35343a = ("{\"description\":\"" + C12005a.COULD_NOT_CHECK.f35352d + "\"}");

    /* renamed from: b */
    public static final String f35344b = ("{\"description\":\"" + C12005a.JSON_EXCEPTION.f35352d + "\"}");

    /* renamed from: com.threatmetrix.TrustDefender.w0$a */
    public enum C12005a {
        INCONSISTENT_PATH("Invalid Data Path", true),
        MULTIPLE_PID("Multiple PID same UID", true),
        INVALID_COMM_CONTENT("Invalid comm Name", true),
        COULD_NOT_CHECK("Could Not Check", false),
        JSON_EXCEPTION("Json exception", false),
        NOT_CLONED("Not Cloned", false);
        

        /* renamed from: d */
        public String f35352d;

        /* renamed from: e */
        public boolean f35353e;

        private C12005a(String str, boolean z) {
            this.f35352d = str;
            this.f35353e = z;
        }
    }
}

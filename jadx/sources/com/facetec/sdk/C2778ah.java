package com.facetec.sdk;

import java.util.Locale;

/* renamed from: com.facetec.sdk.ah */
final class C2778ah extends Exception {

    /* renamed from: com.facetec.sdk.ah$a */
    enum C2779a {
        UNKNOWN(0),
        PERMISSION_DENIED(1),
        OPEN_TIMEOUT(2),
        LOCK_OPEN_TIMEOUT(3),
        CLOSE_ERROR(4),
        FRONT_FACING_NOT_FOUND(5),
        NO_OUTPUT_SIZES(6),
        ACCESS_ERROR(7);
        

        /* renamed from: f */
        final int f8824f;

        private C2779a(int i) {
            this.f8824f = i;
        }
    }

    C2778ah(C2779a aVar) {
        this(aVar, "");
    }

    /* renamed from: a */
    private static String m10758a(C2779a aVar, String str) {
        String format = String.format(Locale.US, "Camera error (%d)", new Object[]{Integer.valueOf(aVar.f8824f)});
        if (str.isEmpty()) {
            return format;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    C2778ah(C2779a aVar, String str) {
        super(m10758a(aVar, str));
    }

    C2778ah(Throwable th) {
        super(m10758a(C2779a.UNKNOWN, ""), th);
    }

    C2778ah(C2779a aVar, Throwable th) {
        super(m10758a(aVar, ""), th);
    }
}

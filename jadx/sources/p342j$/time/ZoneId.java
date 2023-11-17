package p342j$.time;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.zone.C9351c;

/* renamed from: j$.time.ZoneId */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f25755a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f25755a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C9331l.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: k */
    public static ZoneId m34284k(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.mo24922i(C9343k.m34504f());
        if (zoneId != null) {
            return zoneId;
        }
        throw new C9288c("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* renamed from: n */
    public static ZoneId m34285n(String str, ZoneOffset zoneOffset) {
        if (str == null) {
            throw new NullPointerException("prefix");
        } else if (zoneOffset == null) {
            throw new NullPointerException("offset");
        } else if (str.length() == 0) {
            return zoneOffset;
        } else {
            if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
                if (zoneOffset.mo25008p() != 0) {
                    str = str.concat(zoneOffset.mo25004l());
                }
                return new C9331l(str, C9351c.m34550j(zoneOffset));
            }
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
    }

    /* renamed from: of */
    public static ZoneId m34286of(String str) {
        int i;
        if (str == null) {
            throw new NullPointerException("zoneId");
        } else if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m34290q(str);
        } else {
            if (str.startsWith("UTC") || str.startsWith("GMT")) {
                i = 3;
            } else if (!str.startsWith("UT")) {
                return C9331l.m34429o(str);
            } else {
                i = 2;
            }
            String substring = str.substring(0, i);
            if (str.length() == i) {
                return m34285n(substring, ZoneOffset.UTC);
            }
            if (str.charAt(i) != '+' && str.charAt(i) != '-') {
                return C9331l.m34429o(str);
            }
            try {
                ZoneOffset q = ZoneOffset.m34290q(str.substring(i));
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                return m34285n(substring, q);
            } catch (C9288c e) {
                throw new C9288c("Invalid ID for offset-based ZoneId: ".concat(str), e);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo25004l().equals(((ZoneId) obj).mo25004l());
        }
        return false;
    }

    public int hashCode() {
        return mo25004l().hashCode();
    }

    /* renamed from: l */
    public abstract String mo25004l();

    /* renamed from: m */
    public abstract C9351c mo25005m();

    public String toString() {
        return mo25004l();
    }
}

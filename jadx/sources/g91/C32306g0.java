package g91;

import com.medallia.digital.mobilesdk.MedalliaDigital;

/* renamed from: g91.g0 */
public abstract class C32306g0 {
    /* renamed from: a */
    public static void m95220a(String str) {
        m95221b(str, "");
    }

    /* renamed from: b */
    public static void m95221b(String str, String str2) {
        MedalliaDigital.setCustomParameter("event", str);
        if (str2 != null && str2.length() > 0) {
            MedalliaDigital.setCustomParameter("context1", str2);
        }
    }

    /* renamed from: c */
    public static void m95222c(String str) {
        m95221b("loan_prepayment_complete", str);
    }

    /* renamed from: d */
    public static void m95223d(String str) {
        m95221b("transfer_complete", str);
    }
}

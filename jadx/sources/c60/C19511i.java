package c60;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.cleanarch.presentation.smstopush.SmsToPushParams;
import ue1.C43075l;

/* renamed from: c60.i */
public abstract class C19511i {

    /* renamed from: c60.i$a */
    static final class C19512a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19512a f53809d = new C19512a();

        C19512a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(SmsNotification smsNotification) {
            C41536l.m120489i(smsNotification, "it");
            return String.valueOf(smsNotification.mo52111d());
        }
    }

    /* renamed from: a */
    public static final SmsToPushParams m65102a(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str2, "deviceId");
        return new SmsToPushParams(str, str2, "SMSNOTIFS_CONVERT_SMS_TO_PUSH", str3, str4, str5);
    }

    /* renamed from: b */
    public static final String m65103b(List list) {
        List list2;
        C41536l.m120489i(list, "smsNotfications");
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            return C41358y.m120017g0(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C19512a.f53809d, 30, (Object) null);
        }
        return null;
    }
}

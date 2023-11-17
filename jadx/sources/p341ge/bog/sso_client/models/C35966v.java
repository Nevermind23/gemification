package p341ge.bog.sso_client.models;

import android.content.Context;
import ba1.C10220y;
import kotlin.jvm.internal.C41536l;
import sso.type.UserContactType;

/* renamed from: ge.bog.sso_client.models.v */
public abstract class C35966v {

    /* renamed from: ge.bog.sso_client.models.v$a */
    public /* synthetic */ class C35967a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87022a;

        static {
            int[] iArr = new int[UserContactType.values().length];
            iArr[UserContactType.PHONE.ordinal()] = 1;
            iArr[UserContactType.MAIL.ordinal()] = 2;
            f87022a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m107022a(UserContactType userContactType, Context context) {
        int i;
        C41536l.m120489i(context, "context");
        if (userContactType == null) {
            i = -1;
        } else {
            i = C35967a.f87022a[userContactType.ordinal()];
        }
        if (i == 1) {
            String string = context.getString(C10220y.contacts_type_phone);
            C41536l.m120488h(string, "context.getString(R.string.contacts_type_phone)");
            return string;
        } else if (i != 2) {
            String string2 = context.getString(C10220y.contacts_type_other);
            C41536l.m120488h(string2, "context.getString(R.string.contacts_type_other)");
            return string2;
        } else {
            String string3 = context.getString(C10220y.contacts_type_email);
            C41536l.m120488h(string3, "context.getString(R.string.contacts_type_email)");
            return string3;
        }
    }
}

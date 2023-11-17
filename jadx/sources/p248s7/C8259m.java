package p248s7;

import android.content.Context;
import android.content.res.Resources;
import p130j6.C6733i;

/* renamed from: s7.m */
public abstract class C8259m {
    /* renamed from: a */
    public static String m31089a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C6733i.f20302a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m31090b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}

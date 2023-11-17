package p212pa;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import p134ja.C6763a;

/* renamed from: pa.l */
public abstract class C7795l {

    /* renamed from: a */
    private static String[] f22519a;

    /* renamed from: a */
    public static boolean m29500a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C6763a.m26371e().mo20804a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f22519a == null) {
            f22519a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f22519a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}

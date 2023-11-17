package p206p4;

import android.text.TextUtils;
import com.facebook.C2626d;
import java.io.File;
import java.nio.charset.Charset;
import p334z4.C9207a;

/* renamed from: p4.e */
public abstract class C7710e {
    /* renamed from: a */
    public static File m29283a() {
        Class<C7710e> cls = C7710e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            File file = new File(C2626d.m10134e().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static String m29284b(String str) {
        Class<C7710e> cls = C7710e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return TextUtils.join(" ", str.trim().split("\\s+"));
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static int[] m29285c(String str, int i) {
        Class<C7710e> cls = C7710e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int[] iArr = new int[i];
            byte[] bytes = m29284b(str).getBytes(Charset.forName("UTF-8"));
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}

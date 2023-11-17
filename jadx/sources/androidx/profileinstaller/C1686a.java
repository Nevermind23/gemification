package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
abstract class C1686a {

    /* renamed from: androidx.profileinstaller.a$a */
    private static class C1687a {
        /* renamed from: a */
        static File m5904a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* renamed from: androidx.profileinstaller.a$b */
    private static class C1688b {
        /* renamed from: a */
        static File m5905a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* renamed from: a */
    static boolean m5902a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File a : listFiles) {
                if (!m5902a(a) || !z) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* renamed from: b */
    static void m5903b(Context context, ProfileInstallReceiver.C1682a aVar) {
        File file;
        if (Build.VERSION.SDK_INT >= 24) {
            file = C1688b.m5905a(context);
        } else {
            file = C1687a.m5904a(context);
        }
        if (m5902a(file)) {
            aVar.mo5126a(14, (Object) null);
        } else {
            aVar.mo5126a(15, (Object) null);
        }
    }
}

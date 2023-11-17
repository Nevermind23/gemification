package p318y0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C41536l;

/* renamed from: y0.d */
public final class C8993d {

    /* renamed from: a */
    public static final C8993d f25025a = new C8993d();

    private C8993d() {
    }

    /* renamed from: a */
    public static final File m33286a(Context context) {
        C41536l.m120489i(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C41536l.m120488h(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

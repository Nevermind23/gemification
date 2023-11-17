package androidx.work.impl;

import android.content.Context;
import androidx.work.C2073m;
import he1.C41224m;
import he1.C41233s;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.work.impl.a0 */
public final class C1968a0 {

    /* renamed from: a */
    public static final C1968a0 f5958a = new C1968a0();

    private C1968a0() {
    }

    /* renamed from: c */
    private final File m7760c(Context context) {
        return new File(C1967a.f5957a.mo6766a(context), "androidx.work.workdb");
    }

    /* renamed from: d */
    public static final void m7761d(Context context) {
        String str;
        C41536l.m120489i(context, "context");
        C1968a0 a0Var = f5958a;
        if (a0Var.mo6768b(context).exists()) {
            C2073m.m8071e().mo6959a(C1970b0.f5959a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a0Var.mo6769e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C2073m.m8071e().mo6966k(C1970b0.f5959a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    C2073m.m8071e().mo6959a(C1970b0.f5959a, str);
                }
            }
        }
    }

    /* renamed from: a */
    public final File mo6767a(Context context) {
        C41536l.m120489i(context, "context");
        return m7760c(context);
    }

    /* renamed from: b */
    public final File mo6768b(Context context) {
        C41536l.m120489i(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C41536l.m120488h(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    /* renamed from: e */
    public final Map mo6769e(Context context) {
        C41536l.m120489i(context, "context");
        File b = mo6768b(context);
        File a = mo6767a(context);
        String[] a2 = C1970b0.f5960b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(a2.length), 16));
        for (String str : a2) {
            C41224m a3 = C41233s.m119492a(new File(b.getPath() + str), new File(a.getPath() + str));
            linkedHashMap.put(a3.mo95678e(), a3.mo95680f());
        }
        return C41344r0.m119935q(linkedHashMap, C41233s.m119492a(b, a));
    }
}

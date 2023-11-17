package p051d5;

import android.content.Context;
import com.facebook.C2626d;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import p036c5.C2264d;
import p297w4.C8769a0;

/* renamed from: d5.e */
public class C5835e implements C2264d {

    /* renamed from: a */
    private static C5835e f18358a;

    private C5835e() {
    }

    /* renamed from: b */
    public static synchronized C5835e m23510b() {
        C5835e eVar;
        synchronized (C5835e.class) {
            if (f18358a == null) {
                f18358a = new C5835e();
            }
            eVar = f18358a;
        }
        return eVar;
    }

    /* renamed from: a */
    public Collection mo7306a() {
        ArrayList arrayList = new ArrayList();
        Context e = C2626d.m10134e();
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new BufferedInputStream(e.openFileInput("facebooksdk.monitoring.persistedlogs")));
            try {
                Collection collection = (Collection) objectInputStream2.readObject();
                C8769a0.m32668h(objectInputStream2);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused) {
                }
                return collection;
            } catch (Exception unused2) {
                objectInputStream = objectInputStream2;
                C8769a0.m32668h(objectInputStream);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                    return arrayList;
                } catch (Exception unused3) {
                    return arrayList;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream = objectInputStream2;
                C8769a0.m32668h(objectInputStream);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
            C8769a0.m32668h(objectInputStream);
            e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            C8769a0.m32668h(objectInputStream);
            e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
            throw th;
        }
    }
}

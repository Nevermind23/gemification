package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1638u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p176n0.C7188b;

/* renamed from: androidx.loader.app.a */
public abstract class C1647a {

    /* renamed from: androidx.loader.app.a$a */
    public interface C1648a {
        /* renamed from: a */
        void mo4964a(C7188b bVar);

        /* renamed from: b */
        void mo4965b(C7188b bVar, Object obj);

        /* renamed from: c */
        C7188b mo4966c(int i, Bundle bundle);
    }

    /* renamed from: b */
    public static C1647a m5726b(C1619q qVar) {
        return new C1649b(qVar, ((C1638u0) qVar).getViewModelStore());
    }

    /* renamed from: a */
    public abstract void mo4961a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract C7188b mo4962c(int i, Bundle bundle, C1648a aVar);

    /* renamed from: d */
    public abstract void mo4963d();
}

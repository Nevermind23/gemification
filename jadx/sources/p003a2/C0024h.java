package p003a2;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.C2325h;
import com.airbnb.lottie.C2328i0;
import com.airbnb.lottie.C2344p;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p048d2.C5804f;

/* renamed from: a2.h */
public class C0024h {

    /* renamed from: a */
    private final C0023g f57a;

    /* renamed from: b */
    private final C0022f f58b;

    public C0024h(C0023g gVar, C0022f fVar) {
        this.f57a = gVar;
        this.f58b = fVar;
    }

    /* renamed from: a */
    private C2325h m130a(Context context, String str, String str2) {
        C0023g gVar;
        Pair a;
        C2328i0 i0Var;
        if (str2 == null || (gVar = this.f57a) == null || (a = gVar.mo79a(str)) == null) {
            return null;
        }
        C0019c cVar = (C0019c) a.first;
        InputStream inputStream = (InputStream) a.second;
        if (cVar == C0019c.ZIP) {
            i0Var = C2344p.m9089y(context, new ZipInputStream(inputStream), str2);
        } else {
            i0Var = C2344p.m9079o(inputStream, str2);
        }
        if (i0Var.mo7567b() != null) {
            return (C2325h) i0Var.mo7567b();
        }
        return null;
    }

    /* renamed from: b */
    private C2328i0 m131b(Context context, String str, String str2) {
        boolean z;
        C5804f.m23332a("Fetching " + str);
        C0020d dVar = null;
        try {
            dVar = this.f58b.mo75a(str);
            if (dVar.mo74u0()) {
                C2328i0 d = m132d(context, str, dVar.mo73k0(), dVar.mo71c0(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                if (d.mo7567b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                C5804f.m23332a(sb.toString());
                try {
                    dVar.close();
                } catch (IOException e) {
                    C5804f.m23335d("LottieFetchResult close failed ", e);
                }
                return d;
            }
            C2328i0 i0Var = new C2328i0((Throwable) new IllegalArgumentException(dVar.mo70A()));
            try {
                dVar.close();
            } catch (IOException e2) {
                C5804f.m23335d("LottieFetchResult close failed ", e2);
            }
            return i0Var;
        } catch (Exception e3) {
            C2328i0 i0Var2 = new C2328i0((Throwable) e3);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e4) {
                    C5804f.m23335d("LottieFetchResult close failed ", e4);
                }
            }
            return i0Var2;
        } catch (Throwable th) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e5) {
                    C5804f.m23335d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    private C2328i0 m132d(Context context, String str, InputStream inputStream, String str2, String str3) {
        C2328i0 i0Var;
        C0019c cVar;
        C0023g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C5804f.m23332a("Handling zip response.");
            C0019c cVar2 = C0019c.ZIP;
            i0Var = m134f(context, str, inputStream, str3);
            cVar = cVar2;
        } else {
            C5804f.m23332a("Received json response.");
            cVar = C0019c.JSON;
            i0Var = m133e(str, inputStream, str3);
        }
        if (!(str3 == null || i0Var.mo7567b() == null || (gVar = this.f57a) == null)) {
            gVar.mo80e(str, cVar);
        }
        return i0Var;
    }

    /* renamed from: e */
    private C2328i0 m133e(String str, InputStream inputStream, String str2) {
        C0023g gVar;
        if (str2 == null || (gVar = this.f57a) == null) {
            return C2344p.m9079o(inputStream, (String) null);
        }
        return C2344p.m9079o(new FileInputStream(gVar.mo81f(str, inputStream, C0019c.JSON).getAbsolutePath()), str);
    }

    /* renamed from: f */
    private C2328i0 m134f(Context context, String str, InputStream inputStream, String str2) {
        C0023g gVar;
        if (str2 == null || (gVar = this.f57a) == null) {
            return C2344p.m9089y(context, new ZipInputStream(inputStream), (String) null);
        }
        return C2344p.m9089y(context, new ZipInputStream(new FileInputStream(gVar.mo81f(str, inputStream, C0019c.ZIP))), str);
    }

    /* renamed from: c */
    public C2328i0 mo82c(Context context, String str, String str2) {
        C2325h a = m130a(context, str, str2);
        if (a != null) {
            return new C2328i0((Object) a);
        }
        C5804f.m23332a("Animation for " + str + " not found in cache. Fetching from network.");
        return m131b(context, str, str2);
    }
}

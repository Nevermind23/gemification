package p218q3;

import android.content.Context;
import java.io.File;
import p218q3.C7871d;

/* renamed from: q3.f */
public final class C7874f extends C7871d {

    /* renamed from: q3.f$a */
    class C7875a implements C7871d.C7872a {

        /* renamed from: a */
        final /* synthetic */ Context f22819a;

        /* renamed from: b */
        final /* synthetic */ String f22820b;

        C7875a(Context context, String str) {
            this.f22819a = context;
            this.f22820b = str;
        }

        /* renamed from: a */
        public File mo22840a() {
            File cacheDir = this.f22819a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f22820b != null) {
                return new File(cacheDir, this.f22820b);
            }
            return cacheDir;
        }
    }

    public C7874f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C7874f(Context context, String str, long j) {
        super(new C7875a(context, str), j);
    }
}

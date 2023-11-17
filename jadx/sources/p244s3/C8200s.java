package p244s3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.s */
public class C8200s implements C8188n {

    /* renamed from: a */
    private final C8188n f23374a;

    /* renamed from: b */
    private final Resources f23375b;

    /* renamed from: s3.s$a */
    public static final class C8201a implements C8190o {

        /* renamed from: a */
        private final Resources f23376a;

        public C8201a(Resources resources) {
            this.f23376a = resources;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8200s(this.f23376a, rVar.mo23396d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s3.s$b */
    public static class C8202b implements C8190o {

        /* renamed from: a */
        private final Resources f23377a;

        public C8202b(Resources resources) {
            this.f23377a = resources;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8200s(this.f23377a, rVar.mo23396d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: s3.s$c */
    public static class C8203c implements C8190o {

        /* renamed from: a */
        private final Resources f23378a;

        public C8203c(Resources resources) {
            this.f23378a = resources;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8200s(this.f23378a, C8212w.m30955c());
        }
    }

    public C8200s(Resources resources, C8188n nVar) {
        this.f23375b = resources;
        this.f23374a = nVar;
    }

    /* renamed from: d */
    private Uri m30926d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f23375b.getResourcePackageName(num.intValue()) + '/' + this.f23375b.getResourceTypeName(num.intValue()) + '/' + this.f23375b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Integer num, int i, int i2, C7088h hVar) {
        Uri d = m30926d(num);
        if (d == null) {
            return null;
        }
        return this.f23374a.mo23326a(d, i, i2, hVar);
    }

    /* renamed from: e */
    public boolean mo23327b(Integer num) {
        return true;
    }
}

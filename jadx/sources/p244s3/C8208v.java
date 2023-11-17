package p244s3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.v */
public class C8208v implements C8188n {

    /* renamed from: a */
    private final C8188n f23384a;

    /* renamed from: s3.v$a */
    public static final class C8209a implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8208v(rVar.mo23396d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s3.v$b */
    public static class C8210b implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8208v(rVar.mo23396d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: s3.v$c */
    public static class C8211c implements C8190o {
        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8208v(rVar.mo23396d(Uri.class, InputStream.class));
        }
    }

    public C8208v(C8188n nVar) {
        this.f23384a = nVar;
    }

    /* renamed from: e */
    private static Uri m30946e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m30947f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m30947f(str);
        }
        return parse;
    }

    /* renamed from: f */
    private static Uri m30947f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(String str, int i, int i2, C7088h hVar) {
        Uri e = m30946e(str);
        if (e == null || !this.f23384a.mo23327b(e)) {
            return null;
        }
        return this.f23384a.mo23326a(e, i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo23327b(String str) {
        return true;
    }
}

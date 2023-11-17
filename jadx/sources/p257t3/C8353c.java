package p257t3;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.C2525n0;
import p076f4.C6156d;
import p166m3.C7088h;
import p179n3.C7220b;
import p179n3.C7221c;
import p244s3.C8188n;
import p244s3.C8190o;
import p244s3.C8196r;

/* renamed from: t3.c */
public class C8353c implements C8188n {

    /* renamed from: a */
    private final Context f23756a;

    /* renamed from: t3.c$a */
    public static class C8354a implements C8190o {

        /* renamed from: a */
        private final Context f23757a;

        public C8354a(Context context) {
            this.f23757a = context;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8353c(this.f23757a);
        }
    }

    public C8353c(Context context) {
        this.f23756a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m31417e(C7088h hVar) {
        Long l = (Long) hVar.mo21312c(C2525n0.f7968d);
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        if (!C7220b.m27787d(i, i2) || !m31417e(hVar)) {
            return null;
        }
        return new C8188n.C8189a(new C6156d(uri), C7221c.m27791g(this.f23756a, uri));
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return C7220b.m27786c(uri);
    }
}

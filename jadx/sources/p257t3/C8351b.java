package p257t3;

import android.content.Context;
import android.net.Uri;
import p076f4.C6156d;
import p166m3.C7088h;
import p179n3.C7220b;
import p179n3.C7221c;
import p244s3.C8188n;
import p244s3.C8190o;
import p244s3.C8196r;

/* renamed from: t3.b */
public class C8351b implements C8188n {

    /* renamed from: a */
    private final Context f23754a;

    /* renamed from: t3.b$a */
    public static class C8352a implements C8190o {

        /* renamed from: a */
        private final Context f23755a;

        public C8352a(Context context) {
            this.f23755a = context;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8351b(this.f23755a);
        }
    }

    public C8351b(Context context) {
        this.f23754a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        if (C7220b.m27787d(i, i2)) {
            return new C8188n.C8189a(new C6156d(uri), C7221c.m27790f(this.f23754a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return C7220b.m27784a(uri);
    }
}

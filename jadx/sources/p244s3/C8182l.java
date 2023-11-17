package p244s3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.File;
import java.io.FileNotFoundException;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p179n3.C7220b;
import p244s3.C8188n;

/* renamed from: s3.l */
public final class C8182l implements C8188n {

    /* renamed from: a */
    private final Context f23338a;

    /* renamed from: s3.l$a */
    public static final class C8183a implements C8190o {

        /* renamed from: a */
        private final Context f23339a;

        public C8183a(Context context) {
            this.f23339a = context;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8182l(this.f23339a);
        }
    }

    /* renamed from: s3.l$b */
    private static class C8184b implements C2415d {

        /* renamed from: f */
        private static final String[] f23340f = {"_data"};

        /* renamed from: d */
        private final Context f23341d;

        /* renamed from: e */
        private final Uri f23342e;

        C8184b(Context context, Uri uri) {
            this.f23341d = context;
            this.f23342e = uri;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo7786b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            Cursor query = this.f23341d.getContentResolver().query(this.f23342e, f23340f, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo7797c(new FileNotFoundException("Failed to find file path for: " + this.f23342e));
                return;
            }
            aVar.mo7798f(new File(str));
        }
    }

    public C8182l(Context context) {
        this.f23338a = context;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(uri), new C8184b(this.f23338a, uri));
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return C7220b.m27785b(uri);
    }
}

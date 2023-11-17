package p257t3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p179n3.C7220b;
import p244s3.C8188n;
import p244s3.C8190o;
import p244s3.C8196r;

/* renamed from: t3.d */
public final class C8355d implements C8188n {

    /* renamed from: a */
    private final Context f23758a;

    /* renamed from: b */
    private final C8188n f23759b;

    /* renamed from: c */
    private final C8188n f23760c;

    /* renamed from: d */
    private final Class f23761d;

    /* renamed from: t3.d$a */
    private static abstract class C8356a implements C8190o {

        /* renamed from: a */
        private final Context f23762a;

        /* renamed from: b */
        private final Class f23763b;

        C8356a(Context context, Class cls) {
            this.f23762a = context;
            this.f23763b = cls;
        }

        /* renamed from: d */
        public final C8188n mo23331d(C8196r rVar) {
            return new C8355d(this.f23762a, rVar.mo23396d(File.class, this.f23763b), rVar.mo23396d(Uri.class, this.f23763b), this.f23763b);
        }
    }

    /* renamed from: t3.d$b */
    public static final class C8357b extends C8356a {
        public C8357b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: t3.d$c */
    public static final class C8358c extends C8356a {
        public C8358c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: t3.d$d */
    private static final class C8359d implements C2415d {

        /* renamed from: n */
        private static final String[] f23764n = {"_data"};

        /* renamed from: d */
        private final Context f23765d;

        /* renamed from: e */
        private final C8188n f23766e;

        /* renamed from: f */
        private final C8188n f23767f;

        /* renamed from: g */
        private final Uri f23768g;

        /* renamed from: h */
        private final int f23769h;

        /* renamed from: i */
        private final int f23770i;

        /* renamed from: j */
        private final C7088h f23771j;

        /* renamed from: k */
        private final Class f23772k;

        /* renamed from: l */
        private volatile boolean f23773l;

        /* renamed from: m */
        private volatile C2415d f23774m;

        C8359d(Context context, C8188n nVar, C8188n nVar2, Uri uri, int i, int i2, C7088h hVar, Class cls) {
            this.f23765d = context.getApplicationContext();
            this.f23766e = nVar;
            this.f23767f = nVar2;
            this.f23768g = uri;
            this.f23769h = i;
            this.f23770i = i2;
            this.f23771j = hVar;
            this.f23772k = cls;
        }

        /* renamed from: c */
        private C8188n.C8189a m31428c() {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f23766e.mo23326a(m31431h(this.f23768g), this.f23769h, this.f23770i, this.f23771j);
            }
            if (m31430g()) {
                uri = MediaStore.setRequireOriginal(this.f23768g);
            } else {
                uri = this.f23768g;
            }
            return this.f23767f.mo23326a(uri, this.f23769h, this.f23770i, this.f23771j);
        }

        /* renamed from: f */
        private C2415d m31429f() {
            C8188n.C8189a c = m31428c();
            if (c != null) {
                return c.f23351c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m31430g() {
            return this.f23765d.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m31431h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f23765d.getContentResolver().query(uri, f23764n, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23772k;
        }

        /* renamed from: b */
        public void mo7786b() {
            C2415d dVar = this.f23774m;
            if (dVar != null) {
                dVar.mo7786b();
            }
        }

        public void cancel() {
            this.f23773l = true;
            C2415d dVar = this.f23774m;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            try {
                C2415d f = m31429f();
                if (f == null) {
                    aVar.mo7797c(new IllegalArgumentException("Failed to build fetcher for: " + this.f23768g));
                    return;
                }
                this.f23774m = f;
                if (this.f23773l) {
                    cancel();
                } else {
                    f.mo7790e(gVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo7797c(e);
            }
        }
    }

    C8355d(Context context, C8188n nVar, C8188n nVar2, Class cls) {
        this.f23758a = context.getApplicationContext();
        this.f23759b = nVar;
        this.f23760c = nVar2;
        this.f23761d = cls;
    }

    /* renamed from: c */
    public C8188n.C8189a mo23326a(Uri uri, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(uri), new C8359d(this.f23758a, this.f23759b, this.f23760c, uri, i, i2, hVar, this.f23761d));
    }

    /* renamed from: d */
    public boolean mo23327b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C7220b.m27785b(uri);
    }
}

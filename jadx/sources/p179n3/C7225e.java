package p179n3;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C2402a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p205p3.C7674b;

/* renamed from: n3.e */
class C7225e {

    /* renamed from: f */
    private static final C7219a f21397f = new C7219a();

    /* renamed from: a */
    private final C7219a f21398a;

    /* renamed from: b */
    private final C7224d f21399b;

    /* renamed from: c */
    private final C7674b f21400c;

    /* renamed from: d */
    private final ContentResolver f21401d;

    /* renamed from: e */
    private final List f21402e;

    C7225e(List list, C7224d dVar, C7674b bVar, ContentResolver contentResolver) {
        this(list, f21397f, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m27800b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            n3.d r2 = r6.f21399b     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            android.database.Cursor r2 = r2.mo21587a(r7)     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001a }
            r2.close()
            return r7
        L_0x001a:
            r3 = move-exception
            goto L_0x0026
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0049
        L_0x0024:
            r3 = move-exception
            r2 = r1
        L_0x0026:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            r4.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r7 = move-exception
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p179n3.C7225e.m27800b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m27801c(File file) {
        return this.f21398a.mo21584a(file) && 0 < this.f21398a.mo21586c(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo21588a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f21401d.openInputStream(uri);
            int b = C2402a.m9317b(this.f21402e, openInputStream, this.f21400c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream mo21589d(Uri uri) {
        String b = m27800b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f21398a.mo21585b(b);
        if (!m27801c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f21401d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    C7225e(List list, C7219a aVar, C7224d dVar, C7674b bVar, ContentResolver contentResolver) {
        this.f21398a = aVar;
        this.f21399b = dVar;
        this.f21400c = bVar;
        this.f21401d = contentResolver;
        this.f21402e = list;
    }
}

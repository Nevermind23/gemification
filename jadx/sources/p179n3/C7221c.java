package p179n3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.data.C2422g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p166m3.C7079a;

/* renamed from: n3.c */
public class C7221c implements C2415d {

    /* renamed from: d */
    private final Uri f21390d;

    /* renamed from: e */
    private final C7225e f21391e;

    /* renamed from: f */
    private InputStream f21392f;

    /* renamed from: n3.c$a */
    static class C7222a implements C7224d {

        /* renamed from: b */
        private static final String[] f21393b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f21394a;

        C7222a(ContentResolver contentResolver) {
            this.f21394a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21587a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f21394a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f21393b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: n3.c$b */
    static class C7223b implements C7224d {

        /* renamed from: b */
        private static final String[] f21395b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f21396a;

        C7223b(ContentResolver contentResolver) {
            this.f21396a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21587a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f21396a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f21395b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    C7221c(Uri uri, C7225e eVar) {
        this.f21390d = uri;
        this.f21391e = eVar;
    }

    /* renamed from: c */
    private static C7221c m27789c(Context context, Uri uri, C7224d dVar) {
        return new C7221c(uri, new C7225e(C2379b.m9204c(context).mo7689j().mo7669g(), dVar, C2379b.m9204c(context).mo7684e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C7221c m27790f(Context context, Uri uri) {
        return m27789c(context, uri, new C7222a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C7221c m27791g(Context context, Uri uri) {
        return m27789c(context, uri, new C7223b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m27792h() {
        int i;
        InputStream d = this.f21391e.mo21589d(this.f21390d);
        if (d != null) {
            i = this.f21391e.mo21588a(this.f21390d);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C2422g(d, i);
        }
        return d;
    }

    /* renamed from: a */
    public Class mo7781a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo7786b() {
        InputStream inputStream = this.f21392f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: d */
    public C7079a mo7789d() {
        return C7079a.LOCAL;
    }

    /* renamed from: e */
    public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
        try {
            InputStream h = m27792h();
            this.f21392f = h;
            aVar.mo7798f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo7797c(e);
        }
    }
}

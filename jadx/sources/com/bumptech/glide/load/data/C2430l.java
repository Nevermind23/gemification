package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p166m3.C7079a;

/* renamed from: com.bumptech.glide.load.data.l */
public abstract class C2430l implements C2415d {

    /* renamed from: d */
    private final Uri f7667d;

    /* renamed from: e */
    private final ContentResolver f7668e;

    /* renamed from: f */
    private Object f7669f;

    public C2430l(ContentResolver contentResolver, Uri uri) {
        this.f7668e = contentResolver;
        this.f7667d = uri;
    }

    /* renamed from: b */
    public void mo7786b() {
        Object obj = this.f7669f;
        if (obj != null) {
            try {
                mo7782c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7782c(Object obj);

    public void cancel() {
    }

    /* renamed from: d */
    public C7079a mo7789d() {
        return C7079a.LOCAL;
    }

    /* renamed from: e */
    public final void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
        try {
            Object f = mo7783f(this.f7667d, this.f7668e);
            this.f7669f = f;
            aVar.mo7798f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo7797c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo7783f(Uri uri, ContentResolver contentResolver);
}

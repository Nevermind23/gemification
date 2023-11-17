package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.IOException;
import p166m3.C7079a;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class C2413b implements C2415d {

    /* renamed from: d */
    private final String f7643d;

    /* renamed from: e */
    private final AssetManager f7644e;

    /* renamed from: f */
    private Object f7645f;

    public C2413b(AssetManager assetManager, String str) {
        this.f7644e = assetManager;
        this.f7643d = str;
    }

    /* renamed from: b */
    public void mo7786b() {
        Object obj = this.f7645f;
        if (obj != null) {
            try {
                mo7787c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7787c(Object obj);

    public void cancel() {
    }

    /* renamed from: d */
    public C7079a mo7789d() {
        return C7079a.LOCAL;
    }

    /* renamed from: e */
    public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
        try {
            Object f = mo7791f(this.f7644e, this.f7643d);
            this.f7645f = f;
            aVar.mo7798f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo7797c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo7791f(AssetManager assetManager, String str);
}

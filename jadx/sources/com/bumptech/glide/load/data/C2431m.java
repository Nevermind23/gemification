package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
public class C2431m extends C2413b {
    public C2431m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class mo7781a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7787c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo7791f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}

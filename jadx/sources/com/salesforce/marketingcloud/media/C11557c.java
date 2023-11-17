package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.LruCache;
import androidx.core.graphics.C0822a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.c */
public class C11557c {

    /* renamed from: a */
    private final LruCache<String, C11559b> f33545a;

    /* renamed from: com.salesforce.marketingcloud.media.c$a */
    class C11558a extends LruCache<String, C11559b> {
        C11558a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, C11559b bVar) {
            return bVar.f33548b;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.c$b */
    static final class C11559b {

        /* renamed from: a */
        final Bitmap f33547a;

        /* renamed from: b */
        final int f33548b;

        C11559b(Bitmap bitmap, int i) {
            this.f33547a = bitmap;
            this.f33548b = i;
        }
    }

    C11557c(Context context) {
        this.f33545a = new C11558a(m42210a(context));
    }

    /* renamed from: a */
    private static int m42210a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo30175a(String str) {
        C11559b bVar = this.f33545a.get(str);
        if (bVar != null) {
            return bVar.f33547a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30176a() {
        this.f33545a.evictAll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30177a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int a = C0822a.m3089a(bitmap);
            if (a > this.f33545a.maxSize()) {
                this.f33545a.remove(str);
            } else {
                this.f33545a.put(str, new C11559b(bitmap, a));
            }
        }
    }
}

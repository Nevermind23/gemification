package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C1369a implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ String f3930d;

    public /* synthetic */ C1369a(String str) {
        this.f3930d = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C1370b.m4709c(this.f3930d, runnable);
    }
}

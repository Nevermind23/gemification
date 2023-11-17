package androidx.emoji2.text;

import androidx.emoji2.text.C1378e;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.f */
public final /* synthetic */ class C1389f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiCompatInitializer.C1366b f3966d;

    /* renamed from: e */
    public final /* synthetic */ C1378e.C1387h f3967e;

    /* renamed from: f */
    public final /* synthetic */ ThreadPoolExecutor f3968f;

    public /* synthetic */ C1389f(EmojiCompatInitializer.C1366b bVar, C1378e.C1387h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f3966d = bVar;
        this.f3967e = hVar;
        this.f3968f = threadPoolExecutor;
    }

    public final void run() {
        this.f3966d.m4702d(this.f3967e, this.f3968f);
    }
}

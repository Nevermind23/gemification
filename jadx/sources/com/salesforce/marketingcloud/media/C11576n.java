package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.media.C11587s;
import com.salesforce.marketingcloud.media.C11591u;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.n */
public class C11576n implements Runnable {

    /* renamed from: m */
    private static final String f33583m = "ImageHandler-";

    /* renamed from: n */
    private static final String f33584n = "ImageHandler-Idle";

    /* renamed from: o */
    private static final ThreadLocal<StringBuilder> f33585o = new C11577a();

    /* renamed from: p */
    private static final C11591u f33586p = new C11578b();

    /* renamed from: a */
    final C11580o f33587a;

    /* renamed from: b */
    final C11564h f33588b;

    /* renamed from: c */
    final String f33589c;

    /* renamed from: d */
    final C11591u f33590d;

    /* renamed from: e */
    final C11557c f33591e;

    /* renamed from: f */
    C11587s f33592f;

    /* renamed from: g */
    C11553a f33593g;

    /* renamed from: h */
    List<C11553a> f33594h;

    /* renamed from: i */
    C11591u.C11593b f33595i;

    /* renamed from: j */
    Future<?> f33596j;

    /* renamed from: k */
    Exception f33597k;

    /* renamed from: l */
    C11580o.C11583c f33598l;

    /* renamed from: com.salesforce.marketingcloud.media.n$a */
    class C11577a extends ThreadLocal<StringBuilder> {
        C11577a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder(C11576n.f33583m);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.n$b */
    class C11578b extends C11591u {
        C11578b() {
        }

        /* renamed from: a */
        public void mo30203a(C11580o oVar, C11587s sVar, C11591u.C11592a aVar) {
            aVar.mo30228a((Throwable) new C11569k(sVar));
        }

        /* renamed from: a */
        public boolean mo30204a(C11587s sVar) {
            return true;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.n$c */
    class C11579c implements C11591u.C11592a {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f33599a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f33600b;

        /* renamed from: c */
        final /* synthetic */ AtomicReference f33601c;

        C11579c(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f33599a = atomicReference;
            this.f33600b = countDownLatch;
            this.f33601c = atomicReference2;
        }

        /* renamed from: a */
        public void mo30227a(C11591u.C11593b bVar) {
            this.f33599a.set(bVar);
            this.f33600b.countDown();
        }

        /* renamed from: a */
        public void mo30228a(Throwable th) {
            this.f33601c.set(th);
            this.f33600b.countDown();
        }
    }

    C11576n(C11580o oVar, C11564h hVar, C11557c cVar, C11553a aVar, C11591u uVar) {
        this.f33587a = oVar;
        this.f33588b = hVar;
        this.f33591e = cVar;
        this.f33593g = aVar;
        this.f33589c = aVar.mo30165c();
        this.f33592f = aVar.mo30167e();
        this.f33590d = uVar;
        this.f33598l = aVar.mo30166d();
    }

    /* renamed from: a */
    static Bitmap m42245a(C11587s sVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = sVar.f33636i;
        float f2 = sVar.f33637j;
        float f3 = (float) width;
        float f4 = (float) height;
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f3, f4);
        RectF rectF2 = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f3, f4);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        int i = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i > 0) {
            paint2.setStrokeWidth(f2);
            paint2.setColor(sVar.f33638k);
            float f5 = f2 / 2.0f;
            rectF2.inset(f5, f5);
            float floor = (float) Math.floor((double) f5);
            rectF.inset(floor, floor);
        }
        if (f > Utils.FLOAT_EPSILON) {
            canvas.drawRoundRect(rectF, f, f, paint);
            if (i > 0) {
                canvas.drawRoundRect(rectF2, f, f, paint2);
            }
        } else {
            canvas.drawRect(rectF, paint);
            if (i > 0) {
                canvas.drawRect(rectF2, paint2);
            }
        }
        if (bitmap == createBitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m42248b(com.salesforce.marketingcloud.media.C11587s r11, android.graphics.Bitmap r12) {
        /*
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            boolean r2 = r11.mo30247d()
            r3 = 0
            if (r2 == 0) goto L_0x009f
            int r2 = r11.f33632e
            int r4 = r11.f33633f
            boolean r5 = r11.f33634g
            if (r5 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0021
            float r11 = (float) r2
            float r5 = (float) r0
            goto L_0x0023
        L_0x0021:
            float r11 = (float) r4
            float r5 = (float) r1
        L_0x0023:
            float r11 = r11 / r5
            if (r4 == 0) goto L_0x0029
            float r5 = (float) r4
            float r6 = (float) r1
            goto L_0x002b
        L_0x0029:
            float r5 = (float) r2
            float r6 = (float) r0
        L_0x002b:
            float r5 = r5 / r6
            int r6 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0044
            float r2 = (float) r1
            float r5 = r5 / r11
            float r2 = r2 * r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
            int r1 = r1 - r2
            int r1 = r1 / 2
            float r4 = (float) r4
            float r5 = (float) r2
            float r5 = r4 / r5
            r10 = r2
            r2 = r1
            r1 = r10
            goto L_0x005f
        L_0x0044:
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            float r4 = (float) r0
            float r11 = r11 / r5
            float r4 = r4 * r11
            double r8 = (double) r4
            double r8 = java.lang.Math.ceil(r8)
            int r11 = (int) r8
            int r0 = r0 - r11
            int r0 = r0 / 2
            float r2 = (float) r2
            float r4 = (float) r11
            float r2 = r2 / r4
            r10 = r0
            r0 = r11
            r11 = r2
            r2 = r3
            r3 = r10
            goto L_0x005f
        L_0x005d:
            r2 = r3
            r11 = r5
        L_0x005f:
            r7.preScale(r11, r5)
            r5 = r0
            r6 = r1
            r4 = r2
            goto L_0x00a2
        L_0x0066:
            boolean r11 = r11.f33635h
            if (r11 == 0) goto L_0x0084
            if (r2 == 0) goto L_0x006f
            float r11 = (float) r2
            float r5 = (float) r0
            goto L_0x0071
        L_0x006f:
            float r11 = (float) r4
            float r5 = (float) r1
        L_0x0071:
            float r11 = r11 / r5
            if (r4 == 0) goto L_0x0077
            float r2 = (float) r4
            float r4 = (float) r1
            goto L_0x0079
        L_0x0077:
            float r2 = (float) r2
            float r4 = (float) r0
        L_0x0079:
            float r2 = r2 / r4
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r11 = r2
        L_0x0080:
            r7.preScale(r11, r11)
            goto L_0x009f
        L_0x0084:
            if (r2 != 0) goto L_0x0088
            if (r4 == 0) goto L_0x009f
        L_0x0088:
            if (r2 != r0) goto L_0x008c
            if (r4 == r1) goto L_0x009f
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            float r11 = (float) r2
            float r5 = (float) r0
            goto L_0x0093
        L_0x0091:
            float r11 = (float) r4
            float r5 = (float) r1
        L_0x0093:
            float r11 = r11 / r5
            if (r4 == 0) goto L_0x0099
            float r2 = (float) r4
            float r4 = (float) r1
            goto L_0x009b
        L_0x0099:
            float r2 = (float) r2
            float r4 = (float) r0
        L_0x009b:
            float r2 = r2 / r4
            r7.preScale(r11, r2)
        L_0x009f:
            r5 = r0
            r6 = r1
            r4 = r3
        L_0x00a2:
            r8 = 1
            r2 = r12
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            if (r11 == r12) goto L_0x00ae
            r12.recycle()
            r12 = r11
        L_0x00ae:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.media.C11576n.m42248b(com.salesforce.marketingcloud.media.s, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public C11553a mo30216c() {
        return this.f33593g;
    }

    /* renamed from: d */
    public List<C11553a> mo30217d() {
        return this.f33594h;
    }

    /* renamed from: e */
    public C11587s mo30218e() {
        return this.f33592f;
    }

    /* renamed from: f */
    public Exception mo30219f() {
        return this.f33597k;
    }

    /* renamed from: g */
    public C11580o mo30220g() {
        return this.f33587a;
    }

    /* renamed from: h */
    public String mo30221h() {
        return this.f33589c;
    }

    /* renamed from: i */
    public C11591u.C11593b mo30222i() {
        return this.f33595i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo30223j() {
        Future<?> future = this.f33596j;
        return future != null && future.isCancelled();
    }

    public void run() {
        try {
            m42247a(this.f33592f);
            C11591u.C11593b b = mo30214b();
            this.f33595i = b;
            if (!b.mo30272d()) {
                this.f33588b.mo30198c(this);
            } else {
                C11461g.m41880a("IMAGE", "onSuccess - Loaded from: %s", this.f33595i.mo30271c());
                this.f33588b.mo30196b(this);
            }
        } catch (Exception e) {
            this.f33597k = e;
            this.f33588b.mo30198c(this);
        } catch (Throwable th) {
            Thread.currentThread().setName(f33584n);
            throw th;
        }
        Thread.currentThread().setName(f33584n);
    }

    /* renamed from: a */
    static C11576n m42246a(C11580o oVar, C11564h hVar, C11557c cVar, C11553a aVar) {
        C11587s e = aVar.mo30167e();
        List<C11591u> a = oVar.mo30231a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C11591u uVar = a.get(i);
            if (uVar.mo30204a(e)) {
                return new C11576n(oVar, hVar, cVar, aVar, uVar);
            }
        }
        return new C11576n(oVar, hVar, cVar, aVar, f33586p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11591u.C11593b mo30214b() {
        Bitmap a;
        if (C11587s.C11589b.m42304a(this.f33592f.f33631d) && (a = this.f33591e.mo30175a(this.f33589c)) != null) {
            return new C11591u.C11593b(a, C11580o.C11582b.MEMORY);
        }
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.f33590d.mo30203a(this.f33587a, this.f33592f, (C11591u.C11592a) new C11579c(atomicReference, countDownLatch, atomicReference2));
            countDownLatch.await();
            Throwable th = (Throwable) atomicReference2.get();
            if (th == null) {
                C11591u.C11593b bVar = (C11591u.C11593b) atomicReference.get();
                if (!bVar.mo30272d()) {
                    return bVar;
                }
                Bitmap a2 = bVar.mo30269a();
                if (!this.f33592f.mo30248e()) {
                    return bVar;
                }
                if (this.f33592f.mo30247d()) {
                    a2 = m42248b(this.f33592f, a2);
                }
                if (this.f33592f.mo30246c()) {
                    a2 = m42245a(this.f33592f, a2);
                }
                return new C11591u.C11593b(a2, bVar.mo30271c());
            }
            throw new RuntimeException(th);
        } catch (InterruptedException e) {
            throw new InterruptedIOException(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo30212a(C11553a aVar) {
        if (this.f33593g == null) {
            this.f33593g = aVar;
            return;
        }
        if (this.f33594h == null) {
            this.f33594h = new ArrayList();
        }
        this.f33594h.add(aVar);
        C11580o.C11583c d = aVar.mo30166d();
        if (d.ordinal() > this.f33598l.ordinal()) {
            this.f33598l = d;
        }
    }

    /* renamed from: b */
    public void mo30215b(C11553a aVar) {
        if (this.f33593g == aVar) {
            this.f33593g = null;
            return;
        }
        List<C11553a> list = this.f33594h;
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* renamed from: a */
    static void m42247a(C11587s sVar) {
        String b = sVar.mo30245b();
        StringBuilder sb = f33585o.get();
        sb.ensureCapacity(b.length() + 13);
        sb.replace(13, sb.length(), b);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f33596j;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo30213a() {
        /*
            r2 = this;
            com.salesforce.marketingcloud.media.a r0 = r2.f33593g
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<com.salesforce.marketingcloud.media.a> r0 = r2.f33594h
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f33596j
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.media.C11576n.mo30213a():boolean");
    }
}

package com.bumptech.glide;

import android.content.Context;
import android.support.p013v4.media.session.C0125b;
import java.util.Iterator;
import java.util.List;
import p005a4.C0045a;
import p047d1.C5797b;
import p089g4.C6215f;
import p205p3.C7674b;
import p205p3.C7676d;

/* renamed from: com.bumptech.glide.i */
abstract class C2392i {

    /* renamed from: com.bumptech.glide.i$a */
    class C2393a implements C6215f.C6217b {

        /* renamed from: a */
        private boolean f7589a;

        /* renamed from: b */
        final /* synthetic */ C2379b f7590b;

        /* renamed from: c */
        final /* synthetic */ List f7591c;

        /* renamed from: d */
        final /* synthetic */ C0045a f7592d;

        C2393a(C2379b bVar, List list, C0045a aVar) {
            this.f7590b = bVar;
            this.f7591c = list;
            this.f7592d = aVar;
        }

        /* renamed from: a */
        public Registry get() {
            if (!this.f7589a) {
                C5797b.m23308a("Glide registry");
                this.f7589a = true;
                try {
                    return C2392i.m9242a(this.f7590b, this.f7591c, this.f7592d);
                } finally {
                    this.f7589a = false;
                    C5797b.m23309b();
                }
            } else {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
        }
    }

    /* renamed from: a */
    static Registry m9242a(C2379b bVar, List list, C0045a aVar) {
        C7676d f = bVar.mo7685f();
        C7674b e = bVar.mo7684e();
        Context applicationContext = bVar.mo7688i().getApplicationContext();
        C2387e g = bVar.mo7688i().mo7707g();
        Registry registry = new Registry();
        m9243b(applicationContext, registry, f, e, g);
        m9244c(applicationContext, bVar, registry, list, aVar);
        return registry;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0276  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9243b(android.content.Context r24, com.bumptech.glide.Registry r25, p205p3.C7676d r26, p205p3.C7674b r27, com.bumptech.glide.C2387e r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r4 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r4.<init>()
            r1.mo7677o(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L_0x001e
            com.bumptech.glide.load.resource.bitmap.x r5 = new com.bumptech.glide.load.resource.bitmap.x
            r5.<init>()
            r1.mo7677o(r5)
        L_0x001e:
            android.content.res.Resources r5 = r24.getResources()
            java.util.List r6 = r25.mo7669g()
            y3.a r7 = new y3.a
            r7.<init>(r0, r6, r2, r3)
            m3.j r8 = com.bumptech.glide.load.resource.bitmap.C2525n0.m9763m(r26)
            com.bumptech.glide.load.resource.bitmap.u r9 = new com.bumptech.glide.load.resource.bitmap.u
            java.util.List r10 = r25.mo7669g()
            android.util.DisplayMetrics r11 = r5.getDisplayMetrics()
            r9.<init>(r10, r11, r2, r3)
            r10 = 28
            if (r4 < r10) goto L_0x0055
            java.lang.Class<com.bumptech.glide.c$b> r11 = com.bumptech.glide.C2381c.C2383b.class
            r12 = r28
            boolean r11 = r12.mo7710a(r11)
            if (r11 == 0) goto L_0x0055
            com.bumptech.glide.load.resource.bitmap.c0 r11 = new com.bumptech.glide.load.resource.bitmap.c0
            r11.<init>()
            com.bumptech.glide.load.resource.bitmap.k r12 = new com.bumptech.glide.load.resource.bitmap.k
            r12.<init>()
            goto L_0x005f
        L_0x0055:
            com.bumptech.glide.load.resource.bitmap.i r12 = new com.bumptech.glide.load.resource.bitmap.i
            r12.<init>(r9)
            com.bumptech.glide.load.resource.bitmap.i0 r11 = new com.bumptech.glide.load.resource.bitmap.i0
            r11.<init>(r9, r3)
        L_0x005f:
            java.lang.String r13 = "Animation"
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r16 = r7
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r4 < r10) goto L_0x0079
            m3.j r10 = p296w3.C8755h.m32572f(r6, r3)
            r1.mo7668e(r13, r7, r15, r10)
            m3.j r10 = p296w3.C8755h.m32570a(r6, r3)
            r1.mo7668e(r13, r14, r15, r10)
        L_0x0079:
            w3.m r10 = new w3.m
            r10.<init>(r0)
            r17 = r4
            com.bumptech.glide.load.resource.bitmap.c r4 = new com.bumptech.glide.load.resource.bitmap.c
            r4.<init>(r3)
            z3.a r0 = new z3.a
            r0.<init>()
            r28 = r0
            z3.d r0 = new z3.d
            r0.<init>()
            r18 = r0
            android.content.ContentResolver r0 = r24.getContentResolver()
            r19 = r0
            s3.c r0 = new s3.c
            r0.<init>()
            com.bumptech.glide.Registry r0 = r1.mo7666c(r14, r0)
            r20 = r10
            s3.u r10 = new s3.u
            r10.<init>(r3)
            com.bumptech.glide.Registry r0 = r0.mo7666c(r7, r10)
            java.lang.String r10 = "Bitmap"
            r21 = r15
            java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
            com.bumptech.glide.Registry r0 = r0.mo7668e(r10, r14, r15, r12)
            r0.mo7668e(r10, r7, r15, r11)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.m9332c()
            r22 = r13
            java.lang.Class<android.os.ParcelFileDescriptor> r13 = android.os.ParcelFileDescriptor.class
            if (r0 == 0) goto L_0x00cc
            com.bumptech.glide.load.resource.bitmap.e0 r0 = new com.bumptech.glide.load.resource.bitmap.e0
            r0.<init>(r9)
            r1.mo7668e(r10, r13, r15, r0)
        L_0x00cc:
            com.bumptech.glide.Registry r0 = r1.mo7668e(r10, r13, r15, r8)
            m3.j r9 = com.bumptech.glide.load.resource.bitmap.C2525n0.m9753c(r26)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.Registry r0 = r0.mo7668e(r10, r1, r15, r9)
            s3.w$a r9 = p244s3.C8212w.C8213a.m30958a()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r15, r15, r9)
            com.bumptech.glide.load.resource.bitmap.k0 r9 = new com.bumptech.glide.load.resource.bitmap.k0
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7668e(r10, r15, r15, r9)
            com.bumptech.glide.Registry r0 = r0.mo7667d(r15, r4)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r12)
            java.lang.String r12 = "BitmapDrawable"
            r23 = r1
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.Registry r0 = r0.mo7668e(r12, r14, r1, r9)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r11)
            com.bumptech.glide.Registry r0 = r0.mo7668e(r12, r7, r1, r9)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r8)
            com.bumptech.glide.Registry r0 = r0.mo7668e(r12, r13, r1, r9)
            com.bumptech.glide.load.resource.bitmap.b r8 = new com.bumptech.glide.load.resource.bitmap.b
            r8.<init>(r2, r4)
            com.bumptech.glide.Registry r0 = r0.mo7667d(r1, r8)
            y3.j r4 = new y3.j
            r8 = r16
            r4.<init>(r6, r8, r3)
            java.lang.Class<y3.c> r6 = p321y3.C9046c.class
            r9 = r22
            com.bumptech.glide.Registry r0 = r0.mo7668e(r9, r7, r6, r4)
            com.bumptech.glide.Registry r0 = r0.mo7668e(r9, r14, r6, r8)
            y3.d r4 = new y3.d
            r4.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7667d(r6, r4)
            s3.w$a r4 = p244s3.C8212w.C8213a.m30958a()
            java.lang.Class<l3.a> r8 = p153l3.C6874a.class
            com.bumptech.glide.Registry r0 = r0.mo7665b(r8, r8, r4)
            y3.h r4 = new y3.h
            r4.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.mo7668e(r10, r8, r15, r4)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r8 = r20
            r9 = r21
            com.bumptech.glide.Registry r0 = r0.mo7664a(r4, r9, r8)
            com.bumptech.glide.load.resource.bitmap.g0 r10 = new com.bumptech.glide.load.resource.bitmap.g0
            r10.<init>(r8, r2)
            com.bumptech.glide.Registry r0 = r0.mo7664a(r4, r15, r10)
            v3.a$a r8 = new v3.a$a
            r8.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7678p(r8)
            s3.d$b r8 = new s3.d$b
            r8.<init>()
            java.lang.Class<java.io.File> r10 = java.io.File.class
            com.bumptech.glide.Registry r0 = r0.mo7665b(r10, r14, r8)
            s3.g$e r8 = new s3.g$e
            r8.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r10, r7, r8)
            x3.a r8 = new x3.a
            r8.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7664a(r10, r10, r8)
            s3.g$b r8 = new s3.g$b
            r8.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r10, r13, r8)
            s3.w$a r8 = p244s3.C8212w.C8213a.m30958a()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r10, r10, r8)
            com.bumptech.glide.load.data.k$a r8 = new com.bumptech.glide.load.data.k$a
            r8.<init>(r3)
            r0.mo7678p(r8)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.m9332c()
            if (r0 == 0) goto L_0x01ad
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r3 = r25
            r8 = r23
            r3.mo7678p(r0)
            goto L_0x01b1
        L_0x01ad:
            r3 = r25
            r8 = r23
        L_0x01b1:
            s3.o r0 = p244s3.C8161f.m30810g(r24)
            s3.o r11 = p244s3.C8161f.m30808c(r24)
            s3.o r12 = p244s3.C8161f.m30809e(r24)
            r16 = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            com.bumptech.glide.Registry r2 = r3.mo7665b(r6, r7, r0)
            r20 = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            com.bumptech.glide.Registry r0 = r2.mo7665b(r1, r7, r0)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r6, r8, r11)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r8, r11)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r6, r9, r12)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r9, r12)
            s3.o r2 = p244s3.C8204t.m30935f(r24)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r7, r2)
            s3.o r2 = p244s3.C8204t.m30934e(r24)
            r0.mo7665b(r4, r8, r2)
            s3.s$c r0 = new s3.s$c
            r0.<init>(r5)
            s3.s$a r2 = new s3.s$a
            r2.<init>(r5)
            s3.s$b r11 = new s3.s$b
            r11.<init>(r5)
            com.bumptech.glide.Registry r12 = r3.mo7665b(r1, r4, r0)
            com.bumptech.glide.Registry r0 = r12.mo7665b(r6, r4, r0)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r8, r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r6, r8, r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r7, r11)
            r0.mo7665b(r6, r7, r11)
            s3.e$c r0 = new s3.e$c
            r0.<init>()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bumptech.glide.Registry r0 = r3.mo7665b(r1, r7, r0)
            s3.e$c r2 = new s3.e$c
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r7, r2)
            s3.v$c r2 = new s3.v$c
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r7, r2)
            s3.v$b r2 = new s3.v$b
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r13, r2)
            s3.v$a r2 = new s3.v$a
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r1, r8, r2)
            s3.a$c r1 = new s3.a$c
            android.content.res.AssetManager r2 = r24.getAssets()
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r7, r1)
            s3.a$b r1 = new s3.a$b
            android.content.res.AssetManager r2 = r24.getAssets()
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r8, r1)
            t3.b$a r1 = new t3.b$a
            r2 = r24
            r6 = r28
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r7, r1)
            t3.c$a r1 = new t3.c$a
            r1.<init>(r2)
            r0.mo7665b(r4, r7, r1)
            r0 = 29
            r1 = r17
            if (r1 < r0) goto L_0x0286
            t3.d$c r0 = new t3.d$c
            r0.<init>(r2)
            r3.mo7665b(r4, r7, r0)
            t3.d$b r0 = new t3.d$b
            r0.<init>(r2)
            r3.mo7665b(r4, r13, r0)
        L_0x0286:
            s3.x$d r0 = new s3.x$d
            r1 = r19
            r0.<init>(r1)
            com.bumptech.glide.Registry r0 = r3.mo7665b(r4, r7, r0)
            s3.x$b r11 = new s3.x$b
            r11.<init>(r1)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r13, r11)
            s3.x$a r11 = new s3.x$a
            r11.<init>(r1)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r8, r11)
            s3.y$a r1 = new s3.y$a
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r7, r1)
            t3.g$a r1 = new t3.g$a
            r1.<init>()
            java.lang.Class<java.net.URL> r8 = java.net.URL.class
            com.bumptech.glide.Registry r0 = r0.mo7665b(r8, r7, r1)
            s3.l$a r1 = new s3.l$a
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r10, r1)
            t3.a$a r1 = new t3.a$a
            r1.<init>()
            java.lang.Class<s3.h> r2 = p244s3.C8175h.class
            com.bumptech.glide.Registry r0 = r0.mo7665b(r2, r7, r1)
            s3.b$a r1 = new s3.b$a
            r1.<init>()
            java.lang.Class<byte[]> r2 = byte[].class
            com.bumptech.glide.Registry r0 = r0.mo7665b(r2, r14, r1)
            s3.b$d r1 = new s3.b$d
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r2, r7, r1)
            s3.w$a r1 = p244s3.C8212w.C8213a.m30958a()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r4, r4, r1)
            s3.w$a r1 = p244s3.C8212w.C8213a.m30958a()
            com.bumptech.glide.Registry r0 = r0.mo7665b(r9, r9, r1)
            w3.n r1 = new w3.n
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.mo7664a(r9, r9, r1)
            z3.b r1 = new z3.b
            r1.<init>(r5)
            r4 = r20
            com.bumptech.glide.Registry r0 = r0.mo7679q(r15, r4, r1)
            com.bumptech.glide.Registry r0 = r0.mo7679q(r15, r2, r6)
            z3.c r1 = new z3.c
            r7 = r26
            r8 = r18
            r1.<init>(r7, r6, r8)
            com.bumptech.glide.Registry r0 = r0.mo7679q(r9, r2, r1)
            r1 = r16
            r0.mo7679q(r1, r2, r8)
            m3.j r0 = com.bumptech.glide.load.resource.bitmap.C2525n0.m9754d(r26)
            r3.mo7664a(r14, r15, r0)
            com.bumptech.glide.load.resource.bitmap.a r1 = new com.bumptech.glide.load.resource.bitmap.a
            r1.<init>(r5, r0)
            r3.mo7664a(r14, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2392i.m9243b(android.content.Context, com.bumptech.glide.Registry, p3.d, p3.b, com.bumptech.glide.e):void");
    }

    /* renamed from: c */
    private static void m9244c(Context context, C2379b bVar, Registry registry, List list, C0045a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        } else if (aVar != null) {
            aVar.mo97a(context, bVar, registry);
        }
    }

    /* renamed from: d */
    static C6215f.C6217b m9245d(C2379b bVar, List list, C0045a aVar) {
        return new C2393a(bVar, list, aVar);
    }
}

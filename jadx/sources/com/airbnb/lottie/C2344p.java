package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.support.p013v4.media.session.C0125b;
import dg1.C40679d;
import dg1.C40691m;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;
import p020b2.C2149w;
import p033c2.C2224c;
import p048d2.C5804f;
import p048d2.C5808j;
import p294w1.C8740g;

/* renamed from: com.airbnb.lottie.p */
public abstract class C2344p {

    /* renamed from: a */
    private static final Map f7408a = new HashMap();

    /* renamed from: b */
    private static final Set f7409b = new HashSet();

    /* renamed from: c */
    private static final byte[] f7410c = {80, 75, 3, 4};

    /* renamed from: A */
    private static boolean m9054A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: B */
    private static Boolean m9055B(C40679d dVar) {
        try {
            C40679d D = dVar.mo94695D();
            for (byte b : f7410c) {
                if (D.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            D.close();
            return Boolean.TRUE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        } catch (Exception e) {
            C5804f.m23333b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static /* synthetic */ void m9056C(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = f7408a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m9063J(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ C2328i0 m9057D(C2325h hVar) {
        return new C2328i0((Object) hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m9058E(String str, AtomicBoolean atomicBoolean, C2325h hVar) {
        Map map = f7408a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m9063J(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ C2328i0 m9061H(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m9086v(context, i, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ C2328i0 m9062I(Context context, String str, String str2) {
        C2328i0 c = C2311c.m8888e(context).mo82c(context, str, str2);
        if (!(str2 == null || c.mo7567b() == null)) {
            C8740g.m32531b().mo24146c(str2, (C2325h) c.mo7567b());
        }
        return c;
    }

    /* renamed from: J */
    private static void m9063J(boolean z) {
        ArrayList arrayList = new ArrayList(f7409b);
        if (arrayList.size() > 0) {
            C0125b.m366a(arrayList.get(0));
            throw null;
        }
    }

    /* renamed from: K */
    private static String m9064K(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m9054A(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: h */
    private static C2332k0 m9072h(String str, Callable callable) {
        C2325h hVar;
        if (str == null) {
            hVar = null;
        } else {
            hVar = C8740g.m32531b().mo24145a(str);
        }
        if (hVar != null) {
            return new C2332k0(new C2331k(hVar));
        }
        if (str != null) {
            Map map = f7408a;
            if (map.containsKey(str)) {
                return (C2332k0) map.get(str);
            }
        }
        C2332k0 k0Var = new C2332k0(callable);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            k0Var.mo7574d(new C2334l(str, atomicBoolean));
            k0Var.mo7573c(new C2337m(str, atomicBoolean));
            if (!atomicBoolean.get()) {
                Map map2 = f7408a;
                map2.put(str, k0Var);
                if (map2.size() == 1) {
                    m9063J(false);
                }
            }
        }
        return k0Var;
    }

    /* renamed from: i */
    private static C2320e0 m9073i(C2325h hVar, String str) {
        for (C2320e0 e0Var : hVar.mo7551j().values()) {
            if (e0Var.mo7532b().equals(str)) {
                return e0Var;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static C2332k0 m9074j(Context context, String str) {
        return m9075k(context, str, "asset_" + str);
    }

    /* renamed from: k */
    public static C2332k0 m9075k(Context context, String str, String str2) {
        return m9072h(str2, new C2339n(context.getApplicationContext(), str, str2));
    }

    /* renamed from: l */
    public static C2328i0 m9076l(Context context, String str) {
        return m9077m(context, str, "asset_" + str);
    }

    /* renamed from: m */
    public static C2328i0 m9077m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return m9079o(context.getAssets().open(str), str2);
                }
            }
            return m9089y(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C2328i0((Throwable) e);
        }
    }

    /* renamed from: n */
    public static C2332k0 m9078n(InputStream inputStream, String str) {
        return m9072h(str, new C2329j(inputStream, str));
    }

    /* renamed from: o */
    public static C2328i0 m9079o(InputStream inputStream, String str) {
        return m9080p(inputStream, str, true);
    }

    /* renamed from: p */
    private static C2328i0 m9080p(InputStream inputStream, String str, boolean z) {
        try {
            return m9081q(C2224c.m8465u(C40691m.m117770b(C40691m.m117774f(inputStream))), str);
        } finally {
            if (z) {
                C5808j.m23375c(inputStream);
            }
        }
    }

    /* renamed from: q */
    public static C2328i0 m9081q(C2224c cVar, String str) {
        return m9082r(cVar, str, true);
    }

    /* renamed from: r */
    private static C2328i0 m9082r(C2224c cVar, String str, boolean z) {
        try {
            C2325h a = C2149w.m8251a(cVar);
            if (str != null) {
                C8740g.m32531b().mo24146c(str, a);
            }
            C2328i0 i0Var = new C2328i0((Object) a);
            if (z) {
                C5808j.m23375c(cVar);
            }
            return i0Var;
        } catch (Exception e) {
            C2328i0 i0Var2 = new C2328i0((Throwable) e);
            if (z) {
                C5808j.m23375c(cVar);
            }
            return i0Var2;
        } catch (Throwable th) {
            if (z) {
                C5808j.m23375c(cVar);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static C2332k0 m9083s(Context context, int i) {
        return m9084t(context, i, m9064K(context, i));
    }

    /* renamed from: t */
    public static C2332k0 m9084t(Context context, int i, String str) {
        return m9072h(str, new C2341o(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: u */
    public static C2328i0 m9085u(Context context, int i) {
        return m9086v(context, i, m9064K(context, i));
    }

    /* renamed from: v */
    public static C2328i0 m9086v(Context context, int i, String str) {
        try {
            C40679d b = C40691m.m117770b(C40691m.m117774f(context.getResources().openRawResource(i)));
            if (m9055B(b).booleanValue()) {
                return m9089y(context, new ZipInputStream(b.mo94698E1()), str);
            }
            return m9079o(b.mo94698E1(), str);
        } catch (Resources.NotFoundException e) {
            return new C2328i0((Throwable) e);
        }
    }

    /* renamed from: w */
    public static C2332k0 m9087w(Context context, String str) {
        return m9088x(context, str, "url_" + str);
    }

    /* renamed from: x */
    public static C2332k0 m9088x(Context context, String str, String str2) {
        return m9072h(str2, new C2327i(context, str, str2));
    }

    /* renamed from: y */
    public static C2328i0 m9089y(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m9090z(context, zipInputStream, str);
        } finally {
            C5808j.m23375c(zipInputStream);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.airbnb.lottie.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.airbnb.lottie.C2328i0 m9090z(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ IOException -> 0x02a5 }
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x013a
            java.lang.String r7 = r2.getName()     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r8 = "__MACOSX"
            boolean r8 = r7.contains(r8)     // Catch:{ IOException -> 0x02a5 }
            if (r8 == 0) goto L_0x0025
            r13.closeEntry()     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0134
        L_0x0025:
            java.lang.String r8 = r2.getName()     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r9 = "manifest.json"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ IOException -> 0x02a5 }
            if (r8 == 0) goto L_0x0036
            r13.closeEntry()     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0134
        L_0x0036:
            java.lang.String r2 = r2.getName()     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r8 = ".json"
            boolean r2 = r2.contains(r8)     // Catch:{ IOException -> 0x02a5 }
            if (r2 == 0) goto L_0x005b
            dg1.z r2 = dg1.C40691m.m117774f(r13)     // Catch:{ IOException -> 0x02a5 }
            dg1.d r2 = dg1.C40691m.m117770b(r2)     // Catch:{ IOException -> 0x02a5 }
            c2.c r2 = p033c2.C2224c.m8465u(r2)     // Catch:{ IOException -> 0x02a5 }
            com.airbnb.lottie.i0 r2 = m9082r(r2, r3, r6)     // Catch:{ IOException -> 0x02a5 }
            java.lang.Object r2 = r2.mo7567b()     // Catch:{ IOException -> 0x02a5 }
            r4 = r2
            com.airbnb.lottie.h r4 = (com.airbnb.lottie.C2325h) r4     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0134
        L_0x005b:
            java.lang.String r2 = ".png"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r8 = "/"
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = ".webp"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = ".jpg"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = ".jpeg"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            if (r2 == 0) goto L_0x007f
            goto L_0x0125
        L_0x007f:
            java.lang.String r2 = ".ttf"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = ".otf"
            boolean r2 = r7.contains(r2)     // Catch:{ IOException -> 0x02a5 }
            if (r2 == 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r13.closeEntry()     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0134
        L_0x0095:
            java.lang.String[] r2 = r7.split(r8)     // Catch:{ IOException -> 0x02a5 }
            int r7 = r2.length     // Catch:{ IOException -> 0x02a5 }
            int r7 = r7 - r5
            r2 = r2[r7]     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r5 = "\\."
            java.lang.String[] r5 = r2.split(r5)     // Catch:{ IOException -> 0x02a5 }
            r5 = r5[r6]     // Catch:{ IOException -> 0x02a5 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x02a5 }
            java.io.File r8 = r12.getCacheDir()     // Catch:{ IOException -> 0x02a5 }
            r7.<init>(r8, r2)     // Catch:{ IOException -> 0x02a5 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02a5 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x02a5 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x00d8 }
            r8.<init>(r7)     // Catch:{ all -> 0x00d8 }
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x00ce }
        L_0x00bc:
            int r10 = r13.read(r9)     // Catch:{ all -> 0x00ce }
            r11 = -1
            if (r10 == r11) goto L_0x00c7
            r8.write(r9, r6, r10)     // Catch:{ all -> 0x00ce }
            goto L_0x00bc
        L_0x00c7:
            r8.flush()     // Catch:{ all -> 0x00ce }
            r8.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00fa
        L_0x00ce:
            r6 = move-exception
            r8.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r8 = move-exception
            r6.addSuppressed(r8)     // Catch:{ all -> 0x00d8 }
        L_0x00d7:
            throw r6     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02a5 }
            r8.<init>()     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r9 = "Unable to save font "
            r8.append(r9)     // Catch:{ IOException -> 0x02a5 }
            r8.append(r5)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r9 = " to the temporary file: "
            r8.append(r9)     // Catch:{ IOException -> 0x02a5 }
            r8.append(r2)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r2 = ". "
            r8.append(r2)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r2 = r8.toString()     // Catch:{ IOException -> 0x02a5 }
            p048d2.C5804f.m23335d(r2, r6)     // Catch:{ IOException -> 0x02a5 }
        L_0x00fa:
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ IOException -> 0x02a5 }
            boolean r6 = r7.delete()     // Catch:{ IOException -> 0x02a5 }
            if (r6 != 0) goto L_0x0121
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02a5 }
            r6.<init>()     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r8 = "Failed to delete temp font file "
            r6.append(r8)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x02a5 }
            r6.append(r7)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r7 = "."
            r6.append(r7)     // Catch:{ IOException -> 0x02a5 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x02a5 }
            p048d2.C5804f.m23334c(r6)     // Catch:{ IOException -> 0x02a5 }
        L_0x0121:
            r1.put(r5, r2)     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0134
        L_0x0125:
            java.lang.String[] r2 = r7.split(r8)     // Catch:{ IOException -> 0x02a5 }
            int r6 = r2.length     // Catch:{ IOException -> 0x02a5 }
            int r6 = r6 - r5
            r2 = r2[r6]     // Catch:{ IOException -> 0x02a5 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r13)     // Catch:{ IOException -> 0x02a5 }
            r0.put(r2, r5)     // Catch:{ IOException -> 0x02a5 }
        L_0x0134:
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ IOException -> 0x02a5 }
            goto L_0x0010
        L_0x013a:
            if (r4 != 0) goto L_0x0149
            com.airbnb.lottie.i0 r12 = new com.airbnb.lottie.i0
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Unable to parse composition"
            r13.<init>(r14)
            r12.<init>((java.lang.Throwable) r13)
            return r12
        L_0x0149:
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0151:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x017f
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r2 = r13.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.airbnb.lottie.e0 r2 = m9073i(r4, r2)
            if (r2 == 0) goto L_0x0151
            java.lang.Object r13 = r13.getValue()
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            int r7 = r2.mo7535e()
            int r8 = r2.mo7533c()
            android.graphics.Bitmap r13 = p048d2.C5808j.m23384l(r13, r7, r8)
            r2.mo7536f(r13)
            goto L_0x0151
        L_0x017f:
            java.util.Set r12 = r1.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0187:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01e7
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.util.Map r1 = r4.mo7548g()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = r6
        L_0x01a0:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01c5
            java.lang.Object r7 = r1.next()
            w1.c r7 = (p294w1.C8736c) r7
            java.lang.String r8 = r7.mo24127a()
            java.lang.Object r9 = r13.getKey()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01a0
            java.lang.Object r2 = r13.getValue()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r7.mo24131e(r2)
            r2 = r5
            goto L_0x01a0
        L_0x01c5:
            if (r2 != 0) goto L_0x0187
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Parsed font for "
            r1.append(r2)
            java.lang.Object r13 = r13.getKey()
            java.lang.String r13 = (java.lang.String) r13
            r1.append(r13)
            java.lang.String r13 = " however it was not found in the animation."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            p048d2.C5804f.m23334c(r13)
            goto L_0x0187
        L_0x01e7:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x024c
            java.util.Map r12 = r4.mo7551j()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x01f9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x024c
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            com.airbnb.lottie.e0 r13 = (com.airbnb.lottie.C2320e0) r13
            if (r13 != 0) goto L_0x020e
            return r3
        L_0x020e:
            java.lang.String r0 = r13.mo7532b()
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inScaled = r5
            r2 = 160(0xa0, float:2.24E-43)
            r1.inDensity = r2
            java.lang.String r2 = "data:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x01f9
            java.lang.String r2 = "base64,"
            int r2 = r0.indexOf(r2)
            if (r2 <= 0) goto L_0x01f9
            r2 = 44
            int r2 = r0.indexOf(r2)     // Catch:{ IllegalArgumentException -> 0x0245 }
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)     // Catch:{ IllegalArgumentException -> 0x0245 }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0245 }
            int r2 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r6, r2, r1)
            r13.mo7536f(r0)
            goto L_0x01f9
        L_0x0245:
            r12 = move-exception
            java.lang.String r13 = "data URL did not have correct base64 format."
            p048d2.C5804f.m23335d(r13, r12)
            return r3
        L_0x024c:
            java.util.Map r12 = r4.mo7551j()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0258:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0296
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r0 = r13.getValue()
            com.airbnb.lottie.e0 r0 = (com.airbnb.lottie.C2320e0) r0
            android.graphics.Bitmap r0 = r0.mo7531a()
            if (r0 != 0) goto L_0x0258
            com.airbnb.lottie.i0 r12 = new com.airbnb.lottie.i0
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "There is no image for "
            r0.append(r1)
            java.lang.Object r13 = r13.getValue()
            com.airbnb.lottie.e0 r13 = (com.airbnb.lottie.C2320e0) r13
            java.lang.String r13 = r13.mo7532b()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            r12.<init>((java.lang.Throwable) r14)
            return r12
        L_0x0296:
            if (r14 == 0) goto L_0x029f
            w1.g r12 = p294w1.C8740g.m32531b()
            r12.mo24146c(r14, r4)
        L_0x029f:
            com.airbnb.lottie.i0 r12 = new com.airbnb.lottie.i0
            r12.<init>((java.lang.Object) r4)
            return r12
        L_0x02a5:
            r12 = move-exception
            com.airbnb.lottie.i0 r13 = new com.airbnb.lottie.i0
            r13.<init>((java.lang.Throwable) r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C2344p.m9090z(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):com.airbnb.lottie.i0");
    }
}

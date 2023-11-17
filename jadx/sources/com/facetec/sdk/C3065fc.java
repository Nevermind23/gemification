package com.facetec.sdk;

import java.io.Writer;

/* renamed from: com.facetec.sdk.fc */
public final class C3065fc {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.facetec.sdk.C2997eb((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.facetec.sdk.C3007ei((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.facetec.sdk.C2996ea.f10129b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.facetec.sdk.C3007ei((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.facetec.sdk.C3007ei((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: fy (r2v4 'e' com.facetec.sdk.fy A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facetec.sdk.C3000ee m12712c(com.facetec.sdk.C3143fx r2) {
        /*
            r2.mo9292f()     // Catch:{ EOFException -> 0x0024, fy -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.facetec.sdk.eg<com.facetec.sdk.ee> r1 = com.facetec.sdk.C3096fp.f10284B     // Catch:{ EOFException -> 0x000d, fy -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo8992d(r2)     // Catch:{ EOFException -> 0x000d, fy -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.facetec.sdk.ee r2 = (com.facetec.sdk.C3000ee) r2     // Catch:{ EOFException -> 0x000d, fy -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.facetec.sdk.ei r0 = new com.facetec.sdk.ei
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.facetec.sdk.eb r0 = new com.facetec.sdk.eb
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.facetec.sdk.ei r0 = new com.facetec.sdk.ei
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.facetec.sdk.ea r2 = com.facetec.sdk.C2996ea.f10129b
            return r2
        L_0x002b:
            com.facetec.sdk.ei r0 = new com.facetec.sdk.ei
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3065fc.m12712c(com.facetec.sdk.fx):com.facetec.sdk.ee");
    }

    /* renamed from: com.facetec.sdk.fc$a */
    static final class C3066a extends Writer {

        /* renamed from: b */
        private final C3067d f10226b = new C3067d();

        /* renamed from: e */
        private final Appendable f10227e;

        /* renamed from: com.facetec.sdk.fc$a$d */
        static class C3067d implements CharSequence {

            /* renamed from: c */
            char[] f10228c;

            C3067d() {
            }

            public final char charAt(int i) {
                return this.f10228c[i];
            }

            public final int length() {
                return this.f10228c.length;
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f10228c, i, i2 - i);
            }
        }

        C3066a(Appendable appendable) {
            this.f10227e = appendable;
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final void write(char[] cArr, int i, int i2) {
            C3067d dVar = this.f10226b;
            dVar.f10228c = cArr;
            this.f10227e.append(dVar, i, i2 + i);
        }

        public final void write(int i) {
            this.f10227e.append((char) i);
        }
    }

    /* renamed from: c */
    public static void m12714c(C3000ee eeVar, C3160gb gbVar) {
        C3096fp.f10284B.mo8991b(gbVar, eeVar);
    }

    /* renamed from: c */
    public static Writer m12713c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C3066a(appendable);
    }
}

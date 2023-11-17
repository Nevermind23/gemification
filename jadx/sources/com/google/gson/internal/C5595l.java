package com.google.gson.internal;

import com.google.gson.C5494h;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.Writer;
import java.util.Objects;
import p328ya.C9146c;

/* renamed from: com.google.gson.internal.l */
public abstract class C5595l {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C5495i.f17561d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C5494h m22245a(p328ya.C9143a r2) {
        /*
            r2.mo18348n0()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.TypeAdapter r1 = com.google.gson.internal.bind.TypeAdapters.f17671V     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo18185b(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.h r2 = (com.google.gson.C5494h) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.i r2 = com.google.gson.C5495i.f17561d
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C5595l.m22245a(ya.a):com.google.gson.h");
    }

    /* renamed from: b */
    public static void m22246b(C5494h hVar, C9146c cVar) {
        TypeAdapters.f17671V.mo18186d(cVar, hVar);
    }

    /* renamed from: c */
    public static Writer m22247c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C5597b(appendable);
    }

    /* renamed from: com.google.gson.internal.l$b */
    private static final class C5597b extends Writer {

        /* renamed from: d */
        private final Appendable f17779d;

        /* renamed from: e */
        private final C5598a f17780e = new C5598a();

        /* renamed from: com.google.gson.internal.l$b$a */
        private static class C5598a implements CharSequence {

            /* renamed from: d */
            private char[] f17781d;

            /* renamed from: e */
            private String f17782e;

            private C5598a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo18432a(char[] cArr) {
                this.f17781d = cArr;
                this.f17782e = null;
            }

            public char charAt(int i) {
                return this.f17781d[i];
            }

            public int length() {
                return this.f17781d.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f17781d, i, i2 - i);
            }

            public String toString() {
                if (this.f17782e == null) {
                    this.f17782e = new String(this.f17781d);
                }
                return this.f17782e;
            }
        }

        C5597b(Appendable appendable) {
            this.f17779d = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) {
            this.f17780e.mo18432a(cArr);
            this.f17779d.append(this.f17780e, i, i2 + i);
        }

        public Writer append(CharSequence charSequence) {
            this.f17779d.append(charSequence);
            return this;
        }

        public void write(int i) {
            this.f17779d.append((char) i);
        }

        public Writer append(CharSequence charSequence, int i, int i2) {
            this.f17779d.append(charSequence, i, i2);
            return this;
        }

        public void write(String str, int i, int i2) {
            Objects.requireNonNull(str);
            this.f17779d.append(str, i, i2 + i);
        }
    }
}

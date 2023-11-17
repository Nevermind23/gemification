package com.google.gson;

import com.google.gson.internal.C5595l;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import p328ya.C9143a;
import p328ya.C9145b;

/* renamed from: com.google.gson.k */
public final class C5611k {
    /* renamed from: b */
    public static C5494h m22280b(Reader reader) {
        try {
            C9143a aVar = new C9143a(reader);
            C5494h c = m22281c(aVar);
            if (!c.mo18219n()) {
                if (aVar.mo18348n0() != C9145b.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return c;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    /* renamed from: c */
    public static C5494h m22281c(C9143a aVar) {
        boolean x = aVar.mo24714x();
        aVar.mo24715x0(true);
        try {
            C5494h a = C5595l.m22245a(aVar);
            aVar.mo24715x0(x);
            return a;
        } catch (StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e2);
        } catch (Throwable th) {
            aVar.mo24715x0(x);
            throw th;
        }
    }

    /* renamed from: d */
    public static C5494h m22282d(String str) {
        return m22280b(new StringReader(str));
    }

    /* renamed from: a */
    public C5494h mo18452a(String str) {
        return m22282d(str);
    }
}

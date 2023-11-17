package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11398b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.g */
public final class C11818g {

    /* renamed from: a */
    public static final Charset f34319a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f34320b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Charset f34321c = Charset.forName("UTF-8");

    private C11818g() {
    }

    /* renamed from: a */
    public static String m43257a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[C11398b.f33141t];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, read);
            }
        } finally {
            reader.close();
        }
    }

    /* renamed from: b */
    public static void m43264b(File file) {
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m43258a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m43259a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m43259a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    public static void m43260a(File file, OutputStream outputStream) {
        m43262a((InputStream) new FileInputStream(file), outputStream);
    }

    /* renamed from: a */
    public static void m43261a(InputStream inputStream, File file) {
        m43262a(inputStream, (OutputStream) new FileOutputStream(file));
    }

    /* renamed from: a */
    public static void m43262a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[C11398b.f33143v];
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 != read) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            m43258a((Closeable) inputStream);
            m43258a((Closeable) outputStream);
        }
    }

    /* renamed from: a */
    public static byte[] m43263a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m43262a(inputStream, (OutputStream) byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m43258a((Closeable) byteArrayOutputStream);
        return byteArray;
    }
}

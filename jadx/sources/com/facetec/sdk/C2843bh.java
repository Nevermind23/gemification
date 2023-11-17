package com.facetec.sdk;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.facetec.sdk.bh */
final class C2843bh {
    C2843bh() {
    }

    /* renamed from: a */
    private static byte[] m11408a(FileInputStream fileInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((int) fileInputStream.getChannel().size())];
        while (fileInputStream.available() > 0) {
            byteArrayOutputStream.write(bArr, 0, fileInputStream.read(bArr));
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private static byte[] m11411b(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m11408a(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: d */
    static byte[] m11412d(File file, byte[] bArr) {
        return new C2770ad(bArr).mo8810e(m11411b(file));
    }

    /* renamed from: e */
    static byte[] m11414e(Context context, String str) {
        FileInputStream openFileInput = context.openFileInput(str);
        try {
            return m11408a(openFileInput);
        } finally {
            openFileInput.close();
        }
    }

    /* renamed from: b */
    private static void m11410b(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    /* renamed from: e */
    static void m11413e(Context context, String str, byte[] bArr) {
        FileOutputStream openFileOutput = context.openFileOutput(str, 0);
        openFileOutput.write(bArr);
        openFileOutput.close();
    }

    /* renamed from: a */
    static void m11406a(File file, byte[] bArr, byte[] bArr2) {
        m11410b(file, new C2770ad(bArr).mo8809d(bArr2));
    }

    /* renamed from: a */
    static byte[] m11407a(Context context, String str, byte[] bArr) {
        return new C2770ad(bArr).mo8810e(m11414e(context, str));
    }

    /* renamed from: b */
    static void m11409b(Context context, String str, byte[] bArr, byte[] bArr2) {
        m11413e(context, str, new C2770ad(bArr).mo8809d(bArr2));
    }
}

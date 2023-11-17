package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: androidx.exifinterface.media.b */
abstract class C1422b {

    /* renamed from: androidx.exifinterface.media.b$a */
    static class C1423a {
        /* renamed from: a */
        static void m4915a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        static FileDescriptor m4916b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: c */
        static long m4917c(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* renamed from: androidx.exifinterface.media.b$b */
    static class C1424b {
        /* renamed from: a */
        static void m4918a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: a */
    static String m4912a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: b */
    static long[] m4913b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    static boolean m4914c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}

package p293w0;

import android.os.Build;
import com.salesforce.marketingcloud.C11398b;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.C41536l;

/* renamed from: w0.c */
public abstract class C8723c {
    /* renamed from: a */
    public static final void m32488a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        C41536l.m120489i(readableByteChannel, "input");
        C41536l.m120489i(fileChannel, "output");
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[C11398b.f33143v];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}

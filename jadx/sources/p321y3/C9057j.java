package p321y3;

import android.util.Log;
import com.bumptech.glide.load.C2402a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;
import p205p3.C7674b;

/* renamed from: y3.j */
public class C9057j implements C7090j {

    /* renamed from: a */
    private final List f25237a;

    /* renamed from: b */
    private final C7090j f25238b;

    /* renamed from: c */
    private final C7674b f25239c;

    public C9057j(List list, C7090j jVar, C7674b bVar) {
        this.f25237a = list;
        this.f25238b = jVar;
        this.f25239c = bVar;
    }

    /* renamed from: e */
    private static byte[] m33537e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C7430c mo7972b(InputStream inputStream, int i, int i2, C7088h hVar) {
        byte[] e = m33537e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f25238b.mo7972b(ByteBuffer.wrap(e), i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo7971a(InputStream inputStream, C7088h hVar) {
        if (((Boolean) hVar.mo21312c(C9056i.f25236b)).booleanValue() || C2402a.m9321f(this.f25237a, inputStream, this.f25239c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}

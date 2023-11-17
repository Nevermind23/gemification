package p244s3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p089g4.C6206a;
import p166m3.C7082d;
import p166m3.C7088h;

/* renamed from: s3.c */
public class C8152c implements C7082d {
    /* renamed from: c */
    public boolean mo7975a(ByteBuffer byteBuffer, File file, C7088h hVar) {
        try {
            C6206a.m24702f(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

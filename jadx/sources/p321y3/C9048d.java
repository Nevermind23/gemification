package p321y3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p089g4.C6206a;
import p166m3.C7081c;
import p166m3.C7088h;
import p166m3.C7091k;
import p192o3.C7430c;

/* renamed from: y3.d */
public class C9048d implements C7091k {
    /* renamed from: b */
    public C7081c mo7976b(C7088h hVar) {
        return C7081c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo7975a(C7430c cVar, File file, C7088h hVar) {
        try {
            C6206a.m24702f(((C9046c) cVar.get()).mo24535c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}

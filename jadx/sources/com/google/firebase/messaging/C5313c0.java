package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p182n6.C7264i;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.c0 */
public class C5313c0 implements Closeable {

    /* renamed from: d */
    private final URL f17028d;

    /* renamed from: e */
    private volatile Future f17029e;

    /* renamed from: f */
    private Task f17030f;

    private C5313c0(URL url) {
        this.f17028d = url;
    }

    /* renamed from: n */
    private byte[] m21002n() {
        URLConnection openConnection = this.f17028d.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d = C5308b.m20990d(C5308b.m20988b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d.length + " bytes from " + this.f17028d);
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    /* renamed from: o */
    public static C5313c0 m21003o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C5313c0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m21004s(C9227g gVar) {
        try {
            gVar.mo24885c(mo17567k());
        } catch (Exception e) {
            gVar.mo24884b(e);
        }
    }

    public void close() {
        this.f17029e.cancel(true);
    }

    /* renamed from: k */
    public Bitmap mo17567k() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f17028d);
        }
        byte[] n = m21002n();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(n, 0, n.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f17028d);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f17028d);
    }

    /* renamed from: q */
    public Task mo17568q() {
        return (Task) C7264i.m27902k(this.f17030f);
    }

    /* renamed from: t */
    public void mo17569t(ExecutorService executorService) {
        C9227g gVar = new C9227g();
        this.f17029e = executorService.submit(new C5310b0(this, gVar));
        this.f17030f = gVar.mo24883a();
    }
}

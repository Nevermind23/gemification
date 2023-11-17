package p174mb;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: mb.e */
public final class C7157e {

    /* renamed from: d */
    private static final String f21180d = "e";

    /* renamed from: a */
    private final Context f21181a;

    /* renamed from: b */
    private boolean f21182b = true;

    /* renamed from: c */
    private boolean f21183c = false;

    public C7157e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f21181a = activity.getApplicationContext();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m27535c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m27536d(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f21180d;
        Log.w(str, "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: e */
    public MediaPlayer mo21420e() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new C7155c());
        mediaPlayer.setOnErrorListener(new C7156d());
        try {
            openRawResourceFd = this.f21181a.getResources().openRawResourceFd(C7167m.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f21180d, e);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    /* renamed from: f */
    public synchronized void mo21421f() {
        Vibrator vibrator;
        if (this.f21182b) {
            mo21420e();
        }
        if (this.f21183c && (vibrator = (Vibrator) this.f21181a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: g */
    public void mo21422g(boolean z) {
        this.f21182b = z;
    }
}

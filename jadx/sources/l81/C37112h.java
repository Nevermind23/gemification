package l81;

import android.content.Context;
import android.media.SoundPool;
import androidx.collection.ArrayMap;

/* renamed from: l81.h */
public class C37112h {

    /* renamed from: a */
    private SoundPool f89304a;

    /* renamed from: b */
    private ArrayMap f89305b;

    public C37112h() {
        this.f89304a = null;
        this.f89305b = new ArrayMap();
        this.f89304a = new SoundPool.Builder().setMaxStreams(1).build();
    }

    /* renamed from: a */
    public void mo90043a(Context context, int[] iArr) {
        for (int i : iArr) {
            this.f89305b.put(Integer.valueOf(i), Integer.valueOf(this.f89304a.load(context, i, 1)));
        }
    }

    /* renamed from: b */
    public void mo90044b(int i) {
        ArrayMap arrayMap;
        if (this.f89304a != null && (arrayMap = this.f89305b) != null) {
            this.f89304a.play(((Integer) arrayMap.get(Integer.valueOf(i))).intValue(), 0.99f, 0.99f, 0, 0, 1.0f);
        }
    }

    /* renamed from: c */
    public void mo90045c() {
        SoundPool soundPool = this.f89304a;
        if (soundPool != null) {
            soundPool.release();
        }
        this.f89304a = null;
    }
}

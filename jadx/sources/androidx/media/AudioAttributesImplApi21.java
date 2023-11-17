package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f4687a;

    /* renamed from: b */
    int f4688b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4687a.equals(((AudioAttributesImplApi21) obj).f4687a);
    }

    public int hashCode() {
        return this.f4687a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4687a;
    }
}

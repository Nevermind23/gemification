package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4687a = (AudioAttributes) versionedParcel.mo6456r(audioAttributesImplApi21.f4687a, 1);
        audioAttributesImplApi21.f4688b = versionedParcel.mo6454p(audioAttributesImplApi21.f4688b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.mo6462x(false, false);
        versionedParcel.mo6436H(audioAttributesImplApi21.f4687a, 1);
        versionedParcel.mo6434F(audioAttributesImplApi21.f4688b, 2);
    }
}

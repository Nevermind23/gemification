package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4686a = (AudioAttributesImpl) versionedParcel.mo6460v(audioAttributesCompat.f4686a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6462x(false, false);
        versionedParcel.mo6441M(audioAttributesCompat.f4686a, 1);
    }
}

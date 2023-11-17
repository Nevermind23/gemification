package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4689a = versionedParcel.mo6454p(audioAttributesImplBase.f4689a, 1);
        audioAttributesImplBase.f4690b = versionedParcel.mo6454p(audioAttributesImplBase.f4690b, 2);
        audioAttributesImplBase.f4691c = versionedParcel.mo6454p(audioAttributesImplBase.f4691c, 3);
        audioAttributesImplBase.f4692d = versionedParcel.mo6454p(audioAttributesImplBase.f4692d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.mo6462x(false, false);
        versionedParcel.mo6434F(audioAttributesImplBase.f4689a, 1);
        versionedParcel.mo6434F(audioAttributesImplBase.f4690b, 2);
        versionedParcel.mo6434F(audioAttributesImplBase.f4691c, 3);
        versionedParcel.mo6434F(audioAttributesImplBase.f4692d, 4);
    }
}
